/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author Bayu Pramana
 */
public abstract class Square_1301174532 implements Shape_1301174532 {
    private double side;
    private double area;
    private final String shapenm = "Square";

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calculatearea(){
        return area = side * side;
    }
    public double getLuas() {
        return area;
    }

    public void showShape(){
        System.out.print("This Shape is : ");
        System.out.println(shapenm);
        
    }

}
