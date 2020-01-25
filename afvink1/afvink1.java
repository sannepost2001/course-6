package afvink1;

import java.util.*;
import java.util.stream.Collectors;

class BubbleSortExample {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
//        System.out.println("Geef 10 getallen in");
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++)
        {
//            System.out.println("Geef een nieuw nummer in");
//            array[i] = input.nextInt();
            Random r = new Random();
            int max = 100;
            int min = 0;
            array[i] = r.nextInt((max - min) + 1) + min;
        }

//        int[] array = {99, 88, 55, 77, 1, 66};

        System.out.print("ongesoorteerde data: ");
        printArray(array);

        System.out.print("oplopende order: "); //1,55,66,77,88,99
        bubble(array);

        printArray(array);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime /1000000000 + " seconden");
    }


    private static void bubble(int[] input) {

        int inputLength = input.length;
        int getal;

        for (int i = 0; i < inputLength; i++) {

            for (int j = 1; j < (inputLength - i); j++) {

                if (input[j - 1] > input[j]) {
                    getal = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = getal;
                }
            }
        }
    }
    private static void printArray(int[] data) {
        String resultaat = Arrays.stream(data).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(resultaat);
    }

}