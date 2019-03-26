package deterministicfiniteautomaton;

import java.util.Scanner;

public class DeterministicFiniteAutomaton {

    public static void main(String[] args) {

        Validation validation = new Validation();

        String input;
        int state = 0;
        int position = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a entrada: ");
        input = sc.nextLine().trim();

        if (validation.validateAlphabet(input)) {
            while (position < input.length()) {
                printCI(input, state, position);

                Character element = input.charAt(position);

                switch (state) {
                    case 0:
                        state = element == '0' ? 0 : 1;
                        break;
                    case 1:
                        state = element == '0' ? 1 : 2;
                        break;
                    case 2:
                        state = element == '0' ? 0 : 3;
                        break;
                    case 3:
                        state = 3;
                        break;
                }
                position++;
            }
            printCI(input, state, position);
            System.out.println(state == 3 ? "Aceito!" : "Rejeitado!");

        } else {
            System.out.println("Alfabeto inválido. Rejeitado!");
        }
    }

    public static void printCI(String input, int state, int position) {
        System.out.print(input.substring(0, position));
        System.out.print(" [q" + state + "] ");
        System.out.println(input.substring(position));
    }
}
