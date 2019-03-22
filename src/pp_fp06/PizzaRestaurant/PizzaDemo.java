/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import java.util.Date;
import pp_fp06.PizzaRestaurant.enums.IngOrigem;

/**
 *
 * @author tiago
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancia dos ingredientes
        Ingredient ingrediente1 = new Ingredient(1, "Massa", IngOrigem.Animal);
        Ingredient ingrediente2 = new Ingredient(2, "Tomate", IngOrigem.Vegetal);
        Ingredient ingrediente3 = new Ingredient(3, "Queijo", IngOrigem.Vegetal);
        //vetor de ingredientes
        Ingredient[] ingredientes1 = new Ingredient[]{ingrediente1, ingrediente2, ingrediente3};
        
        //pizza 1
        Pizza pizza1 = new Pizza(1, "Celeste", "Boa!");
        pizza1.addIngredinte(ingrediente2); //adiciona ingrediente2 à pizza1
        pizza1.addIngredinte(ingrediente3); //adiciona ingrediente3 à pizza1
        pizza1.removeIngrediente(2); //nao pode repetir ingredientes
        System.out.println(pizza1.getDescription()); //print da descrição e ingredientes da pizza1
        
        //pizza 2
        Pizza pizza2 = new Pizza(2, "Ananás", "Muito boa!");
        pizza2.addIngredinte(ingrediente1); //adiciona ingrediente1 à pizza2
        System.out.println("+++++++++");
        System.out.println(pizza1.toString());
        //System.out.println(pizza2.getDescription()); //print da descrição e ingredientes da pizza2
        
        //data
        Date data1 = new Date(119, 2, 25);
        
        //ementa
        Ementa ementa1 = new Ementa(data1);
        ementa1.addPizza(pizza2);
        ementa1.validaEmenta();
        System.out.println(ementa1.isValida());
        //System.out.println("+++++++++++");
        //System.out.println(ementa1.toString());
        //System.out.println(ementa1.toString());
    }
    
}
