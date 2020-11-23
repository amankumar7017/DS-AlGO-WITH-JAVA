import java.util.*;
import java.lang.*;
import java.io.*;

class Prims{
		
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



		int vertex = 7;

		for(int i = 0 ; i < vertex ; i++){
			adj.add(new ArrayList<>());
		}	

			addEgde(adj,0, 1, 10);
            addEgde(adj,0, 3, 25);
            addEgde(adj,1, 2, 10);
            addEgde(adj,2, 3, 10);
            addEgde(adj,3, 4, 20);
          
            addEgde(adj,4, 6, 8);
            addEgde(adj,5, 6, 3);
          	addEgde(adj,4, 5, 3);
          // print(adj,vertex);
            Prims(adj,vertex,0);

	}

	static void addEgde(ArrayList<ArrayList<Edge>> adj,int v,int u, int w){

		Edge e = new Edge(v,u,w);

		adj.get(v).add(e);

		Edge e2 = new Edge(u,v,w);
		adj.get(u).add(e2);

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

	static void Prims(ArrayList<ArrayList<Edge>> adj,int vertex,int src){

		boolean[] visited = new boolean[vertex];

		Queue<Pair> q = new PriorityQueue<Pair>(); 

		q.add(new Pair(src,-1,0));

		while(!q.isEmpty()){

			Pair rem = q.remove();

			if(visited[rem.v] == false){

				visited[rem.v] = true;

			if(rem.psf!=-1)
			System.out.println(rem.v+" - "+rem.psf+" @ "+rem.wsf);

			ArrayList<Edge> list = adj.get(rem.v);

			for(Edge e : list){
				if(visited[e.u] == false){
					q.add(new Pair(e.u,rem.v,e.w+rem.wsf));
					}
				}
			}
		}
	}

	static class Pair implements Comparable<Pair> {
		int v; 
		int psf;
		int wsf;

		Pair(int v,int psf,int wsf){
			this.v = v;
			this.psf = psf;
			this.wsf = wsf;
		}


		public int compareTo(Pair p1){
			return this.wsf - p1.wsf;
		}

	}


}
