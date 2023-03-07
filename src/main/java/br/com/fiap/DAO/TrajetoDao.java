package br.com.fiap.DAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Trajeto;

    public class TrajetoDao {
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user = "xxxxxxx";
        private static String password = "xxxxxxx";
        static Connection con;
        
        public static void inserirTrajeto(Trajeto trajeto) throws SQLException, IOException{
            con = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO tb_ats_trajeto(veiculo, horario_saida, previsão_chegada)"
                            + "VALUES (?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, trajeto.getVeiculoTrajeto());
            stm.setString(2, trajeto.getHorarioSaidaTrajeto());
            stm.setString(3, trajeto.getPrevisaoChegadaTrajeto());
            
            stm.execute();
            con.close();
        }

        public List<Trajeto> listarTodosTrajetos() throws SQLException{
            con = DriverManager.getConnection(url, user, password);
            List<Trajeto> listaTrajeto = new ArrayList<>();
           
            Statement stm = con.createStatement();
            String sql = "SELECT * FROM TB_ATS_TRAJETO";
            ResultSet resultado = stm.executeQuery(sql);
            while(resultado.next()){
               var trajeto = new Trajeto(
                   resultado.getString("veiculo"), 
                   resultado.getString("horario_saida"), 
                   resultado.getString("previsão_chegada") 
               );
               listaTrajeto.add(trajeto);
            }
            con.close();
           
            return listaTrajeto;
        }
    
        
    }

