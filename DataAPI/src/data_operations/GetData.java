package data_operations;

import model.Person;
import netscape.javascript.JSObject;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class GetData extends DataOperations {

    public String getPersonName(String phone)throws Exception{
        prepare("Select first_name, last_name from persons where phone = '" + phone + "'" );

        resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
            return "FullName: " + resultSet.getString("first_name") + " " + resultSet.getString("last_name") ;

        return "Phone doesn't belong anyone on the list";
    }


    public String getPersonPhone(String first_name, String last_name) throws Exception{
        prepare("Select phone from persons where first_name = '" + first_name + "'" + " and last_name = '" + last_name + "'");

        resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
            return "Phone: " + resultSet.getString("phone");

        return "Person doesn't have any phone-number on the list";
    }


    public List<Person> getAllPersons() throws Exception{
        prepare("Select * from persons");
        resultSet = preparedStatement.executeQuery();
        List<Person> persons = new LinkedList<>();
        while(resultSet.next()){
            persons.add(new Person(resultSet.getInt("person_id"),
                                   resultSet.getString("first_name"),
                                   resultSet.getString("last_name"),
                                   resultSet.getString("phone") ) );
        }
        return persons;
    }


    public Object action(String ... params) { // String command, String phone || (String first_name, String last_name), ...
        try {
            switch (params[0]) {
                case "getAllPersons": return getAllPersons();
                case "getPersonName": return getPersonName(params[1]);
                case "getPersonPhone": return  getPersonPhone(params[1], params[2]);
            }
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
        return null;
    }

}
