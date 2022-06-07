/*Java Exception Handling */
/*When executing Java code, different errors can occur: coding errors made by the programmer, 
errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term 
for this is: Java will throw an exception (throw an error). 

Then there is an introduction of "try and catch keywords, they come in pairs:
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //Fuhrenheit to Celcius
        System.out.println("Enter the Fuhrenheit from 32 to 212");
        try {
            
            Celcius Celc = new Celcius();
            double Fah = scan.nextInt();
            if(Fah >= 32 && Fah <= 212){
                Celc.setCelcius(Fah);
                System.out.println("This "+ Fah +"F, is equal to "+ Math.floor(Celc.getCelcius()) + " C");
            }else{
                System.out.println("The Fuhrenheit number you entered Doesn't exist");
            }
            
        } catch (Exception e) {
            System.out.println("Please Enter the Number");
        }

        
        
        
        
        //Celcius to Fuhrenheit
        System.out.println("Enter the Celcius from 0 to 100");
        try {

            CallFuhrenheit Fuhr = new CallFuhrenheit();
            double celcius = scan.nextInt();
            if(celcius >= 0 && celcius <= 100){
                Fuhr.CelciusToFuhrenheit(celcius);
                System.out.println("This "+ celcius +"C, is equal to "+ Fuhr.fuhrenheit + " F");
                System.out.println(Fuhr.fuhrenheit);
            }else{
                System.out.println("The number you entered is not in range with celcius scale");
            }
            
        } catch (Exception e) {
            System.out.println("Please Enter the Number");
        }
    }
}
