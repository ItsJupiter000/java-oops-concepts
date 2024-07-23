// Runtime polymorphism : Method Overloading 
// Same method name but different parameters and return type

class Person{
    int age;
    String name;

    void walk(){
        System.out.println(name + " is walking");
    }
    int walk(int steps){
        System.out.println(name + " walked " + steps + " steps!");
        return 0;
    }
    void walk(String place){
        System.out.println(name + " walked to " + place);
    }
}

public class Main{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "John";
        p1.walk();
        p1.walk(12);
        p1.walk("Park");
    }
}
