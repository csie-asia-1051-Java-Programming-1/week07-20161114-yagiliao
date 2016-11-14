package ex;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a,b,c,d,e,total;
		int []data=new int [n];
		for(a=0;a<n;a++){
			data[a]=scn.nextInt();
			}
		System.out.println(std(n,data));
		
	}
	public static double std(int n,int[] total){
		return Math.sqrt(var(n,total));
	}
	public static double var(int n,int[] data){
		int sum1=0,sum2=0,a,b,c,d,total;
		for(a=0;a<n;a++){
			sum1=sum1+data[a];
			}
		c=sum1/n;
		for(a=0;a<n;a++){
			b=c-data[a];
			d=b*b;
			sum2=sum2+d;
			}
		total=sum2/n;
		return total;
	}
	
}