import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
/**
 * Created by yuan105 on 7/19/16.
 */
public class FAFSAGUI {
    public static void main(String[] args) {
        do {
            JOptionPane.showMessageDialog(null, "Welcome to the FAFSA!", "Welcome", 1);
            boolean acceptStudent = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Have you been accepted " +
                    "into a degree or certificate program?", "Program Accpetance", JOptionPane.YES_NO_OPTION, 3);
            boolean ssRegistered = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Are you registered for " +
                    "the selective service?", "Selective Service", JOptionPane.YES_NO_OPTION, 3);
            boolean hasSSN = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you have a social security " +
                    "number?", "Social Security Number", JOptionPane.YES_NO_OPTION, 3);
            boolean validResidancy = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you have valid" +
                    " residency status?", "Residency Status", JOptionPane.YES_NO_OPTION, 3);
            int age = 0;
            do {
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?", "Age", 3));
                if (age < 0) {
                    JOptionPane.showMessageDialog(null, "Age cannot be a negative number.", "Error: Age", 0);
                }
            } while (age < 0);
            int creditHour = 1;
            do {
                creditHour = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credit " +
                        "hours do you plan on taking?", "Credit Hours", 3));
                if (creditHour < 1 || creditHour > 24) {
                    JOptionPane.showMessageDialog(null, "Credit hours must be between 1 and 24, " +
                            "inclusive.", "Error: Credit Hours", 0);
                }
            } while (creditHour < 1 || creditHour > 24);
            int studentIncome = 0;
            do {
                studentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your " +
                        "total yearly income?", "Student Income", 3));
                if (studentIncome < 0) {
                    JOptionPane.showMessageDialog(null, "Income cannot be a negative number.", "Error: Student Income", 0);
                }
            } while (studentIncome < 0);
            int parentIncome = 0;
            do {
                parentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your parent's " +
                        "total yearly income?", "Parent Income", 3));
                if (parentIncome < 0) {
                    JOptionPane.showMessageDialog(null, "Income cannot be a negative number.", "Error: Parent Income", 0);
                }
            } while (parentIncome < 0);
            boolean isIndependent = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Are you " +
                    "a dependent?", "Dependency", JOptionPane.YES_NO_OPTION, 3);
            String[] classStanding = {"Freshmen", "Sophomore", "Junior", "Senior", "Graduate"};
            String selected = (String) JOptionPane.showInputDialog(null, "What is your class standing?", "Class " +
                    "Standing", -1, null, classStanding, null);
            if (!selected.equals("Graduate"))
                selected = "Undergraduate";

            FAFSA student = new FAFSA(acceptStudent, ssRegistered, hasSSN, validResidancy,
                    isIndependent, age, creditHour, studentIncome, parentIncome, selected);

            JOptionPane.showMessageDialog(null, "Loan: " + student.calcStaffordLoan() + "\nGrant: " + student.calcFederalGrant()
                    + "\nWork Sturdy: " + student.calcWorkStudy() + "\nTotal: "
                    + student.calcFederalAidAmount(), "FAFSA Results", 1);
            //int goon = JOptionPane.showConfirmDialog(null, "Would you like to complete another Application?", "Continue", JOptionPane.YES_NO_OPTION, 3);
        }while(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Would you like to complete another Application?", "Continue", JOptionPane.YES_NO_OPTION, 3));
    }
}
