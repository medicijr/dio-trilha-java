package models;

public class Clientes {

    public int NumeroConta;
    public String Agencia;
    public String NomeCliente;
    public float Saldo;

    public Clientes (int NumeroConta,String Agencia, String NomeCliente, float Saldo){ 
        this.NumeroConta = NumeroConta;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;
    }

}
