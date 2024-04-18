package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(100); 

        System.out.println("Bienvenido al juego de adivinar el número.");
        System.out.println("He pensado en un número entre 1 y 100, intenta adivinarlo.");

        boolean hasGuessed = false;
        while (!hasGuessed) {
            System.out.print("Ingresa tu número: ");
            int guess = scanner.nextInt();
            hasGuessed = game.checkGuess(guess);
        }

        scanner.close();
    }
}
