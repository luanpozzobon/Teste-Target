package luan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre um valor a ser verificado na sequência de Fibonacci");
        int value = sc.nextInt();

        if (belongsToFibonacci(value)) {
            System.out.printf("O valor %d, está contido na sequência de Fibonacci", value);
        } else {
            System.out.printf("O valor %d, não está contido na sequência de Fibonacci", value);
        }

    }

    private static boolean belongsToFibonacci(int number) {
        List<Integer> fibonacci = new ArrayList<>() {{
            add(0);
            add(1);
        }};

        int currentNumber = 1;
        for (int i = 1; currentNumber <= number; ++i) {
            currentNumber += fibonacci.get(i - 1);
            fibonacci.add(currentNumber);
        }

        return fibonacci.contains(number);
    }
}