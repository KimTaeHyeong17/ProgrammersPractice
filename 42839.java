import java.util.*;
class Solution {
    String[] array;
    HashSet<Integer> set = new HashSet();
    
    public int solution(String numbers) {
        
        //순열
        array = numbers.split("");
        int n = array.length;
        LinkedList<Integer> perArr = new LinkedList();
        int[] checkArr = new int[n];
        for(int r = 0 ; r <= n ; r++){
            permutation(n, r, perArr, checkArr);
        }
        return set.size();
    }
    public boolean check(String str){
        if(str.equals("")){
            return false;
        }else{
           int num = Integer.parseInt(str);
            
            if(num==1 || num == 0){
                return false;
            }
            if(num==2){
                return true;
            }
            for(int i = 2 ; i < num ; i++){
                if(num%i==0){
                    return false;
                }
            }
            // System.out.println(num);
            return true;  
        }
    }
    
    public void permutation(int n, int r, LinkedList<Integer> perArr, int[] checkArr){
        if(r==perArr.size()){
            StringBuilder builder = new StringBuilder();
            for(int i : perArr){
                builder.append(array[i]);
            }
            String result = new String(builder);
            if(check(result)) set.add(Integer.parseInt(result));
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
