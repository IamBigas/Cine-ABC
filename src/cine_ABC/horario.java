package javaapplication11;

import java.util.Scanner;

public class classe {

    Scanner ler = new Scanner(System.in);
    private int hora = 0;
    private int minutos = 0;
    private int horario = 0;
    private String opcao = "";

    public int setHorario() {
        while (opcao.equalsIgnoreCase("Sim")) {
            System.out.print("Digite a hora do filme: ");
            hora = ler.nextInt();
            System.out.print("Digite o(s) minuto(s) do filme: ");
            minutos = ler.nextInt();
            if (hora > 24 || hora < 0 || minutos > 60 || minutos < 0 || hora == 24 && minutos > 0) {
                System.out.print("Esse não é um horário ideal, deseja escrever outro? {Sim/Não]: ");
                opcao = ler.nextLine();
            }
        }
        return horario;
    }

    public int getHorario() {
        return horario;
    }
}
