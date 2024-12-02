import java.util.Scanner;

public class InputHandler {


    public static int readInput() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt for the amount of grades
            System.out.print("Voer een geheel getal in van 1 tot en met 9 ");
            System.out.println();
            String input = scanner.nextLine(); // Correcte aanroep van de Scanner
            // Controleer en corrigeer voor comma's
            if (input.contains(",")) {
                input = input.replace(",", ".");
            }
            try {
                // Probeer de invoer te parsen naar een float
                float floatInput = Float.parseFloat(input);
                // Controleer of het getal binnen het bereik 1 tot en met 9 valt
                if (floatInput >= 1 && floatInput <= 9) {
                    // Rond af
                    return (int) Math.round(floatInput); // Retourneer het afgeronde getal

                } else {
                    System.out.println("Het getal moet tussen 1 en 9 liggen. Probeer opnieuw.");
                }
            } catch(NumberFormatException e){
                    System.out.println("Ongeldige invoer! Probeer opnieuw.");
                }
            }
        }
    }

