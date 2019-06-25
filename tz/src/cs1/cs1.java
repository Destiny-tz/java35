package cs1;

public class cs1 {
	/**nullpointerexception  运行时的空指针异常*/
	public static void main(String[] args) {
		Object ob=new String("空指针");
		/*String string = obj.toString();*/
		test1(null);
		
		
	}
		public static void test1(Object ob) {
			if(ob==null) {
				/**
				 * throw 关键字，抛出的意思
				 * java 的异常（出现的二种异常情况 ，分为编译时异常，运行时异常）他们都是Exception的子类
				 * 的实例
				 * 换而言之，在throw的时候，向方法外抛出的是一个异常的对象
				 * */
				throw new  NullPointerException("参数ob不能为null，日志记录");
			}
			System.out.println(ob.toString());
			
		}

}
