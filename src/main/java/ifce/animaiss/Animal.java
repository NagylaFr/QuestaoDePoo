/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifce.animaiss;

/**
 *
 * @author pc
 */
public class Animal {
   // Atributos comuns a todos os animais
    private final String nome;
    private final int idade;

    // Construtor da classe Animal
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para emitir som (implementação padrão)
    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }

    // Métodos getters para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
} 

