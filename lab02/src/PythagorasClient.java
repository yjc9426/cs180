/**
 * PythagorasClient
 * create a client to run the pythagoras class
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */

import java.util.Scanner;

public class PythagorasClient {
    public static void main(String[] args) {
 		Pythagoras p = new Pythagoras();
		int side1 = 3;
		int side2 = 4;
		double hypotenuse = p.getHypotenuse(side1, side2);
		System.out.println("Side 'a': " + side1);
		System.out.println("Side 'b': " + side2);
		System.out.println("Hypotenuse: " + hypotenuse);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of side 'a': ");
		side1 = s.nextInt();
		System.out.println("Enter the length of side 'b': ");
		side2 = s.nextInt();
		hypotenuse = p.getHypotenuse(side1, side2);
		System.out.println("Side 'a': " + side1);
		System.out.println("Side 'b': " + side2);
		System.out.println("Hypotenuse: " + hypotenuse);				
    }
}

