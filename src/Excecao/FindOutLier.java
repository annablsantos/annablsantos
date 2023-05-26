package Excecao;

public class FindOutLier {
    public static int findException(int[] numbers) {
        boolean pares = numbers[0] % 2 == 0 && numbers[1] % 2 == 0 || numbers[0] % 2 == 0 && numbers[2] % 2 == 0 || numbers[1] % 2 == 0 && numbers[2] % 2 == 0;

        for (int number : numbers) {
            if (pares && number % 2 != 0) {
                return number;
            } else if (!pares && number % 2 == 0) {
                return number;
            }
        }
        return -1;
    }
}
