
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
import Model.Fornecedor;


public class FornecedorDAO {
 private Connection conexao;
    public FornecedorDAO() {
         try {
            this.conexao = BDConexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       
 public String todos(){
     String s="CODIGO \t    NOME \t                             RUA \t  CIDADE \t     AVENIDA \t                          TELEFONE \n \n \n";
        try {
            String sql = "SELECT * from fornecedor";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Fornecedor> lista = new ArrayList<>();
            while(rs.next()){
                Fornecedor forn = new Fornecedor();
                forn.setNome(rs.getString("nome"));
                forn.setCodigo(rs.getInt("codigo"));
                forn.setRua(rs.getString("rua"));
                forn.setAvenida(rs.getString("avenida"));
                forn.setCidade(rs.getString("cidade"));
                forn.setTelefone(rs.getString("telefone"));
                lista.add(forn);
                s=s+forn.toString()+"\n \n";
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
 
    
}
