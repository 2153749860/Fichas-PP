/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import java.time.LocalDateTime;
import java.time.Month;
import pp_fp06.PizzaRestaurant.enums.IngOrigem;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;

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
        //instancia dos ingredientes da pizza1
        Ingredient ingrediente1 = new Ingredient(1, "Massa", IngOrigem.Animal);
        Ingredient ingrediente2 = new Ingredient(2, "Tomate", IngOrigem.Vegetal);
        Ingredient ingrediente3 = new Ingredient(3, "Queijo", IngOrigem.Vegetal);
        
        //instancia dos ingredientes da pizza2
        Ingredient ingrediente4 = new Ingredient(4, "Pimento", IngOrigem.Vegetal);
        Ingredient ingrediente5 = new Ingredient(5, "Ananás", IngOrigem.Vegetal);
        Ingredient ingrediente6 = new Ingredient(6, "Coentros", IngOrigem.Vegetal);
        
        //Instancia da pizza1
        Pizza pizza1 = new Pizza(1, "Celeste", "Boa!", PizzaSize.BIG);
        //Instancia da pizza2
        Pizza pizza2 = new Pizza(2, "Havaiana", "Muito boa!", PizzaSize.MEDIUM);
        
        //adiciona ingredientes à pizza1
        pizza1.addIngrediente(ingrediente1);
        pizza1.addIngrediente(ingrediente2); 
        pizza1.addIngrediente(ingrediente3); 
        //adiciona ingredientes à pizza2
        pizza2.addIngrediente(ingrediente4);
        pizza2.addIngrediente(ingrediente5);
        pizza2.addIngrediente(ingrediente6);
        
        System.out.println(pizza1.getPreco());
        
        //remove o ingrediente de ID 2 da pizza1
        pizza1.removeIngrediente(2); 
        //print da descrição e ingredientes da pizza1
        System.out.println(pizza1.getDescription()); 
        
        //print de todas as informações da pizza1
        System.out.println(pizza1.toString());
        
        //print da descrição e ingredientes da pizza2
        System.out.println(pizza2.getDescription());
        
        //instancia da data dinal da ementa
        LocalDateTime dataFinalEmenta = LocalDateTime.of(2019, Month.MARCH, 30, 11, 30);
        
        //Instancia da ementa1
        Ementa ementa1 = new Ementa(dataFinalEmenta);
        
        //adiciona as pizzas à ementa1
        ementa1.addPizza(pizza1);
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
