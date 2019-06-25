import java.util.*;

public class SortNumber {

    /* method to count the number of digits */
    public int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }

    /* method to sort the digits in decending order */
    public void sortDigits(int[] array) {
        for (int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Sorted digits in non-increasing order: ");

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }

        System.out.println("");
    }

    /* method to calulate the sum of the even digits */
    public int evenSum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    /* main method */
    public static void main(String ss[]) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = number;
        SortNumber objSortNumber = new SortNumber();
        int length = objSortNumber.countDigits(number);
        int digitsArray[] = new int[length];
        int i = 0;
            while(n!=0) {
                int r = n % 10;
                digitsArray[i] = r;
                n /= 10;
                i++;
            }

        objSortNumber.sortDigits(digitsArray);

        int sum = objSortNumber.evenSum(digitsArray);

        System.out.println("Sum of even numbers: "+sum);

        if(sum>15){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
