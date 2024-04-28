package _01_Lambda_Methods;

public class LambdaMethods {
    public static void main(String[] args) {
        // 1. Look at the SpecialPrinter function interface.

        // Here is an example of calling the printCustomMessage method with a lambda.
        // This prints the passed-in String 10 times.
        printCustomMessage((s) -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(s);
            }
        }, "repeat");

        // 2. Call the printCustomMessage method using a lambda so that the String prints backwards.
        printCustomMessage((s) -> {
            StringBuilder reversed = new StringBuilder(s).reverse();
            System.out.println(reversed);
        }, "backwards");

        // 3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper and lower case characters.
        printCustomMessage((s) -> {
            StringBuilder mixedCase = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Math.random() < 0.5) {
                    mixedCase.append(Character.toUpperCase(c));
                } else {
                    mixedCase.append(Character.toLowerCase(c));
                }
            }
            System.out.println(mixedCase);
        }, "mixed case");

        // 4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
        printCustomMessage((s) -> {
            StringBuilder withPeriod = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                withPeriod.append(s.charAt(i));
                if (i != s.length() - 1) {
                    withPeriod.append('.');
                }
            }
            System.out.println(withPeriod);
        }, "periods");

        // 5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
        printCustomMessage((s) -> {
            String withoutVowels = s.replaceAll("[aeiouAEIOU]", "");
            System.out.println(withoutVowels);
        }, "vowels");
    }

    public static void printCustomMessage(SpecialPrinter sp, String value) {
        sp.printSpecial(value);
    }

}
	
