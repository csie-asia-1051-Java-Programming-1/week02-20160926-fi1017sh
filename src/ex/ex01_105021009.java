package ex;
/*
 * Topic: ?�話?�司?��?費方式是 600?��?以�?每�???.5?��?
 * 	600~1200?��??�話費以9?��?算�?1200?��?以�??�話費以79?��?算�?
 *  讓使?��?輸入?��?使用?��????��?)，�??�電話費(??
 * Date: 2016/09/26
 * Author: 105021009 陳俞儒
 */
import java.util.Scanner;
public class ex01_105021009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float p=0.5f;
		float n=scn.nextInt();
		float d=0;
		if (n<=600){
			d=n*p;
		}else{
			if(n<=1200){
				d=n*p*0.9f;
			}else{
				d=n*p*0.79f;
			}
		}
	System.out.print(d);	
	}

}
