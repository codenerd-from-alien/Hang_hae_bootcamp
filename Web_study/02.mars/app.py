from flask import Flask, render_template, request, jsonify
from pymongo import MongoClient
#pymongo 및 flask


client  = MongoClient('mongodb+srv://sparta2:test@cluster0.hgc3odv.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta
app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html')

@app.route("/mars", methods=["POST"])
def mars_post():
    name_recieve = request.form['name_give']
    address_recieve = request.form['address_give']
    size_recieve = request.form['size_give']

    doc = {
        'name': name_recieve,
        'address_recieve' : address_recieve,
        'size_recieve' : size_recieve
    }


    db.mars.insert_one(doc)
    

    return jsonify({'msg':'complete send!'})

@app.route("/mars", methods=["GET"])
def mars_get():

    mars_data= list(db.mars.find({}, {'_id':False}))
    return jsonify({'result': mars_data})

if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)