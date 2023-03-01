package faturamentodistribuidora;

/**
 *
 * @author Anderson Meirelles Cabrera
 */
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaturamentoDistribuidora {
  
  public static void main(String[] args) {
    try {
      // Carrega os dados do arquivo JSON
      JSONParser parser = new JSONParser();
      JSONArray faturamentoJson = (JSONArray) parser.parse(new FileReader("\\AQUI\\O\\DIRETORIO\\DO\\ARQUIVO\\faturamento.json"));

      // Converte os dados para uma lista de objetos Faturamento
      List<Faturamento> faturamento = new ArrayList<>();
      for (Object obj : faturamentoJson) {
        JSONObject jsonObj = (JSONObject) obj;
        Faturamento fat = new Faturamento();
        fat.dia = ((Long) jsonObj.get("dia")).intValue();
        fat.valor = ((Number) jsonObj.get("valor")).doubleValue();
        faturamento.add(fat);
      }

      // Calcula o menor e o maior valor de faturamento diário
      double menor = Double.MAX_VALUE;
      double maior = Double.MIN_VALUE;
      for (Faturamento fat : faturamento) {
        if (fat.valor < menor) {
          menor = fat.valor;
        }
        if (fat.valor > maior) {
          maior = fat.valor;
        }
      }
      System.out.println("Menor valor de faturamento diário: " + formatarValor(menor));
      System.out.println("Maior valor de faturamento diário: " + formatarValor(maior));

      // Calcula a média mensal de faturamento, desconsiderando os dias sem faturamento
      double total = 0;
      int contDias = 0;
      for (Faturamento fat : faturamento) {
        if (fat.valor > 0) {
          total += fat.valor;
          contDias++;
        }
      }
      double media = total / contDias;

      // Calcula o número de dias em que o faturamento diário foi superior à média mensal
      int contSuperior = 0;
      for (Faturamento fat : faturamento) {
        if (fat.valor > media) {
          contSuperior++;
        }
      }
      System.out.println("Número de dias com faturamento superior à média mensal: " + contSuperior);

    } catch (IOException | ParseException e) {
      e.printStackTrace();
    }
  }

  // Classe auxiliar para representar os dados de faturamento diário
  private static class Faturamento {
    public int dia;
    public double valor;
  }

  // Método auxiliar para formatar o valor de faturamento com duas casas decimais
  private static String formatarValor(double valor) {
    DecimalFormat df = new DecimalFormat("#.00");
    return "R$" + df.format(valor);
  }

}


