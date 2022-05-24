import java.util.Scanner;

public class Ex09_11 {
    static int plus(int v1, int v2){
        int result;
        result = v1 + v2;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        hap = plus(100, 200);

        System.out.printf("100과 200의 plus() 메소드의 결과는 : %d\n", hap);
    }
}