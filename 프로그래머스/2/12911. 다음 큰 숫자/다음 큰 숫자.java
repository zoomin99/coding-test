import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int n) {
        int answer = n;
        String binary = Integer.toBinaryString(n);
        int oneCount = findOneCount(binary);
        
        while(true){
            answer++;
            String answerBinary = Integer.toBinaryString(answer);
            if(oneCount==findOneCount(answerBinary)){
                break;
            }
        }
        return answer;
    }
    public int findOneCount(String str){
        int findNumber = 0;
        for(char ch : str.toCharArray()){
            if(ch=='1'){
                findNumber++;
            }
        }
        return findNumber;
    }
}