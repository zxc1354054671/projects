package Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JpgCopy {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("D:/sw/util/eclipsedemo/iofile/j1.jpeg");
			fos=new FileOutputStream("D:/sw/util/eclipsedemo/iofile/j2.jpeg");
			byte bytes[]=new byte[1024];
			int len;
			while((len=fis.read(bytes))!=-1){
				fos.write(bytes,0,len);
				fos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(1);
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
