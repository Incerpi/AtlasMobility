package br.com.fiap.DAO;
import br.com.fiap.model.Cliente;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
   
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String user = "xxxxxxx";
    private static String password = "xxxxxx";
    private static Connection con;

    public static void inserirCliente(Cliente cliente) throws SQLException, IOException{
        con = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO tb_ats_cliente (nm_cliente, cpf_cliente,  tel_cliente, eml_cliente)"
                        + "VALUES (?, ?, ?, ?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, cliente.getNomeCliente());
        stm.setInt(2, cliente.getCpfCliente());
        stm.setInt(3, cliente.getTelefoneCliente());
        stm.setString(4, cliente.getEmailCliente());

        stm.execute();
        con.close();
    }

    public List<Cliente> listarTodosClientes() throws SQLException{
        con = DriverManager.getConnection(url, user, password);
        List<Cliente> lista = new ArrayList<>();
       
        Statement stm = con.createStatement();
        String sql = "SELECT * FROM TB_ATS_CLIENTE";
        ResultSet resultado = stm.executeQuery(sql);
        while(resultado.next()){
           var cliente = new Cliente(
               resultado.getString("nm_cliente"), 
               resultado.getInt("cpf_cliente"), 
               resultado.getInt("tel_cliente"), 
               resultado.getString("eml_cliente")
           );
           lista.add(cliente);
        }
        con.close();
       
        return lista;
    }

}
