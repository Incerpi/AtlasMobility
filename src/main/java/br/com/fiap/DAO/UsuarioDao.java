package br.com.fiap.DAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.model.Usuario;

public class UsuarioDao {
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String user = "RM93918";
    private static String password = "310703";

    public static void inserirUsuario(Usuario usuario) throws SQLException, IOException{
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO tb_ats_usuario(nm_usuario, senha)"
                        + "VALUES (?, ?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, usuario.getNomeUsuario());
        stm.setString(2, usuario.getSenhaUsuario());
                
        stm.execute();
        con.close();
    }
}