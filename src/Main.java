public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            entier.decrementer();
            System.out.println("Valeur actuelle: " + entier.getVal());
            entier.setVal(-2);
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeur());
        }
    }
}