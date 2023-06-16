package ProjetoJAVA;

public class PessoaJuridica extends Pessoas{
    String cnpj;

    //getters and setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void InformacoesGeraisPJ() {
        System.out.println("=======================");
        System.out.println("Nome da Conta: " +nome);
        System.out.println("CNPJ: " +cnpj);
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println(" Saldo: R$ " +saldo);
        System.out.println("=======================");
    }
    
}
