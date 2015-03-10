package ArrayPractice;
import java.util.Scanner;

public class ArrayOfTemps {

	public static void main(String args[]){
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many temps do you want to enter? ");
		int size = keyboard.nextInt();
		double [] temps = new double[size];
		
		//Read temps and compute their average
		System.out.println("Enter "+temps.length+" temps.");
		
		 double sum = 0;
		 for (int i = 0; i<temps.length; i++){
			 temps[i]= keyboard.nextDouble();
			 sum +=temps[i];
		 }
		 
		 double average = sum / temps.length;
		 System.out.println("The average temperature is: "+average);
		 
		 //printing the array 
       /*  for( int i = 0; i<temps.length; i++){
        	 System.out.print(temps[i]+" ");
         }
		 */
		 
		 //displaying the array with a for each loop
		 for(double value: temps){
			 System.out.print(value+" ");
		 }
	}
}
