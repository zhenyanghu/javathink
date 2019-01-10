package othertest.file;

import java.io.File;

/**
 * Created by Rocky on 2018-10-30.
 * 
 */
public class FileDemo02 {

	public static void main(String[] args) {
		//1、利用System.getProperty()函数获取当前路径： 
		System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径 
		
		//2、使用File提供的函数获取当前路径：
		File directory = new File("");//设定为当前文件夹 
		try{ 
		    System.out.println(directory.getCanonicalPath());//获取标准的路径 
		    System.out.println(directory.getAbsolutePath());//获取绝对路径 
		}catch(Exception e){} 
	}
}
