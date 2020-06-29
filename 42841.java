import java.util.*;
class Solution {
    String[] nums = {"1","2","3","4","5","6","7","8","9"};
    Stack<String> st = new Stack();
    public int solution(int[][] baseball) {
        int answer = 0;
        
        //3자리 수를 모두 만든다.
        //{1~9까지 중복X 순서O}
        int n = nums.length;
        int r = 3;
        LinkedList<Integer> perArr = new LinkedList();
        int[] checkArr = new int[n];
        permutation(n,r,perArr,checkArr);
        while(st.isEmpty() == false){
            String str = st.peek();
            String[] num = st.pop().split("");

            boolean result = true;
            for(int i = 0 ; i < baseball.length ; i++){
                int[] item = baseball[i];
                String[] compareNum = String.valueOf(item[0]).split("");
                int strike = item[1];
                int ball = item[2];
                
                //num 과 compareNum을 비교하여 strike와 ball 의 갯수가 맞을 경우 true
                int comStrike = 0;
         
                for(int j = 0 ; j < 3 ; j++){
                    if(num[j].equals(compareNum[j])) comStrike++;
                }
                
                int comBall = 0;
                for(int j = 0 ; j < 3 ; j++){
                    if(str.contains(compareNum[j])) comBall++;
                }
                comBall = comBall - comStrike;
         
                if(ball == comBall && strike == comStrike){
                }else{
                    result = false;
                }
            
            }//loop of i
            // 
            if(result) answer++;
            
        }
        
    
        
        return answer;
    }
    public void permutation(int n, int r, LinkedList<Integer> perArr, int[] checkArr){
        
        if(r==perArr.size()){
            StringBuilder builder = new StringBuilder();
            for(int i : perArr){
                builder.append(nums[i]);
            }
            st.push(new String(builder));
            return;
        }
        for(int i = 0 ; i < n ; i++){
            if(checkArr[i] == 0){
                perArr.add(i);
                checkArr[i] = 1;
                permutation(n,r,perArr,checkArr);
                perArr.removeLast();
                checkArr[i] = 0;
            }
        }
    }
}
