public class Exam25 {
    static short getNumber() {
        return (short) (Math.random() * 45 + 1);
    }

    public static void main(String[] args) {
        short[] Num = {0, 0, 0, 0, 0, 0};
        short i, k, num;
        char dupl = 'N';

        System.out.println("** 번호 추첨을 시작합니다. **\n\n");

        for (i = 0; i < 6; ) {
            num = getNumber();

            for (k = 0; k < 6; k++)
                if (Num[k] == num)
                    dupl = 'Y';

                if (dupl == 'N')
                    Num[i++] = num;
                else
                    dupl = 'N';
            }
            System.out.println("추첨된 번호 ==> ");
            for (i = 0; i < 6; i++) {
                System.out.printf("%d ", Num[i]);
            }
        }
    }


