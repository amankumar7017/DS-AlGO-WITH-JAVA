import java.util.*;
import java.lang.*;
import java.io.*;

public class Test1{
	public static void main(String[] args){

		// ArrayList<Integer> al = new ArrayList<>();
		// al.add(){1,2,5,3,6};
	
		for(int i = 0 ; i<3;i++){
			al2.add(new ArrayList<>());
		}
		al2.get(0).add(5);
		al2.get(1).add(1);
		al2.get(1).add(2);
		al2.get(2).add(3);

		//Collections.sort(al);
		Collections.sort(al2,new LengthComparator());

		System.out.println(al2);
	}

static	class LengthComparator implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.get(0) - list2.get(0); // sort increasing order
    }
}
}
