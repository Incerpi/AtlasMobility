package br.com.fiap.DAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.model.Localizacao;


public class LocalizacaoDao {
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String user = "xxxxxx";
    private static String password = "xxxxxx";
    
    public static void inserirLocalizacao(Localizacao localizacao) throws SQLException, IOException{
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO tb_ats_localização(endereço, cidade, estado)"
                        + "VALUES (?, ?, ?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, localizacao.getEnderecoLocalizacao());
        stm.setString(2, localizacao.getCidadeLocalizacao());
        stm.setString(3, localizacao.getEstadoLocalizacao());
        
        stm.execute();
        con.close();
    }
    
}
