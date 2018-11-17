import java.util.Scanner;

class StudentCalc {
    
        public static void main(String args[]){

            double newCredits = 0;
            double tuition = 0;
            double cFees = 0;
            double saFees = 4.60;
            double piFees = 2.00;
            double perCredit = 0;
            double finalTotal = 1 ;
            char newStudentType;
    //open scanner for user input for name, student type & credits
            Scanner Userinput = new Scanner(System.in);
    //NAME
            System.out.format("Welcome to the NOVA Tuition and Fees Calculator.%nPlease enter your name:%n");
                String newName = Userinput.nextLine();
    // STUDENT TYPE
            
            //LOOP QUESTION if given invalid answer until given valid answer
            do {
            System.out.format("Please enter the type of student that you are from the choices below:%nR for Virginia Resident%nM for Military Contract Out-of-State%nV for Military Veterans and Dependents%nD for Dual Enrolled%nB for Business Contract Students%nO for Out of State Students%n%n%n");
            char newStudentTypeInput = Userinput.next().charAt(0);
            newStudentType = Character.toUpperCase(newStudentTypeInput);       // makes letter casing irrelavent
            
            }
            while (newStudentType != 'R'&& newStudentType != 'M' && newStudentType != 'V' && newStudentType != 'D' && newStudentType != 'B' && newStudentType != 'O');
                   
    // Credits
            do {
                System.out.println("Please enter the number of credits you are taking:");
             newCredits = Userinput.nextDouble();
            } while (newCredits >= 200); //will loop if "credit" input is greater than 200. invalid answer
    // close the scanner
            Userinput.close();
    
    
    //processing
            
            
            // VA RESIDENT STUDENTS
            if(newStudentType == 'R') {
                tuition = 180.40;
                perCredit = tuition + cFees + saFees + piFees;
                finalTotal = newCredits*perCredit;
            }
            // MILITARY O-O-S STUDENTS
            else if(newStudentType == 'M') {
                tuition = 180.40;
                cFees = 21;
                perCredit = tuition + cFees + saFees + piFees;
                finalTotal = newCredits*perCredit;
                
            }
            // MILITARY VETS
            else if(newStudentType == 'V') {
                tuition = 180.40;
                perCredit = tuition + cFees + saFees + piFees;
                finalTotal = newCredits*perCredit;
                
            }
            // DUAL ENROLLMENT
            else if(newStudentType == 'D') {
                tuition = 180.40;
                perCredit = tuition + cFees + saFees + piFees;
                finalTotal = newCredits*perCredit;
                
            }
            // BUSINESS CONTRACT STUDENTS
            else if(newStudentType == 'B') {
                tuition = 240.40;
                cFees = 21;
                perCredit = tuition + cFees + saFees + piFees;
                finalTotal = newCredits*perCredit;
                
            }
            // OUT OF STATE STUDENTS
            else if(newStudentType == 'O') {
                tuition = 387.25;
                cFees = 21;
                perCredit = tuition + cFees + saFees + piFees;
                finalTotal = newCredits*perCredit;
                
            // Return Error and loop for letter
            }
            
            
    // PRINT REPORT
            
            System.out.format("Tuition and fees report for " + newName + "%nTuition:   $" + String.format("%.2f", tuition) + "%nCaptial Fee:   $" + String.format("%.2f", cFees) + "%nStudent Activities Fee:    $" + String.format("%.2f", saFees) + "%nParking Infrastructure Fee:   $" + String.format("%.2f", piFees) + "%nTuition & Fees Per Credit:   $" + String.format("%.2f", perCredit) + "%nX Number of Credits:   " + String.format("%.0f", newCredits) + "%nTotal Tuition and Fees:   $" + String.format("%.2f", finalTotal) + "%n%nBoldly NOVA%n");
            
            
            
        }
}
