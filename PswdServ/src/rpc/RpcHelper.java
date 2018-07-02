package rpc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * @Function 	RPC auxiliary common function class 
 * 				Help to resolve basic function which Servlets may use. 
 * @author 		Rick Liu
 * @version 	v0.1.0
 * @Time 		2018-6-24
 */
public class RpcHelper {
	/**
	 * @function 	Write the JSONObject to front-end
	 * @param		response - HttpServletResponse
	 * 				obj - JSONObject - used for front-end
	 * @return		
	 * @exception 	JSONException		
	 */		
	public static void writeJsonObj(HttpServletResponse response, JSONObject obj){
		try {
			response.setContentType("application/json");
			response.addHeader("Access-Control-Allow-Origin", "*");
			PrintWriter out = response.getWriter();
			out.print(obj);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @function 	Write the JSONArray to front-end
	 * @param		response - HttpServletResponse
	 * 				array - JSONArray - used for front-end
	 * @return		
	 * @exception 	JSONException		
	 */	
	public static void writeJsonArr(HttpServletResponse response, JSONArray array){
		try {
			response.setContentType("application/json");
			response.addHeader("Access-Control-Allow-Origin", "*");
			PrintWriter out = response.getWriter();
			out.print(array);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
}
