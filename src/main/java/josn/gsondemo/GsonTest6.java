package josn.gsondemo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by Rocky on 2019-01-03.
 */
public class GsonTest6 {

	public static void main(String[] args) {
		String listStr = "[{\"goods_num\":\"01\",\"weight\":\"1.5\",\"amount\":\"1230\"},{\"goods_num\":\"02\",\"weight\":\"0.6\",\"amount\":\"234\"}]";
		
		List<Map<String, String>> list = new Gson().fromJson(listStr, new TypeToken<List<Map<String, String>>>() {}.getType());
		System.out.println(list);
	}
}
