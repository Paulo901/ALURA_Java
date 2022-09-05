package pooepolimorfismo;

public class RegistraC {
    
    private double soma;
    
    public void registra(Conta c){
        
        double desco = c.getDescontos();
        this.soma = this.soma + desco;
        
    }

    public double getSoma() {
        return soma;
    }
    
    
    
}
