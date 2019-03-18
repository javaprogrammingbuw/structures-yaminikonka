import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("the odd numbers till "+num);
		for(int i=0;i<num;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}

		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
