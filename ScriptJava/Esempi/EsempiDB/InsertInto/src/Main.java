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
            String query = "SELECT Name, SurfaceArea, " +
                    "CASE " +
                    "WHEN SurfaceArea > ? THEN 'Superficie maggiore di 100.000' " +
                    "    ELSE 'Superficie minore di 100.000' " +
                    "    END Superfice, " +
                    "CASE " +
                    "WHEN IFNULL(IndepYear, 1) = 1 THEN 'NO INDEPYEAR' " +
                    "    ELSE IndepYear " +
                    "    END IndepYearPresente " +
                    "FROM country; ";
            PreparedStatement stm = myConnection.prepareStatement(query);
            stm.setInt(1, 100000);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                String tableFormat = String.format("Nome: %s | Superficie: %s | Stato superficie: %s | IndepYearPresente: %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                System.out.println(tableFormat);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}