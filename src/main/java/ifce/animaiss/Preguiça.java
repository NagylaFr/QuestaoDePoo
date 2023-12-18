/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifce.animaiss;

/**
 *
 * @author pc
 */
public class Preguiça extends Animal {

    // Construtor da classe Preguiça
    // Atributo específico de Preguiça
    public Preguiça(String nome, int idade, int quantidadeDeGarras) {
        super(nome, idade);
    }

    // Sobrescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println("A preguiça está fazendo um som peculiar.");
    }

    // Método específico de Preguiça
    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em árvores.");
    }
}
