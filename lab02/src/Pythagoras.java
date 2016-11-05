/**
 * CS180 - Lab 02: Pythagoras
 * calculating the side of triangle using pythagoras
 * @author Jiacheng Yuan, yuan105@purdue.edu, lab section
 */
 public class Pythagoras {
 	public double getHypotenuse(int a, int b){
		double result;	
		result = Math.sqrt(a * a + b * b);
		return result;
	}
 }
