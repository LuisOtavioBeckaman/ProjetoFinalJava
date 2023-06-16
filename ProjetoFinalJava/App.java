package ProjetoJAVA;

import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class App {
    public static void main(String[] args) {

        // vetor das contas
        PessoaFisica contaPessoaFisica[] = new PessoaFisica[50];
        PessoaJuridica contaPessoaJuridica[] = new PessoaJuridica[50];

        Scanner sc = new Scanner(System.in);

        boolean aberta = true;

        int contPessoaFisica = 0;
        int contPessoaJuridica = 0;

        while (aberta) {
            System.out.println("============================");
            System.out.println("Seja bem vindo !");
            System.out.println(" O que você deseja fazer "
                    + "\n0 : Sair"
                    + "\n1 : Criar nova conta"
                    + "\n2 : Acessar uma conta já existente");      
            int escolha = sc.nextInt();
            System.out.println(" ");

            if (escolha == 1) {
                System.out.println("========================");
                System.out.println("Você escolheu a opção - criar uma conta ");

                System.out.println("Agora , escolha o tipo de conta que deseja criar: "
                        + "\n1: Pessoa Jurídica"
                        + "\n2: Pessoa Física");

                int tipoDeConta = sc.nextInt();
                System.out.println("========================");

                if (tipoDeConta == 1) {

                    contaPessoaJuridica[contPessoaJuridica] = new PessoaJuridica();


                    System.out.print("Digite o Nome referente a conta:");
                    contaPessoaJuridica[contPessoaJuridica].setNome(sc.next());
                    System.out.println(" ");
                    System.out.print("Digite o CNPJ referente a conta:");
                    contaPessoaJuridica[contPessoaJuridica].setCnpj(sc.next());

                    contaPessoaJuridica[contPessoaJuridica].setSaldo(0);

                    contaPessoaJuridica[contPessoaJuridica].setNumeroDaConta((1001 + contPessoaJuridica));

                    System.out.println("O numero da sua conta é: ** "+contaPessoaJuridica[contPessoaJuridica].getNumeroDaConta()+" **");
                    System.out.println("========================");
                    System.out.println("Criação de conta realizada com sucesso!");

                    contPessoaJuridica++;
                } else if (tipoDeConta == 2) {

                    contaPessoaFisica[contPessoaFisica] = new PessoaFisica();
                    
                    System.out.print("Digite o Nome da conta:");
                    contaPessoaFisica[contPessoaFisica].setNome(sc.next());
                    System.out.println("========================");
                    System.out.print("Digite o CPF da conta:");
                    contaPessoaFisica[contPessoaFisica].setCpf(sc.next());

                    contaPessoaFisica[contPessoaFisica].setSaldo(0);

                    contaPessoaFisica[contPessoaFisica].setNumeroDaConta((2001 + contPessoaFisica));
                    System.out.println("O número da sua conta é: ** "+contaPessoaFisica[contPessoaFisica].getNumeroDaConta()+" **");
                    System.out.println("========================");
                    System.out.println("Criação de conta realizada com sucesso!");

                    contPessoaFisica++;
                } else {
                    System.out.println("O número indicado que é inválido , porfavor, tente novamente!");
                }

            } else if (escolha == 2) {

                System.out.println("Você escolheu acessar uma conta que já posssui registro!");
                System.out.println("Escolha o tipo de conta que você deseja acessar: "
                        + "\n1: Pessoa Jurídica"
                        + "\n2: Pessoa Física");
                        System.out.println(" ");
                int tipoDeConta2 = sc.nextInt();

                if (tipoDeConta2 == 1) {
                    // acessar conta existente
                    System.out.println("Você escolheu acessar uma conta de Pessoa Jurídica");

                    System.out.print("Digite o número da conta que você deseja acessar: ");
                    int buscarConta = sc.nextInt();

                    int contaAtual = 0;

                    for (int i = 0; i < contaPessoaJuridica.length; i++) {
                        if (buscarConta == contaPessoaJuridica[i].getNumeroDaConta()) {
                            contaAtual = i;
                            break;
                        }
                    }

                    boolean acessar = true;
                    while (acessar) {
                        System.out.println("============================");
                        System.out.println("Seja bem vindo!, " + contaPessoaJuridica[contaAtual].getNome());
                        System.out.println(" O que você deseja fazer "
                                + "\n0 : vizualizar Saldo"
                                + "\n1 : Saque"
                                + "\n2 : Depósito"
                                + "\n3 : Empréstimo"
                                + "\n4 : Informações gerais"
                                + "\n5 : Sair");
                        System.out.println("============================");
                        int acao = sc.nextInt();
                        System.out.println(" ");

                        if (acao == 0) {
                            contaPessoaJuridica[contaAtual].VerificarSaldo();
                        } else if (acao == 1) {
                            System.out.println("============================");
                            System.out.print(" Indique o valor que você deseja sacar: ");
                            contaPessoaJuridica[contaAtual].Saque(sc.nextDouble());
                            System.out.println("============================");
                            System.out.println(" ");
                        } else if (acao == 2) {
                            System.out.println("============================");
                            System.out.print(" Indique o valor que será depositado: ");
                            contaPessoaJuridica[contaAtual].Deposito(sc.nextDouble());
                            System.out.println("============================");
                            System.out.println(" ");
                        } else if (acao == 3) {
                            System.out.println("============================");
                            System.out.print(" Indique o valor do empréstimo");
                            contaPessoaJuridica[contaAtual].Emprestimo(sc.nextDouble());
                            System.out.println("============================");
                            System.out.println(" ");
                        } else if (acao == 4) {
                            contaPessoaJuridica[contaAtual].InformacoesGeraisPJ();
                        } else if (acao == 5) {
                            System.out.println("============================");
                            System.out.println("Você deseja sair? "
                                    + "\n1: Sim"
                                    + "\n2: Não");
                            int nFechar = sc.nextInt();
                            if (nFechar == 1) {
                                acessar = false;
                            } else if (nFechar == 2) {

                            } else {
                                System.out.println(" O número digitado é inválido , porfavor, tente novamente!");
                            }
                        } else {
                            System.out.println("O número digitado é inválido, porfavor, tente novamente!");
                        }

                    }
                    // acessar conta existente
                } else if (tipoDeConta2 == 2) {
                    // acessar conta existente
                    System.out.println("Você optou acessar uma conta de Pessoa Física");

                    System.out.print("Indique o número da conta deseja acessar: ");
                    int buscarConta = sc.nextInt();

                    int contaAtual = 0;

                    for (int i = 0; i < contaPessoaFisica.length; i++) {
                        if (buscarConta == contaPessoaFisica[i].getNumeroDaConta()) {
                            contaAtual = i;
                            break;
                        }
                    }

                    boolean acessar = true;
                    while (acessar) {
                        System.out.println("============================");
                        System.out.println("Seja bem vindo!, " + contaPessoaFisica[contaAtual].getNome());
                        System.out.println(" O que você deseja fazer ?"
                                + "\n0 : Ver Saldo"
                                + "\n1 : Saque"
                                + "\n2 : Depósito"
                                + "\n3 : Empréstimo"
                                + "\n4 : Informações gerais"
                                + "\n5 : Sair");
                        System.out.println("============================");
                        int acao = sc.nextInt();
                        System.out.println("========================");

                        if (acao == 0) {
                            System.out.println("============================");
                            contaPessoaFisica[contaAtual].VerificarSaldo();
                            System.out.println("============================");
                            System.out.println("========================");
                        } else if (acao == 1) {
                            System.out.println("============================");
                            System.out.print(" Indique o valor que você deseja sacar: ");
                            contaPessoaFisica[contaAtual].Saque(sc.nextDouble());
                            System.out.println("============================");
                            System.out.println("========================");
                        } else if (acao == 2) {
                            System.out.println("============================");
                            System.out.print(" Indique o valor que será depositado: ");
                            contaPessoaFisica[contaAtual].Deposito(sc.nextDouble());
                            System.out.println("============================");
                            System.out.println("========================");
                        } else if (acao == 3) {
                            System.out.println("============================");
                            System.out.print(" Indique o valor do empréstimo");
                            contaPessoaFisica[contaAtual].Emprestimo(sc.nextDouble());
                            System.out.println("============================");
                            System.out.println("========================");
                        } else if (acao == 4) {
                            contaPessoaFisica[contaAtual].InformacoesGeraisPF();
                        } else if (acao == 5) {
                            System.out.println("============================");
                            System.out.println("Você deseja sair? "
                                    + "\n1: Sim"
                                    + "\n2: Não");
                            int nFechar = sc.nextInt();
                            if (nFechar == 1) {
                                acessar = false;
                            } else if (nFechar == 2) {

                            } else {
                                System.out.println(" O número digitado é inválido , porfavor, tente novamente!");
                            }
                        } else {
                            System.out.println("O número indicado inválido, porfavor, tente novamente!");
                        }

                    }
                    // acessar conta existente
                } else {
                    System.out.println(" O nnúmero que você digitou é inválido, porfavor, tente novamente!");
                }

            } else if (escolha == 0) {
                aberta = false;
            } else {
                System.out.println("Digite um número que seja válido!");
            }

        }
    }
}
