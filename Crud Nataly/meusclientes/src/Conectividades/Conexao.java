package Conectividades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import meusclientes.Clientes;
public class Conexao {
private final String fonte = "jdbc:mysql://localhost/meusclientes";
private final String driver = "com.mysql.jdbc.Driver";
private final String usuario = "root";
private final String senha = "neiton";
private Connection con;
private PreparedStatement stm;

public void CadastrarCliente(Clientes clientes) throws SQLException{
this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
this.stm = this.con.prepareStatement(" INSERT INTO " +
" cliente (nome, telefone, celular, email) " +
" values (?,?,?,?) ");
this.stm.setString(1, clientes.getNOME());
this.stm.setString(2, clientes.getTELEFONE());
this.stm.setString(3, clientes.getCELULAR());
this.stm.setString(4, clientes.getEMAIL());
this.stm.execute();
this.stm.close();
}
public Clientes ProcurarCliente(int id) throws SQLException{
this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
this.stm = this.con.prepareStatement("SELECT * FROM cliente " +
"WHERE id = ?");
this.stm.setInt(1, id);
ResultSet rs = this.stm.executeQuery();
Clientes clientes = new Clientes();
while(rs.next()){
clientes.setID(rs.getInt("id"));
clientes.setNOME(rs.getString("nome"));
clientes.setTELEFONE(rs.getString("telefone"));
clientes.setCELULAR(rs.getString("celular"));
clientes.setEMAIL(rs.getString("email"));
}
this.con.close();
return clientes;
}
public void AtualizarCliente(Clientes clientes, int id) throws SQLException
{
this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
this.stm = this.con.prepareStatement("UPDATE cliente SET nome = ?,"+"telefone = ?, celular = ?, email = ? WHERE id = ?");
this.stm.setString(1, clientes.getNOME());
this.stm.setString(2, clientes.getTELEFONE());
this.stm.setString(3, clientes.getCELULAR());
this.stm.setString(4, clientes.getEMAIL());
this.stm.setInt(5, id);
this.stm.executeUpdate();
this.con.close();
}
public void RemoverCliente(int id) throws SQLException{
this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
this.stm = this.con.prepareStatement("DELETE FROM cliente WHERE id = ?");
this.stm.setInt(1, id);
this.stm.execute();
this.con.close();
}
}