import java.io.*;
import java.util.*;

public class q14_radixsort {
//printing the code
  static void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
//Get Maximum Here
  static int getMaximum(int arr[]){
      int max = 0;
      for(int i =0;i<arr.length;i++){
         if(max<arr[i])
            max = arr[i];
      }
      return max;
 }
//CountSort 
static void countSort(int arr[],int n,int exp){
     int[] output = new int[n];
     int[] count = new int[10];
     Arrays.fill(count,0);
     for(int i =0;i<n;i++){
      int v = (arr[i]/exp)%10;
      count[v]++;
     }
    for(int i = 1; i<10;i++){
      count[i] += count[i-1];
    }

    
    for(int i = 0; i<10;i++){
      count[i] -=1;
    }
    //  Now I Have to put element in the array
    for(int i=arr.length-1;i>=0;i--){
      int v = (arr[i]/exp)%10;
      output[count[v]] = arr[i];
      count[v]--;
    }
    for(int i = 0;i<n;i++){
      arr[i] = output[i];
    }
     
  }

// redix sort meaning
static void redixSort(int arr[], int n){
      int m  = getMaximum(arr);
      for(int exp = 1;m/exp>0;exp*=10){
        countSort(arr,n,exp);
    }

  }

// main function;
public static void main(String[] args){
        int[] arr={170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        redixSort(arr,n);
        print(arr);
        
  }
}
