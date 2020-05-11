import java.util.*;
class Solution {
    int n = 0;
    public String[] solution(int n1, int[] arr1, int[] arr2) {
        String[] answer = new String[n1];
        n = n1;
        ArrayList<String> arraylist = new ArrayList();
        for(int i = 0 ; i < n ; i++){
            arraylist.add(Combine(Integer.toBinaryString(arr1[i]),Integer.toBinaryString(arr2[i])));
        }
        // System.out.println(arraylist);
       for(int i = 0 ; i < arraylist.size() ;i++){
           answer[i] = arraylist.get(i);
       }
        
        return answer;
    }
    
  
    public String Combine(String strA, String strB){
         while(strA.length() < n){
            strA = "0" + strA;
        }
         while(strB.length() < n){
            strB = "0" + strB;
        }
        String str = "";
        for(int i = 0 ; i < strA.length() ; i++){
            char chA = strA.charAt(i);
            char chB = strB.charAt(i);
            if(chA == ('0') && chB == ('0')){
                str = str + " ";
            }else{
                str = str + "#";
            }
        }
        // System.out.println(str);
        return str;
    }
}
