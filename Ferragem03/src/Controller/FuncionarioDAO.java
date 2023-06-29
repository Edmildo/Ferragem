
package Controller;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Funcionario;


public class FuncionarioDAO {
 private Connection conexao;
    public FuncionarioDAO() {
         try {
            this.conexao = BDConexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Funcionario> todos(){
        try {
            String sql = "SELECT * from funcionario";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Funcionario> lista = new ArrayList<>();
            while(rs.next()){
                Funcionario func = new Funcionario();
                func.setCodigo(rs.getString("codigo"));
                func.setNome(rs.getString("nome"));
               
                lista.add(func);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
}
