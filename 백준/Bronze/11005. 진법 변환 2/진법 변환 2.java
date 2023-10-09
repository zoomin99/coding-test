import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        List<Character> characterList = new ArrayList<>();
        List<Character> answer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            characterList.add((char) (48 + i));
        }
        for (int i = 0; i < 26; i++) {
            characterList.add((char) (i + 'A'));
        }

        while (true) {
            answer.add(0, characterList.get(N % B));
            N /= B;
            if (N < B) {
                if (N > 0) {
                    answer.add(0, characterList.get(N));
                }
                break;
            }
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
        }
    }
}