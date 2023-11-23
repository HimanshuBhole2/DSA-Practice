public class Multiplication {
    public static void multi(int a){
        for (int i = 0 ;i <11; i++){
            System.out.println(i+"x"+a+ "="+ i*a);
        }
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        multi(4);
        System.out.println(add(9,5));
    }
}
