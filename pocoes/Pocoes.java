
package pocoes;




public class Pocoes {
    private String nome;
    private int poder;
    private String tipo;

    
    public Pocoes(String nome) {
        this.setNome(nome);
        this.setPoder(30); 
        this.setTipo("Veneno"); o"
    }

    
    public Pocoes(String nome, int poder) {
        this.setNome(nome);
        this.setPoder(poder);
        this.setTipo("Sonífero"); 
    }

    
    public Pocoes(String nome, int poder, String tipo) {
        this.setNome(nome);
        this.setPoder(poder);
        this.setTipo(tipo);
    }

    
    public void usar() {
        System.out.println("A poção " + this.nome + " foi usada!");
        System.out.println("Ela causou " + this.poder + " de dano.");
    }

    public void usar(String alvo) {
        System.out.println("A poção " + this.nome + " foi usada em " + alvo + "!");
        System.out.println("Ela causou " + this.poder + " de dano.");
    }

    
    public void usar(String alvo, int vezes) {
        System.out.println("A poção " + this.nome + " foi usada " + vezes + " vezes em " + alvo + "!");
        System.out.println("Ela causou " + this.poder + " de dano.");
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    
    public void setPoder(int poder) {
        if (poder >= 1 && poder <= 100) {
            this.poder = poder;
        } else {
            System.out.println("[ERRO] O poder da poção deve ser entre 1 e 100. O valor " + poder + " é inválido.");
            
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}