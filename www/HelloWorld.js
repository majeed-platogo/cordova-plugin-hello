var exec = require("cordova/exec");

exports.coolMethod = function (arg0, success, error) {
  exec(success, error, "HelloWorld", "coolMethod", [arg0]);
};

exports.sayHello = function (success, error) {
  exec(success, error, "HelloWorld", "sayHello");
};
