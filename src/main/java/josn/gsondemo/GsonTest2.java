package josn.gsondemo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by Rocky on 2018-12-21.
 */
public class GsonTest2 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		// toJson
		Student student = new Student();
		student.setName("Rocky");
		student.setAge(27);
		String jsonStr = gson.toJson(student);
		log("----->javabean convert jsonStr: " + jsonStr);
		
		Map<String, Object> content = new HashMap<>();
		content.put("name", "huzhenyang");
		content.put("age", 27);
		jsonStr = gson.toJson(content);
		log("----->map convert jsonStr: " + jsonStr);
		
		List<String> list = Arrays.asList("1", "a", "3", "rt", "5");
		jsonStr = gson.toJson(list);
		log("----->list convert jsonStr: " + jsonStr);
		
		// fromJson
		String studentJsonStr = "{\"name\":\"Rocky\",\"age\":27}";
		Student student2 = gson.fromJson(studentJsonStr, Student.class);
		log("----->jsonStr convert javabean: " + student2);
		
		String listJsonStr = "[\"1\",\"a\",\"3\",\"rt\",\"5\"]";
		Type type = new TypeToken<ArrayList<String>>() {}.getType();
		ArrayList<String> list2 = gson.fromJson(listJsonStr, type);
		log("---->json convert list: " + list2);

        ArrayList<String> list3 = gson.fromJson(listJsonStr, ArrayList.class);
        System.out.println("(直接用类类型)json convert list " + list3);
		
	}
	
	private static void log(String msg) {
		System.out.println(msg);
	}
	
	private static class Student {
		private String name;
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
	}
}
