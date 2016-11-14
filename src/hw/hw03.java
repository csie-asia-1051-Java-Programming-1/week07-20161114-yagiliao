package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(fun(m,n));
	}
	public static int fun(int m,int n){
		int val1=1,val2=1,val3=1,s=m-n;
		for(int a=1;a<=m;a++){
			val1=val1*a;
		}
		for(int a=1;a<=n;a++){
			val2=val2*a;
		}
		for(int a=1;a<=s;a++){
			val3=val3*a;
		}
		int total=val1/(val2*val3);
		return total;
	}

}
