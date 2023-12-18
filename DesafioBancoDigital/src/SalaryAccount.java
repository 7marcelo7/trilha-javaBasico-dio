import java.util.Random;

public class SalaryAccount extends Account{

    public SalaryAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("--- Extrato Conta Salario ---");
        super.bankStatement();
    }

    @Override
    protected int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000) + 99999;
    }
}
