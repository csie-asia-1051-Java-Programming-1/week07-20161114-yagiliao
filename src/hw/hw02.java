package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		System.out.println(fun(n));
	}
	public static int fun(long n){
		int a=0;
		while(n>0){
			n=n/10;
			a++;
		}
		return a;
	}

}
