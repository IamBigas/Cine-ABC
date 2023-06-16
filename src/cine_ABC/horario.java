package cine_abc;

import java.util.Scanner;
import java.util.ArrayList;

public class horario {

    Scanner ler = new Scanner(System.in);
    ArrayList<String> arrayhorarios = new ArrayList<String>();
    protected int opcao = 0;
    protected String horario = "";
    protected String opcao2 = "";
    protected String horarioRd = "";

    public ArrayList setHorario() {
        do {
            System.out.println("1 - Adicionar horarios\n2 - Remover horários\n0 - Sair");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    do {
                        System.out.print("Digite o horário: ");
                        horario = ler.next();
                        arrayhorarios.add(horario);
                        System.out.print("Deseja adicionar mais horários? [Sim/Não]: ");
                        opcao2 = ler.next();
                    } while (opcao2.equals("Sim"));
                case 2:
                    do {
                        System.out.println("Qual desses horários você deseja remover? ");
                        System.out.print(arrayhorarios.toString() + ": ");
                        horarioRd = ler.next();
                        for (int i = 0; i < arrayhorarios.size(); i++) {
                            if (arrayhorarios.get(i) == horarioRd) {
                                arrayhorarios.remove(i);
                            }
                        }
                        System.out.print("Deseja remover mais horários? [Sim/Não]: ");
                        opcao2 = ler.next();

                    } while (opcao2.equals("Sim"));
            }
        } while (opcao != 0);
        return arrayhorarios;
    }

}
