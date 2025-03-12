package entities;

public class Employees {
    private Integer id; // Identificador único do funcionário
    private String name; // Nome do funcionário
    private Double salary; // Salário do funcionário

    // Construtor padrão
    public Employees() {
    }

    // Construtor com parâmetros para inicializar os atributos
    public Employees(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Métodos getters para acessar os atributos
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    // Métodos setters para modificar os atributos
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Método para aumentar o salário do funcionário em uma determinada porcentagem
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    // Método toString para representar o objeto Employees como uma string
    public String toString() {
        return  "ID: "
                + id
                + ", "
                + "Nome: "
                + name + ", "
                + "Salário: $ "
                + String.format("%.2f", salary);
    }
}