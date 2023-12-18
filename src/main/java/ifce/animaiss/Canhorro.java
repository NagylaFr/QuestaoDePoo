/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifce.animaiss;

/**
 *
 * @author pc
 */
public class Canhorro extends Animal {

    // Construtor da classe Cachorro
    // Atributo específico de Cachorro
    public Canhorro(String nome, int idade, String raca) {
        super(nome, idade);
    }

    // Sobrescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }

    // Método específico de Cachorro
    public void cavar() {
        System.out.println("O cachorro está cavando.");
    }
}
