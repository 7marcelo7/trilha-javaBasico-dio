package CelularIphone;

import java.util.Scanner;

import Ligacoes.*;
import Navegadores.*;
import AppMusica.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Ligando Iphone");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Desligando Iphone");
    }

    @Override
    public void iniciarChamada() {
        System.out.println("Chamada realizada");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void historicoNavegacao() {
        System.out.println("Aqui esta seu historico de navegação");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

    public void comandarCelular() {
        Scanner scanner = new Scanner(System.in);
        try {
            String inicio = "";

            while (!inicio.equalsIgnoreCase("s")) {
                System.out.println("\n--- Menu ---");
                System.out.println("Opções disponíveis:");
                System.out.println("l - Ligar Iphone");
                System.out.println("d - Desligar Iphone");
                System.out.println("i - iniciar chamada");
                System.out.println("c - atender chamada");
                System.out.println("e - exibir pagina");
                System.out.println("a - adicionar nova aba");
                System.out.println("f - atualizar pagina");
                System.out.println("h - historico de navegação");
                System.out.println("t - tocar musica");
                System.out.println("p - pausar musica");
                System.out.println("m - selecionar musica");
                System.out.println("s - Sair");

                System.out.println("\nDigite uma opção: ");
                inicio = scanner.nextLine();

                switch (inicio.toLowerCase()) {
                    case "l":
                        ligar();
                        break;
                    case "d":
                        desligar();
                        break;
                    case "i":
                        iniciarChamada();
                        break;
                     case "c":
                        atenderChamada();
                        break;
                    case "e":
                        exibirPagina();
                        break;
                    case "a":
                        adicionarNovaAba();
                        break;
                    case "f":
                        atualizarPagina();
                        break;
                    case "h":
                        historicoNavegacao();
                        break;
                    case "t":
                        tocar();
                        break;
                    case "p":
                        pausar();
                        break;
                    case "m":
                        selecionarMusica();
                        break;
                    case "s":
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } finally {
            scanner.close();
        }
        System.out.println("Celular desligado");
    }
}