public class Main {

    public static void main(String[] args) {
        
        Cliente fulano = new Cliente();
        fulano.setNome("Fulano Da Silva");
        
        Conta cc = new ContaCorrente(fulano);

        Conta cp = new ContaPoupanca(fulano);

        cc.depositar(100);
        cc.transferir(20.50, cp);


        System.out.println("++++++++++++++++\n");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        System.out.println("++++++++++++++++\n");
    }
}