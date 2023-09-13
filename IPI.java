public class IPI implements ImpostoTaxa {
    private static final double ALIQUOTA = 0.25;

    @Override
    public double calcularImpostoTaxa(Item item) {
        if (item.isProduto()) {
            return item.getValor() * ALIQUOTA;
        }
        return 0;
    }
}
