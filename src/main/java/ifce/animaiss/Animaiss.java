/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifce.animaiss;

/**
 *
 * @author pc
 */
public class Animaiss {


 public static void main(String[] args) {
    // Criando instâncias de animais
        Canhorro meuCachorro = new Canhorro("Rex", 3, "Labrador");
        Cavalo meuCavalo = new Cavalo("Pé de Pano", 5, "Marrom");
        Preguiça minhaPreguica;
        minhaPreguica = new Preguiça("Zé", 2, 3);

        // Testando métodos e atributos
        System.out.println("Cachorro:");
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Idade: " + meuCachorro.getIdade());
        meuCachorro.emitirSom();
        meuCachorro.cavar();

        System.out.println("\nCavalo:");
        System.out.println("Nome: " + meuCavalo.getNome());
        System.out.println("Idade: " + meuCavalo.getIdade());
        meuCavalo.emitirSom();
        meuCavalo.correr();

        System.out.println("\nPreguiça:");
        System.out.println("Nome: " + minhaPreguica.getNome());
        System.out.println("Idade: " + minhaPreguica.getIdade());
        minhaPreguica.emitirSom();
        minhaPreguica.subirEmArvores();
    }
    }
    
        

