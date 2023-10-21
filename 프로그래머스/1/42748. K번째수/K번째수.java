import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[][] sortedArray = new int[commands.length][array.length];
        
        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sortedArray[i][j] = 999;
            }
        }
        
        for(int i = 0; i < commands.length; i++){
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                sortedArray[i][j] = array[j];
            }
        }
        
        
        for(int i = 0; i < commands.length; i++){
            Arrays.sort(sortedArray[i]);
            answer[i] = sortedArray[i][commands[i][2]-1];
        }
        return answer;
    }
}