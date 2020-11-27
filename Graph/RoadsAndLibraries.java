import java.util.*;
import java.lang.*;
import java.io.*;


public class RoadsAndLibraries{

   // problem link -  https://www.hackerrank.com/challenges/torque-and-development/submissions/code/189388429


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){

            int vertex = sc.nextInt()+1;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertex);

        for(int i = 0 ; i < vertex ; i++){
            adj.add(new ArrayList<>());
        }   

        int edge = sc.nextInt();

        
        int clib = sc.nextInt();
        int croad = sc.nextInt();
   
        while(edge-->0){

            int a = sc.nextInt();
            int b = sc.nextInt();

            addEdge(adj,a,b);

        }

        boolean[] visited = new boolean[vertex+1];

        long ans = 0 ;

     

         for(int i = 1 ; i<vertex;i++ ){

            if(visited[i] == false){

                ArrayList<Integer> list = new ArrayList<>();

                dfs(adj,vertex,i,visited,list);
                
                if(clib<=croad){
                    ans+=clib*list.size();
                }else{
                    ans+=clib + croad * (list.size()-1);
                }

            }
        }
          System.out.println(ans);
         



        }

      


    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){

        adj.get(u).add(v);
        adj.get(v).add(u);
        
    }

    

    static void dfs(ArrayList<ArrayList<Integer>> adj,int vertex,int src,boolean[] visited,ArrayList<Integer> list){

    //  ArrayList<Integer> al  = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

       

        st.add(src);
        // al.add(0);
        //visited[0] = true;

        while(!st.isEmpty()){


        int t = st.pop();

        if(visited[t] == false){
           // System.out.print(t);
            list.add(t);
            visited[t] = true;


            ArrayList<Integer> temp_list = adj.get(t);

            for(int temp : temp_list){

                if(visited[temp] == false)  
                    st.add(temp);
            }

        }

        } 
 
        

    }
}