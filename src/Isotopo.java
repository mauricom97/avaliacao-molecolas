import java.util.Date;
package src;

private int numNeutrons;
private String nome;
private int numSubPart;

public class Isotopo extends Atomo{
    
    public Isotopo(String nome, int numNeutrons, int numSubPart){
        this.numNeutrons = numNeutrons;
        this.numSubPart = numSubPart;
        this.nome = nome;
    }

}