import java.util.Date;
package src;

private String nome;
private int numSubPart;


public class Atomo extends Particula {

public Particula(String nome, int numSubPart){
    this.nome = nome;
    this.numSubPart = numSubPart;
}
    
public abstract double getPesoAtomico(numSubPart){

    return numSubPart * 1.0073 + numSubPart * 1.0087 + numSubPart * 1 / 1836

} 

}