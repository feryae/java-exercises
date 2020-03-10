/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public abstract class Parent {
    public abstract void doSomething();
    public void printSomething(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{

    @Override
    public void doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

abstract class AnotherChild extends Parent{
   
}
