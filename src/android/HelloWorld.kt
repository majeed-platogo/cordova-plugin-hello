package com.cordova.hello

import org.apache.cordova.CallbackContext
import org.apache.cordova.CordovaPlugin
import org.json.JSONArray


class HelloWorld :  CordovaPlugin() {

    override fun execute(action: String, args: JSONArray, callbackContext: CallbackContext): Boolean {
        if (action == "coolMethod") {
            val message: String = args.getString(0)
            coolMethod(message, callbackContext)
            return true
        } else if (action == "sayHello") {
            sayHello(callbackContext)
            return true
        }
        
        return false
    }

    private fun coolMethod(message: String, callbackContext: CallbackContext) {
        if (message.isNotEmpty()) {
            callbackContext.success(message)
        } else {
            callbackContext.error("Expected one non-empty string argument.")
        }
    }

    private fun sayHello(callbackContext: CallbackContext) {
        callbackContext.success("Hello World")
    }
}