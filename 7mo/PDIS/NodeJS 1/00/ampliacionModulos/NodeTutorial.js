let Tutor = require("./tutorial.js");

exports.NodeTutorial = function () {
  console.log("Node Tutorial");
  this.pTutor = function () {
    let PTutor = Tutor;
    PTutor.tutorial();
  };
};
