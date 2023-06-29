
package Controller;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Produto;
import Model.Venda;
public class ProdutoDAO {
     private Connection conexao;
    
    public ProdutoDAO(){
        try {
            this.conexao = BDConexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(Produto produto){
        String sql = "INSERT INTO produto(codigo,nome,precoUnitario,precoCompra,quantidade,validade,descricao) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getNome());
            ps.setFloat(3, produto.getPrecoUnit());
            ps.setFloat(4, produto.getPrecoCompra());
            ps.setInt(5, produto.getQuant());
            ps.setDate(6, produto.getValidade());
            ps.setString(7, produto.getDescricao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizar(Produto produto) {
        try {
            String sql = "UPDATE produto SET quantidade = ? WHERE codigo = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, produto.getCodigo());
            ps.setInt(2, produto.getQuant());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
     public void apagar (Produto produto){
        String sql = "DELETE FROM produto WHERE codigo = ?";
        try{ 
         PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, produto.getCodigo());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
   
 public List<Produto> todos(){
        try {
            String sql = "SELECT * from produto";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Produto> lista = new ArrayList<>();
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnit(rs.getFloat("precoUnitario"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setQuant(rs.getInt("quantidade"));
                produto.setValidade(rs.getDate("validade"));
                produto.setDescricao(rs.getString("descricao"));
               
                lista.add(produto);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
 
 
  public Produto PesquisaCodigo(int cod){
      Produto p=new Produto();
        try {
            String sql = "SELECT * from produto";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnit(rs.getFloat("precoUnitario"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setQuant(rs.getInt("quantidade"));
                produto.setValidade(rs.getDate("validade"));
                produto.setDescricao(rs.getString("descricao"));
                if(produto.getCodigo()==cod){
                    return produto;
            }}
           
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return p;
        }
         return null;
  }
   
  
   public String todoStringMetade(){
        String s="CODIGO \t  NOME \t \t PRECO\n";
        try { 
            String sql = "SELECT * from produto";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnit(rs.getFloat("precoUnitario"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setQuant(rs.getInt("quantidade"));
                produto.setValidade(rs.getDate("validade"));
                produto.setDescricao(rs.getString("descricao"));
                s=s+(produto.getCodigo()+"\t "+produto.getNome()+"\t \t"+produto.getPrecoUnit()+"\n");
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
   
   
    public float ValorTotal(){
        float Total=0;
        try {
            String sql = "SELECT * from produto";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnit(rs.getFloat("precoUnitario"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setQuant(rs.getInt("quantidade"));
                produto.setValidade(rs.getDate("validade"));
                produto.setDescricao(rs.getString("descricao"));
                Total=Total+produto.getPrecoUnit();
            }
            return Total;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
   
    
    
    
}

    







