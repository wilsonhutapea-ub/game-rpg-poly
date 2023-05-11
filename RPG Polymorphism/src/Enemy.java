public class Enemy extends Character {
    public void move(){
        System.out.println("Enemy moves.");
    }
    public void move(int step){
        System.out.printf("Enemy moves %d step(s).\n", step);
    }
    public void greet(String name){
        System.out.printf("Hey %s. I am Enemy.\n", name);
    }
}
