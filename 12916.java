class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int numP = 0;
        int numY = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') {
                numP++;
            } else if (c == 'y' || c == 'Y') {
                numY++;
            }
        }
        if (numP == numY) {
            answer = true;
        }
        return answer;
    }
}
