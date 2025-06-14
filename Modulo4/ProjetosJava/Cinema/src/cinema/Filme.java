package cinema;
public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int ano;

    public Filme(int id, String titulo, String genero, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public Filme() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
