/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Point {
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.x);
        System.out.println(p.y);
    } 

   
}
