class Solution {
    int[] answer = {0, 0};

    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (!sb.toString().equals("1")) {
            removeZero(sb);
            convertToBinary(sb.length(), sb);
            answer[0]++;
        }
        return answer;
    }

    public void removeZero(StringBuilder sb) {
        char[] charArr = sb.toString().toCharArray();
        sb = sb.delete(0,sb.length());
        for (char ch : charArr) {
            if (ch != '0') {
                sb.append(ch);
            } else {
                answer[1]++;
            }
        }
    }

    public void convertToBinary(int s, StringBuilder sb) {
        sb.delete(0,sb.length());
        while (s > 1) {
            sb.insert(0, s % 2);
            s /= 2;
        }
        sb.insert(0, 1);
    }
}