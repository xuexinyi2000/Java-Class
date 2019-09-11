package unit2;

import java.util.Scanner; //Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Compute area
		double area = radius * radius * 3.14159;
		
		//Display results
		System.out.println("The area of the circle of radius " + radius + " is " + area);
	}
}

//Enter a number for radius: 2.5 (Enter)
//The area of the circle of radius 2.5 is 19.6349375

//代码第8行，有一个warning:Resource leak: 'input' is never closed
//解决办法：(https://blog.csdn.net/he_zhao/article/details/70171089)
//try {
//	System.out.print("Enter a number for radius: ");
//	double radius = input.nextDouble();
//	double area = radius * radius * 3.14159;
//	System.out.println("The area of the circle of radius " + radius + " is " + area);
//}finally {
//	input.close();
//}