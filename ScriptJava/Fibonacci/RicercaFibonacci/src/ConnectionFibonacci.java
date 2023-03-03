import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionFibonacci {

    /*
    TODO Singleton
    Connessione database fibonacci
    URL database fibonacci
    Driver manager
    Password database
    Statement statico con query
    Esecuzione query con risultato
    Funzione che collega con il Main
    */

    private String myUrl;
    private String myUser;
    private String myPassword;
    public ConnectionFibonacci(String url, String user, String password){

        myUrl = url;
        myUser = user;
        myPassword = password;
    }
    public void CreaConnessione(){
        try{
            Connection conn;
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);
            System.out.println(conn == null ? "Connessione non riuscita" : "Connessione avvenuta");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
