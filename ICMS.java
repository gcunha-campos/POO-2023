public class ICMS implements ImpostoTaxa {
    private static final double ALIQUOTA = 0.17;

    @Override
    public double calcularImpostoTaxa(Item item) {
        return item.getValor() * ALIQUOTA;
    }
}
