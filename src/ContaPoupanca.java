git ini

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        
        System.out.println("EXtrato conta poupança");
        super.imprimirInfosComuns();
        
        
        
    }

  
    
 
}
