from flask import Flask, request, jsonify
from textblob import TextBlob

app = Flask(__name__)

@app.route('/analyze', methods=['POST'])
def analyze():
    text = request.json['text']
    polarity = TextBlob(text).sentiment.polarity

    if polarity > 0:
        return jsonify({"sentiment": "positive", "score": 1})
    else:
        return jsonify({"sentiment": "negative", "score": -1})

app.run(port=5000)