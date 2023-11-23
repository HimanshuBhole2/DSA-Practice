public class inheritance {
    public static void main(String[] args){
        cat ca = new cat();
        cat.eat();
        cat.walk();


    System.out.println("Now derive the dog");
    dog dg = new dog();
    dg.newe();
    dg.swim();
    }
}

class Animal{
    static void eat(){
        System.out.println("They eat somethings .");
    }
    static void walk(){
        System.out.println("Anyone has special Power tha");
    }
}
class Mamals extends Animal{
    void swim(){
        System.out.println("Swim like a Fish");
    }
}

class dog extends Mamals{
    void newe(){
    System.out.println("Eat any thing specially gally dogs Which very dengerous! ");
    }
}

class cat extends Mamals{
    void some(){
    System.out.println("Very fucking attitude ");}
}