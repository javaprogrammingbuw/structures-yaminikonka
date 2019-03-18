import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("the sum of the three given numbers is:"+(a+b+c));
        System.out.println("the mean of the a,b,c is:"+(a+b+c)/3);
        if(a>b&&a>c){
        	System.out.println("a is maximum and it's value is:"+a);
        }else if(b>a&&b>c){
        	System.out.println("b is maximum and it's value is:"+b);
        }else{
        	System.out.println("c is maximum and it's value is:"+c);
        }
        if(a<b&&a<c){
        	System.out.println("a is minimum and it's value is:"+a);
        }else if(b<a&&b<c){
        	System.out.println("b is minimum and it's value is:"+b);
        }else{
        	System.out.println("c is minimum and it's value is:"+c);
        }
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
