
package modul6;


public class Main {
    public static void main(String[] args) {
        Circle_1301174532 a = new Circle_1301174532();
        Square_1301174532 b = new Square_1301174532() {};
        a.setradius(21);
        b.setSide(20);
        
        System.out.println("CircleArea ="+a.calculatearea());
        System.out.println("SquareArea = "+b.calculatearea());
        a.showShape();
        b.showShape();
        
    }
}


