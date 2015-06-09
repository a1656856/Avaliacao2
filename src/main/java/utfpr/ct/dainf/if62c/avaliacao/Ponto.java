package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;

    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public Ponto(){
    
    this.x = 0;
    this.y = 0;
    this.z = 0;
    
        
    
    
    
    }
    
    
    public Ponto(double x,double y ,double z){
        
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    
    public String toString(){
        
        
        return (String.format(getNome()+"(%d,%d,%d",getX(),getY(),getZ()));
    }
 
        
   
        
    public double dist(Ponto b){
        
        double a;
        
        a = Math.sqrt(Math.pow(this.getX()-b.getX(),2) + Math.pow(this.getY()-b.getY(),2) + Math.pow(this.getZ()-b.getZ(),2));
        
        
        
        return a;
        
    }
    
    
    
    
    
    

    
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

}

    
    /*
    @Override
    public boolean equals(Object b){
        
        if(this.getX() != b.getX() || this.getY() != b.getY() || this.getZ() != b.getZ()){
            return false;
        }
        
        
        
        
       
        
        else return true;
        
        
        
        
    }
    
    
    */
    