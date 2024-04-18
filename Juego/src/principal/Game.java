package principal;

import java.util.Random;

public class Game {
    private int number;
    private int maxNumber;
    private Random random;

    public Game(int maxNumber) {
        this.maxNumber = maxNumber;
        this.random = new Random();
        this.number = random.nextInt(maxNumber) + 1;
    }

    public boolean checkGuess(int guess) {
        if (guess == number) {
            System.out.println("¡Correcto! Has adivinado el número.");
            return true;
        } else if (guess < number) {
            System.out.println("El número es mayor que " + guess + ".");
        } else {
            System.out.println("El número es menor que " + guess + ".");
        }
        return false;
    }

    public void resetGame() {
        this.number = random.nextInt(maxNumber) + 1;
    }
}
