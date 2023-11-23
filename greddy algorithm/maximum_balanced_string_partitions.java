public class maximum_balanced_string_partitions {
    
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("LRRRRLLRLLRL");
        int L = 0,R =0;
        int partions =0;
        for(int i =0;i<name.length();i++){
          
           if(name.charAt(i)=='R'){
            R++;
           }
           else{
            L++;
           }
            if(L==R && L!=0){
            partions++;
            System.out.println(" R , L : " + R+L);
            L=0;
            R=0;
           }
        }
        System.out.println("System Gives me Output of Partions : " + partions);

    }
}
