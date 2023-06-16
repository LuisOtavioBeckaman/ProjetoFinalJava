package ProjetoJAVA;

public class PessoaFisica extends Pessoas {
    String cpf;

    //getters and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void InformacoesGeraisPF() {
        System.out.println("=======================");
        System.out.println("Nome da Conta: " +nome);
        System.out.println("CPF: " +cpf);
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println(" Saldo: R$ " +saldo);
        System.out.println("=======================");
    }
    
}
