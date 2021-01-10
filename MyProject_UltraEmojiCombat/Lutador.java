package myproject_ultraemojicombat;

/**
 *
 * @author Alexssandro
 */
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitórias, derrotas, empates;
    
 
    //Métodos Públicos
    
    public void apresentar(){
        
        System.out.println ("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println ("\n Diretamente de: "+ this.getNacionalidade());
        System.out.println ("\n com "+ this.getIdade() + "anos e "+ this.getAltura() + "m" );
        System.out.println ("\n pesando: "+ this.getPeso() + "Kg");
        System.out.println (this.getVitórias() + " Vitórias");
        System.out.println (this.getDerrotas() + " Derrotas");
        System.out.println (this.getEmpates() + " Empates");
        
        
    }
    public void status(){
        
        System.out.println (this.getNome() + "é um peso" + this.getCategoria());
        System.out.println ("Ganhou "+ this.getVitórias()+" Vezes");
        System.out.println ("Empatou "+ this.getEmpates() + " Vezes");
        System.out.println ("Perdeu "+ this.getDerrotas()+ " Vezes");
        
        
        
    }
    public void ganharLuta(){
        
        this.setVitórias (this.getVitórias() + 1);
        
    }
    public void perderLuta(){
        
        this.setDerrotas(this.getVitórias() + 1);
        
    }
    public void empatarLuta(){
        
        this.setEmpates(this.getEmpates() + 1);
        
    }    
        
        
    //Métodos Especiais
    
    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em) {
        
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitórias = vi;
        this.derrotas = de;
        this.empates = em;
                
    
}
    
    public String getNome () {
        
        return nome;
        
    }
    public void setNome (String nome) {
        
        this.nome= nome;
    }
    public String getNacionalidade() {
        
        return nacionalidade;
               
    }
    public void setNacionalidade (String nacionalidade) {
        
        this.nacionalidade = nacionalidade;
        
    }
    public int getIdade() {
        
        return idade;
        
    }
    public void setIdade (int idade) {
        
        this.idade= idade;
        
    }
    public float getAltura () {
        
        return altura;
        
    }
    public void setAltura (float altura) {
        
        this.altura = altura;
        
    }
    public float getPeso () {
        
        return peso;
 
    }
    public void setPeso (float peso) {
        
        this.peso= peso;
        this.setCategoria();
    }
    public String getCategoria () {
        
        return categoria;
    
        
    }
    private void setCategoria (){    
        
        if (peso < 52.2) {
            
          this.categoria= " Inválido";
           
        }
        else if (peso <= 70.3){
            
          this.categoria= " Leve";
                  
        }
        else if (peso <= 83.9){
          
          this.categoria = " Médio";
          
        }
        else if (peso <= 120.2){
            
          this.categoria= " Pesado"; 
        }
        else {
           
          this.categoria= " Inválido";
        }
        
    }

    public int getVitórias () {
        
        return vitórias;
        
    }
    
    public void setVitórias (int vitórias) {
        
        this.vitórias= vitórias; 
    }
    
    public int getDerrotas () {
        
        return derrotas;
        
    }
    public void setDerrotas (int derrotas)  {
        
        this.derrotas= derrotas;
        
    }
    public int getEmpates () {
        
        return empates;
        
    }
    public void setEmpates (int empates){
        
        this.empates= empates;
        
    }
    
        
    
}

