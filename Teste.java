package ProjetoPOO;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senhaPadrão = "null";
        String testarSenha;
        System.out.println("Digite 1 para criar uma conta corrente");
        System.out.println("Digite 2 para criar uma conta poupança");
        int aux = ler.nextInt();

        // CRIANDO CONTA CORRENTE
        if (aux == 1) {
            
            ContaBancaria cc = new ContaCorrente(senhaPadrão);
            Cliente cliente = new Cliente();
            ler.nextLine();
            System.out.println("Nome:");
            cliente.setNome(ler.nextLine());
            System.out.println("Cpf:");
            cliente.setCpf(ler.nextLine());
            System.out.println("Idade:");
            cliente.setIdade(ler.nextInt());

            if (cc.validarIdade(cliente.getIdade())) {
                System.out.println("------------------------");
                System.out.println("A senha padrão é: null");
                System.out.println("Digite 1 para manter a senha padrão");
                System.out.println("Digite 2 para alterar a senha padrão");
                int aux2 = ler.nextInt();

                // MUDANDO OU MANTENDO SENHA
                if (aux2==1) {
                    System.out.println("A senha padrão foi mantida");
                }else{
                    ler.nextLine();
                    System.out.println("Informe a senha padrão primeiro");
                    String informarSenha = ler.nextLine();
                    // CONFIRMANDO SE A SENHA PADRÃO ESTÁ CORRETA
                    if (informarSenha.equals(senhaPadrão)) {
                        System.out.println("Agora informe a nova senha");
                        String novaSenha = ler.nextLine();
                        cc.alteraSenha(novaSenha);
                    } else{
                        System.out.println("-- PIM PIM PIM --");
                        System.out.println("A senha padrão que você informou está errada, ela será mantida pelo resto do código, sua senha é (null)");
                    }
                }

                // CODIGO CONTA CORRENTE
                ler.nextLine();
                System.out.println("Agora que a senha foi criada digite sua senha para entrar na conta: ");
                    testarSenha = ler.nextLine();
                    if (testarSenha.equals(cc.getSenha())) {
                        int aux3;
                        System.out.println("Você entrou na sua conta corrente");
                        do {
                            System.out.println("------------------------");
                            System.out.println("Para sacar digite 1");
                            System.out.println("Para depositar digite 2");
                            System.out.println("Para ver o seu saldo digite 3");
                            System.out.println("Para tirar extrato digite 4");
                            System.out.println("Para sair digite 5");
                            aux3 = ler.nextInt();

                            if (aux3==1) {
                                System.out.println("Quanto você deseja sacar?");
                                double auxSaca = ler.nextDouble();
                                cc.saca(auxSaca);
                            }else if (aux3==2) {
                                System.out.println("Quanto você deseja depositar?");
                                double auxDeposita = ler.nextDouble();
                                cc.deposita(auxDeposita);
                            }else if (aux3==3) {
                                System.out.println(cc.getSaldo());
                            }else if (aux3==4) {
                                cc.extrato();
                            }else{
                                System.out.println("Você saiu da sua conta");
                            }
                        } while (aux3!=5);
                    }else{
                        System.out.println("Senha incorreta");
                    }
            }else{
                System.out.println("Você não possui idade suficiente para criar uma conta bancaria");
            }

        } 
        
        //CRIANDO CONTA POUPANÇA
        else {
            ContaPoupanca cp = new ContaPoupanca(senhaPadrão);
            
            Cliente cliente = new Cliente();
            ler.nextLine();
            System.out.println("Nome:");
            cliente.setNome(ler.nextLine());
            System.out.println("Cpf:");
            cliente.setCpf(ler.nextLine());
            System.out.println("Idade:");
            cliente.setIdade(ler.nextInt());

            if (cp.validarIdade(cliente.getIdade())) {
                System.out.println("------------------------");
                System.out.println("A senha padrão é: null");
                System.out.println("Digite 1 para manter a senha padrão");
                System.out.println("Digite 2 para alterar a senha padrão");
                int aux2 = ler.nextInt();

                //MUDANDO SENHA OU MANTENDO
                if (aux2==1) {
                    System.out.println("A senha padrão foi mantida");
                }else{
                    //CONFIRMANDO SE A SENHA PADRÃO ESTÁ CORRETA
                    ler.nextLine();
                    System.out.println("Informe a senha padrão primeiro");
                    String informarSenha = ler.nextLine();

                    // MUDANDO SENHA
                    if (informarSenha.equals(senhaPadrão)) {
                        System.out.println("Agora informe a nova senha");
                        String novaSenha = ler.nextLine();
                        cp.alteraSenha(novaSenha);
                    } else{
                        System.out.println("-- PIM PIM PIM --");
                        System.out.println("A senha padrão que você informou está errada, ela será mantida pelo resto do código, sua senha é (null)");
                    }

                }

                //CODIGO CONTA POUPANÇA
                ler.nextLine();
                System.out.println("Agora que a senha foi criada digite sua senha para entrar na conta: ");
                testarSenha = ler.nextLine();
                if (testarSenha.equals(cp.getSenha())) {
                    int aux3;
                    System.out.println("Você entrou na sua conta corrente");
                    do {
                        System.out.println("------------------------");
                        System.out.println("Para sacar digite 1");
                        System.out.println("Para depositar digite 2");
                        System.out.println("Para ver o seu saldo digite 3");
                        System.out.println("Para tirar extrato digite 4");
                        System.out.println("Para ver rendimento anual do seu saldo atual digite 5");
                        System.out.println("Para sair digite 6");
                        aux3 = ler.nextInt();

                        if (aux3==1) {
                            System.out.println("Quanto você deseja sacar?");
                            double auxSaca = ler.nextDouble();
                            cp.saca(auxSaca);
                        }else if (aux3==2) {
                            System.out.println("Quanto você deseja depositar?");
                            double auxDeposita = ler.nextDouble();
                            cp.deposita(auxDeposita);
                        }else if (aux3==3) {
                            System.out.println(cp.getSaldo());
                        }else if (aux3==4) {
                            cp.extrato();
                        }else if(aux3==5){
                            // System.out.println(cp.rendimentoAnual());
                            double saldoRendimento = cp.getSaldo() + cp.rendimentoAnual();
                            System.out.printf("%.2f %n",  cp.rendimentoAnual()); 
                            System.out.printf("Seu saldo após um ano seria: %.2f %n" , saldoRendimento);
                        }else{
                            System.out.println("Você saiu da sua conta");
                        }
                    } while (aux3!=6);
                }else{
                    System.out.println("Senha incorreta");
                }
            }else{
                System.out.println("Você não possui idade suficiente para criar uma conta bancaria");
            }
        }
        ler.close();
    }
}