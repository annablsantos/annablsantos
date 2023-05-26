package Excecao;

import static Excecao.FindOutLier.findException;

public class FindOutLierMain {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 0, 100, 4, 11, 2602, 36};
        int exception1 = findException(array1);
        if (exception1 != -1) {
            System.out.println("Exception 1: " + exception1 + " is even.");
        } else {
            System.out.println("No exception number was found in array 1.");
        }

        int[] array2 = {160, 3, 1719, 19, 11, 13, -21};
        int exception2 = findException(array2);
        if (exception2 != -1) {
            System.out.println("Exception 2: " + exception2 + " is odd.");
        } else {
            System.out.println("No exception number was found in array 2.");
        }
    }
}
