
package Controller;

import Model.Funcionario;
import Model.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenteDAO {
     private Connection conexao;
    public GerenteDAO() {
         try {
            this.conexao = BDConexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GerenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Gerente> todos(){
        try {
            String sql = "SELECT * from gerente";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Gerente> lista = new ArrayList<>();
            while(rs.next()){
                Gerente gerente = new Gerente();
                gerente.setCodigo(rs.getString("codigo"));
                gerente.setNome(rs.getString("nome"));
               
                lista.add(gerente);
            }
           
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(GerenteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
}
