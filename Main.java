import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        
        itens.add(new Item("Secador de Cabelo", 120.0, true));
        itens.add(new Item("Televisão 4K", 800.0, true));
        itens.add(new Item("Notebook", 1500.0, true));
        itens.add(new Item("Relógio de Pulso", 300.0, true));
        itens.add(new Item("Fone de Ouvido Bluetooth", 80.0, true));
        itens.add(new Item("Câmera Digital", 400.0, true));
        itens.add(new Item("Corte de Cabelo", 50.0, false));
        itens.add(new Item("Manicure", 30.0, false));
        itens.add(new Item("Limpeza de Carpete", 120.0, false));
        itens.add(new Item("Aula de Yoga", 40.0, false));

        double totalImpostosTaxas = 0.0;
        
        DecimalFormat df = new DecimalFormat("#.##"); 

        for (Item item : itens) {
            ImpostoTaxa impostoTaxa;
            if (item.isProduto()) {
                impostoTaxa = new ICMS();
                impostoTaxa = new IPI(); 
            } else {
                impostoTaxa = new ISS();
            }

            double impostoTaxaCalculado = impostoTaxa.calcularImpostoTaxa(item);
            totalImpostosTaxas += impostoTaxaCalculado;

            System.out.println("Item: " + item.getNome());
            System.out.println("  Valor original: R$" + df.format(item.getValor()));
            System.out.println("  Imposto/Taxa (" + impostoTaxa.getClass().getSimpleName() + "): R$" + df.format(impostoTaxaCalculado));
        }

        System.out.println("Total de impostos/taxas: R$" + df.format(totalImpostosTaxas));
        System.out.println("Total a pagar: R$" + df.format(totalImpostosTaxas + itens.stream().mapToDouble(Item::getValor).sum()));
    }
}

