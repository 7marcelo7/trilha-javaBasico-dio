import java.util.Random;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("--- Extrato Conta Poupança ---");
        super.bankStatement();
    }

    @Override
    protected int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000) + 99999;
    }
}
