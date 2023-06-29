
package Model;

public class Cliente {
   private String nome;
   private int codigo;
   private String tel1;
   private String tel2;
   private String cidade;
   private String avenida;
   private String rua;
   private String descricao;

    public Cliente() {
    }

    public Cliente(String nome, int codigo, String tel1, String tel2, String cidade, String avenida, String rua, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.cidade = cidade;
        this.avenida = avenida;
        this.rua = rua;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", codigo=" + codigo + ", tel1=" + tel1 + ", tel2=" + tel2 + ", cidade=" + cidade + ", avenida=" + avenida + ", rua=" + rua + ", descricao=" + descricao + '}';
    }
    
}