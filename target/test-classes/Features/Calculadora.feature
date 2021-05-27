#language: pt
#enconding: UTF-8
@Calculadora
Funcionalidade: Calculadora Mobile
  	eu como usuario gostaria de realizar algumas operacoes na calculadora do celular

  @Somar
  Esquema do Cenario: Somar dois numeros
    Quando adicionar o primeiro numero "<NUMERO1>"
    E escolher a operacao de adicao
    E adicionar o segundo numero "<NUMERO2>"
    Entao o resultado da soma deve ser "<RESULTADO>".

    Exemplos: 
      | NUMERO1 | NUMERO2 | RESULTADO |
      |     1.5 |     1.5 |         3 |
      |      -6 |       2 | −4        |
      |      -4 |       6 |         2 |
      |       8 |     0.5 |       8,5 |
      |   -10.5 |       5 | −5,5      |
      |       1 |       1 |         2 |
      |       3 |       7 |        10 |

  @Subtrair
  Esquema do Cenario: Subtrair um numero pelo outro.
    Quando adicionar o primeiro numero "<NUMERO1>"
    E escolher a operacao de subtracao
    E adicionar o segundo numero "<NUMERO2>"
    Entao o resultado da soma deve ser "<RESULTADO>".

    Exemplos: 
      | NUMERO1 | NUMERO2 | RESULTADO |
      |     1.5 |     1.5 |         0 |
      |      -6 |       2 | −8        |
      |      -4 |       6 | −10       |
      |       8 |     0.5 |       7,5 |
      |   -10.5 |       5 | −15,5     |
      |       1 |       2 | −1        |
      |       7 |       3 |         4 |

  @Multiplicar
  Esquema do Cenario: Multiplicar um numero pelo outro.
    Quando adicionar o primeiro numero "<NUMERO1>"
    E escolher a operacao de multiplicacao
    E adicionar o segundo numero "<NUMERO2>"
    Entao o resultado da soma deve ser "<RESULTADO>".

    Exemplos: 
      | NUMERO1 | NUMERO2 | RESULTADO |
      |       2 |       4 |         8 |
      |       5 |       5 |        25 |
