package josn.gsondemo;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * 重命名注解:SerializedName 
 * 作用:转换关键字key,json转换成JavaBean时,json字段的key 默认必须和我们声明类的字段名称一样,当服务器端返回了关键字怎么办，比如key 为new switch这样,
 * 我们在声明类的时候不能写这样的字段,可能你想服务器端改动，他可能要改数据库，但是我告诉你，做服务端的大部分不愿意改动他的json,是很自私的!
 * 这时候重命名注解都排上用场了   第二种场景:服务器端返回的json 的key 简直太丑，或者太长,你想简化,my_parent_name,可以简化成mpn比较优雅简介
 * Created by Rocky on 2018-12-22.
 */
public class GsonTest5 {

	public static void main(String[] args) {
        String jsonFromServer = "{\n" +
                "    \"age\": 26,\n" +
                "    \"name\": \"zhangsan\",\n" +
                "    \"new\": 1\n" +
                "}";
        Gson gson = new Gson();
        User user = gson.fromJson(jsonFromServer, User.class);
        log("------>user:" + user);
	}
	
	private static void log(String msg) {
        System.out.println(msg);
    }

    private static class User {
        public String name;
        public int age;
        @SerializedName("new")
        public int isnew;
        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", isnew=" + isnew +
                    '}';
        }
    }
}
