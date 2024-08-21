package Conta;

import Banco.Banco;
import Cliente.Cliente;

public abstract class Conta implements IConta{
    private static int SEQUENCIAL = 1;
    protected double saldo = 0;
    protected int agencia = 1;
    protected int numero;
    protected Cliente titular;
    protected Banco banco;
    public Conta() {
        this.numero = SEQUENCIAL++;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
}