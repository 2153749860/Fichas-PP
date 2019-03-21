package pp_fp06.PizzaRestaurant;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma pizza
 * </p>
 */
public class Pizza {

    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private Ingredient[] ingredients;
    private int numberOfIngredients;

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     *
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição resumida da <b>Pizza</b>
     */
    public Pizza(int id, String name, String description) {
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = new Ingredient[MAX_INGREDIENTS];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        //System.out.println("A pizza " + this.getName() + " possui " + this.getNumberOfIngredients() + " ingredientes:" + Arrays.toString(this.ingredients));
        return("A pizza " + this.getName() + " possui " + this.getNumberOfIngredients() + " ingredientes:" + Arrays.toString(this.ingredients));
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
        this.numberOfIngredients = this.ingredients.length;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    @Override
    public String toString() {
        return "Pizza{" + "MAX_INGREDIENTS=" + MAX_INGREDIENTS + ", id=" + id + ", name=" + name + ", description=" + description + ", ingredients=" + Arrays.toString(ingredients) + ", numberOfIngredients=" + numberOfIngredients + '}';
    }
    
    
    
}
