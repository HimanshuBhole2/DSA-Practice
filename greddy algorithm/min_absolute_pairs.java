import java.util.*;

class min_absolute_pairs {
    


    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int min_abs = 0;
        for(int i = 0;i<A.length;i++){
                min_abs += Math.abs(A[i]-B[i]);

        }
        System.out.println("The Minimum difference : " + min_abs);
    }
}