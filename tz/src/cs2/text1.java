package cs2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class text1 {
	private void mian() {
		/**尝试对比老师代码自己敲自己的代码*/
		String ran_str = UUID.randomUUID().toString().replaceAll("-", "");
		String newName = ran_str + "@" + "img3.png";
	copy("D:\\img3.png","E:\\" + newName);

	}
	/**根据路径，赋值文件到目标目录
	 * origin被复制的文件
	 * dest 要被粘贴到哪里去*/
	private static void copy(String orogin,String dest) {
		 File  file=new File(orogin);//被复制的对象
		 FileInputStream in=null;//字节输入流，将文件字节输入
		 FileOutputStream out=null;//字节输出流，将文件字节输出
		 try {
			 in=new FileInputStream(file);//输入这个文件的对象
			 out=new FileOutputStream(dest);//新建/覆盖dest的目录的原先的文件
			 byte[] bytes=new byte[2056];//建立一个数组来接收，长度为2056，这长度可以改变，
			 
			 int len;//申明一个len的量，没有给值
			 int count=0; //申明一个为了的变量
			 while ((len=in.read(bytes)) != -1) {//输入这个对象，最后这个对象不等于-1时
			out.write(bytes, 0, len);	//循环完整输出这个对象
				count++;
			}
			 
			 out.flush();//刷新缓存
			 System.out.println("复制文件完成！总共写入了" + count + "次");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (in!=null) {
					in.close();//关闭输入流
				}
				if (out!=null) {
					out.close();//关闭输出流
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
