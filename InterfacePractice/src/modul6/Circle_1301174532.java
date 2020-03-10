/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;


public class Circle_1301174532 implements Shape_1301174532 {
    private double radius;
    private double area;
    private final String shapenm = "Circle";

    public double getradius() {
        return radius;
    }

    
    public void setradius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculatearea(){
        return area = phi * radius * radius;
    }
    public double getLuas() {
        return area;
    }
    
    public void showShape(){
        System.out.print("This Shape is : ");
        System.out.println(shapenm);
    }

 
   
}
