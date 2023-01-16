public class NombreNegatifException extends Exception {
    private int valeur;
    NombreNegatifException(int valeur) {
        super("Nombre négatif détecté: " + valeur);
        this.valeur = valeur;
    }
    int getValeur() {
        return valeur;
    }
}
