package ex33;

public class Contabancaria {

    private double numeroDaConta;
    private String titular;
    private double saldo;

    public void contaBancaria(String titular, double numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0.0;

    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("deposito de:" + valor + "deposito feito!");
        } else {
            System.out.println("Valor tem que ser positivo");
        }


    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("saque de:" + valor + "realizado com sucesso");
        } else {
            System.out.println("sado insuficiente");

        }


    }
    public void consultarConta(){
        System.out.println("saldo atual:" + saldo);

    }
    public double getNumeroDaConta(){
        return numeroDaConta;
    }
    public String getTitular(){
        return titular;
    }
}