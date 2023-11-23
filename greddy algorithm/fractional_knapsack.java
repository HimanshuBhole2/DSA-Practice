import java.util.*;


public class fractional_knapsack {
   
    

    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[value.length][2];

        for(int i = 0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double) weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        for(int i = 0;i<ratio.length;i++){
            System.out.println( (int)ratio[i][0] + " "  + ratio[i][1]);
        }

       int  capacity = W;
       int final_profit = 0;
        for(int i = ratio.length-1; i>=0;i--){
            int ind = (int) ratio[i][0];
            if(capacity>= weight[ind]){
                capacity -= weight[ind];
                final_profit += value[ind];
            }
            else{
                final_profit += capacity * ratio[i][1]; 
                capacity = 0;
                break;
            }

        }
        System.out.println(final_profit);
    }
}
