class StringToIntConvert{
	public static void main(String[] args) {

	//	Convert String To Integer In Java

		String s = "2020";
         
        int i = Integer.parseInt(s);
         
        System.out.println(i);  
               
        String st = "2015";
         
        int it = Integer.valueOf(st);
         
        System.out.println(it);  

        // Convert Integer To String In Java

        int iy = 2010;
         
        String sy = Integer.toString(iy);
         
        System.out.println(sy);     
		
		int iu = 2005;
         
        String su = String.valueOf(iu);
         
        System.out.println(su);   
	}
}