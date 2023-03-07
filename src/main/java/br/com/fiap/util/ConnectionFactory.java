package br.com.fiap.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import br.com.fiap.App;


public class ConnectionFactory {
  
    public static Connection getConnection() throws SQLException, IOException{
        Properties properties = new Properties();
        InputStream resourceAsStream = App.class.getResourceAsStream("application.properties");
        properties.load(resourceAsStream);

        String url = properties.getProperty("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL");
        String user =  properties.getProperty("RM93918");
        String password =  properties.getProperty("310703");
        return DriverManager.getConnection(url, user, password);
    }
}


