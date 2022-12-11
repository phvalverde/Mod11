package domain;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String sexo;
    private String idade;

    public Pessoa(String nome, String sexo, String idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return
                "(" +
                nome +
                 ", " + sexo +
                 ", " + idade +
                        ")";

//                "}";
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }

}
