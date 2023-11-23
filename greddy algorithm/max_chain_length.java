import java.util.*;
public class max_chain_length {
    public static void main(String[] args) {
        int pairs [][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int maxChainLength = 1;
        int previousEnd = 0;
        for(int i = 1;i<pairs.length;i++){
            if(pairs[previousEnd][1]<=pairs[i][0]){
                maxChainLength +=1;
                previousEnd = i;
            }
        }
        System.out.println("the maximum length of chain will formed as : " + maxChainLength);
    }
}
