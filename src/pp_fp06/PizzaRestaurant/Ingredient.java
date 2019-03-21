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
public class Ingredient {
    private int codigo;
    private String nome;
    private IngOrigem origem;

    public Ingredient() {
    }
    
    public Ingredient(int codigo, String nome, IngOrigem origem) {
        this.codigo = codigo;
        this.nome = nome;
        this.origem = origem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public IngOrigem getOrigem() {
        return origem;
    }

    public void setOrigem(IngOrigem origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "codigo=" + codigo + ", nome=" + nome + ", origem=" + origem + '}';
    }
    
    
    
}
