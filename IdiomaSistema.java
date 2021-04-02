package idiomasistema;

import java.util.*;

public class IdiomaSistema {
    public static void main(String[] args) {
        
        Locale idioma = Locale.getDefault();
        
        System.out.println("O idioma do seu sistema eh: " + idioma.getDisplayLanguage());
        
    }
}
