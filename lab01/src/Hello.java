/**
 * CS180 - Lab 01
 * This is my first Java program. It prints "Hello, World!" to the console. 
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */

public class Hello {
	public static void main(String[] args) {
		System.out.println(""+15+20);
		for(int i = 0; i<5; ++i)
			System.out.println(i);
		int b= 1;
		int a= b++;
		System.out.println(a);
		String x = "hello";
		boolean y = (x=="hello");
		System.out.println(y);
	}
}
