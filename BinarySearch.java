import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[51];
        for(int i = 0; i< array.length; i++){
            int pair=2;
            array[i] = pair*i;
        }

        for(int i = 1; i< array.length; i++){
            System.out.print(array[i] + " | ");
        }

        System.out.println("\nWhat number are you looking for ?");
        int n = sc.nextInt();

        System.out.println("That number is in the position " + binarySearch(array, n));

    }

    private static int binarySearch(int array[], int numberToFind){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middlePosition = (low + high) / 2;
            int middleNumber = array[middlePosition]; // pega o valor desta psociao

            if(numberToFind == middleNumber){ // se numero digitado for igual ao numero da posciao meio
                return middlePosition; // retorne a posicao
            } else if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            }
            else{
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
