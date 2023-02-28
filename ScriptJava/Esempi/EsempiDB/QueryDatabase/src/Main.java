import java.sql.*;
public class Main {

    public static void main(String[] args){

        //--------test jdbc---------
        String url = "jdbc:mysql://localhost:3306/world";

        // i driver sono presi in automatico da DriverManager
        // nome driver di mysql = "com.mysql.jdbc.Driver" ovver il connector

        try{
            Connection myConnection = null;
            myConnection = DriverManager.getConnection(url, "root", "root");

            if(myConnection == null){
                System.out.println("Non ho stabilito la connessione");
            }
            else{
                System.out.println("Connessione riuscita");
            }
            //Prova lettura DB
            String query = "SELECT * FROM city LIMIT 5";
            Statement stm = myConnection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                String tableFormat = String.format("ID: %s | Name: %s | CountryCode: %s | District: %s | Population: %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(2),
                        rs.getString(2),
                        rs.getString(2));
                System.out.println(tableFormat);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

    }

}