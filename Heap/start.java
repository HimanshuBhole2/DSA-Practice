import java.util.Comparator;
import java.util.PriorityQueue;
public class start {
    public static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name= name;
            this.rank= rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }

    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Himanshu", 10));
        pq.add(new Student("Devki", 3));
        pq.add(new Student("Ramanuj", 2));
        pq.add(new Student("Renuka", 5));
        pq.add(new Student("Damodar",9));
        while(!pq.isEmpty()){
            Student st = pq.peek();
            pq.remove();
            System.out.println(st.name + " => " + st.rank);
        }
    }
}
