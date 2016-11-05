import java.util.Scanner;
/**
 * CS180 - Lab 03 - StringManipulator
 *
 * Manipulate string
 *
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */

public class StringManipulator {
    /**
     * @param fullName contains the person's
     * first and last name separated by a space
     * @return user name
     */
    public String makeUserName(String fullName) {
        int lastNameInd = fullName.indexOf(' ');
        String lastName = fullName.substring(lastNameInd+1,fullName.length());
        if (fullName == null || lastName == null)
            return "";
        char firstLetter = fullName.charAt(0);
        String userName = (firstLetter + lastName).toLowerCase();
        return userName;
    }

    /**
     * @param name user name returned by the makeUserName method
     * @param domain Internet domain name (e.g. purdue.edu)
     * @return e-mail
     */
    public String makeEmail(String name, String domain) {
        String email = (name + "@" + domain).toLowerCase();
        return email;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringManipulator stringManipulator = new StringManipulator();
        System.out.println("Enter you full name: ");
        String word = in.nextLine();
        System.out.println("Enter domain: ");
        String domain = in.nextLine();
        String name = stringManipulator.makeUserName(word);
        System.out.println("Your user name: " + name);
        String email = stringManipulator.makeEmail(name,domain);
        System.out.println("Your email address: " + email);
    }
}
