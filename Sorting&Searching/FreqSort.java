import java.util.*;
class FreqSort{

	public static void main(String[] args) {

		int[] arr = {6 ,6, 2 ,3 ,1 ,4, 1 ,5, 6 ,2 ,8, 7 ,4, 2 ,1 ,3, 4 ,5 ,9, 6};

		sortByFreq(arr,arr.length);

	}

 public static void sortByFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Pair> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(Integer key : hm.keySet()){
            al.add(new Pair(key,hm.get(key)));
        }

        

       Collections.sort(al,new sort1());

        

        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).y;j++){
                System.out.print(al.get(i).x+" ");   
            }
        }
    }


static class sort1 implements Comparator<Pair>{

    public int compare(Pair a,Pair b){
        
        return b.y-a.y;

   }
}
static class Pair{
	int x;
	int y;
	Pair(int x,int y){
		this.x = x;
		this.y = y;
	}
	

	public String toString() {
		return x+" "+y;
	}
}
}

