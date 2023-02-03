package ArraysOfNumbers;

public class ArraysOfNumberMain {
    public static void main(String[] args) {
        ArraysOfNumbers numbers = new ArraysOfNumbers();
        int [] elite = {25,77,3,5,7,9,3};

        int mutiplySelf = numbers.arrayElementMutiplySelf(elite);
        System.out.println(mutiplySelf);

        System.out.println(numbers.ascendingOrder(elite));
        System.out.println(numbers.getInDescendingOrder(elite));
    }
}
