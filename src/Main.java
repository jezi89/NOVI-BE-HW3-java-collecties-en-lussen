// Import the HashMap class
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
//        To use other types, such as int, you must specify an equivalent wrapper class (dus hoofdletters): Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
        HashMap<Integer, String> convertedNumber = new HashMap <Integer,String> ();
        convertedNumber.put(1, "één");
        convertedNumber.put(2, "twee");
        convertedNumber.put(3, "drie");
        convertedNumber.put(4, "vier");
        convertedNumber.put(5, "vijf");
        convertedNumber.put(6, "zes");
        convertedNumber.put(7, "zeven");
        convertedNumber.put(8, "acht");
        convertedNumber.put(9, "negen");

        int roundedValue =  InputHandler.readInput();;
        System.out.println(convertedNumber.get(roundedValue));
    }
}
