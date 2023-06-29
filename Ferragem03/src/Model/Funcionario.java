
package Model;

public class Funcionario {
  private String nome;
    private String codigo;

    public Funcionario(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Codigo: " + codigo;
    }
    

}
