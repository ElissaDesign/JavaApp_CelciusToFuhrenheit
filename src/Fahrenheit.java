/*Abstration in Java */

/*Data abstraction is the process of hiding certain details and showing 
only essential information to the user.*/
//Abstract class: is a restricted class that cannot be used to create objects



abstract class Fuhrenheit {
    double fuhrenheit;

    //Abstract class is like a class which is not yet implemented(no values )
    public double CelciusToFuhrenheit(double newCelcius){
        //°F = 1.8 * °C + 32
        return fuhrenheit = 1.8 * newCelcius + 32 ;
    }
}

//We need to extend the abstract class in order to use it we can't create 
//Objects of abstract class directly
class CallFuhrenheit extends Fuhrenheit{}