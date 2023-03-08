import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionTo {

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

    private Connection conn;
    private String myUrl;
    private String myUser;
    private String myPassword;
    public ConnectionTo(String url, String user, String password){

        myUrl = url;
        myUser = user;
        myPassword = password;
    }
    public void CreaConnessione(){
        try{
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);
            System.out.println(conn == null ? "Connessione non riuscita" : "Connessione avvenuta");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }
}