/*Encapsulation in Java */
/*The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
To achieve this, you must:

declare class variables/attributes as private
provide public "get" and "set" methods to access and update the value of a private variable.

The get method returns the variable value, and the set method sets the value.
*/


public class Celcius {
   //private double fahrenheit;
   private double celcius;
    public double setCelcius(double newFahrenheit){
        //°C = (°F - 32)/1.8
        return celcius = (newFahrenheit - 32)/1.8;
    }
    public double getCelcius(){
        return celcius;
    }
}
