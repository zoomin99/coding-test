import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int answer = 0;

        int[] intArr = new int[26];
        int[] intArr2 = new int[26];

        for (char ch : str1.toCharArray()) {
            intArr[(int) ch - (int) 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            intArr2[(int) ch - (int) 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            answer += Math.abs(intArr[i] - intArr2[i]);
        }

        System.out.println(answer);
    }
}
