import  java.util.*;
class AlienLanguage{


	// question
	// Given a sorted dictionary of an alien language having N
	//  words and k starting alphabets of standard dictionary. 
	//  Find the order of characters in the alien language.

	// Input:  Dict[ ] = { "baa", "abcd", "abca", "cab", "cad" }, k = 4
	// Output: Function returns "bdac"



	public static void main(String[] args) {
		
		

        String[] words = {"baa", "abcd", "abca", "cab", "cad"}; 
       String ans = printOrder(words, words.length-1); 

       System.out.print(ans);

        // graph with vertex 3
       
    } 

     private static String printOrder(String[] words, int k) {
    	
     	 int n=words.length;
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i=0;i<k;i++)
            graph.add(new ArrayList<Integer>());
        
        for(int i=0;i<n-1;i++){
            String word1= words[i];
            String word2= words[i+1];
            for(int j=0;j<Math.min(word1.length(),word2.length());j++){
                if(word1.charAt(j)!=word2.charAt(j)){
                    graph.get(word1.charAt(j)-'a').add(word2.charAt(j)-'a');
                    break;
                }
            }
        }
        
        
        Stack<Integer> stack= new Stack<>();
        topSort(graph,stack,k);
        String s= new String("");
        while(!stack.isEmpty()){
            s+=(char)('a'+stack.pop());
        }
        return s;
        
    }

    public static void topSort(ArrayList<ArrayList<Integer>> graph,Stack<Integer> stack,int n){
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
            if(visited[i]==false)
                DFS(graph,visited,stack,i);
        
    }
    public  static     void DFS(ArrayList<ArrayList<Integer>> graph,boolean[] visited,Stack<Integer> stack,int u){
        visited[u]=true;
        for(int v:graph.get(u)){
            if(visited[v]==false)
                DFS(graph,visited,stack,v);
        }
        stack.push(u);
    }



    

    
  

     


}
