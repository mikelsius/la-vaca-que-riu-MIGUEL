import java.util.ArrayList;

/**
 * Programa d'entrada de vaques en un cami贸.
 *
 * @author xavier
 *
 */
public final class Principal {
    /**
     * Pes m脿xim que pot portar el cami贸.
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
     * Entra les vaques que hi c脿piguen i plega...
     *
     * @param args arguments
     */
    public static void main(final String[] args) {

        //Dades de les vaques
        String[] noms = {"Maria", "Pepa", "Flor", "To駃", "Conxita", "Blanca"};
        int[] pesos   = {360,    250,    400,    180,    50,         90};
        int[] litres  = {40,     35,     43,     28,    12,         13};

        // Genero la llista de vaques.
        vaques = new ArrayList<Vaca>();
        for (int i = 0; i < noms.length; i++) {
            vaques.add(new Vaca(noms[i], pesos[i], litres[i]));
        }

        // Creo el cami贸 definint-li el pes m脿xim.
        Camio trailer = new Camio(PESDELCAMIO);

        // ACCI脫
        trailer = emplenaCamioSensePensar(trailer);
        System.out.println(trailer.getNomsDeVaques() + " : "
                           + trailer.getLitres() + " litres");
    }


    /**
     * Calcula quines vaques s'han de posar al cami贸.
     * @param trailer Cami贸
     * @return cami贸 amb les vaques posades
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
