# splitting
import java.io.*;
import java.util.*;
public class Splitingarray
{
  public static void main(String args[])throws IOException 
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int len,n,a,b;
    
    System.out.println("Enter the size of array");
     n=Integer.parseInt(br.readLine());
    int []arr=new int[n];
    int []c=new int[n];
    int []d=new int[n];
    System.out.println("Enter the array element: " );
    for (int i = 0; i < n; i++) 
    {
       a=Integer.parseInt(br.readLine());
      arr[i]= a;
    }
    len=arr.length;
     b=len/2;
     if(len%2==0)
        {   
    for (int i = 0; i <b ; i++) 
      {
      c[i] = arr[2 * i];
      d[i] = arr[2 * i + 1];
    }
    System.out.print("c : " );
      for (int i = 0; i < c.length; i++) 
      {
        System.out.print("\t" + c[i]);
    }   
      System.out.println();  
      System.out.println("d : " );
    for (int i = 0; i < d.length; i++)
      {
        System.out.print("\t" + d[i]);
    }
    }
    else
    {
    System.out.println("Not Possible");
  }
  }
}
