package teatro.main;

/**
 *
 * @author mulle
 */
public class Mensagem {
    
    public Mensagem(){
            
    }
        
    public void bemVindo(){
        System.out.println("Seja bem-vindo ao Teatro Deodoro!");
    }
    
    public void opcoes(){
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Cadastrar espetáculo");
        System.out.println("2 - Listar todos os espetáculos");
        System.out.println("3 - Listar espetáculos em estreia");
        System.out.println("4 - Listar espetáculos futuros");
        System.out.println("5 - Listar ingressos");
        System.out.println("6 - Finalizar");
    }
    
    public void sucesso(){
        System.out.println("\nOperação efetuada com sucesso!\n");
    }
    
    public void saida(){
        System.out.println("\nAcesso finalizado...\n");
    }
}
