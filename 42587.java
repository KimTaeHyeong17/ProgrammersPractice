import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue < Job > pq = new PriorityQueue();

        for (int i = 0; i < priorities.length; i++) {
            Job job = new Job();
            job.num = i;
            job.weight = priorities[i];
            pq.offer(job);
        }
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek().weight == priorities[i]) {
                    pq.poll();
                    answer++;
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
class Job implements Comparable < Job > {
    int num;
    int weight;
    @Override
    public int compareTo(Job target) {
        //오름차순 정렬
        if (this.weight > target.weight) {
            return -1;
        } else if (this.weight < target.weight) {
            return 1;
        }
        return 0;
    }
}
