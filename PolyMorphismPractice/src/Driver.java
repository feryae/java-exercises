/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Driver {
   
    public static void main(String[] args) {
		Parent castP;

		castP = new Parent();
		System.out.println(castP.toString());

		castP = new ChildA();
		System.out.println(castP.toString());

		castP = new ChildB();
		System.out.println(castP.toString());

		castP = new GrandChildA();
		System.out.println(castP.toString());

	}
}

    


class Parent{ 
        @Override
	public String toString(){ 
		return "this is class Parent"; 
	} 
} 


class ChildB extends Parent{
    @Override
    public String toString(){ 
	return "this is class Child B"; 
    } 
}

class ChildA extends Parent{
        @Override
	public String toString(){ 
		return "this is class Child A"; 
	} 
}

class GrandChildA extends ChildA{
        @Override
	public String toString(){ 
		return "this is class Grand Child"; 
	} 	
}

