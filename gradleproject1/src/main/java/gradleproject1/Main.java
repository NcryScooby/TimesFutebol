package gradleproject1;

public class Main {

 
    public static void main(String[] args) {
        
        ElencoInter e1 = new ElencoInter("Guerrero", 37, 1.85f, 82f, "Centro-Avante", 9);
        
        e1.status();
        
        ElencoInter e2 = new ElencoInter ("Cuesta", 32, 1.87f, 84f, "Zagueiro", 15);
        
        e2.status(); 
       
        ElencoInter e3 = new ElencoInter("Edenilson", 31, 1.75f, 76f, "Meio-Campo", 8);
        
        e3.status();
        
        ElencoInter e4 = new ElencoInter("Patrick", 29, 1.77f, 78f, "Meio-Campo", 88);
        
        e4.status();
        
  
    }
    
}

