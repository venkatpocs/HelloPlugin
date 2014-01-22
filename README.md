HelloPlugin
===========
Add the following lines of code on onDeviceReady callback in index.js

var success = function (message) {alert("Plugin Working\nDevice Model :"+message);};
var error = function (message) {alert("Oops :"+message);};
HelloPlugin.callHelloPluginFunction('Hello Plugin', success, error);