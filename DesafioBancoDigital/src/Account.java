
public abstract class Account implements IAccount {

    private static final int DEFAULT_AGENCY = 2071;
    protected abstract int generateRandomNumber();

    
    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = generateRandomNumber();
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void bankStatement() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

}
