
package Model;

public class Fornecedor {
   private int codigo;
   private String nome;
   private String rua;
   private String cidade;
   private String avenida;
   private String telefone;

    public Fornecedor(int codigo, String nome, String rua, String cidade, String avenida, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.avenida = avenida;
        this.telefone = telefone;
    }

    public Fornecedor() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  codigo + "\t" + nome + "\t" + rua + "\t" + cidade + "\t" + avenida + "\t" + telefone;
    }
   
}
