import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int answer = 0;

        int startIndex = 0;

        while (true) {
            int findIndex = str1.indexOf(str2, startIndex);
            if (findIndex < 0) {
                break;
            }
            answer++;

            startIndex = findIndex + str2.length();
        }
        System.out.println(answer);
    }
}
