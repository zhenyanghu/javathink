package josn.gsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson的实例化方式
 * Created by Rocky on 2018-12-21.
 */
public class GsonTest1 {
	public static void main(String[] args) {
		// 1.
		Gson gson1 = new Gson();
		// 2.
		Gson gson2 = new GsonBuilder()
				.setLenient()// json宽松
				.enableComplexMapKeySerialization()// 支持Map的key为为复杂对象形式
				.serializeNulls()// 智能null
				.setPrettyPrinting()// 调用格式
				.disableHtmlEscaping()// 默认是GSON 吧HTML 转义的
				.create();
	}

}
