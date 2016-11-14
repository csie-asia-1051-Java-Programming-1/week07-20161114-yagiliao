package ex;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a,b,total;
		int [][]data=new int [n][m];
		for(a=0;a<n;a++){
			for (b=0;b<m;b++){
			data[a][b]=scn.nextInt();
			}
		}
		System.out.println(std(var(n,m,data)));
		System.out.println(var(n,m,data));
	}
	public static double std(double x){
		return Math.sqrt(x);
	}
	public static double var(int n,int m,int[][] data){
		int sum1=0,sum2=0,c,d,e,total;
		for(int a=0;a<n;a++){
			for(int b=0;b<m;b++){
			sum1=sum1+data[a][b];
			}
		}
		c=sum1/(n*m);
		for(int a=0;a<n;a++){
			for(int b=0;b<m;b++){
			e=data[a][b]-c;
			d=e*e;
			sum2=sum2+d;
			}
		}
		total=sum2/(n*m);
		return total;
	}
	
}