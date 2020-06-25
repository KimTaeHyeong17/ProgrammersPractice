import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> cloth = new HashMap();
        HashMap<String,String> map = new HashMap();
        for(String[] array : clothes){
            String name = array[0];
            String category = array[1];
            if(map.containsKey(category)){
                int tmp = cloth.get(category);
                tmp++;
                cloth.put(category,tmp);
            }else{
                map.put(category,name);
                cloth.put(category,1);
            }
        }
   
        // System.out.println(cloth);
     
        for( String key : map.keySet() ){
            if (cloth.size() == 1){
                return cloth.get(key);
            }
            answer = answer*(cloth.get(key)+1);
        }
        
        answer--;
        return answer;
    }
}
