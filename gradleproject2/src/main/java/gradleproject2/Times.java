package gradleproject2;

public class Times {
    
    String nome;
    String local;
    String cor;
    boolean champ;
    int ntitulos;
    
    void status(){
        System.out.println("Nome do time: "+ this.nome);
        System.out.println("Local do time: "+ this.local);
        System.out.println("Cor do time: "+ this.cor);
    }
    
    void campeao(){
        this.champ = true;
            System.out.println("Campeao da champions League\n");
        
    }
    
    void ncampeao(){
        this.champ = false;
            System.out.println("Nao eh Campeao da champions League\n");
        }
    }