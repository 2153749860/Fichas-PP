/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

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
        Ingredient ingrediente1 = new Ingredient(1, "Massa", IngOrigem.Vegetal);
        Ingredient ingrediente2 = new Ingredient(2, "Tomate", IngOrigem.Vegetal);
        Ingredient ingrediente3 = new Ingredient(3, "Queijo", IngOrigem.Animal);
        
        Ingredient[] ingredientes1 = new Ingredient[]{ingrediente1, ingrediente2, ingrediente3};
        
        Pizza pizza1 = new Pizza(1, "Celeste", "Boa!");
        pizza1.setIngredients(ingredientes1);
        pizza1.getDescription();
        
        Pizza pizza2 = new Pizza(2, "Ananás", "Muito boa!");
        pizza2.setIngredients(ingredientes1);
        pizza2.getDescription();
    }
    
}
