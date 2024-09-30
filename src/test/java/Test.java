import dev.siea.NardoFilter;

import java.util.Scanner;

public class Test {

    public Test(String target) {
        NardoFilter nf = new NardoFilter(target);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings to filter (type 'exit' to quit):");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            String filtered = nf.filterWithFeedback(input);

            System.out.println("Input: " + input + "/Target: " + target + " || Result: " + filtered);

        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word to filter: ");
        String target = scanner.nextLine();

        Test test = new Test(target);

        scanner.close();

    }
}
