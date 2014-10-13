import java.util.ArrayList;

/**
 * Programa d'entrada de vaques en un camió.
 *
 * @author xavier
 *
 */
public final class Principal {
    /**
     * Pes màxim que pot portar el camió.
     */
    private static final int PESDELCAMIO = 700;

    static ArrayList<Vaca> vaques;

    /**
     * Evitar que es crein objectes a partir de la classe.
     */
    private Principal() {
    }
    /**
     * Programa principal.
     *
     * Entra les vaques que hi càpiguen i plega...
     *
     * @param args arguments
     */
    public static void main(final String[] args) {

        //Dades de les vaques
        String[] noms = {"Maria", "Pepa", "Flor", "To�i", "Conxita", "Blanca"};
        int[] pesos   = {360,    250,    400,    180,    50,         90};
        int[] litres  = {40,     35,     43,     28,    12,         13};

        // Genero la llista de vaques.
        vaques = new ArrayList<Vaca>();
        for (int i = 0; i < noms.length; i++) {
            vaques.add(new Vaca(noms[i], pesos[i], litres[i]));
        }

        // Creo el camió definint-li el pes màxim.
        Camio trailer = new Camio(PESDELCAMIO);

        // ACCIÓ
        trailer = emplenaCamioSensePensar(trailer);
        System.out.println(trailer.getNomsDeVaques() + " : "
                           + trailer.getLitres() + " litres");
    }


    /**
     * Calcula quines vaques s'han de posar al camió.
     * @param trailer Camió
     * @return camió amb les vaques posades
     */
    private static Camio emplenaCamioSensePensar(final Camio trailer) {

        // Entro els camions
        for (int i = 0; i < vaques.size(); i++) {

            if (trailer.entraVaca(vaques.get(i))) {
                System.out.println(vaques.get(i).getNom() + " ha entrat!");
            } else {
                System.out.println(vaques.get(i).getNom() + " rebutjada");
            }
        }

        return trailer;
    }

}
