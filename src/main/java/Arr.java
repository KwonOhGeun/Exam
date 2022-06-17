import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("정수 10개 입력 : ");

        int[] arr = new int[10];
        int i;

        for(i = 0; i<10; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(arr[1] + " " + arr[5] );
    }
}
