import java.util.*;
class ClientGraph extends Graph{

	public static void main(String[] args) {
		

		Graph graph = new Graph();

		graph.addVertex("A"); 
		graph.addVertex("B"); 
		graph.addVertex("C"); 
		graph.addVertex("D"); 
		graph.addVertex("E"); 
		graph.addVertex("F"); 
		graph.addVertex("G"); 
		

		graph.addEdge("A","D",2);
		graph.addEdge("A","B",3);
		graph.addEdge("B","C",4);
		graph.addEdge("B","A",3);
		graph.addEdge("C","D",7);
		graph.addEdge("C","B",4);
		graph.addEdge("D","E",10);
		graph.addEdge("E","F",9);
		graph.addEdge("E","G",8);
		graph.addEdge("G","F",6);

		graph.display();

		// System.out.println("-------------------");
		// System.out.println("Graph Current Number of Vertex "+graph.numVertex());
		// System.out.println("Graph Current Number of Edges "+graph.numEdge());
		// System.out.println("Graph Containing This Edge "+graph.containsEdge("E","D"));

		// graph.addEdge("A","C",5);
		// graph.display();

		// System.out.println("-------------------");

		// graph.removeEdge("A","C");
		// graph.display();

		// System.out.println("-------------------");


		// graph.removeVertex("A");
		// graph.display();

		// System.out.println("-------------------");

 		//System.out.println("Path exist ?\n"+graph.hasPath("A","X",new HashMap<>()));

 		// System.out.println("Sortest path "+graph.bfs("A","F"));

 		// System.out.println("Not gurante for Sortest path "+graph.dfs("A","F"));

 		//graph.dft();
		graph.bft();

	}
}