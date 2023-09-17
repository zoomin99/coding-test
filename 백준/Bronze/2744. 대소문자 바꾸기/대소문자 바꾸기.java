import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] chArr = str.toCharArray();
        int num = (int) ((int) 'a' - (int) 'A');
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] >= 'a' && chArr[i] <= 'z') {
                chArr[i] -= num;
            } else {
                chArr[i] += num;
            }
        }
        System.out.println(new String(chArr));
    }
}