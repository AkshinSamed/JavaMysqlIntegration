package data_operations;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class DataOperations {

    protected MysqlDataSource dataSource = null;
    protected Connection connection = null;
    protected PreparedStatement preparedStatement = null;
    protected ResultSet resultSet = null;
    protected String result = " ";


    public void prepare(String command ) throws Exception {

            dataSource = new MysqlDataSource();
            dataSource.setUser("your_user_name");
            dataSource.setPassword("your_password");
            dataSource.setUrl("jdbc:mysql://localhost:3306/your_database_name");

            connection = dataSource.getConnection();

            preparedStatement = connection.prepareStatement(command);

    }
}
