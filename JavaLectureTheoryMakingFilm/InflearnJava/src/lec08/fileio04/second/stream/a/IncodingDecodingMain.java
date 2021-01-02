package lec08.fileio04.second.stream.a;

import java.util.Arrays;

public class IncodingDecodingMain {
	
	public static void main(String[] args) throws Exception {
		
		String strData = "한국";
		
		byte[] defaultBytes = strData.getBytes();
		byte[] ms949Bytes = strData.getBytes("MS949");
		byte[] utf8Bytes = strData.getBytes("UTF-8");
		byte[] euckrBytes = strData.getBytes("EUC-KR");
		
		System.out.println("시스템설정방식 : " + Arrays.toString(defaultBytes));
		System.out.println("MS949 : " + Arrays.toString(ms949Bytes));
		System.out.println("UTF-8 : " + Arrays.toString(utf8Bytes));
		System.out.println("EUC-KR : " + Arrays.toString(euckrBytes));
		
		String strDataDefault = new String(defaultBytes);
		String strDataMs949 = new String(ms949Bytes, "MS949");
		String strDataUtf8 = new String(utf8Bytes, "UTF-8");
		String strDataEucKr = new String(euckrBytes, "EUC-kr");
		
		System.out.println("default : " + strDataDefault);
		System.out.println("ms949 : " + strDataMs949);
		System.out.println("utf8 : " + strDataUtf8);
		System.out.println("euckr : " + strDataEucKr);
		
	}

}
