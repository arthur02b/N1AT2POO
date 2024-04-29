package N1AT2;
public class ContaBancaria {
    // Item 1 Classe ContaBancaria - pontos 1, 2 e 3 - atributos
    private String titular; 
    private double saldo;
    
    // Item 1 Classe ContaBancaria - ponto 4 - construtor para titular e saldo
    public ContaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }
    
    // Item 1 Classe ContaBancaria - ponto 5 - get para o titular
    public String getTitular() {
        return titular;
    }
                
    // Item 1 Classe ContaBancaria - ponto 6 - get para o saldo
    public double getSaldo() {
        return saldo;
    }
    
    // Item 2 Operações Bancárias - ponto 1 - método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else if (valor == 0) {
            System.out.println("Nenhum depósito realizado, valor mantido: R$" + saldo);
        } else {
            System.out.println("Erro! Valor inválido para depósito.");
        }
    }
    
    // Item 2 Operações Bancárias - ponto 2 - método para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else if (valor == 0) {
            System.out.println("Nenhum saque realizado, valor mantido: R$" + saldo);
            return false;
        } else {
            System.out.println("Erro! Saldo insuficiente para saque de no valor de R$" + valor + ".");
            return false;
        }
    }  
}
