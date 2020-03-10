
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam*/



public class CollectionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List list = new ArrayList();
       // list.add(new Employees());
        list.add(1);
        list.add("Hello");
        list.add(false);
        list.add(null);
        
        List<Employees> listEmp = new LinkedList<Employees>();
        listEmp.add(new Employees("Susy",2000000));
        listEmp.add(new Employees("Susy",2000000));
    }
    

    }
    


