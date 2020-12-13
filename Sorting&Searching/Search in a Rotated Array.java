
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int search(int arr[],int l,int h,int x)
    {
        if(l>h)
            return -1;
        int mid = l + (h-l)/2;
        // base condition
        if(arr[mid] == x)
            return mid;
        // this means from 0 to mid the array is sorted    
        if(arr[l] <= arr[mid])
        {
            if(x >= arr[l] && x<=arr[mid])
                return search(arr,l,mid-1,x);
            return search(arr,mid+1,h,x);    
        }
        // second subarray is sorted from mid+1 to h
        if( x >= arr[mid] && x<= arr[h])
            return search(arr,mid+1,h,x);
        return search(arr, l, mid-1, x);     
    }
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int v=0;v<t;v++)
		{
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    String[] s = br.readLine().trim().split("\\s");
		    for(int i=0;i<n;i++)
		        arr[i] = Integer.parseInt(s[i]);
		    int k = Integer.parseInt(br.readLine());
		    int res = search(arr,0,n-1,k);
		    System.out.println(res);
		}
		
	}
}