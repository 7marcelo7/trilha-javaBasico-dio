/**
 * IAccount
 */
public interface IAccount {

    void withdraw(double value);
    void transfer(double value, Account destinationAccount);
    void deposit(double value);
    void printStatement();
}