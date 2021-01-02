package lec08.fileio04.first.a;

import java.io.File;

public class FileIOTest {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\dev\\test.txt");
		
		String path = file.getPath();
		String absolutePath = file.getAbsolutePath();
		String canonicalPath = file.getCanonicalPath();
		
		System.out.println("path : " + path);
		System.out.println("absolutePath : " + absolutePath);
		System.out.println("canonicalPath : " + canonicalPath);
		
		System.out.println();
		
		String parent = file.getParent();
		File parentFile = file.getParentFile();
		System.out.println("parent : " + parent);
		System.out.println("parentFile : " + parentFile);
		
		String absoluteParent = file.getAbsoluteFile().getParent();
		File absoluteFileParentFile = file.getAbsoluteFile().getParentFile();
		System.out.println();
		System.out.println("absoluteParent : " + absoluteParent);
		System.out.println("absoluteFileParentFile : " + absoluteFileParentFile);
		
		boolean exists = file.exists();
		boolean isFile = file.isFile();
		boolean isDirectory = file.isDirectory();
		System.out.println();
		System.out.println("exists : " + exists);
		System.out.println("isFile : " + isFile);
		System.out.println("isDirectory : " + isDirectory);
		 
	}

}
