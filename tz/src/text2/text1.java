package text2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class text1 {
	public static void main(String[] args) {
		//输入输出流的注解
		zi();
			}
	

	/**按字节来读取文件，每次只读一个字节*/
	private static void zi() {	
		InputStream	in=null;
	try {
		in=new FileInputStream("E:\\1.txt");
		//通过read方法，从in对象每次读一个字节
		int i;
		while ((i=in.read())!=-1) {
			//System.out.print(i);
			char a=(char)i;
		System.out.print(a);
		}
		
			
	} catch (FileNotFoundException e) {
		e.printStackTrace();//字节抛出的异常
	} catch (IOException e) {
		e.printStackTrace();//上面I抛出的异常
	}finally {
		if (in!=null) {			
			try {	
				in.close();//关闭流
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	}
}
