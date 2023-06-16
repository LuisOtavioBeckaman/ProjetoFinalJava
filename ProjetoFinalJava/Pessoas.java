package ProjetoJAVA;

public abstract class Pessoas {
    // superclasse
    // atributos
    String nome;
    int numeroDaConta;
    double saldo;

    // métodos
    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // métodos diversos

    public void VerificarSaldo() {
        System.out.println("Saldo Atual: R$ "+saldo);
    }

    public void Saque(double valorSacado) {
        if (valorSacado <= saldo) {
            saldo -= valorSacado;
            System.out.println(" Saque de R$ " + valorSacado + " realizado com sucesso!");
            System.out.println("Saldo atual : R$ " + saldo);
        } else {
            System.out.println("Saldo Insuficiente!!");
        }
    }

    public void Deposito(double valorDepositado) {
        saldo += valorDepositado;

        System.out.println(" Depósito de R$ " + valorDepositado + " realizado com sucesso!");

        System.out.println(" Saldo atual: R$ " + saldo);
    }

    public void Emprestimo(double valorEmprestimo) {

        if (valorEmprestimo > 0 && valorEmprestimo < 10000) {
            System.out.println(" Empréstimo de R$ "+valorEmprestimo+" feito com sucesso!");
            saldo += valorEmprestimo;
        } else {
            System.out.println("Indique um valor que seja válido ao banco!");
        }

    }

    

    
}
