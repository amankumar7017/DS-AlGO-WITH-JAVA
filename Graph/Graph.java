import java.util.*;
class Graph{


	private class Vertex{

		HashMap<String,Integer> nbrs = new HashMap<>(); 

	}


	HashMap<String,Vertex> vtce; 

	public Graph(){
		vtce = new HashMap<>();
	}


	public int numVertex(){

		return vtce.size();
	} 

	public boolean containsVertex(String s){
		return this.vtce.containsKey(s);
	}

	public void addVertex(String s){

		Vertex vtx = new Vertex();

		vtce.put(s,vtx);

	}

	public int numEdge(){

		ArrayList<String> keys = new ArrayList<>(vtce.keySet());

		int count= 0 ;

		for(String s : keys){
				
			Vertex vtx = vtce.get(s);	
			count += vtx.nbrs.size(); 

		}

		return count/2;
	}

	public boolean containsEdge(String vname1 , String vname2){


		Vertex vtx1 = vtce.get(vname1);

		Vertex vtx2 = vtce.get(vname2);

		if(vtx1 == null || vtx2== null || !vtx1.nbrs.containsKey(vname2))
		{
			return  false;
		}
		
		return  true;

	}


	public void addEdge(String vname1,String vname2,int cost){

		Vertex vtx1 = vtce.get(vname1);

		Vertex vtx2 = vtce.get(vname2);

		if(vtx1 == null || vtx2== null || vtx1.nbrs.containsKey(vname2))
		{
			return ;
		}

		vtx1.nbrs.put(vname2,cost);
		vtx2.nbrs.put(vname1,cost);
	}

	public void removeEdge(String vname1,String vname2){

		Vertex vtx1 = vtce.get(vname1);

		Vertex vtx2 = vtce.get(vname2);

		if(vtx1 == null || vtx2== null || !vtx1.nbrs.containsKey(vname2))
		{
			return ;
		}


		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void removeVertex(String vname){

		Vertex vtx = vtce.get(vname);

		ArrayList<String> keys  = new ArrayList<>(vtx.nbrs.keySet()); 

		for (String key : keys ) {
			
			Vertex nbrVtx = vtce.get(key);
			nbrVtx.nbrs.remove(vname);
		}

		vtce.remove(vname);

	}

	public void display(){

		ArrayList<String> keys = new ArrayList<>(vtce.keySet());

		for(String key : keys){

			Vertex vtx = vtce.get(key);

			System.out.println(key+":"+vtx.nbrs);
		}

	}

	public boolean hasPath(String vname1,String vname2,HashMap<String,Boolean> processed){

		processed.put(vname1,true);

		if(containsEdge(vname1,vname2)){

			
			return true;
		}

		Vertex vtx = vtce.get(vname1);

		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());

		for (String nbr : nbrs ) {
			
			if(!processed.containsKey(nbr) && hasPath(nbr,vname2,processed)){
				return true;
			}
		}
		return false;
	}

	private class Pair{
		String vname;
		String psf;
	}


	public boolean bfs(String src ,String dst){


		LinkedList<Pair> queue = new LinkedList<>();

		HashMap<String,Boolean>  processed = new HashMap<>(); 

		Pair sp = new Pair();
		sp.vname = src ;
		sp.psf = src;

		queue.add(sp);

		while(!queue.isEmpty()){
			Pair rp = queue.removeFirst();


			if(processed.containsKey(rp.vname)){
				continue;
			}

			processed.put(rp.vname,true);

			if(containsEdge(rp.vname,dst)){

				System.out.println(rp.psf+dst);

				return true;
			}

			Vertex rpVtx = vtce.get(rp.vname);

			ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());

			for(String nbr : nbrs){

				if(!processed.containsKey(nbr)){

					Pair np  = new Pair();
					np.vname = nbr;
					np.psf = rp.psf+nbr;

					queue.addLast(np);

				}
			}

		}

		return false;
	}

	public void bft(){


		LinkedList<Pair> queue = new LinkedList<>();

		HashMap<String,Boolean>  processed = new HashMap<>(); 

		ArrayList<String> keys = new ArrayList<>(vtce.keySet());

		

		for (String key : keys) {
			
			if(processed.containsKey(key)){
				continue;
			}

		Pair sp = new Pair();
		sp.vname = key ;
		sp.psf = key;

		queue.add(sp);

		while(!queue.isEmpty()){


			Pair rp = queue.removeFirst();


			if(processed.containsKey(rp.vname)){
				continue;
			}

			processed.put(rp.vname,true);


			System.out.println(rp.vname+" via "+rp.psf);

			Vertex rpVtx = vtce.get(rp.vname);

			ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());

			for(String nbr : nbrs){

				if(!processed.containsKey(nbr)){

					Pair np  = new Pair();
					np.vname = nbr;
					np.psf = rp.psf+nbr;

					queue.addLast(np);

				}
			}

		}
	}

		
	}
	
	public boolean dfs(String src ,String dst){

		LinkedList<Pair> stack = new LinkedList<>();

		HashMap<String,Boolean>  processed = new HashMap<>(); 

		Pair sp = new Pair();
		sp.vname = src ;
		sp.psf = src;

		stack.addFirst(sp);

		while(!stack.isEmpty()){
			Pair rp = stack.removeFirst();


			if(processed.containsKey(rp.vname)){
				continue;
			}

			processed.put(rp.vname,true);

			if(containsEdge(rp.vname,dst)){

				System.out.println(rp.psf+dst);

				return true;
			}

			Vertex rpVtx = vtce.get(rp.vname);

			ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());

			for(String nbr : nbrs){

				if(!processed.containsKey(nbr)){

					Pair np  = new Pair();
					np.vname = nbr;
					np.psf = rp.psf+nbr;

					stack.addFirst(np);

				}
			}

		}

		return false;
	}


	public void dft(){

		LinkedList<Pair> stack = new LinkedList<>();

		HashMap<String,Boolean>  processed = new HashMap<>(); 

		ArrayList<String> keys = new ArrayList<>(vtce.keySet());


		for(String key : keys){

			if(processed.containsKey(key)){
				continue;
			}



		Pair sp = new Pair();
		sp.vname = key ;
		sp.psf = key;

		stack.addFirst(sp);

		while(!stack.isEmpty()){
			Pair rp = stack.removeFirst();


			if(processed.containsKey(rp.vname)){
				continue;
			}

			processed.put(rp.vname,true);



			System.out.println(rp.vname+" via "+rp.psf);


			Vertex rpVtx = vtce.get(rp.vname);

			ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());

			for(String nbr : nbrs){

				if(!processed.containsKey(nbr)){

					Pair np  = new Pair();
					np.vname = nbr;
					np.psf = rp.psf+nbr;

					stack.addFirst(np);

				}
			}

			}

		}
	}



}
