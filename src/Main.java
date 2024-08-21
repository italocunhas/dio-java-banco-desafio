import Banco.Banco;
import Cliente.Cliente;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Banco bancoCaixa = new Banco("caixa");

        Cliente alexandre = new Cliente("Alexandre","09252174925", 31, "teste", "teste" );
        Cliente helena = new Cliente("Helena","09252174925", 31, "teste", "teste" );


        ContaCorrente contaA = new ContaCorrente(alexandre, bancoCaixa);
        ContaPoupanca contaB = new ContaPoupanca(helena, bancoCaixa);


        System.out.println(contaA.getTitular().getNome());
        System.out.println(contaA.getBanco().getNome());
        contaA.depositar(2000.00);
        contaB.depositar(2000.00);

        contaA.sacar(100.00);
        contaA.transferir(contaB, 500.00);
        contaA.extrato();
        contaB.extrato();

    }
}