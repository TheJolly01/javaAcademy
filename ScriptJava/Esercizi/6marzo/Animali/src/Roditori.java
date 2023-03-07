import java.util.ArrayList;

public class Roditori extends Animale {

    private ArrayList<String> nome;
    private int contaAnimali;

    // COSTRUTTORE RODITORI
    public Roditori(){
        nome = new ArrayList<String>();
        contaAnimali = 0;
    }

    public void verso(){
        System.out.println("Squit squit");
    }

    // STAMPA RODITORI
    public void stampaRoditori(){
        System.out.println("I roditori sono " + contaAnimali + ". Ecco i loro nomi:");
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
