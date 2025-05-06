//////////////////////////////////////////////////////////////////// 
// GIULIA CREMA 2111945 
// ANGELA FAVARO 2111015
////////////////////////////////////////////////////////////////////

public class IntegerToRoman {
    public static String convert(int number) {

        // Definizione delle lettere romane e dei loro valori corrispondenti
        String[] romanLetters = {"I"};
        int[] values = {1};

        StringBuilder romanNumber = new StringBuilder();

        // Itera attraverso i valori romani e aggiungi le lettere corrispondenti
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }

        return romanNumber.toString();
    }
}