package gradleproject1;

public class ElencoInter {
    
    String nome;
    int idade;
    float altura;
    float peso;
    String posicao;
   
    public ElencoInter(String n, int i, float a, float p, String p1){
        
        this.nome = n;
        this.idade = i;
        this.altura = a;
        this.peso = p;
        this.posicao = p1;
        
    }
    
    public void status(){
        
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Altura: %.2f CM\n", altura);
        System.out.printf("Peso: %.2f KG\n", peso);
        System.out.printf("Posicao: %s\n", posicao);
        System.out.println("");
        System.out.println("");
        
    }
    
}