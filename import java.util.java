import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>();
        ArrayList<String> horario = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        String opcao;
        String resposta;
        do{
            System.out.println(
            "1-Nome aluno:\n"+
            "2-Matricula\n"+
            "3-Horarios\n"+
            "4-Encerrar Sistema\n");
            
            opcao = entrada.nextLine();
            switch(opcao){
                case "1":
                    System.out.println("Informe o nome cadastrado do aluno: ");
                    String nome = entrada.nextLine();
                    
                    System.out.println("Agora informe a sua senha: ");
                    
                    try {
                        int senha = Integer.parseInt(entrada.nextLine());

                        alunos.add(nome);
                        System.out.println("Aluno cadastrado com sucesso!");

                    } catch (NumberFormatException e) {
                        System.out.println("Erro, insira apenas números para a senha.");
                    }

                    break;
                    
                case "2":
                    System.out.println("Informe a sua matricula para o sistema: ");
                    try {
                        int matricula = Integer.parseInt(entrada.nextLine());
                        System.out.println("Seja bem vindo "+matricula);

                    } catch (NumberFormatException e) {
                        System.out.println("Erro, insira apenas números na matricula.");
                    }

                    break;
                    
                case "3":
                    while(true){
                        System.out.println("Monte a sua grade de horarios (digite 'sair' para encerrar o loop)");
                        System.out.println(
                        "segunda: Filosofia e logica matematica \n"+
                        "terca:Creatividade e Calculo 1 \n"+
                        "quarta: \n"+
                        "quinta: \n"+
                        "sexta:");
                        
                        
                        String dia = entrada.nextLine();
                        
                        if(dia.equals("sair")){
                            System.out.println("Os dias de aula que escolheu foram: "+horario);
                            break;
                        }
                        horario.add(dia);
                        System.out.println("Foi adicionado em sua grade horaria");
                        
                    }
                    break;
                    
                case "4":
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
                
                }
        System.out.println("Deseja visitar alguma coisa no sistema: [s n]");
        resposta = entrada.nextLine();
        if(resposta.equals("n")){
            break;
        }
            } while(!opcao.equals("4"));
            
            entrada.close();
        }
    }