import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class try_catch02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("a.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("여긴 정상 출력");
    }

}
