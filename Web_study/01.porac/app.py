from flask import Flask, render_template, request, jsonify
app = Flask(__name__)

@app.route('/')
def home():
   return render_template('index.html')
#html 파일 불러와서 mypage에 렌더링해줌
@app.route('/test', methods=['POST'])
def test_post():
   title_receive = request.form['title_give']
   print(title_receive)
   return jsonify({'result':'success', 'msg': '이 요청은 POST!'})


if __name__ == '__main__':  
   app.run('0.0.0.0',port=5000,debug=True)