public class Vaca {
    private String nom;
    private int pes;
    private int litres;

    /**
     * Constructor de la vaca.
     * @param elnom nom de la vaca
     * @param elpes pes de la vaca
     * @param elslitres litres que fa la vaca
     */
    public Vaca(final String elnom, final int elpes, final int elslitres) {
        nom = elnom;
        pes = elpes;
        litres = elslitres;
    }

    /**
     * @return el pes de la vaca.
     */
    public final int getPes() {
        return pes;
    }

    /**
     * Defineix el pes de la vaca.
     * @param quilos Pes
     */
    public final void setPes(final int quilos) {
        pes = quilos;
    }

    /**
     * @return litres de llet que fa la vaca.
     */
    public final int getLitres() {
        return litres;
    }

    /**
     * Defineix els litres de llet que fa la vaca.
     * @param llet Litres de llet
     */
    public final void setLitres(final int llet) {
        this.litres = llet;
    }

    /**
     * @return no de la vaca.
     */
    public final String getNom() {
        return nom;
    }

    /**
     * Identificador.
     */
    public String toString() {
        return nom;
    }

}

