package othertest.file;

import java.io.File;

/**
 * Created by Rocky on 2018-10-30.
 * 创建目录
 */
public class FileDemo01 {

	public static void main(String[] args) {
//		File fileId = new File("D:/printqrcode/1000001/id");
		File fileId = new File("D:/printqrcode/test");
		if (!fileId.exists() && !fileId.isDirectory()) {
			boolean b = fileId.mkdir();
			System.out.println("是否成功： " + b);
		}
	}
}
