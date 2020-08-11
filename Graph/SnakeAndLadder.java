import java.util.*;
public class SnakeAndLadder{

	 static class Pair{

		int vertex ;
		int distance ;

		// Pair(int vertex, int distance){
		// 	this.vertex = vertex;
		// 	this.distance = distance;
		// }

	}


	public static void main(String[] args) {
		
		int n = 30;
		int dis = 0 ;
		
		int board[] = new int[n];
		boolean visited[] = new boolean[n]; 

		Queue<Pair> queue = new LinkedList<>();

		for (int i =0; i<n ;i++ ) {
			board[i] = -1;
		}

		// ladder 

		board[2] = 21;
		board[4] = 7;
		board[10] = 25;
		board[19] = 28 ;


		//snake

		board[26] = 0;
	board[20] = 8;
		board[16] = 3;
		board[18] = 6;

		
		Pair pq = new Pair();

		pq.vertex = 0;
		pq.distance = 0;


		// mark 

		visited[0] = true;


		queue.add(pq);

		while(!queue.isEmpty()){


		 pq = queue.remove();

		 int removeVertex = pq.vertex; 


			if(removeVertex == n-1){
				break;
			} 

			// 6 time loop
			for (int i = removeVertex+1; i <= (removeVertex+6) && i < n ;i++) {
				
				if(!visited[i]){

					visited[i] = true;

					Pair np = new Pair();

					np.distance = pq.distance + 1;

					// vertex selection

					if(board[i] != -1){
						np.vertex = board[i];
					}else{
						np.vertex = i;
					}

					queue.add(np);

				}

			}



		}

		System.out.println(pq.distance);

	}

}