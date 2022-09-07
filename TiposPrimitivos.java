
package tiposprimitivos;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class TiposPrimitivos {


    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.print("Digite o nome do usuario: ");
        String nome = escreva.nextLine();
        System.out.print("Digite a nota do usuario: ");
        float nota = escreva.nextFloat();
        System.out.println("A nota do " + nome + " é " +nota);
    }
    
}
