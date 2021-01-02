package lec07.collectionproperties04.second;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesMain {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("src/lec07/collectionproperties04/second/conf.properties");
			
			properties.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(properties);
		
		properties = new Properties();
		properties.put("a", "windows");
		properties.put("b", "android");
		properties.put("c", "iOS");
		properties.put("d", "unix");
		properties.put("e", "linux");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream("src/lec07/collectionproperties04/second/conf.properties");
			
			properties.store(fos, "setting");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
		
		Properties properties1 = System.getProperties();
		for (Object o : properties1.keySet()) {
			Object o1 = properties1.get(o);
			System.out.println("시스템 설정값 : " + o1);
		}
		
	}

}
