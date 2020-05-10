class Solution {
    public int solution(int number) {
        int answer = 0;
        double num = number;
        if(number == 1){
            return 0;
        }
        while(true){
            if(num%2==0){
                num = num / 2;
            }else{
                num = num * 3 + 1;
            }
            answer++;
            if(answer>=500){
                System.out.println(num);
                return -1;
            }else if(num == 1){
                return answer;
            }
        }

    }
}
