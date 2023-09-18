import java.util.StringTokenizer;

class Solution {

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution("3people Unfollowed Me"));
//    }

    public String solution(String s) {

        s = s.toLowerCase();

        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();


        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word == " ") {
                sb.append(word);
            } else {
                char[] charArr = word.toCharArray();
                if (charArr[0] >= 'A' && charArr[0] <= 'z') {
                    charArr[0] -= 'a' - 'A';
                }
                sb.append(charArr);
            }
        }

        return sb.toString();
    }
}