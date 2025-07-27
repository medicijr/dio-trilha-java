package banco;
/*
 Sintaxe - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
Revise sobre regras de declaração de variáveis

Atributo	Tipo	    Exemplo
Numero	    Inteiro	    1021
Agencia	    Texto	    067-8
NomeCliente	Texto	    MARIO ANDRADE
Saldo	    Decimal	    237.48

Revise sobre terminal, main args e a classe Scanner
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)

Revise sobre concatenação e classe String com método concat

Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários. 
*/

import java.util.Scanner;

import models.Clientes;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!: ");
        int num = scanner.nextInt();

        Clientes cliente01 = new Clientes (num, "067-8","Mario Andrade", 237.48f);

        System.out.println("Olá "+ cliente01.NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "+cliente01.Agencia+ ", conta "+cliente01.NumeroConta+ " e seu saldo "+cliente01.Saldo+ " já está disponível para saque.");

        scanner.close();
    
    }
}