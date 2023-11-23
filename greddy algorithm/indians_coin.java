import java.util.*;
public class indians_coin {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin,Comparator.reverseOrder());
        int minData = 0;
        int amount = 590;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<coin.length;i++){
            if(coin[i]<=amount ){
                while(coin[i]<=amount){
                    amount -= coin[i];
                    minData++;
                    arr.add(coin[i]);
                }
            }
        }
        System.out.println("The minimum Notes Required : " + minData);
        System.out.println("The data is Given as : " +  arr);
    }
}
