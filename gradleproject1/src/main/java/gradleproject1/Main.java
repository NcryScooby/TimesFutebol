package gradleproject1;

public class Main {

 
    public static void main(String[] args) {
        
        ElencoInter e1 = new ElencoInter("Guerrero", 37, 1.85f, 82f);
        
        e1.status();
        
        System.out.println("");
        
        ElencoInter e2 = new ElencoInter ("Cuesta", 32, 1.87f, 84f);
        
        e2.status();
        
        System.out.println("");
        
        ElencoInter e3 = new ElencoInter("Edenilson", 31, 1.75f, 76f);
        
        e3.status();
  
    }
    
}

