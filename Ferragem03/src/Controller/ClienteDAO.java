
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Cliente;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteDAO {
     private Connection conexao;
    
    public ClienteDAO(){
        try {
            this.conexao = BDConexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(Cliente cliente){
        String sql = "INSERT INTO Cliente(codigo,nome,telefone1,telefone2,cidade,avenida,rua,descricao) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getTel1());
            ps.setString(4, cliente.getTel2());
            ps.setString(5, cliente.getCidade());
            ps.setString(6, cliente.getAvenida());
            ps.setString(7, cliente.getRua());
            ps.setString(8, cliente.getDescricao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizar(Cliente cliente) {
        try {
            String sql = "UPDATE cliente SET nome = ?, telefone1 = ?, telefone2 = ?, cidade = ?, avenida= ?, rua = ?, descricao = ?  WHERE codigo = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getTel1());
            ps.setString(4, cliente.getTel2());
            ps.setString(5, cliente.getCidade());
            ps.setString(6, cliente.getAvenida());
            ps.setString(7, cliente.getRua());
            ps.setString(8, cliente.getDescricao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void apagar (Cliente cliente){
        String sql = "DELETE FROM estudante WHERE codigo = ?";
        try{ 
         PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> todos(){
        try {
            String sql = "SELECT * from cliente";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Cliente> lista = new ArrayList<>();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTel1(rs.getString("telefone1"));
                cliente.setTel2(rs.getString("telefone2"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setAvenida(rs.getString("avenida"));
                cliente.setRua(rs.getString("rua"));
                cliente.setDescricao(rs.getString("descricao"));
                lista.add(cliente);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public String data(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date=new Date();
                return sdf.format(date);
    }
    
}
