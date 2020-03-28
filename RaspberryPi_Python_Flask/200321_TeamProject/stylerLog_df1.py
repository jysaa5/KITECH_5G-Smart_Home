import pandas as pd
import datetime
from flask import Flask, request, Response, jsonify, make_response
from flask_cors import CORS

import requests
import json

app = Flask(__name__)
CORS(app)

@app.route("/log/<stylerDate>", methods =['GET'])
def styler_log(stylerDate):

    data_dic = stylerDate

    try:
        # 로그파일 불러오기
        df = pd.read_csv("styler-"+data_dic+".log", sep=' ', \
                    names=['날짜', '시간','로그레벨', '프로세스ID', '촬영여부'], \
                    header=None)
    
        # '촬영여부' 중 ReadyCapture, CaptureSuccess만 output / Capture, SaveCapture, exit 제외
        df_cond = df[(df['촬영여부'] == 'ReadyCapture') | (df['촬영여부'] == 'CaptureSuccess')]

        # '날짜', '시간', '촬영여부' 컬럼만 output
        styler_df = df_cond.loc[:, ['날짜', '시간', '촬영여부']]

        return styler_df.to_html(justify='center')

    except:
        return "Error"

if __name__ == "__main__":              
    app.run(host="192.168.0.24", port=5000, debug=False)
