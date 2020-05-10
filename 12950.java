class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0 ; i < arr1.length ; i++){
            int[] arr1_sub = arr1[i];
            int[] arr2_sub = arr2[i];
            for(int j = 0 ; j < arr1_sub.length ; j++){
                int arr1_item = arr1_sub[j];
                int arr2_item = arr2_sub[j];
                answer[i][j] = arr1_item + arr2_item;
            }
        }
        return answer;
    }
}
