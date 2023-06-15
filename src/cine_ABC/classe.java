package cine_ABC;

import java.util.Scanner;

public class classe {

    Scanner ler = new Scanner(System.in);
    private int salas = 0;
    private int aux = 0;
    private int opcao = 0;
    private int salasAdd = 0;
    private int salasRd = 0;
    private String opcao2 = "";

    public int setnumeroSalas() {
        System.out.print("-Digitar quantidade de salas\n 2-Adicionar salas\n 3-Remover quantidade de salas\n");
        opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite a quantidade de salas: ");
                salas = ler.nextInt();
                aux = salas;
                break;
            case 2:
                System.out.println("A quantidade atual de salas é " + salas + ". Digite a quantidade a ser adicionada: ");
                salasAdd = ler.nextInt();
                salas += salasAdd;
                break;
            case 3:
                while (opcao2.equalsIgnoreCase("Não")) {
                    while (salas < 0) {
                        System.out.println("A quantidade atual de salas é " + salas + ". Digite a quantidade a ser diminuida: ");
                        salasRd = ler.nextInt();
                    }
                    salas -= salasRd;
                    if(salas<=0){
                        System.out.print("A quantidade de salas é igual a " + salas + ". Deseja continuar mesmo assim? [Sim/Não] ");
                        opcao2 = ler.nextLine();
                        if(opcao2.equals("Não")){
                            salas = aux;
                        }
                    }
                }
        }
        salas = ler.nextInt();
        return salas;
    }

    public int getnumeroSalas() {
        return salas;
    }
}
