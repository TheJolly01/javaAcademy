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
            String query = "SELECT * FROM city";
            Statement stmt = myConnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
            int risposta = 0;
            boolean esistenzaRegione = false;
            do {
                esistenzaRegione = false;
                risposta = inputInt("Vuoi aggiungere una città?\n[1]SI\n[2]NO");
                if(risposta == 1) {
                    String city = inputString("Inserisci il nome della città");
                    String district = inputString("Inserisci la regione");
                    String countryCode = inputString("Inserisci il Country Code");
                    rs.beforeFirst();
                    while(rs.next()){
                        if(city.equals(rs.getString("Name"))){
                            if (district.equals(rs.getString("District"))) {
                                if(countryCode.equals(rs.getString("CountryCode"))){
                                    esistenzaRegione = true;
                                    rs.last();
                                    System.out.println("Città già esistente");
                                }
                            }
                        }
                    }
                    if(!esistenzaRegione) {
                        int popolazione = inputInt("Inserisci la popolazione");

                        rs.moveToInsertRow();
                        rs.updateString("Name", city);
                        rs.updateString("CountryCode", countryCode);
                        rs.updateString("District", district);
                        rs.updateInt("Population", popolazione);
                        rs.insertRow();
                    }
                }else if(risposta < 1 || risposta > 2);
            }while (risposta != 2);


        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int inputInt(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }

    public static String inputString(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextLine();
    }

}