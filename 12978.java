import java.util.*;
class Solution {
    
      List<Node>[] list;
        int[] dist;
    
    List<Node>[] list2;
        int[] dist2;
    
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        list = new ArrayList[N+1];
        dist = new int[N+1];
        
        list2 = new ArrayList[N+1];
        dist2 = new int[N+1];
        
        Arrays.fill(dist,100000000);
        Arrays.fill(dist2,100000000);

        for(int i = 1 ; i <= N ; i++){
            list[i] = new ArrayList<>();
            list2[i] = new ArrayList<>();

        }
        
        for(int i = 0 ; i < road.length ; i++){
            int[] item = road[i];
            Node node = new Node(item[1], item[2]);
            list[item[0]].add(node);
            
            Node node2 = new Node(item[0], item[2]);
            list[item[1]].add(node2);
        }
        dijkstra(1,N);
        dijkstra2(1,N);
        
        for(int i = 1 ; i <= N ; i++){
            if(dist[i] == 100000000){
                if(dist2[i] == 100000000){
                    System.out.println("INF");
                }else{
                    if(dist[2]<=K){
                        answer++;
                    }
                    // System.out.println("1 에서 " +i+" 까지의 최단 경로 " +dist2[i]);
                }
            }else{
                if(dist[i] <= K){
                    answer++;
                }
                // System.out.println("1 에서 " +i+" 까지의 최단 경로 " +dist[i]);
            }
        }
        
        return answer;
    }
    
    public void dijkstra(int start, int v){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] check = new boolean[v+1];
        queue.add(new Node(start,0));
        dist[start] = 0;
 
        while(!queue.isEmpty()){
            Node current = queue.poll();
            int cur = current.end;
            if(check[cur] == true) continue;
            check[cur] = true;
            for(Node node : list[cur]){
                if(dist[node.end]>dist[cur]+node.weight){
                    dist[node.end] = dist[cur] + node.weight;
                    queue.add(new Node(node.end, dist[node.end]));
                }
            }
        }
    }
    public void dijkstra2(int start, int v){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] check = new boolean[v+1];
        queue.add(new Node(start,0));
        dist2[start] = 0;
 
        while(!queue.isEmpty()){
            Node current = queue.poll();
            int cur = current.end;
            if(check[cur] == true) continue;
            check[cur] = true;
            for(Node node : list[cur]){
                if(dist2[node.end]>dist2[cur]+node.weight){
                    dist2[node.end] = dist2[cur] + node.weight;
                    queue.add(new Node(node.end, dist2[node.end]));
                }
            }
        }
    }
}
class Node implements Comparable<Node>{
    int end, weight;

    public Node(int end, int weight){
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}
