
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Beh
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) tamanhoTela.getWidth();
        int altura = (int) tamanhoTela.getHeight();
        System.out.println("A sua tela tem resolucao " + largura + " x " + altura);
    }
    
}
