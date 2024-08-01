package Week_14_07012024.day_2;

public class Example {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 10, 3, 5, 4, 0, 1, 1, 1, 0, 10};

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(numbers[i] + " ");
            }
        }

    }

}
