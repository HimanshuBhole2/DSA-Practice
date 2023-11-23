import java.io.*;
import java.util.*;


public class q10_using_gap {
    // Gap Algorithms (Sub version of Shell Sort) are Use here \

    public static void GreaterSwap(long arr1[], long arr2[], int left, int right){
        if(arr1[left]>arr2[right]){
            int temp = (int) arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
    }

    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
        
        int len = m+n;
        int gap = (len/2)+(len%2);
        
        while(gap>0){
            int left = 0;
            int right = left+gap;
            while(right<len){
                if(left<n && right>=n){
                    GreaterSwap(arr1, arr2, left, right-n);
                }
                else if (left>=n){
                    GreaterSwap(arr2, arr2, left-n,right-n);
                }
                else{
                    GreaterSwap(arr1, arr1,left,right);
                }
                left++;right++;
            }
             if(gap==1)break;
            gap = (gap/2)+(gap%2);
        }
        
    }

    public static void main(String[] args){
        long arr1[] = {0,1,2,3,4};
        long arr2[] = {0,1,2,3,4};
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1,arr2,n,m);

        for(int i = 0;i<n;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println(" ");
        for(int i =0;i<m;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
