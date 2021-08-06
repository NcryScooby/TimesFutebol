package gradleproject2;

public class Main {

    public static void main(String[] args) {
        
        Times t1 = new Times();
        
        t1.nome = "Barcelona";
        t1.local = "Espanha";
        t1.cor = "Grena e azul";        
        t1.status();
        t1.campeao();
        
        Times t2 = new Times();
        
        t2.nome = "Milan";
        t2.local = "Italia";
        t2.cor = "Vermelho, branco e preto";
        t2.status();
        t2.campeao();
        
        Times t3 = new Times();
        
        t3.nome = "Atletico de Madrid";
        t3.local = "Espanha";
        t3.cor = "Vermelho, branco e azul";
        t3.status();
        t3.ncampeao();
    }
    
}