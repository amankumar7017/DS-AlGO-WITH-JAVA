class CommonElement3Array{
	public static void main(String[] args) {


//sorted 3 Array given 

// approch -
// step 1 intersection of 2 array
//step 2 result of above Intersection, intersect with last array which is 3rd array

		 int n1=sc.nextInt();
	     int n2=sc.nextInt();
	     int n3=sc.nextInt();
	    
	        LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
            LinkedHashSet<Integer> h2=new LinkedHashSet<Integer>();
            LinkedHashSet<Integer> h3=new LinkedHashSet<Integer>();
          
	     for(int i=0;i<n1;i++)
	     h1.add(sc.nextInt());
	     for(int i=0;i<n2;i++)
	     h2.add(sc.nextInt());
	     h1.retainAll(h2);
	     for(int i=0;i<n3;i++)
	     h3.add(sc.nextInt());
	    h1.retainAll(h3);
	     int length=h1.size();
         if(length>=1){
             Iterator<Integer> i = h1.iterator(); 
        while (i.hasNext()) 
            System.out.print(i.next()+" ");   
         }
         else{
             System.out.print("-1");
         }
         System.out.println();

	}
}
// Input:
// 6 5 8
// 1 5 10 20 40 80
// 6 7 20 80 100
// 3 4 15 20 30 70 80 120
// Output:
// 20 80
