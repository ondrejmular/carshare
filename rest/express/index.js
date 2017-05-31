var express = require('express')
var app = express()

app.get('/is_licence_plate_valid', function (req, res) {
  console.log(req.query);
  var valid = ["validnaSPZ", "ZA-VODOU", "BA-WORAK", "ZA-SVOJE", "HE-RECKA"];
  if (req.query.licence_plate && valid.indexOf(req.query.licence_plate) != -1) {
    res.send("OK")
  } else {
    res.send("FAIL")
  }
})

app.get('/is_card_valid', function (req, res) {
  console.log(req.query);
  var valid = ["123456789", "987654321"];
  if (req.query.card_number && valid.indexOf(req.query.card_number) != -1) {
    res.send("OK")
  } else {
    res.send("FAIL")
  }
})

app.listen(3001, function () {
  console.log('App listening on port 3001!')
})
