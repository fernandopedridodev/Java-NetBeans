package stringcomparator;

/**
 *
 * @author fernando.pedridomarino
 */
public class StringComparator {

      // Atributos da clase
    private String str1;
    private String str2;
    private String str3;
    
    /**
     * Constructor da clase StringComparator.
     * @param str1 primeira cadea
     * @param str2 segunda cadea
     * @param str3 terceira cadea
     */
    public StringComparator(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }
    
    /**
     * O método getBigger devolve o String que ten a maior lonxitude.
     * @return a cadea de maior lonxitude
     */
    public String getBigger() {
        String bigger = str1; // Supoñemos inicialmente que str1 é a maior
        
        if (str2.length() > bigger.length()) {
            bigger = str2; // str2 é maior que o actual "bigger"
        }
        
        if (str3.length() > bigger.length()) {
            bigger = str3; // str3 é maior que o actual "bigger"
        }
        
        return bigger; // Devolvemos a cadea de maior lonxitude
    }

    /**
     * O método main proba a funcionalidade do método getBigger.
     * @param args non utilizado
     */
    public static void main(String[] args) {
        // Crear unha instancia de StringComparator
        StringComparator comparator = new StringComparator("Mazá", "Laranxa", "Amorodo");
        
        // Chamar o método getBigger para obter a cadea de maior lonxitude
        String maiorCadea = comparator.getBigger();
        
        // Imprimir o resultado
        System.out.println("A cadea de maior lonxitude é: " + maiorCadea);
    }
}