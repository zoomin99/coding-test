import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";

        List<Integer> intList = Arrays.stream(s.split(" ")).map(ch -> Integer.valueOf(ch)).collect(Collectors.toList());
        intList.sort(Comparator.naturalOrder());
        answer += intList.get(0) + " " + intList.get(intList.size() - 1);
        return answer;
    }
}