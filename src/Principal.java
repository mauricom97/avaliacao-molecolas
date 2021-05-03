package src;

public class Principal {
    public static void main(String[] args) {
        Particula nome = new Particula();
        Particula pesoAtomico = new Particula();

        System.out.println(nome.getNome());
        System.out.println(pesoAtomico.getPesoAtomico());
    }
}