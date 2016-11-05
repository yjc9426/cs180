/**
 * CS180 - Lab 01
 * This is my second Java program. It calculate temperature. 
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */

import java.util.Scanner;
public class Temperature{

	public static void main(String[] args){
		double fahrenheit;
		double celsius;
        fahrenheit = 212;
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		fahrenheit = s.nextDouble();
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Fahernheit: " + fahrenheit);
		System.out.println("Celsius: " + celsius);
		System.out.println("Enter the temperature in Celsius: ");
		celsius = s.nextDouble();
		fahrenheit = celsius * 9 / 5 + 32;
		System.out.println("Celsius: " + celsius);
		System.out.println("Fahernheit: " + fahrenheit);
	}
}
