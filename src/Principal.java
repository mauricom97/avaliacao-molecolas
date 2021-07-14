import java.util.Date;
package src;

public class Principal {
    public static void main(String[] args) {
        Particula nome = new Particula();
        Particula pesoAtomico = new Particula();

        System.out.println(nome.getNome());
        System.out.println(pesoAtomico.getPesoAtomico());

 
        Molecola nome = new Molecola("H2O");
        Molecola pesoAtomico = new Molecola(8);

    }
}