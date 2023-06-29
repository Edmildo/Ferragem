
package Controller;

import Model.Produto;
import Model.Venda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendaDAO {
 private Connection conexao;
    public VendaDAO() {
         try {
            this.conexao = BDConexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void inserir(Venda venda){
        String sql = "INSERT INTO venda(produto,quantidade,data) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, venda.getProduto());
            ps.setInt(2,venda.getQnt());
            ps.setDate(3, venda.getData());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
        
 public String todos(){
     String s="";
        try {
            String sql = "SELECT * from venda";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Venda ven = new Venda();
                ven.setProduto(rs.getString("produto"));
                ven.setQnt(rs.getInt("quantidade"));
                ven.setData(rs.getDate("data"));
                
                s=s+ven.toString()+"\n";
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
  public String todosP(String dat){
     String s="";
        try {
            String sql = "SELECT * from venda";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Venda ven = new Venda();
                ven.setProduto(rs.getString("produto"));
                ven.setQnt(rs.getInt("quantidade"));
                ven.setData(rs.getDate("data"));
                if(ven.getProduto().equalsIgnoreCase(dat)){
                s=s+ven.toString()+"\n";
            }}
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
 
    
}
