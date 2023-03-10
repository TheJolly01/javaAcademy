public abstract class Animal {
    public abstract void animalSound();
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

