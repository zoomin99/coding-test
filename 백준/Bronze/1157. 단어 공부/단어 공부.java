import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;


        str = bf.readLine();


        bw.write(sol.solution(str) + "\n");
        bw.flush();
    }
}

class Solution {
    public char solution(String str) {
        char answer = '0';
        str = str.toUpperCase();

        int[] count = new int[26];
        for (char ch : str.toCharArray()) {
            int chNum = (int) (ch - 65);
            count[chNum]++;
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
                answer = (char) (maxIndex + 65);
            } else if (count[i] == max && max > 0) {
                answer = '?';
            }
        }

        return answer;
    }
}
