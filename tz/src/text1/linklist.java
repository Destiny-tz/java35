package text1;

import java.util.LinkedList;
import java.util.List;

import cs1.worker;

public class linklist {

	public static void main(String[] args) {

		LinkedList<Work> list = new LinkedList<Work>();
		list.add(new Work(18, "zhao6", 3200));
		list.add(new Work(22, "zh5", 3200));
		list.add(new Work(2, "zfgh5", 3500));
		list.add(new Work(20, "z5", 3800));
		list.add(new Work(19, "z545", 3600));
		list.add(new Work(12, "z55", 3200));
		list.add(new Work(19, "zhao5", 3000));
		list.add(new Work(20, "zhao4", 3300));
		list.add(new Work(21, "zhao3", 33.0));
		/** 获取的第一个元素 */
		// Object a = list.getFirst();
		// System.out.println("获取的第一个元素"+a);
		// /**获得的最后*/
		// Object b = list.getLast();
		// System.out.println("获取的最后一个元素"+b);
		/** 删除最后哥袁术 */
		// list.removeLast();
		// /**删除第一个元素*/
		// list.removeFirst();
		//
		linklist a=new linklist();
		a.sort(list);
		print(list);

	}
	
	

	public  void sort(LinkedList<Work> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).getAge() > list.get(j + 1).getAge()) {
					Work w = list.get(j);
					list.set(j,list.get(j + 1));
					list.set(j + 1,w) ;
				}

				}
			}
		}
	

	
	
	private static void print(LinkedList list) {
		for (Object ob : list) {
			System.out.println(ob);
		}
	}

}
