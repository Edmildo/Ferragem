
package Model;
import java.sql.Date;
public class Produto {
    private String nome;
    private int codigo;
    private float precoUnit;
    private float precoCompra;
    private int quant;
    private Date validade;
    private String descricao;

    public Produto() {
    }

    public Produto(String nome, int codigo, float precoCompra, int quant, Date validade, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoCompra = precoCompra;
        this.quant = quant;
        this.validade = validade;
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

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    @Override
    public String toString() {
        return   "Nome: " + nome + "\tCodigo: " + codigo + "\tPreco_Unitario: " + precoUnit + ",\tQuantidade: " + quant ;
    }
    
    
}
