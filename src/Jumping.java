import java.util.Scanner;

public class Jumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[numberOfElements];
        int[] lengthOfSequencesArray = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = sc.nextInt();
        }

        int TopOfQueue = 0;
        int tempNumber;
        int maxLengthOfSequences = 0;

        for (int i = 0; i < numberOfElements; i++) {
            tempNumber = numbers[TopOfQueue];
            int lengthOfSequences = 0;
            int tempMax = 0;
            for (int j = TopOfQueue; j < numberOfElements; j++) {
                int currentNumber = numbers[j];
                if (currentNumber > tempNumber && currentNumber > tempMax) {
                    lengthOfSequences++;
                    tempMax = currentNumber;
                }
            }
            if (lengthOfSequences > maxLengthOfSequences) {
                maxLengthOfSequences = lengthOfSequences;
            }
            lengthOfSequencesArray[i] = lengthOfSequences;
            TopOfQueue++;
        }

        System.out.println(maxLengthOfSequences);
        for (int print:lengthOfSequencesArray) {
            System.out.print(print + " ");
        }
    }
}