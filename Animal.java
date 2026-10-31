public class Animal{
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
}
public static void main (String args[]) {
    Dog dog= new Dog();
    dog.walk();


}
