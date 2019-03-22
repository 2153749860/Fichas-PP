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
    /**
     * codigo - codigo do ingrediente
     * nome - nome do ingrediente
     * origem - origem do ingrediente
     */
    private int codigo;
    private String nome;
    private IngOrigem origem;
    
    /**
     * Construtor
     * @param codigo - codigo do ingrediente
     * @param nome - nome do ingrediente
     * @param origem - origem do ingrediente
     */
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
    
    /**
     * metodo toString() vai imprimir todos os dados do ingrediente na tela
     * @return uma string com todas as informações do ingrediente
     */
    @Override
    public String toString() {
        return "Ingredient{" + "codigo=" + codigo + ", nome=" + nome + ", origem=" + origem + '}';
    }
    
    
    
}
