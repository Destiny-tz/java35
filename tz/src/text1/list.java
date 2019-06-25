package text1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import cs1.worker;


public class list {
	public static void main(String[] args) {
		ArrayList<Work> wo=new ArrayList<>();
		wo.add(new Work(18,"zhao6",3300));
		wo.add(new Work(25,"li4",3500));
		wo.add(new Work(22,"wang5",3200));
		wo.add(new Work(55,"wang10",3200));
		/**在li4之前插入一个工人，*/
		/**删除wang5*/
		Work o=new Work(22,"wang5",3200);//删除wang5
		wo.remove(o);//根据对象删除

		
		
		
//		/**foreach循环*/
//		for (Work work : wo) {
//			System.out.println(work);
//		}
		/**迭代器调用*/
		Iterator<Work> it=wo.iterator();
		while (it.hasNext()) {
			Work wor = (Work) it.next();
			System.out.println(wor);
			
		}

//		/** 迭代器 */
//		 Iterator<worker> wo=arr.iterator();
//		 while (wo.hasNext()) {
//		 worker work = (worker) wo.next();
//		 System.out.println(work);
}
}
