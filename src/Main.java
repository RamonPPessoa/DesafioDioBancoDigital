public class Main {

    public static void main(String[] args) {

        Cliente ramon = new Cliente();
        ramon.setNome("Ramon");
        Conta corrente1 = new ContaCorrente(ramon);
        
        corrente1.depositar(250);

        Conta poupanca1 = new ContaPoupanca(ramon);

    

        corrente1.transferir(poupanca1, 150);
        corrente1.transferir(poupanca1, 50);



        corrente1.imprimirExtrato();
        poupanca1.imprimirExtrato();    
    }
    
}
