package cs1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import cs1.worker;

public class gong {

	public static void main(String[] args) {

		List<worker> arr = new ArrayList<>();
		// 添加三个工人数据
		arr.add(new worker("zhang3", 18, 3000));
		arr.add(new worker("li4", 25, 3500));
		arr.add(new worker("wang5", 22, 3200));
		/** 在坐标1插入一个工人为li4 */
		arr.add(1, new worker("zhao6", 24, 3300));
		/** 删除wang5信息 */
		arr.remove(3);
		System.out.println("Hlo");
		

//	/** 利用for循环来遍历 */
//		for (int i=0;i<arr.size();i++) {
//		System.out.println(arr.get(i));
//		}
//		// /**foreach*/
		// for (worker work:arr) {
		// System.out.println(work);
//		/** 迭代器 */
//		 Iterator<worker> wo=arr.iterator();
//		 while (wo.hasNext()) {
//		 worker work = (worker) wo.next();
//		 System.out.println(work);
		
// }
		 /**调用equls方法*/
	
		 /**foreach*/
//         	boolean  a =arr.contains(arr.get(2));
//    	  System.out.println(a);
      }
		
		 

	}

