import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] salaryBook=generateRandomArray();
        int sumSalaryForMonth=sumOfArray(salaryBook);
        System.out.println("Книга зарплат: "+ Arrays.toString(salaryBook));
        //1
        System.out.println("Сумма трат за месяц составила " + sumSalaryForMonth + " рублей");
        //2
        int min=min(salaryBook);
        int max=max(salaryBook);
        System.out.println("Минимальная сумма трат за день составила "+ min +" рублей. Максимальная сумма трат за день составила "+ max +" рублей");
        //3
        System.out.println("Средняя сумма трат за месяц составила "+ (float)sumSalaryForMonth/30 +" рублей");
        //4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i=reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int min(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}