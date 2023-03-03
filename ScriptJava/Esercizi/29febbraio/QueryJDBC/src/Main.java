import java.sql.*;
import java.util.Scanner;
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

            Scanner a = new Scanner(System.in);
            Scanner b = new Scanner(System.in);
            Scanner c = new Scanner(System.in);
            Scanner d = new Scanner(System.in);
            Scanner e = new Scanner(System.in);
            int nPopolazione = 0;
            String ordina;

            System.out.println("Vuoi mostrare le città?\n[1] SI\n[2] NO");
            int nomeCitta = a.nextInt();
            System.out.println("Quale codice devono avere le città?");
            String countryCode = b.nextLine();
            System.out.println("Vuoi filtrare per popolazione?\n[1] SI\n[2] NO");
            int rispostaPopolazione = c.nextInt();
            if(rispostaPopolazione == 1){
                System.out.println("Da quale popolazione deve partire?");
                nPopolazione = d.nextInt();
            }
            System.out.println("Come vuoi ordinare?\n [ASC]CRESCENTE\n [DESC]DECRESCENTE");
            ordina = e.nextLine();



            String query = String.format(
                    "SELECT CountryCode, Population, " +
                    "CASE " +
                    "   WHEN  2 != ? THEN Name " +
                    "   ELSE '-' " +
                    "   END 'Città' " +
                    "FROM city " +
                    "WHERE CountryCode LIKE (?) AND Population > ? " +
                    "ORDER BY Population " + ordina);
            PreparedStatement stm = myConnection.prepareStatement(query);
            stm.setInt(1, nomeCitta);
            stm.setString(2, countryCode);
            stm.setInt(3, nPopolazione);

            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                String tableFormat = String.format("Codice: %s | Population: %s | Name: %s",
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