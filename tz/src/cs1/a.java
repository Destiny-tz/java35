package cs1;



import java.util.TreeSet;

import javafx.concurrent.Worker;
import cs1.worker;

public class a {
	public static void main(String[] args) {
		TreeSet<worker> tree = new TreeSet<>();
		worker w1 = new worker("zhang3", 18, 3000);
		worker w2 = new worker("li4", 25, 3500);
		worker w3 = new worker("wang5", 22, 3200);
		tree.add(w1);
		tree.add(w2);
		tree.add(w3);
		worker w4=new worker("zhao6",24,3300);
		//tree.get(1,werker.w4);
		System.out.println(tree);
	}

}

