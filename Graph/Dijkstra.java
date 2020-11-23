import java.util.*;
import java.lang.*;
import java.io.*;

class Dijkstra{
		
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



		int vertex = 6;

		for(int i = 0 ; i < vertex ; i++){
			adj.add(new ArrayList<>());
		}	

			addEgde(adj,0, 1, 4);
            addEgde(adj,0, 2, 3);
            addEgde(adj,1, 3, 2);
            addEgde(adj,1, 2, 5);
            addEgde(adj,2, 3, 7);
            addEgde(adj,3, 4, 2);
            addEgde(adj,4, 0, 4);
            addEgde(adj,4, 1, 4);
            addEgde(adj,4, 5, 6);  

         //   print(adj,vertex);
            Dijkstra(adj,vertex,0);

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

	static void Dijkstra(ArrayList<ArrayList<Edge>> adj,int vertex,int src){

		boolean[] visited = new boolean[vertex];

		Queue<Pair> q = new PriorityQueue<Pair>(); 

		q.add(new Pair(src,src+"",0));

		while(!q.isEmpty()){

			Pair rem = q.remove();

			if(visited[rem.v] == false){

				visited[rem.v] = true;

			System.out.print(rem.v+" ");

			ArrayList<Edge> list = adj.get(rem.v);

			for(Edge e : list){
				if(visited[e.u] == false){
					q.add(new Pair(e.u,rem.psf+e.u,rem.wsf+e.w));
					}
				}
			}
		}
	}

	static class Pair implements Comparable<Pair> {
		int v; 
		String psf;
		int wsf;

		Pair(int v,String psf,int wsf){
			this.v = v;
			this.psf = psf;
			this.wsf = wsf;
		}


		public int compareTo(Pair p1){
			return this.wsf - p1.wsf;
		}

	}


}
