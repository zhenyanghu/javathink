package utils;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TestZip {

	public static void main(String[] args) {
		System.out.println(createCardImgZip("D:/test/", "s"));
//		System.out.println(deleteDirectory("D:/testzip/s.zip"));
	}
	

	public static boolean createCardImgZip(String sourcePath, String zipName) {
		boolean result = false;
		String zipPath = "D:/testzip/";
		File sourceFile = new File(sourcePath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		ZipOutputStream zos = null;
 
		if (sourceFile.exists() == false) {
			System.out.println("File catalog:" + sourcePath + "not exist!");
		} else {
			try {
				if(!new File(zipPath).exists()){
					new File(zipPath).mkdirs();
				}
				File zipFile = new File(zipPath + "/" + zipName + ".zip");
				if (zipFile.exists()) {
					System.out.println(zipPath + "Catalog File: " + zipName + ".zip" + "pack file.");
				} else {
					File[] sourceFiles = sourceFile.listFiles();
					if (null == sourceFiles || sourceFiles.length < 1) {
						System.out.println("File Catalog:" + sourcePath + "nothing in there,don't hava to compress!");
					} else {
						fos = new FileOutputStream(zipFile);
						zos = new ZipOutputStream(new BufferedOutputStream(fos));
						byte[] bufs = new byte[1024 * 10];
						for (int i = 0; i < sourceFiles.length; i++) {
							// create .zip and put pictures in
							ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getName());
							zos.putNextEntry(zipEntry);
							// read documents and put them in the zip
							fis = new FileInputStream(sourceFiles[i]);
							bis = new BufferedInputStream(fis, 1024 * 10);
							int read = 0;
							while ((read = bis.read(bufs, 0, 1024 * 10)) != -1) {
								zos.write(bufs, 0, read);
							}
						}
						result = true;
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			} finally {
				try {
					if (null != bis)
						bis.close();
					if (null != zos)
						zos.close();
				} catch (IOException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
		return result;
	}
	
   public static boolean delete(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("删除文件失败:" + fileName + "不存在！");
            return false;
        } else {
            if (file.isFile())
                return deleteFile(fileName);
            else
                return deleteDirectory(fileName);
        }
    }
   
   public static boolean deleteFile(String fileName) {
       File file = new File(fileName);
       // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
       if (file.exists() && file.isFile()) {
           if (file.delete()) {
               System.out.println("删除单个文件" + fileName + "成功！");
               return true;
           } else {
               System.out.println("删除单个文件" + fileName + "失败！");
               return false;
           }
       } else {
           System.out.println("删除单个文件失败：" + fileName + "不存在！");
           return false;
       }
   }
   
   public static boolean deleteDirectory(String dir) {
       // 如果dir不以文件分隔符结尾，自动添加文件分隔符
       if (!dir.endsWith(File.separator))
           dir = dir + File.separator;
       File dirFile = new File(dir);
       // 如果dir对应的文件不存在，或者不是一个目录，则退出
       if ((!dirFile.exists()) || (!dirFile.isDirectory())) {
           System.out.println("删除目录失败：" + dir + "不存在！");
           return false;
       }
       boolean flag = true;
       // 删除文件夹中的所有文件包括子目录
       File[] files = dirFile.listFiles();
       for (int i = 0; i < files.length; i++) {
           // 删除子文件
           if (files[i].isFile()) {
               flag = deleteFile(files[i].getAbsolutePath());
               if (!flag)
                   break;
           }
           // 删除子目录
           else if (files[i].isDirectory()) {
               flag = deleteDirectory(files[i]
                       .getAbsolutePath());
               if (!flag)
                   break;
           }
       }
       if (!flag) {
           System.out.println("删除目录失败！");
           return false;
       }
       // 删除当前目录
       if (dirFile.delete()) {
           System.out.println("删除目录" + dir + "成功！");
           return true;
       } else {
           return false;
       }
   }
}
