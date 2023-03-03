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
            String query = String.format("SELECT country.Name, countrylanguage.Language," +
                    "countrylanguage.Percentage FROM country, countrylanguage" +
                    " WHERE country.Code = countrylanguage.CountryCode");
            Statement stm = myConnection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                String tableFormat = String.format("Name: %s | Language: %s | Percentage: %s ",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                System.out.println(tableFormat);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}