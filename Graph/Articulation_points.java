
import java.io.*; 
import java.util.*; 

// This class represents a directed graph 
// using adjacency list representation 
public class Articulation_points{ 

// No. of vertices   
private int V; 

//Adjacency Lists 
private LinkedList<Integer> adj[]; 
private int Time; 

// Constructor 
@SuppressWarnings("unchecked") 
Graph(int v) 
{ 
    V = v; 
    adj = new LinkedList[v]; 
    
    for(int i = 0; i < v; ++i) 
        adj[i] = new LinkedList(); 
        
    Time = 0; 
} 

// Function to add an edge into the graph 
void addEdge(int v,int w) 
{ 
    adj[v].add(w); 
} 


void SCCUtil(int src, int low[], int disc[], 
            boolean visited[], 
            int[] parent,int time,ArrayList<Integer> al) 
{ 
    visited[src] = true;
    low[src] = disc[src] = ++time;
    int child = 0;

    for(int temp : adj[src])
    {

        if(visited[temp] == false)
        {
            child++;
            parent[temp] = src ;
            SCCUtil(temp,low,disc,visited,parent,time,al);

            low[src] = Math.min(low[src],low[temp]);

            // if current Node is root and it has more than one children 
            // then add it to answer list.
            if(parent[src] == -1 && child >1){
                al.add(src);
            }

            if(parent[src] != -1 && low[temp] >= disc[src]){
                al.add(src);
            }

        }else if(temp  !=parent[src]){ // back_edge 
            low[src] = Math.min(low[src],disc[temp]);
        }


    }
   
} 

// The function to do DFS traversal. 
// It uses SCCUtil() 
void SCC() 
{ 
   
    int disc[] = new int[V]; 
    int low[] = new int[V]; 
    for(int i = 0;i < V; i++) 
    { 
        disc[i] = -1; 
        low[i] = -1; 
    } 
    int[] parent = new int[V]; 
    Arrays.fill(parent,-1);
    boolean visited[] = new boolean[V]; 
    ArrayList<Integer> al = new ArrayList<>();
  
    for(int i = 0; i < V; i++) 
    { 
        if (disc[i] == -1){ 
            SCCUtil(i, low, disc, 
                    visited, parent,0,al); 
           
        }
    }

	System.out.println(al); 
	al.clear();
	
} 

// Driver code 
public static void main(String args[]) 
{ 
    
    // Create a graph given in the above diagram 
    Graph g1 = new Graph(8); 

    g1.addEdge(1, 0); 
    g1.addEdge(0, 3); 
    g1.addEdge(2, 3); 
    g1.addEdge(0, 3); 
    g1.addEdge(3, 4); 
	g1.addEdge(2, 5); 
    g1.addEdge(2, 6); 
    g1.addEdge(5, 6); 
  //  g1.addEdge(3, 4); 

    System.out.println("Articulation points in graph "); 
    g1.SCC(); 

   
} 
} 


