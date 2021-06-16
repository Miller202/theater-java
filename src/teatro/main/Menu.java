package teatro.main;

import java.util.ArrayList;
import java.util.Scanner;
import teatro.model.Espetaculo;
import teatro.app.EspetaculoMenu;
import teatro.app.IngressoMenu;
import teatro.model.Ingresso;

/**
 *
 * @author mulle
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Espetaculo espetaculo = null;
        Ingresso ingresso = null;
        int aux = 0;
        ArrayList<Espetaculo> espetaculos = new ArrayList<Espetaculo>();
        ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
        Mensagem m = new Mensagem();
        Scanner scanner = new Scanner(System.in);
        
        m.bemVindo();
        
        while(aux == 0){
            m.opcoes();
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    EspetaculoMenu.cadastrar(espetaculo, espetaculos);
                    IngressoMenu.cadastrar(espetaculo, ingresso, ingressos);
                    m.sucesso();
                    break;
                case 2:
                    EspetaculoMenu.listar(espetaculos);
                    m.sucesso();
                    break;
                case 3:
                    EspetaculoMenu.listarEstreias(espetaculos);
                    m.sucesso();
                    break;
                case 4:
                    EspetaculoMenu.listarFuturos(espetaculos);
                    m.sucesso();
                    break;
                case 5:
                    IngressoMenu.listar(ingressos);
                    m.sucesso();
                    break;
                case 6:
                    aux = 1;
                    m.saida();
                    break;
                default:
                    break;
            }
            
        }
    }
    
}
