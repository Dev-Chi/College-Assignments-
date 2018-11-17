//Fadi
//Exam Project ShippingCharges
//Wed, Oct.17 2018

import java.util.Scanner;

class ShippingCharges{
    
    public static void main(String args[]){
        int loopCount = 0;
        int cusCost = 0;
        int packWeight;
        
        Scanner userInput = new Scanner(System.in);
        System.out.format("Welcome to the freight company Calcuator. How many packages do you need shipped?%n");
        int loopCounter = userInput.nextInt();
        
        while (loopCount < loopCounter){
            System.out.format("%nPlease Enter Your Package Number%n");
            String packName = userInput.next();
            System.out.format("Please Enter That Packages Weight:%n");
            packWeight = userInput.nextInt();
            
            if (packWeight <= 15)
                cusCost = 10;
            else if (packWeight>15 && packWeight<35)
                cusCost = 35;
            else if (packWeight>35 && packWeight<=75)
                cusCost = 75;
            else if (packWeight>75)
                cusCost = packWeight * 1;
            
            System.out.format("%nYour Package: " + packName + "%nWeight:" + packWeight + "%nShipping Cost:  $" + cusCost + "%n" );
            loopCount = loopCount + 1;
            
            
        }
        
    }
}

