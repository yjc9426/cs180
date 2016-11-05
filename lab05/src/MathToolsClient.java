import java.util.Scanner;

/**
 * Created by yuan105 on 6/28/16.
 */
public class MathToolsClient{
    public static void main(String[] args) {
        MathTools m = new MathTools();
        double temp;
        boolean toMenu = true;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Select a number from the menu choices:");
            System.out.println("1 - Absolute Value");
            System.out.println("2 - Power");
            System.out.println("3 - Nth Root");
            System.out.println("4 - Scientific Notation");
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Enter the value: ");
                System.out.println(m.absoluteValue(s.nextDouble()));
            } else if (choice == 2) {
                System.out.println("Enter the value: ");
                temp = s.nextDouble();
                System.out.println("Enter the power: ");
                System.out.println(m.power(temp,s.nextInt()));
            } else if (choice == 3) {
                System.out.println("Enter the value: ");
                temp = s.nextDouble();
                System.out.println("Enter the root: ");
                System.out.println(m.nthRoot(temp,s.nextInt()));
            } else if (choice == 4) {
                System.out.println("Enter the value: ");
                System.out.println(m.scientificNotation(s.nextDouble()));
            }
            System.out.println("Return to the menu? (yes/no)");
            s.nextLine();
            toMenu = (s.nextLine().equalsIgnoreCase("yes"));
        }while(toMenu);
        System.out.println("Exiting MathToolsClient...");

    }
}
