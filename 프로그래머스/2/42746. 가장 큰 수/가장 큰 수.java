import java.lang.*;
import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        String answer = "";
        String[] strArray = new String[numbers.length];
        
        for(int i = 0; i<strArray.length; i++){
            strArray[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        for(int i = 0; i< strArray.length; i++){
            answer+=strArray[i];
        }
        
        if(answer.charAt(0)=='0'){
            return "0";
        }
        return answer;
    }
}