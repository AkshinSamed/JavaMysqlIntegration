package application;


import data_operations.GetData;
import data_operations.InsertData;
import model.Person;

import javax.swing.*;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Path("/main")
public class Main {

    List<Person> persons = new LinkedList<>();
    GetData getData = new GetData();


    public Main(){

        persons = (LinkedList<Person>) getData.action("getAllPersons");
    }

    @Path("/get-person-name")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPersonName(@QueryParam("phone") String phone) {

            return (String)getData.action("getPersonName", phone);
    }


    @Path("/get-person-phone")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPersonPhone(@QueryParam("first_name") String first_name, @QueryParam("last_name") String last_name){

        return (String)getData.action("getPersonPhone", first_name, last_name);
    }


    @Path("/list-all-persons")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> listAllPersons(){

        return persons;
    }


    @Path("/get-person-with-phone")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonWithPhone(@QueryParam("phone") String phone){
        for(Person person : persons){
            if(phone.equals(person.getPhone()))
                return person;
        }
        JOptionPane.showMessageDialog(null, "Phone doesn't belong anyone on the list ");
        return null;
    }


    @Path("/get-person-with-name")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonWithName(@QueryParam("first_name") String first_name, @QueryParam("last_name") String last_name){
        for(Person person : persons){
            if(first_name.equals(person.getFirstname()) && last_name.equals(person.getLastname()))
                return person;
        }
        JOptionPane.showMessageDialog(null, "Person doesn't have any phone-number on the list ");
        return null;
    }

    @Path("/add-new-person")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void addNewPerson(@QueryParam("first_name") String first_name,
                             @QueryParam("last_name") String last_name,
                             @QueryParam("phone") String phone){

        InsertData insertData = new InsertData();
        insertData.insertData(first_name, last_name, phone);
    }

}
