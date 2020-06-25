import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> q1 = new LinkedList();
        Queue<Truck> q2 = new LinkedList();
        
        for(int i : truck_weights){
            Truck t = new Truck();
            t.weight = i;
            t.pos = 0;
            q1.add(t);
        }
        int totalWeight = 0;
        
        while(q1.isEmpty() == false || q2.isEmpty() == false){
            answer++;
            // System.out.print(answer+"초 sum : ");
            // System.out.println(totalWeight);

            if(q1.isEmpty() == false){
                if(totalWeight + q1.peek().weight <= weight){
                    Truck t = q1.poll();
                    totalWeight += t.weight;
                    t.pos++;
                    q2.add(t);
                    // System.out.println("q1에서 뽑아서 q2로 " + t.weight);
                }
            }
            
            if(q2.peek().pos == bridge_length){
                totalWeight = totalWeight - q2.peek().weight;
                int w = q2.peek().weight;
                q2.poll();
                // System.out.println("다 건너서 없앰" + w);

            }
            
            for(Truck t : q2){
                t.pos++;
            }
        
        }
        answer++;
        return answer;
    }
}
class Truck {
    int weight;
    int pos;
}
