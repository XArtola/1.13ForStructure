/**
 * 
 */

/**
 * @author ik013043z1
 *
 */ import java.util.Scanner;
 
public class ForStructure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number;
		
		System.out.println("What do you want to do?\n"
				+ "1- Show numbers from 1 to 10\n"
				+ "2- Show the even numbers between 20 and 2\n"
				+ "3- Show multiplication table of 5\n"
				+ "4- Show the square of a number\n"
				+ "5- Guess the numbers\n"
				+ "6- Write asterisks\n");
		
		Scanner Scan = new Scanner (System.in);
		
		int Selection = Scan.nextInt();
		
		switch (Selection){
			
		case 1:   ;
		
			for(Number = 1; Number < 11; Number++) {
		
				
				
				System.out.println(Number+"\n");
				
				
			}
			
				break;
				
				
		case 2: 
		
		
			for(Number = 20;Number > 1; Number-- ) {
		
					
					if(Number % 2 ==0) {
						
						System.out.println(Number+"\n");
					}
					
					
				
				}
				
				break;
			
		case 3: Number = 0;
		
		
		
		for (Number = 0; Number < 11;Number++) {
			
			
				
				System.out.println("5 x "+Number+" = "+5*Number);
				
				
		}
			
			break;
			
		case 4:
			
			System.out.println("Enter an number (0 to finish)");
			
			Number = Scan.nextInt();
			
			
			while(Number != 0) {
				
				for(int i = 0; i<Number; i++) {
					
					
				System.out.println(Number*Number);
				System.out.println("Enter another number");
				
				Number = Scan.nextInt();
				
			}
				
			}
			
			break;
			
		case 5:
			
			System.out.println("Try guessing the two numbers!!");
			
			
			Number = Scan.nextInt();
			int Number2 = Scan.nextInt();
			
			while(!(Number == 123 && Number2 == 321) {
				
				System.out.println("Keep Trying!!");
				
				Number = Scan.nextInt();
				Number2 = Scan.nextInt();
				
			}
			
			System.out.println("Congratulations!!");
			
			break;
			
			
			
		case 6:
			
			
			
			System.out.println("How many asterisks do you want? (0 to finish)");
			
			Number = Scan.nextInt();
			
			while (Number !=0) {
				
			for(int Print = 0; Print < Number; Print++) {
			
			
				
				System.out.print("*");
				
							
			}
			
			System.out.print("\n");
			Number = Scan.nextInt();
				
			
			}
			break;
			
			default:
				
				System.out.println("Please enter a valid number ");
			
			}
					
		
		
		
		
		
		
	}

}
