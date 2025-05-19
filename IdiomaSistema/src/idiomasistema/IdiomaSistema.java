
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Beh
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale localAtual = Locale.getDefault();
        System.out.println("Seu sistema esta em: " + localAtual.getDisplayLanguage());
    }
    
}
