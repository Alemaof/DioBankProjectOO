package dio.meubanco;

import lombok.Data;

@Data
public abstract class Account implements IAccount {

    private int agency;
    private int number;
    private double balance;
    private Client client;

    private static final int AGENCY = 1;
    private static int ACCOUNT_NUMBER = 1;

    public Account (Client client){
        this.agency = AGENCY;
        this.number = ACCOUNT_NUMBER++;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Agência: " + agency +
                ", Número: " + number +
                ", Cliente: " + client.getName();
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(Account destinyAccount, double value) {
        balance -= value;
        destinyAccount.deposit(value);
    }

    @Override
    public void printInfos() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agência: %d", this.getAgency()));
        System.out.println(String.format("Conta: %d", this.getNumber()));
        System.out.println(String.format("Saldo: %.2f \n", this.getBalance()));
    }

}
