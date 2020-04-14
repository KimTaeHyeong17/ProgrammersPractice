//https://programmers.co.kr/learn/courses/30/lessons/64061

import java.util.*;
class Solution {
    int[][] array;
    Stack<Integer> stack = new Stack();
    int answer = 0;
    
    public int solution(int[][] board, int[] moves) {
        array = board;
        // printArray();

        for(int move : moves){
            pick(move);
            checkScore();
        }
        // System.out.println("");
        // printArray();
        // printStack();
        
        return answer;
    }
    public void checkScore(){
        if(stack.size() > 1){
            int pop = stack.pop();
            int peek = stack.peek();
            if (peek == pop){
                answer = answer + 2;
                stack.pop();
            }else{
                stack.push(pop);
            } 
        }
    }
    public void pick(int col){
        // col 이 1 이면 
        loop:
        for(int i = 0 ; i < array.length ; i++){
            int[] row = array[i];
            for(int j = 0 ; j < row.length ; j++){
                int item = row[j];
                if(j == col-1){
                    if(item != 0){
                        array[i][j] = 0;
                        stack.push(item);
                        // printArray();
                        break loop;
                    }

                }// end of if
            }// end of j loop
        }//end of i loop
    }
    public void printArray(){
        for(int[] row : array){
            System.out.println("");
            for(int item : row){
                System.out.print(item);
            }
        } 
        System.out.println("");
    }
    public void printStack(){
        System.out.println(Arrays.toString(stack.toArray()));
    }
}
