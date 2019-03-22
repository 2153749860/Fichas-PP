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
        //pizza 2
        Pizza pizza2 = new Pizza(2, "Ananás", "Muito boa!");
        
        //adiciona ingredientes à pizza1
        pizza1.addIngredinte(ingrediente2); 
        pizza1.addIngredinte(ingrediente3); 
        //adiciona ingredientes à pizza2
        pizza2.addIngredinte(ingrediente1);
        
        //remove o ingrediente de ID 2 da pizza
        pizza1.removeIngrediente(2); 
        //print da descrição e ingredientes da pizza1
        System.out.println(pizza1.getDescription()); 
        
        //print de todas as informações da pizza1
        System.out.println(pizza1.toString());
        
        //print da descrição e ingredientes da pizza2
        System.out.println(pizza2.getDescription());
        
        //data final para ementa1
        Date data1 = new Date(119, 2, 25);
        
        //Instancia da ementa1
        Ementa ementa1 = new Ementa(data1);
        
        //adiciona uma pizza à ementa1
        ementa1.addPizza(pizza2);
        
        //verificar se a ementa1 é válida
        ementa1.validaEmenta();
        System.out.println(ementa1.isValida());
        
        //remove a pizza de id 2 da ementa
        ementa1.removePizza(2);
        
        //print de todas as informações da ementa
        System.out.println(ementa1.toString());
    }
    
}
