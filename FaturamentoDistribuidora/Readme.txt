Esse programa é responsável por ler um arquivo JSON que contém dados de faturamento diário de uma distribuidora, 
e realizar algumas operações com esses dados. Ele utiliza a biblioteca JSON.simple para 
realizar o parse do arquivo JSON e transformar seus dados em objetos Java.
Defini uma classe interna chamada "Faturamento", que representa os dados de faturamento diário, 
contendo o dia e o valor de faturamento para aquele dia.
O programa utiliza o objeto JSONParser para fazer o parse do arquivo JSON e carregar seus dados em um JSONArray 
chamado "faturamentoJson". Em seguida, ele percorre cada objeto no JSONArray e cria um objeto Faturamento para cada um, 
atribuindo os valores do JSON aos campos da classe Faturamento. Esses objetos Faturamento são adicionados a uma 
lista chamada "faturamento".
O programa então calcula o menor e o maior valor de faturamento diário percorrendo a lista de objetos Faturamento e 
atualizando as variáveis "menor" e "maior" conforme necessário. Em seguida, imprime esses valores na tela usando o 
método "formatarValor" para formatar os números em formato de moeda.
O programa também calcula a média mensal de faturamento, desconsiderando os dias sem faturamento. 
Ele faz isso percorrendo novamente a lista de objetos Faturamento, somando os valores dos dias com faturamento 
e contando quantos dias com faturamento existem. A média é então calculada dividindo o total pelo número de dias com faturamento.
Por fim, calcula o número de dias em que o faturamento diário foi superior à média mensal, 
percorrendo a lista de objetos Faturamento e contando os dias em que o valor de faturamento foi maior que a média mensal.
Caso ocorra alguma exceção durante a execução do programa, ela será capturada no bloco catch e será impressa na 
tela usando o método printStackTrace().