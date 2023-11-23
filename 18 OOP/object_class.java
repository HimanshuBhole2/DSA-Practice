// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Student a = new Student();
            System.out.println(a.name);
            System.out.println(a.address);
            System.out.println(a.phone_number);
            System.out.println(a.driving_li_no);
            System.out.println(a.birth_date);
            System.out.println(a.blood_group);
            System.out.println(a.roll_no);
        System.out.println(" ");System.out.println( "  ");
        Student b = new Student("jack","Mexico","0987654321","Mh494939349ueire","12/23/2342","o+ve",645);
        
            System.out.println(b.name);
            System.out.println(b.address);
            System.out.println(b.phone_number);
            System.out.println(b.driving_li_no);
            System.out.println(b.birth_date);
            System.out.println(b.blood_group);
            System.out.println(b.roll_no);
            
        Student c = new Student(a);
        
        System.out.println(" ");System.out.println( "  ");
            System.out.println(c.name);
            System.out.println(c.address);
            System.out.println(c.phone_number);
            System.out.println(c.driving_li_no);
            System.out.println(c.birth_date);
            System.out.println(c.blood_group);
            System.out.println(c.roll_no);
        
    }
}

class Student{
    String name,address,phone_number,driving_li_no,birth_date,blood_group;
    int roll_no;
    
    Student(){
        name = "Himanshu";
        address = "Jalgaon";
        phone_number = "1234567890";
        driving_li_no = "12345678909e4345";
        birth_date = "11/42/4323";
        blood_group = "A -ve";
        roll_no = 34;
    }
    
    Student(String name, String address, String phone_number, String driving_li_no,String birth_date,String blood_group,int roll_no){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.driving_li_no = driving_li_no;
        this.birth_date = birth_date;
        this.blood_group = blood_group;
        this.roll_no = roll_no;
    }
    
    Student(Student s1){
        this.name = s1.name;
        this.address = s1.address;
        this.phone_number = s1.phone_number;
        this.driving_li_no = s1.driving_li_no;
        this.birth_date = s1.birth_date;
        this.blood_group = s1.blood_group;
        this.roll_no = s1.roll_no;
    }
    
    
}