package ArraysOfNumbers;

import java.util.Arrays;

public class ArraysOfNumbers {
    public int arrayElementMutiplySelf(int[]numbers) {
        int productSelf = 0;
        for (int i = 0; i < numbers.length ; i++) {
            productSelf =numbers[i] * numbers[i];
            System.out.println(productSelf);
        }
        return productSelf;
    }

    public String getInDescendingOrder(int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(numbers);
    }

    public String ascendingOrder(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(numbers);
    }
}


