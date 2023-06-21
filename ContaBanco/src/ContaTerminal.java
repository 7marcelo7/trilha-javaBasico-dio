public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();
        System.out.println("Bem vindo! Informe seus dados para criar uma conta em nosso banco.");
        cliente.criarConta();
    }
}
