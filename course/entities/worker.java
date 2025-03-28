package entities;

import java.util.ArrayList;
import java.util.List;

public class worker {
    private String name;
    private String email;
    private Double baseSalary;

    private Departamento departamento;
    private List<horasContract> contracts = new ArrayList<>();

    public worker() {
    }

    public worker(String name, String email, Double baseSalary, Departamento departamento) {
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<horasContract> getContracts() {
        return contracts;
    }


    public void addContract(horasContract contract) {
        contracts.add(contract);
    }

    public void removeContract(horasContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        for (horasContract c : contracts) {
            if (c.getDate().getYear() == year && c.getDate().getMonth() == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
