package zadania;

public class zadanie5 {
    public static void arrayMinMax(int[] numbers) {
        if(numbers.length > 0) {
            int min = numbers[0];
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max){
                    max = number;
                }
                if (number < min) min = number;
            }
            System.out.println("min: " + min);
            System.out.println("max: " + max);

        }
}

public static void maun(String[] args) {
        int[] numbers = {99, -1, 11};
        
    }
}

