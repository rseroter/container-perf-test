var express = require('express');
var router = express.Router();

/* GET employees */
router.get('/', function(req, res, next) {
  res.json(
    [{
        id: "400",
        fullname: "Beverly Goldberg",
        location: "JKN",
        jobtitle: "Mom"
    },
    {
        id: "401",
        fullname: "Dave Kim",
        location: "JKN",
        jobtitle: "Student"
    }]
  );
});

module.exports = router;