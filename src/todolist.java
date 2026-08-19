


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class todolist { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String[] tarefas = new String[10]; 
        boolean[] concluidas = new boolean[10]; 
        int opcao = 0; 

        while (opcao != 5) { 
            System.out.println("\n====LISTA DE TAREFAS===="); 
            System.out.println("1- Adicionar tarefa"); 
            System.out.println("2- Listar tarefas"); 
            System.out.println("3- Concluir tarefa"); 
            System.out.println("4- Excluir tarefa"); 
            System.out.println("5- Sair"); 
            System.out.print("Escolha uma opcao: "); 
            
            opcao = scanner.nextInt(); 
            scanner.nextLine(); // Limpa o buffer do teclado

            switch(opcao) { 
                case 1: 
                    int posicaoLivre = -1; 
                    for(int i = 0; i < tarefas.length; i++) { 
                        if (tarefas[i] == null) { 
                            posicaoLivre = i; 
                            break; 
                        } 
                    } 
                    if (posicaoLivre == -1) { 
                        System.out.println("A lista de tarefas esta cheia!"); 
                    } else { 
                        System.out.print("Digite uma tarefa: "); 
                        tarefas[posicaoLivre] = scanner.nextLine(); 
                        concluidas[posicaoLivre] = false; 
                        System.out.println("Tarefa adicionada com sucesso!"); 
                    } 
                    break; 

                case 2: 
                    System.out.println("\n---Minhas tarefas---"); 
                    boolean existeTarefa = false; 
                    for(int i = 0; i < tarefas.length; i++) { 
                        if(tarefas[i] != null) { 
                            existeTarefa = true; 
                            if(concluidas[i]) { 
                                System.out.println((i + 1) + " - [x] " + tarefas[i]); 
                            } else { 
                                System.out.println((i + 1) + " - [ ] " + tarefas[i]); 
                            } 
                        } 
                    } 
                    if (!existeTarefa) { 
                        System.out.println("Nenhuma tarefa cadastrada!"); 
                    } 
                    break;

                case 3:
                    System.out.print("Digite o numero da tarefa que deseja concluir: ");
                    int concluirIdx = scanner.nextInt() - 1;
                    if (concluirIdx >= 0 && concluirIdx < tarefas.length && tarefas[concluirIdx] != null) {
                        concluidas[concluirIdx] = true;
                        System.out.println("Tarefa marcada como concluida!");
                    } else {
                        System.out.println("Tarefa invalida!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o numero da tarefa que deseja excluir: ");
                    int excluirIdx = scanner.nextInt() - 1;
                    if (excluirIdx >= 0 && excluirIdx < tarefas.length && tarefas[excluirIdx] != null) {
                        tarefas[excluirIdx] = null;
                        concluidas[excluirIdx] = false;
                        System.out.println("Tarefa excluida com sucesso!");
                    } else {
                        System.out.println("Tarefa invalida!");
                    }
                    break;

            } 
        } 
     
    } 
}
