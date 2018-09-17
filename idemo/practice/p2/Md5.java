package p2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Md5 {
	public static void main(String[] args) throws Exception {
		String str="000000";
		MessageDigest md5 = MessageDigest.getInstance("md5");//SHA
		BASE64Encoder be = new BASE64Encoder();
		String newStr = be.encode(md5.digest(str.getBytes("utf-8")));
		System.out.println(newStr);
	}
}
