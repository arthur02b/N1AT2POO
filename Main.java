package N1AT2;
public class Main {
    public static void main(String[] args) {

        // Item 3 Classe Main - ponto 2 - instância da ContaBancaria
        ContaBancaria conta = new ContaBancaria("Arthur", 5000);
        System.out.println("Titular da conta: " + conta.getTitular());

        // Item 2 Operações Bancárias - ponto 3 - imprime o saldo inicial
        System.out.println("Saldo inicial da conta: R$" + conta.getSaldo());
        
        // Item 2 Operações Bancárias - ponto 2 - realizando operações de depósito e saque
        conta.depositar(0);
        conta.sacar(100);
        
        // Item 2 Operações Bancárias - ponto 3 - imprime o saldo final
        System.out.println("Saldo final da conta: R$" + conta.getSaldo());
    }
} 
