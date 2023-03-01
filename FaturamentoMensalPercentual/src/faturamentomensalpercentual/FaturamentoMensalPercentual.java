package faturamentomensalpercentual;

/**
 *
 * @author Anderson Meirelles Cabrera
 */
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class FaturamentoMensalPercentual {

    public static void main(String[] args) {
        // Definindo o faturamento mensal de cada estado
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calculando o faturamento total da distribuidora
        double faturamentoTotal = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        // Calculando o percentual de representação de cada estado
        Map<String, Double> percentualPorEstado = new HashMap<>();
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100.0;
            percentualPorEstado.put(entry.getKey(), percentual);
        }

        // Imprimindo os resultados
        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato com duas casas decimais
        System.out.println("Faturamento total da distribuidora: R$" + df.format(faturamentoTotal));
        for (Map.Entry<String, Double> entry : percentualPorEstado.entrySet()) {
            System.out.println("Percentual de representação de " + entry.getKey() + ": " + df.format(entry.getValue()) + "%");
        }
    }
}
