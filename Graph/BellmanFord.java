import java.util.*;
import java.lang.*;
import java.io.*;

class BellmanFord{

	static class Edge{
		int v;
		int u;
		int w;

		Edge(int vertex,int destination,int weight){
			this.v = vertex;
			this.u = destination;
			this.w = weight;
		}
	}


	public static void main(String[] args) {
		
		ArrayList<ArrayList<Edge>> adj  =  new ArrayList<>();



		int vertex = 5;

		for(int i = 0 ; i < vertex ; i++){
			adj.add(new ArrayList<>());
		}	

			addEgde(adj,0, 2, 6);
            addEgde(adj,0, 3, 6);
            addEgde(adj,1, 0, 3);
            addEgde(adj,2, 3, 2);
            
            addEgde(adj,3, 4, 1);
            addEgde(adj,3, 2, 1);
            addEgde(adj,4, 1, 4);
            addEgde(adj,4, 3, 2);  

         //  print(adj,vertex);
            BellmanFord(adj,vertex,4);


	}

	static void addEgde(ArrayList<ArrayList<Edge>> adj,int v,int u, int w){

		Edge e = new Edge(v,u,w);

		adj.get(v).add(e);

	}
	static void print(ArrayList<ArrayList<Edge>> adj,int vertex){

		for(int i = 0 ; i < vertex;i++){

			ArrayList<Edge> list = adj.get(i);

			for(Edge e : list){

				   System.out.println("vertex-" + i + " is connected to " +
                            e.u+ " with weight " +e.w);


			}


		}

	}


	static int getWeight(ArrayList<ArrayList<Edge>> adj,int src,int destination){

		ArrayList<Edge> list = adj.get(src);

		for(Edge e : list){

			if(e.v == src && e.u == destination){
				return e.w;
			}


		}

		return -1;

	}

	static void  BellmanFord(ArrayList<ArrayList<Edge>> adj,int vertex,int src){

		 int dist[] = new int[vertex]; 
  
        for (int i = 0; i < vertex; ++i) 
            dist[i] = Integer.MAX_VALUE; 
       
        dist[src] = 0; 

        for(int i = 0; i < vertex-1;i++){

        	for(int j =0 ;j<vertex;j++){

        	ArrayList<Edge> list = adj.get(j);

        	for(Edge e : list){

        		int gw = getWeight(adj, e.v, e.u);

        		if(dist[e.v]!=Integer.MAX_VALUE &&  dist[e.v]+gw < dist[e.u]){

        			dist[e.u] = dist[e.v]+gw;
        			
        		}

        	}

        	} 


        }


        int i =0 ;
        for(int temp: dist){
        	System.out.println("vertex "+i+" has sssp of "+temp);
        	i++;
        }


   

       
	}
}	
