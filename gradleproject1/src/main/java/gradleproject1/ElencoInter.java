package gradleproject1;

public class ElencoInter {
    
    String nome;
    int idade;
    float altura;
    float peso;
   
    public ElencoInter(String n, int i, float a, float p){
        
        this.nome = n;
        this.idade = i;
        this.altura = a;
        this.peso = p;
        
    }
    
    public void status(){
        
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
        
    }
    
}