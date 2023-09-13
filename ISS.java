public class ISS implements ImpostoTaxa {
    private static final double ALIQUOTA = 0.046;

    @Override
    public double calcularImpostoTaxa(Item item) {
        if (item.isProduto()) {
            return 0;
        }
        return item.getValor() * ALIQUOTA;
    }
}
