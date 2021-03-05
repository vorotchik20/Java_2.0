package HomeWork4;

import java.util.Random;

public class ArraysHomeWork {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxNegative = -10;
        int minPositive = 10;
        int maxNegativeIndex = 0;
        int minPositiveIndex = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21)-10;
            System.out.print(array[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                if (array[i] < minPositive){
                    minPositive = array[i];
                    minPositiveIndex = i;
                }
            }else if(array[i] < 0) {
                if (array[i] > maxNegative){
                    maxNegative = array[i];
                    maxNegativeIndex = i;
                }
            }
        }

        System.out.println("minPositive = " + minPositive);
        System.out.println("maxNegative = " + maxNegative);

        array[maxNegativeIndex] = minPositive;
        array[minPositiveIndex] = maxNegative;
    }
}
