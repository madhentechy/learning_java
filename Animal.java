class Animal{
    String Cname = "Surendhar";
    String Cage = "2years";

    String Dname = "Surendhar";
    String Dage = "6years";
    void eat(){System.out.println("eating...");}
    void hai(){System.out.println("I am inherited form Animal Class");}
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("meowing...");
    }
}
class Dog extends Animal{
    void makeSound(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String[] args){
        Dog d=new Dog();
        System.out.println("Name: " + d.Dname);
        System.out.println("Age: " + d.Dage);
        d.makeSound();
        d.eat();
        Cat c =new Cat();
        System.out.println("Name: " + c.Cname);
        System.out.println("Age: " + c.Cage);
        c.makeSound();
        c.eat();

        c.hai();
    }}



/* class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog{
    Animal m = new Animal();


    void l(){
     m.eat();
    }
    void bark(){System.out.println("barking...");}


}
class TestInheritance{
    public static void main(String args[]){
        Animal SC = new Animal();
        SC.eat();
        Dog d=new Dog();
        d.bark();
        d.l();
    }} */