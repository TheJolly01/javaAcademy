public class Libro {

    private String nome;
    private int anno;
    private String editore;

    // COSTRUTTORE LIBRO
    public Libro(String nome, int anno, String editore){
        this.nome = nome;
        this.anno = anno;
        this.editore = editore;
    }






    // GETTER DELLE VARIABILI PRIVATE
    public String getNome() {
        return nome;
    }
    public int getAnno() {
        return anno;
    }
    public String getEditore() {
        return editore;
    }

    // SETTER DELLE VARIABILI PRIVATE
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNome(int anno) {
        this.anno = anno;
    }
    public void setEditore(String editore) {
        this.editore = editore;
    }
}
