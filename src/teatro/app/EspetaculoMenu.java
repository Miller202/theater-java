package teatro.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import teatro.model.Espetaculo;

/**
 *
 * @author mulle
 */
public class EspetaculoMenu {
    
    public EspetaculoMenu(){
        
    }
    
    public static void cadastrar(Espetaculo espetaculo, ArrayList<Espetaculo> espetaculos){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo: ");
        String tipo = scanner.nextLine();
        System.out.println("Digite a idade minima: ");
        int faixaEtaria = scanner.nextInt();
        System.out.println("Digite o status (0 - estreia, 1 - futuro): ");
        int status = scanner.nextInt();
        
        espetaculo = new Espetaculo(UUID.randomUUID(), nome, tipo, faixaEtaria, status);
        
        espetaculos.add(espetaculo);
    }
    
    public static void listar(ArrayList<Espetaculo> espetaculos){
        for(Espetaculo item: espetaculos){
            System.out.printf("%s\n", item.toString());
        }
    }
    
    public static void listarEstreias(ArrayList<Espetaculo> espetaculos){
        for(Espetaculo item: espetaculos){
            if(item.getStatus() == 0){
                System.out.printf("%s\n", item.toString());
            }
        }
    }
    
    public static void listarFuturos(ArrayList<Espetaculo> espetaculos){
        for(Espetaculo item: espetaculos){
            if(item.getStatus() == 1){
                System.out.printf("%s\n", item.toString());
            }
        }
    }
    
}
