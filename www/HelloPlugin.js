var HelloPlugin =  {
    callHelloPluginFunction: function(title, successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'HelloPlugin', // mapped to our native Java class called "HelloPlugin"
            'callHelloMessage', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "title": title
            }]
        );
    }
}
module.exports = HelloPlugin;