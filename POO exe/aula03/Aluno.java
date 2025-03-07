package aula03;
    public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome){
    this.nome = nome;

    }
    public int getIdade() {
            return idade;
    }

    public String getNome(){
    return nome;
    }

    public void setIdade(int idade){
    if(idade > 0 && idade < 100){
        this.idade = idade;
        System.out.println("Idade apta para matricular");
    }else {
        System.out.println("Idade inválida");
    }

    }

    }


