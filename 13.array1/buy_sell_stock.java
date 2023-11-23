public class buy_sell_stock {
    
    public static int predict_profit(int arr[]){
        int buy_price = Integer.MAX_VALUE;
        //profit =sell price -  buy price
        int Max_profit = 0;

        for(int i=0;i<arr.length;i++){
            if(buy_price<arr[i]){
                int profit = arr[i] - buy_price;
                Max_profit = Math.max(Max_profit, profit);
            }
            else{
                buy_price = arr[i];
            }
        }
        return Max_profit;
    }

    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(predict_profit(arr));
    }
}
