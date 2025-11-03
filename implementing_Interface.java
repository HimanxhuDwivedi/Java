interface Animal{
    public void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walks on four legs");
    }
}
public class implementing_Interface {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}
