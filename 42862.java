https://programmers.co.kr/learn/courses/30/lessons/42862?language=java

import java.util.*;
class Solution {
    int[] losts;
    int[] reserves;
    int matches;
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        losts = lost;
        reserves = reserve;
        //체육복을 안 가져온 학생만큼 뺀다.
        answer = answer - lost.length;
        //자기가 잃어버리고 자기꺼 입는 사람 먼저 없앤다.
        matches = findIdot();
        matches = matches + findMatchingClothes();
        answer = answer + matches;
        return answer;
    }
    public int findIdot() {
        int matches = 0;
        for (int j = 0; j < losts.length; j++) {
            int item = losts[j];
            for (int i = 0; i < reserves.length; i++) {
                int compare = reserves[i];
                if (item == compare) {
                    losts[j] = -2;
                    reserves[i] = -2;
                    matches++;
                }

            }
        }
        return matches;
    }

    public int findMatchingClothes() {
        int matches = 0;
        loop:
            for (int j = 0; j < losts.length; j++) {
                int item = losts[j];
                for (int i = 0; i < reserves.length; i++) {
                    int compare = reserves[i];
                    if (item == -2) {
                        break;
                    }
                    if (compare + 1 == item || compare - 1 == item || compare == item) {
                        // System.out.println("compare + 1 : " + (compare+1));
                        // System.out.println("compare - 1 : " + (compare-1));
                        // System.out.println("item : " + item);
                        matches++;
                        losts[j] = -2;
                        reserves[i] = -2;
                        item = -2;
                    }
                }
            }
        return matches;
    }
}
