package josn.gsondemo;

import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;

/**
 * Gson里面有一个非常有意思的抽象基类JsonElement,他的继承体系:
 * JsonArray
 * JsonNull 其实就是null 字段
 * JsonObject 等同于org的JSONObject,JsonArray也类似,
 * jsonPrimitive
 * JsonObject
 * Created by Rocky on 2018-12-22.
 */
public class GsonTest3 {

	public static void main(String[] args) {
		// JsonNull jsonNull = new JsonNull();//构造方法过时，推荐INSTANCE
		JsonNull jsonNull = JsonNull.INSTANCE;
		System.out.println(jsonNull);
		
		// JsonPrimitive 如果json转换成字符串 可能包含引号的转义，但是通过JsonPrimative我们可以获得未转义的字符串
		String studentJsonStr = "{\"name\":\"Rocky\",\"age\":27}";
        log("------>studentJsonStr: " + studentJsonStr);
        
        System.out.println("-----------------------分割线---------------------------------------");
        
        JsonPrimitive jsonPrimitive = new JsonPrimitive(studentJsonStr);
        log("------>jsonPrimitive: " + jsonPrimitive);
        log("------>jsonPrimitive: " + jsonPrimitive.toString());
        log("------>jsonPrimitive: " + jsonPrimitive.getAsString());
        
        System.out.println("-----------------------分割线---------------------------------------");
        
        JsonPrimitive jsonPrimitive2 = new JsonPrimitive("this is String");
        log("------>jsonPrimitive2: " + jsonPrimitive2);
        log("------>jsonPrimitive2: " + jsonPrimitive2.toString());
        log("------>jsonPrimitive2: " + jsonPrimitive2.getAsString());		
	}
	
	private static void log(String msg) {
        System.out.println(msg);
    }
}
