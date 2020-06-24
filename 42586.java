import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList();
        Queue<Integer> q = new LinkedList();
        int len = progresses.length;
        int[] time = new int[len];
        
        for(int i = 0 ; i < len ; i++){
            if( (100-progresses[i])%speeds[i] == 0){
                time[i] = (100-progresses[i])/speeds[i];
            }else{
                time[i] = ((100-progresses[i])/speeds[i]) +1;
            }
        }
        // System.out.println(Arrays.toString(time));
                    
        int deploy = 1;
       for(int i = 0 ; i < time.length ; i++){
           int item = time[i];
           if(q.isEmpty()){
               q.add(item);
           }else if (q.peek() >= item){
               q.add(item);
           }else if (q.peek() < item){
               int count = 0;
               while(q.isEmpty() == false){
                   q.poll();
                   count++;
               }
               answer.add(count);
               q.add(item);
           }
           // System.out.println(q);
       }
        
        if(q.isEmpty() == false){
            int count = 0;
               while(q.isEmpty() == false){
                   q.poll();
                   count++;
               }
                answer.add(count);
        }

        int[] array = new int[answer.size()];
        for(int i = 0 ; i < answer.size() ; i++){
            array[i] = answer.get(i);
        }
        // Arrays.toString(array);
        return array;


    }
}
