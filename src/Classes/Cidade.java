/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Vitor
 */
public class Cidade {
    private String nome;
    private int defesas;

    public Cidade(String nome, int defesas) {
        this.nome = nome;
        this.defesas = defesas;
    }

    public int getDefesas() {
        return defesas;
    }

    public void setDefesas(int defesas) {
        this.defesas = defesas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
