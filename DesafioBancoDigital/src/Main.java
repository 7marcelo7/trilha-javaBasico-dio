/**
 * main
 */
public class Main {

    public static void main (String[] args) {

        Client makarov = new Client();
        makarov.setName("Makarov");
        
        Account cc = new CheckingAccount(makarov);
        Account cp = new SavingsAccount(makarov);
        Account ss = new SalaryAccount(makarov);

        cc.deposit(1300);
        cc.transfer(400, cp);
        ss.deposit(3300);
        ss.transfer(600, cp);

        cc.printStatement();
        cp.printStatement();
        ss.printStatement();
    }
}
