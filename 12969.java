import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        for(int i = 0 ; i < a ; i++){
          str = str + "*";
        }
          for(int j = 0 ; j < b ; j++){
                System.out.println(str);
            }

    }
}
