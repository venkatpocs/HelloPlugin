package com.amadeus.plugin;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class HelloPlugin extends CordovaPlugin {
	public static final String ACTION_ADD_CALLBACK_METHOD = "callHelloMessage";
	 
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		try {
			if (ACTION_ADD_CALLBACK_METHOD.equals(action)) {
				JSONObject arg_object = args.getJSONObject(0);
				System.out.println("Calling Native Method:Title:"+ arg_object.getString("title"));
				callbackContext.success();
				return true;
			}
			callbackContext.error("Invalid action");
			return false;
		} catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		} 
	}
}