/**
 * CS180 - Lab 03 - StringManipulator
 *
 * calculate student
 *
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */

public class FAFSA {
    boolean isAcceptedStudent;
    boolean isSSregistered;
    boolean hasSSN;

    boolean hasValidResidency;
    int age;
    double studentIncome;
    double parentIncome;
    String classStanding;
    int creditHours;
    boolean isDependent;
    boolean eligible;
    double efc;
    double grant,loan,ws;

    public FAFSA(boolean isAcceptedStudent, boolean isSSregistered, boolean hasSSN,
                 boolean hasValidResidency, boolean isDependent, int age,
                 int creditHours, double studentIncome, double parentIncome,
                 String classStanding) {
        this.isAcceptedStudent = isAcceptedStudent;
        this.isSSregistered = isSSregistered;
        this.hasSSN = hasSSN;
        this.hasValidResidency = hasValidResidency;
        this.age = age;
        this.studentIncome = studentIncome;
        this.parentIncome = parentIncome;
        this.classStanding = classStanding;
        this.creditHours = creditHours;
        this.isDependent = isDependent;
        this.eligible = isFederalAidEligible();
        this.efc = calcEFC();
        this.grant = calcFederalGrant();
        this.loan = calcStaffordLoan();
        this.ws = calcWorkStudy();

        // initialize all of the instance variables here using 'this' to refer to the instance variable
        // the first one has been done for you
    }
    /**
     * Determines if the student is eligible for federal financial aid. To be
     * eligible, the student must be an accepted student to a higher education
     * program (isAcceptedStudent), must be registered with the selective service
     * (isSSregistered) if they are between  the ages of 18-25 inclusive, must
     * have a social security number (hasSSN), and must have valid residency
     * status (hasValidResidency).
     *
     * @return True if the student is aid eligible and false otherwise
     */
    public boolean isFederalAidEligible() {
        if(isAcceptedStudent && this.hasSSN && this.hasValidResidency)
            if(this.age>=18 && this.age <= 25 && isSSregistered)
                return true;
            else if(this.age < 18 || this.age >25)
                return true;
        return false;


    }
    /**
     * Calculates the students expected family contribution. If the student is
     * a dependent, then their EFC is calculated by the sum of the students
     * income and their parent's income, else if it just the student's income.
     *
     * @return The students expected family contribution
     */
    public double calcEFC() {
        if(this.isDependent)
            return this.studentIncome + this.parentIncome;
        else
            return this.studentIncome;
    }
    /**
     * Calculates the student's federal grant award. The student's EFC must be
     * less than or equal to 50000 and they must be an undergraduate. The award
     * amount is based on their class standing and credit hours. Refer to the
     * tables in the breakdown section.
     *
     * @return The student's calculated federal grant award amount
     */
    public double calcFederalGrant() {
        if(this.classStanding == null || !classStanding.equalsIgnoreCase("undergraduate") )
            return 0;
        if(this.efc<= 50000 && this.classStanding.equalsIgnoreCase("undergraduate") && this.eligible)
            if(this.creditHours < 9)
                return 2500;
            if(this.creditHours >=9)
                return 5775;

        return 0;


    }
    /**
     * Calculates the student's total Stafford loan award. The Stafford loan is
     * only available for students registered for 9 or more credit hours. The amount
     * of the award is calculated by the student's dependency status and their
     * class standing. Refer to the tables in the breakdown section.
     *
     * @return The student's calculated Stafford loan award amount
     */
    public double calcStaffordLoan() {
        if(classStanding == null)
            return 0;
        if(this.creditHours >= 9)
            if(this.classStanding.equalsIgnoreCase("undergraduate"))
                if(this.isDependent)
                    return 5000;
                else
                    return 10000;
            else if(this.classStanding.equalsIgnoreCase("graduate"))
                if(this.isDependent)
                    return 10000;
                else
                    return 20000;
        return 0;
    }
    /**
     * Calculates the student's work study award. The work study award is
     * based on the student's EFC. Refer to the table in the breakdown section.
     *
     * @return The student's calculated federal grant award amount
     */
    public double calcWorkStudy() {
        if(this.efc <= 30000)
            return 1500;
        else if(this.efc>30000 && this.efc<=40000)
            return 1000;
        else if(this.efc>40000 && this.efc<=50000)
            return 500;
        return 0;
    }


    /**
     * Calculates the student's total combined federal aid award. The total
     * aid award is calculated as the sum of Stafford loan award, federal grant
     * award, and work study award. You should make a call to the method
     * isFederalAidEligible() to see if the student is eligible to receive
     * federal aid. If they are NOT eligible, you can return 0. If the are, you
     * will return their total aid award.
     *
     * @return The student's total aid award amount
     */
    public double calcFederalAidAmount() {
        if(eligible)
            return this.grant + this.loan + this.ws;
        else
            return 0;
    }

}
