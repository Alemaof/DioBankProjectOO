package dio.meubanco;

import lombok.Data;

@Data
public class Client {
    private String name;
    private String address;
    private String cpf;
    private int id;

    @Override
    public String toString() {
        return  "Nome: " + name;
    }

    public Client(String name, String address, String cpf, int id) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.id = id;
    }

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
