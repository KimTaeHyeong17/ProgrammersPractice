class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int item = x;
        long num = x;
        for(int i = 0 ; i < n ; i++){
            answer[i] = num;
            num = num + item;
        }
        return answer;
    }
}
