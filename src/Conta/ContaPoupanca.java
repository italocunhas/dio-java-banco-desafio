package Conta;

import Banco.Banco;
import Cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente titular, Banco banco) {
        super.titular = titular;
        super.banco = banco;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.saldo -= valor;

        contaDestino.saldo += valor;
    }

    @Override
    public void extrato() {
        System.out.println(this.saldo);
    }
}