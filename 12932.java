class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        char[] charArray = String.valueOf(n).toCharArray();
        int index = 0;
        for(int i = charArray.length-1 ; i >= 0 ; i--){
            answer[index] = Integer.parseInt(String.valueOf(charArray[i]));
            index++;
        }
        return answer;
    }
}
