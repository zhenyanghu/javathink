package josn.gsondemo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Created by Rocky on 2018-12-22.
 */
public class GsonTest4 {

	public static void main(String[] args) {
		// crate JsonObject 
		JsonObject jsonObject  = new JsonObject();
		jsonObject.addProperty("name", "Rocky");
		jsonObject.addProperty("age", 27);
		log("------>create jsonObject: " + jsonObject);
		
		// create JsonArray
		JsonArray jsonElements = new JsonArray();
		jsonElements.add("a");
		jsonElements.add("b");
		jsonElements.add("c");
		jsonElements.add("d");
		log("------>create jsonArray: " + jsonElements);
		
		/*
		 * JsonObject 嵌套数组（或JsonArray）
		 * 通过JsonObject的add(key,JsonElement)可以为jsonObject 添加一个数组的字段
		 */
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("name", "Rocky");
		jsonObject.addProperty("age", 27);
		JsonArray jsonArray = new JsonArray();
		jsonArray.add("足球");
		jsonArray.add("篮球");
		jsonObject2.add("hobby", jsonArray);
		log("------>create jsonObject inner JsonArray:"+jsonObject2);
		
		
		
	}
	
	
	private static void log(String msg) {
        System.out.println(msg);
    }
}
