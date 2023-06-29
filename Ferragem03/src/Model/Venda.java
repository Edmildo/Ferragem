
package Model;
    
 import java.sql.Date;
public class Venda {
    private String produto;
    private int qnt;
    private Date data;

    public Venda(String produto, int qnt, Date data) {
        this.produto = produto;
        this.qnt = qnt;
        this.data = data;
    }
    
    public Venda() {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + "\t qnt: " + qnt + "\t Data: " + data;
    }

   
}
