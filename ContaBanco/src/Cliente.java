import java.util.Scanner;
import java.util.Random;

public class Cliente {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private String cpf;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCof(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void criarConta() {

        //Foi criada uma função para que o numero da conta seja gerado de forma automatica e aleaoria.
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            numero = random.nextInt(90000) + 10000;

            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.next();

            System.out.println("Informe o seu nome completo");
            nomeCliente = scanner.next();

            //Foi criado um loop de repetição para verificar se o CPF inserido possui 11 digitos.
            do {
                System.out.println("Informe o CPF");
                cpf = scanner.next();
                if (cpf.length() != 11) {
                    System.out.println("CPF inválido. O nos informe um CPF existente com 11 digítos! ");
                }
            } while (cpf.length() != 11);

            //Função criada para perguntar se o cliente deseja realizar um deposito em sua nova conta.
            //Foi definido que caso não queria, a sua conta seria criada sem saldo algum para saque.
            System.out.println("Deseja depositar algum valor nesta conta? (S/N)");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Digite o valor a ser depositado:");
                saldo = scanner.nextDouble();
            } else {
                saldo = 0;
                System.out.println("Tudo bem, prosseguiremos com a abertura da sua conta!");
            }
        }
        boasVindas();

    }

    private void boasVindas() {
        System.out
                .println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."

                );
    }

}
