package teatro.model;

/**
 *
 * @author mulle
 */
public class Ingresso {
    
    private Espetaculo espetaculoIngresso;
    
    private String nome;
    
    private double preco;
    
    private int qtdDisponivel;
    
    public Ingresso(){
    
    }

    public Ingresso(Espetaculo espetaculoIngresso, String nome, double preco, int qtdDisponivel) {
        this.espetaculoIngresso = espetaculoIngresso;
        this.nome = nome;
        this.preco = preco;
        this.qtdDisponivel = qtdDisponivel;
    }

    public Espetaculo getEspetaculoIngresso() {
        return espetaculoIngresso;
    }

    public void setEspetaculoIngresso(Espetaculo espetaculoIngresso) {
        this.espetaculoIngresso = espetaculoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }
    
    @Override
    public String toString() {
        String str = "Nome do espetaculo: " + getNome();
        str += "\nPreco do ingresso: " + getPreco();
        str += "\nQuantidade disponivel: " + getQtdDisponivel() + " ingressos";
        str += "\n";
        return str;
    }
    
}
