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
            String query = "SELECT * FROM city_view";
            Statement stmt = myConnection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsMd = rs.getMetaData();

            while (rs.next()) {
                for (int i = 1; i <= rsMd.getColumnCount(); i++) {
                    String nomeRiga = rsMd.getColumnName(i);
                    Object valoreRiga = rs.getObject(i);

                    System.out.print(nomeRiga + ": " + valoreRiga + " | ");
                }
                System.out.println("\n------------------------------------------------------------------------------------------------");
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}