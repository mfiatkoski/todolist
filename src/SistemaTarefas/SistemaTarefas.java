/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
package SistemaTarefas;

import java.util.Scanner;

public class SistemaTarefas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Vetor para guardar no máximo 10 tarefas
        String[] tarefas = new String[10];
        int quantidade = 0;
        int opcao = 0;

        System.out.println("---gestao de tarefas---");

        while (opcao != 4) {
            System.out.println("\n1 Adicionar tarefa");
            System.out.println("2 Excluir tarefa");
            System.out.println("3 Mostrar todas");
            System.out.println("4 Concluir todas as atividades / Sair");
            System.out.print("Escolha o numero da opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                if (quantidade == 10) {
                    System.out.println("A lista de tarefas esta cheia!");
                } else {
                    System.out.print("Digite a tarefa: ");
                    String texto = teclado.nextLine();
                    for (int i = 0; i < 10; i++) {
                        if (tarefas[i] == null) {
                            tarefas[i] = texto;
                            quantidade = quantidade + 1;
                            System.out.println("Tarefa adicionada com sucesso!");
                            break;
                        }
                    }
                }
            } else if (opcao == 2) {
                if (quantidade == 0) {
                    System.out.println("Nao tem nada para apagar ainda!");
                } else {
                    System.out.println("\nQual você quer apagar? (Digite o número)");
                    for (int i = 0; i < 10; i++) {
                        if (tarefas[i] != null) {
                            System.out.println(i + " - " + tarefas[i]);
                        }
                    }
                    System.out.print("Número da tarefa: ");
                    int posicaoApagar = teclado.nextInt();
                    if (posicaoApagar >= 0 && posicaoApagar < 10 && tarefas[posicaoApagar] != null) {
                        tarefas[posicaoApagar] = null;
                        quantidade = quantidade - 1;
                        System.out.println("Tarefa excluída com sucesso!");
                    } else {
                        System.out.println("Ih, essa posição aí não vale!");
                    }
                }
            } else if (opcao == 3) {
                if (quantidade == 0) {
                    System.out.println("Lista vazia, sem nada para fazer!");
                } else {
                    System.out.println("\nSua Lista Atual:");
                    for (int i = 0; i < 10; i++) {
                        if (tarefas[i] != null) {
                            System.out.println("[" + i + "] " + tarefas[i]);
                        }
                    }
                }
            } else if (opcao == 4) {
                if (quantidade == 0) {
                    System.out.println("Lista completa! Nenhuma atividade pendente.");
                } else {
                    System.out.println("Concluindo todas as atividades restantes:");
                    for (int i = 0; i < 10; i++) {
                        if (tarefas[i] != null) {
                            System.out.println("[" + i + "] " + tarefas[i] + " - CONCLUÍDA!");
                            tarefas[i] = null;
                        }
                    }
                  
                }
             
            }
        }
      
    }
}
