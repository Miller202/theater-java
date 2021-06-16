package teatro.model;

import java.util.UUID;

/**
 *
 * @author mulle
 */
public class Espetaculo{
    
    private UUID id;

    protected String nome;
    
    protected String tipo;
    
    private int faixaEtaria;
    
    private int status; // 0 - Estreia, 1 - Futuro
    
    public Espetaculo(){
        
    }
    
    public Espetaculo(UUID id, String nome, String tipo, int faixaEtaria, int status){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.faixaEtaria = faixaEtaria;
        this.status = status;
    }
    
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public int getFaixaEtaria(){
        return this.faixaEtaria;
    }
    
    public void setFaixaEtaria(int faixaEtaria){
        this.faixaEtaria = faixaEtaria;
    }
    
    
    public int getStatus(){
        return this.status;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    
    @Override
    public String toString() {
        String str = "Espetaculo ID: " + getId();
        str += "\nNome: " + getNome();
        str += "\nTipo: " + getTipo();
        str += "\nFaixa etaria: " + getFaixaEtaria();
        if(getStatus() == 0){
            str += "\nStatus: Estreia (inscrições abertas)";
        }else if(getStatus() == 1){
            str += "\nStatus: Em breve...";
        }
        str += "\n";
        return str;
    }
    
}
