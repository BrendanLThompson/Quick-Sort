//Brendan Thompson
//Project 6 & 7: Quick Sort.
//Due: May 9, 2019 5:30 p.m
import java.util.Random;
import java.util.Arrays;
class QuickSort
{
   static void printArray(int arr[])
   {
   int n = arr.length;
   for (int i=0; i<n; ++i)
   System.out.print(arr[i]+" ");
	System.out.println();
   }
   
   int partition(int arr[], int lo, int hi)
   {
   int pivot = arr[hi];
  	System.out.print("(" + pivot + ")");
   System.out.println (" ");
   int i = (lo-1); 
   for (int j=lo; j<hi; j++)
      {
      if (arr[j] < pivot)
         {
         i++;
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         }
      }
   int temp = arr[i+1];
   arr[i+1] = arr[hi];
   arr[hi] = temp;
   return i+1;
   }

   void sort(int arr[], int lo, int hi)
   {
   if (lo < hi)
      {
      int pi = partition(arr, lo, hi);
      print(arr, 0, pi - 1);
      sort(arr, lo, pi-1);
      sort(arr, pi+1, hi);  	
      }
   }
   
   static void print(int[] arr, int lo,int hi) 
   {
  	for (int i=lo; i<hi; ++i)
   System.out.print(arr[i]+" ");
   }

  
   void populateArray(int [] data)
   {
      for (int i = 0; i<data.length; i++) 
	   {
  	      data[i] = (int)(Math.random() * (99 - 10 +1)) + 10;
	   } 
   }
}

public class ThompsonBProj6_7COMP110  
{
   public static void main(String args[])
   {
   Random r = new Random();
   int lowlength = 15;
   int highlength = 25;
   int Length = (r.nextInt(highlength-lowlength) + lowlength);
   int size = Length + 2;
   int arr[] = new int [Length];
   
   int Array[];
   int lo = 0;
   int hi = arr.length - 1;
   int n = arr.length;
   
   System.out.println ("Brendan Thompson, Project 6 & 7");
   System.out.println (" ");
   
   QuickSort ob = new QuickSort();
   System.out.println ("Sample Size: " + Length);
   System.out.println (" ");
  	ob.populateArray(arr);
   System.out.println ("Array Elements:");
  	ob.printArray(arr);
   System.out.println (" ");
   System.out.println ("Sorting. . . . .");
  	ob.print(arr, 0, n - 1);
   ob.sort(arr, 0, n-1);
   System.out.println (" \n");
   System.out.println("Sorted:");
   ob.printArray(arr);
   
   System.out.println (" ");   
   System.out.println ("Brendan Thompson, End of Project 6 & 7");
   }
}