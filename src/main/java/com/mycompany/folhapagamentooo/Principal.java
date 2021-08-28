/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.folhapagamento;

import java.util.Scanner;

/**
 *
 * @author rafap
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        while (true) {
            exibeMenu();
            opcao = input.nextInt();

            switch (opcao) {

                case 1: // folha de pagamento
                    FolhaPagamento fp = new FolhaPagamento();
                    break;

                case 2: // sair
                    System.out.println("ATÉ LOGO!!!!");
                    System.exit(0);
                default:
                    System.out.println("OPCAO INVALIDA!!!!");
            }
        }
    }

    public static void exibeMenu() {
        System.out.println("-------------------");
        System.out.println("Escolha uma opcao: ");
        System.out.println("[1] Folha de Pagamento");
        System.out.println("[2] Sair");
        System.out.println("-------------------");
    }

}
