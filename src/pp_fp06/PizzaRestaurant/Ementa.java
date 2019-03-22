/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import java.util.Arrays;
import java.util.Date;
import pp_fp06.PizzaRestaurant.enums.IngOrigem;

/**
 *
 * @author tiago
 */
public class Ementa {
    private final int MAX_PIZZAS = 10;
    private Date dataInicio;
    private Date dataFim;
    private Pizza[] pizzas;
    private int numberOfPizzas = 0;
    private boolean valida;

    public Ementa(Date dataFim) {
        //this.numberOfPizzas = 0;
        this.dataFim = dataFim;
        this.dataInicio =  new Date(System.currentTimeMillis());
        this.pizzas = new Pizza[MAX_PIZZAS];
        this.valida = false;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public int getNumberOfPizzas() {
        return numberOfPizzas;
    }

    public void setNumberOfPizzas(int numberOfPizzas) {
        this.numberOfPizzas = numberOfPizzas;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isValida() {
        return valida;
    }
    
    public void addPizza(Pizza pizza){
        if(this.numberOfPizzas < MAX_PIZZAS){
            this.pizzas[numberOfPizzas] = pizza;
            this.numberOfPizzas++;
        }
        else{
            System.out.println("ja nao cabe mais gordo!");
        }
    }
    
    public void validaEmenta(){
        int contAnimal = 0;
        for(int i=0; i<this.numberOfPizzas; i++){
            for(int j=0; j<this.pizzas[i].getNumberOfIngredients(); j++){
                if(this.pizzas[i].getIngredients()[j].getOrigem() == IngOrigem.Animal){
                    contAnimal++;
                }
            }
            if(contAnimal == 0){
                this.valida = true;
            }
            contAnimal = 0;
        }
    }
    
    public void removePizza(int id){
        int pos = -1;
        for(int i=0; i<this.numberOfPizzas; i++){
            if(this.pizzas[i].getId() == id){
                pos = i;
            }
        }
        for(int j=pos; j<this.numberOfPizzas; j++){
            this.pizzas[j] = this.pizzas[j+1];
        }
        this.pizzas[this.numberOfPizzas] = null;
        this.numberOfPizzas--;
    }
    
    @Override
    public String toString() {
        String s = "";
        s+="Data inicial: " + this.getDataInicio() + "\n";
        s+="Data Final: " + this.getDataFim() + "\n";
        s+="Nº de pizzas: " + this.getNumberOfPizzas() + "\n";
        for(int i=0; i<numberOfPizzas; i++){
            s+="Pizza: " + pizzas[i].toString();
        }
        return s;
    }
    
}
