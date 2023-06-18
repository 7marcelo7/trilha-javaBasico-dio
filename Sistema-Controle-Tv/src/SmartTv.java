import java.util.Scanner;

public class SmartTv {

    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 25;
    }

    public void ligarTv() {
        this.ligada = true;
        System.out.println("A TV foi ligada");
    }

    public void desligarTv() {
        this.ligada = false;
        System.out.println("A TV foi desligada");
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal " + this.canal);
    }

    public void aumentarVolume() {
        if (this.volume < 100) {
            this.volume++;
            System.out.println("Volume" + this.volume);
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume--;
            System.out.println("Volume" + this.volume);
        } else {
            System.out.println("Volume mínimo atingido.");
        }
    }

    public void comandarTv() {
        Scanner scanner = new Scanner(System.in);
        try {
            String inicio = "";

            while (!inicio.equalsIgnoreCase("s")) {
                System.out.println("\n--- Menu ---");
                System.out.println("Opções disponíveis:");
                System.out.println("l - Ligar TV");
                System.out.println("d - Desligar TV");
                System.out.println("+ - Aumentar volume");
                System.out.println("- - Diminuir volume");
                System.out.println("c - Trocar canal");
                System.out.println("s - Sair");

                System.out.println("\nDigite uma opção: ");
                inicio = scanner.nextLine();

                switch (inicio.toLowerCase()) {
                    case "l":
                        ligarTv();
                        break;
                    case "d":
                        desligarTv();
                        break;
                    case "+":
                        aumentarVolume();
                        break;
                    case "-":
                        diminuirVolume();
                        break;
                    case "c":
                        System.out.println("Digite o número do canal");
                        int canal = scanner.nextInt();
                        scanner.nextLine();
                        trocarCanal(canal);
                        break;
                    case "s":
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        } finally {
            scanner.close();
        }
        System.out.println("Programa encerrado.");
    }
}
