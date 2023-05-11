public class App {
    public static void main(String[] args){

        // static polymorphism
        Hero h = new Hero();
        h.greet();
        h.greet("Fred");
        System.out.println();

        Enemy e = new Enemy();
        e.greet();
        e.greet("John");
        System.out.println();

        // dynamic polymorphism 1
        Character c = new Character();
        c.move();
        System.out.println();

        c = new Hero();
        c.move();
        c = new Enemy();
        c.move();
        c = new Fighter();
        c.move();
        c = new Witch();
        c.move();
        System.out.println();
        
        // dynamic polymorphism 2
        Character ch = new Witch();
        ch.move();
        ch = new Fighter();
        ch.move();
        

    }
}
