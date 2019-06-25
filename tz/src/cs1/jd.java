package cs1;

public class jd {
	
	    public static void main(String[] args) {
	        //2、有一个数组  int[] arr={123, 12, 3445,2178};
	        //   请分解每一个数字后计算和，如果是偶数就输出来
	        int[] arr={123, 12, 3445,2178};
	        int i=0,len=0;
	        for(;i<arr.length;i++) {
	            int a=arr[i];
	            while (a > 0) {
	                a /= 10;
	                len++;
	            }
	            int b=0,sum=0;
	            for(int j=0;j<len;j++){
	                int k=1;
	                for(int h=0;h<len-j-1;h++){
	                    k*=10;
	                }
	                b=arr[i]/k%10;
	                 sum+=b;
	            }
	            if(sum%2==0){
	                System.out.println(arr[i]);
	            }else{
	                System.out.println(arr[i]+"的和不是偶数！");
	            }
	        }
	    }
	}



