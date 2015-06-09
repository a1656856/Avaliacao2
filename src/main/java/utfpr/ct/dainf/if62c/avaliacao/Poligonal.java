/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1656856
 */
public class Poligonal {
    
    private Ponto2D[] vet;
    
    
    public Poligonal(int a){
        
        if (a <3){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        vet = new Ponto2D[a];
    }
    
    
    
    
    public Ponto2D[] getVet(){
        return vet;
    }
    
    public int getN(){
        return getVet().length;
    }
    
    public Ponto2D get(int a){
        
        
        return getVet()[a-1];
    }
    
    public void set(int a,Ponto2D P){
     
       if(this.getVet()[0].getX() != P.getX() || this.getVet()[0].getY()!= P.getY() || this.getVet()[0].getZ() != P.getZ())
       {
          throw new RuntimeException("Vértices devem estar no mesmo plano"); 
       }
        
       
       else getVet()[a-1] = P;
    }
}
