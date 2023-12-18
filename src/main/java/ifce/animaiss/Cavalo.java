/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifce.animaiss;

/**
 *
 * @author pc
 */
public class Cavalo extends Animal {
    // Atributo específico de Cavalo
    private String corDaCrina;

    // Construtor da classe Cavalo
    public Cavalo(String nome, int idade, String corDaCrina) {
        super(nome, idade);
        this.corDaCrina = corDaCrina;
    }

    // Sobrescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando.");
    }

    // Método específico de Cavalo
    public void correr() {
        System.out.println("O cavalo está correndo.");
    }
}


