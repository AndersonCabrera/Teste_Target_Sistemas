Esse programa tem como objetivo calcular o faturamento mensal da distribuidora por estado 
e apresentar o percentual de representação de cada estado no faturamento total.
Para começar, o programa utiliza a classe HashMap para armazenar o faturamento mensal de cada estado. 
O faturamento é definido para cada estado e, em seguida, é calculado o faturamento total da 
distribuidora através da soma dos valores de faturamento.
Depois disso, o programa calcula o percentual de representação de cada estado no faturamento total. 
Para isso, é utilizado um loop que percorre cada entrada do HashMap de faturamento por estado. 
Dentro do loop, o percentual de representação é calculado dividindo o valor do faturamento do estado 
pelo faturamento total e multiplicando o resultado por 100. Em seguida, o percentual é armazenado em um 
novo HashMap de percentuais por estado.
Por fim, o programa imprime os resultados utilizando um loop que percorre cada entrada do HashMap de 
percentuais por estado. Dentro do loop, é utilizada a classe DecimalFormat para formatar o valor do 
percentual com duas casas decimais e o resultado é exibido na tela junto com o nome do estado.