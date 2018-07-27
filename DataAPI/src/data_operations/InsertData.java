package data_operations;

import javax.swing.*;

public class InsertData extends DataOperations {

    public void insertData(String firstName, String lastName, String phoneNum){
        String command = "Insert into persons (first_name, last_name, phone) Values('" + firstName + "','" + lastName + "','" + phoneNum + "')";
        try {
          prepare(command);
          if(preparedStatement.executeUpdate() == 1)
              JOptionPane.showMessageDialog(null,"Person has been added the list");
          else
              JOptionPane.showMessageDialog(null,"Person can not been added the list");
        }
        catch (Exception mistake){
            JOptionPane.showMessageDialog(null, "There is a mistake : " + mistake.toString() );
        }
        finally {
            try {
                if(connection != null) connection.close();
                if(preparedStatement != null) preparedStatement.close();
                if(resultSet != null) resultSet.close();
            }
            catch (Exception mistake){
                JOptionPane.showMessageDialog(null, "There is a mistake : " + mistake.toString());
            }

        }
    }
}
