import java.util.*;

public class main {
    
    public static void main(String[] args) 
{
    	 
        int[][] adjMatrix = 
{
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 1, 1, 0}
};
        bfs(adjMatrix, 0);
        
     
        HashMap<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B", "F"));
        graph.put("F", Arrays.asList("C", "E"));
        bfs(graph, "A");
}
    
   
    public static void bfs(int[][] adjMatrix, int startVertex) 
{
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[adjMatrix.length];
        
        visited[startVertex] = true;
        queue.add(startVertex);
        
        System.out.print("Breadth First Search Traversal with integer vertex labels: ");
        while(!queue.isEmpty()) 
{
            int currVertex = queue.poll();
            System.out.print(currVertex + " ");
            
         
            for(int i = 0; i < adjMatrix.length; i++) 
{
                if(adjMatrix[currVertex][i] == 1 && !visited[i]) 
{            
                    visited[i] = true;
                    queue.add(i);
}
}
}
        System.out.println();
}
    
   
    public static void bfs(HashMap<String, List<String>> graph, String startVertex) 
{
        Queue<String> queue = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();
        
        visited.add(startVertex);
        queue.add(startVertex);
        
        System.out.print("Breadth First Search Traversal with string vertex labels: ");
        while(!queue.isEmpty()) 
{
            String currVertex = queue.poll();
            System.out.print(currVertex + " ");
            
          
            for(String neighbor : graph.get(currVertex)) 
{
                if(!visited.contains(neighbor)) 
{
                    visited.add(neighbor);
                    queue.add(neighbor);
}
}
}
        System.out.println();
}
}