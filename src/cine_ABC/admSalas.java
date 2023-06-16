package cine_abc;

import java.util.Scanner;
import java.util.ArrayList;

public class admSalas {

    Scanner ler = new Scanner(System.in);
    protected int salas = 0;
    protected int salasRd = 0;
    ArrayList<String> arraysalas = new ArrayList<String>();
    protected int aux = 0;
    protected int opcao = 0;
    protected String opcao2 = "";
    protected int i = 0;

    public int setnumeroSalas() {
        do{
            System.out.println("1 - Adicionar salas\n2 - Remover quantidade de salas\n0 - Sair");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de salas: ");
                    salas = ler.nextInt();
                    for(int i = 0; i < salas; i++){
                        arraysalas.add("Sala " + (i+1));
                    }
                    break;
                case 2:
                    System.out.println("Digite a quantidade de salas a ser diminuida");
                    salasRd = ler.nextInt();
                    i = arraysalas.size() - salasRd;
                    while(arraysalas.size() > i){
                        arraysalas.remove(arraysalas.size() - 1);
                    }
                    break;

            }
        }while(opcao != 0);
        return salas;
    }

    public int getnumeroSalas() {
        return salas;
    }
}
