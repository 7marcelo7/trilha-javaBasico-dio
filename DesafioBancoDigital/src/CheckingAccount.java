import java.util.Random;

public class CheckingAccount  extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("--- Extrato Conta Corrente ---");
        super.bankStatement();
    }

    @Override
    protected int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000) + 99999;
    }
    

}
