import java.util.ArrayList;

public class Anfibi extends Animale {

    private ArrayList<String> nome;
    private int contaAnimali;

    // COSTRUTTORE ANFIBI
    public Anfibi(){
        nome = new ArrayList<String>();
        contaAnimali = 0;
    }

    public void verso(){
        System.out.println("Il coccodrillo come fa papapapapa, non c'è nessuno che lo sa papapapapa");
    }

    // STAMPA Anfibi
    public void stampaAnfibi(){
        System.out.println("Gli anfibi sono " + contaAnimali + ". Ecco i loro nomi:");
        for(int i = 0; i < nome.size(); i++){
            System.out.println(nome.get(i));
        }
    }


    // AGGIUNGI NOME
    public void addNome(String nome){
        this.nome.add(nome);
        contaAnimali++;
    }



    // GETTER

    public ArrayList<String> getNome() {
        return nome;
    }
    public int getContaAnimali() {
        return contaAnimali;
    }


    // SETTER

    public void setNome(ArrayList<String> nome) {
        this.nome = nome;
    }

    public void setContaAnimali(int contaAnimali) {
        this.contaAnimali = contaAnimali;
    }

}
