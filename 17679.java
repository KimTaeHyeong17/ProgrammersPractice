import java.util.*;
class Solution {
    int answer = 0;
    char[][] block;
    boolean[][] isThere;
    boolean getScored = true;
    public int solution(int m, int n, String[] board) {

        char[][] game = new char[m][n];
        boolean[][] localIsthere = new boolean[m][n];
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            game[i] = board[i].toCharArray();
        }
        block = game;
        isThere = localIsthere;
        //CCBDE CCBDE 00BDE | TTTANT TTTANT
        //AAADE 000DE 000DE | RRFACC 00FA00
        //AAABF 000BF 000BF | RRRFCC 00RF00
        //CCBBF CCBBF 00BBF | TRRRAA T00RAA
        //                  | TTMMMF TTMMMF
        //                  | TMMTTJ TMMTTJ
        // [ABCD, BACE, BCDD, BCDD]
        print(block);
        System.out.println("");

        while(getScored == true){
            find();     /*조건에 맞는 값을 구하고 answer++ 하고 해당값은 isThere = true처리한다.*/
            remove();   /*isThere 이 true 이면 0으로 만든다.*/
            // print(block);
            // System.out.println("");
            /* 0인 놈들을 내리고 다시 isThere값을 초기화 한다.*/
            for(int i = 0 ; i < m ; i++){
                gravity();
            }
            // print(block);
            // System.out.println("");  
            // printbool(isThere);
        }
        return answer;
    }
    /* 0인 놈들을 내리고 다시 isThere값을 초기화 한다.*/
    public void gravity(){
        for(int i = 0 ; i < block.length-1 ; i ++){
            for(int j = 0 ; j < block[i].length ; j++){
                if(block[i][j] != '0' && block[i+1][j] == '0'){
                    block[i+1][j] = block[i][j];
                    block[i][j] = '0';
                }
                if(isThere[i][j] != true && isThere[i+1][j] == true){
                    isThere[i+1][j] = isThere[i][j];
                    isThere[i][j] = true;
                }
            }
        }
    }
    /*isThere 이 true 이면 0으로 만든다.*/
    public void remove() {
        for(int i = 0 ; i < block.length ; i ++){
            for(int j = 0 ; j < block[i].length ; j++){
                if(isThere[i][j] == true){
                    block[i][j] = '0';
                }
            }
        }
    }
    /*조건에 맞는 값을 구하고 answer++ 하고 해당값은 isThere = true처리한다.*/
    public void find() {
        getScored = false;
        for (int i = 0; i < block.length - 1; i++) {
            // System.out.println(game[i]);
            // System.out.println(game[i + 1]);
            for (int j = 0; j < block[i].length - 1; j++) {
                if (block[i][j] == block[i][j + 1] 
                    && block[i + 1][j] == block[i + 1][j + 1] 
                    && block[i][j] == block[i + 1][j]
                    && block[i][j] != '0') {
                    getScored = true;

                    // System.out.print(block[i][j]);
                    // System.out.println(block[i][j + 1]);
                    // System.out.print(block[i + 1][j]);
                    // System.out.println(block[i + 1][j + 1]);
                    // System.out.println("");
                    if (isThere[i][j] == false) {
                        isThere[i][j] = true;
                        answer++;
                    }
                    if (isThere[i][j + 1] == false) {
                        isThere[i][j + 1] = true;
                        answer++;
                    }
                    if (isThere[i + 1][j] == false) {
                        isThere[i + 1][j] = true;
                        answer++;
                    }
                    if (isThere[i + 1][j + 1] == false) {
                        isThere[i + 1][j + 1] = true;
                        answer++;
                    }
                } //end of if
            } //end of j
        } //end of i

    }
    


    public void print(char[][] game) {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]);
            }
            System.out.println("");
        }
    }
    public void printbool(boolean[][] game) {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
