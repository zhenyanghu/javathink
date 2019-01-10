package othertest.file.properties;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		System.out.println("当天文件目录: " + System.getProperty("user.dir"));//D:\Users\lrnovo\GitHub\ThinkInJava
		
		//读取a.properties文件的属性
		Properties prop = new Properties();
		try (InputStream is = new BufferedInputStream(new FileInputStream("src/a.properties"))) {//读取配置文件
			prop.load(is);//加载属性列表
			System.out.println(prop.getProperty("name"));
			Iterator<String> it = prop.stringPropertyNames().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("key: " + key + ", value: " + prop.getProperty(key));
			}
		
			//保存属性到b.properties文件
			FileOutputStream fos = new FileOutputStream("src/b.properties", true);//追加写
			prop.setProperty("phone", "13566668888");
			prop.store(fos, "The New properties file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
