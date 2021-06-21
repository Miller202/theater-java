package teatro.app;

import java.util.ArrayList;
import java.util.Scanner;
import teatro.model.Espetaculo;
import teatro.model.Ingresso;

/**
 *
 * @author mulle
 */
public class IngressoMenu {
    
    public IngressoMenu(){
        
    }
    
    public static void cadastrar(Espetaculo espetaculo, Ingresso ingresso, ArrayList<Ingresso> ingressos){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Confirme o nome do espetáculo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preco do ingresso: ");
        Double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade de ingressos: ");
        int qtdDisponivel = scanner.nextInt();
        
        ingresso = new Ingresso(espetaculo, nome, preco, qtdDisponivel);
        
        ingressos.add(ingresso);
    }
    
    public static void listar(ArrayList<Ingresso> ingressos){
        for(Ingresso item : ingressos){
            System.out.printf("%s\n", item.toString());
        }
    }
}
