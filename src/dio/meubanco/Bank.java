package dio.meubanco;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bank {

    private String name;
    private List<Account> accountList = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void getAccount() {
        System.out.println("=== Lista de Contas de " + this.name + " ===");
        for (Account account : accountList ) System.out.println(account.toString());
        System.out.println("");
    }

    public void getClient() {
        System.out.println("=== Lista de Clientes de " + this.name + " ===");
        for (Client client : clientList ) System.out.println(client.toString());
        System.out.println("");
    }

    public void addAccountList(Account account) {
        this.accountList.add(account);
    }

    public void addClientList(Client client) {
        this.clientList.add(client);
    }
}
