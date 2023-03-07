package br.com.fiap.DAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.model.Destino;


public class DestinoDao {
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String user = "xxxxxx";
    private static String password = "xxxxxx";
    
    public static void inserirDestino(Destino destino) throws SQLException, IOException{
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO tb_ats_destino(endereco, cidade, estado)"
                        + "VALUES (?, ?, ?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, destino.getEnderecoDestino());
        stm.setString(2, destino.getCidadeDestino());
        stm.setString(3, destino.getEstadoDestino());
        
        stm.execute();
        con.close();
    }
    
}
