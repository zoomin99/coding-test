class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
            int sum = 0;
            for(int j = i;sum<n;j++){
                sum+=j;
                if(sum>n){
                    break;
                }
                else if(sum==n){
                    //System.out.println("sum: "+sum+" i: "+i+" j: "+j);
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}