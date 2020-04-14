import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int startIndex = 0;
        int endIndex = 0;
        int index = 0;

        //자르고 
        for (int i = 0 ; i < commands.length; i++){
            startIndex = commands[i][0];
            endIndex = commands[i][1];
            index = commands[i][2]-1;
            
            int[] pickedarray = new int[endIndex+1 - startIndex];
            int z = 0;
            for (int j = startIndex-1 ; j < endIndex ; j++){
                pickedarray[z] = array[j];

                z++;
        
            }
            
            for (int k = 0 ; k < pickedarray.length ; k++){
                System.out.print(pickedarray[k]);

            }
            System.out.println(" : " + pickedarray.length);
            
            Arrays.sort(pickedarray);
            int[] temp = pickedarray;
        
            answer[i] = temp[index];
        }
        return answer;
    }
}
