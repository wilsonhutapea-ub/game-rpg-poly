public class Hero extends Character{
    public void move(){
        System.out.println("Hero moves.");
    }
    public void move(String direction){
        System.out.printf("Hero moves to the %s\n", direction);
    }
    public void greet(String name){
        System.out.printf("Hey %s. I am Hero.\n", name);
    }
}
