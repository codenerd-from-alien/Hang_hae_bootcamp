from pymongo import MongoClient
client  = MongoClient('mongodb+srv://sparta2:test@sparta.nhbcwy0.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta

db.movies.update_one({'title':'문재인입니다'},{'$set':{'star':0}})

