/**
 * @author Queiroga
 *
 * @version 1
 * criando uma classe com objeto
 */

public class Caderno{

    // tamanhos: P, M, G
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = "P";

    }
    public static void main(String[] args) {
        System.out.println("Tamanho do caderno: P");
    }
}
