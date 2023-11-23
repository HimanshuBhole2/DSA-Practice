import java.io.*;
import java.util.*;

// THis IS For Ony one sub Array;

class reversing_a_sub_array_make_the_array_sorted {
    public static boolean check_var(int arr[]){
        int l=0;int r = arr.length-1;
        
        // For the l traversing
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                l = i;
                break;
            }
        }
        
        /*for Right the element*/
        
        for(int i = arr.length-1;i>0;i--){
            if(arr[i-1]>arr[i]){
                r = i;
                break;
            }
        }
        
        // Reversing the set
        while(l<r){
            int temp = arr[l];
            arr[l] =arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr [] = {1, 2, 4, 5, 3 };
        System.out.println( check_var(arr));
    }
}