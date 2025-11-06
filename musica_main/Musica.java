
package musica_main;


public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;
    
    public Faixa(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
                
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String print(){
        return "Titulo " + titulo + " Artista " + artista + " Duração " + duracao + "s");
    }
    
    public void reproduzir(){
        System.out.println("Reproduzindo: " + titulo + " por " + artista + " ( " + duracao + "s");
    }
}
