
package polimorfismo;


public class PastelVainilla extends Pastel {

    public PastelVainilla(String tamano, double precio, int pisos) {
        super(tamano, precio, pisos);
    }
    @Override
    public void preparar() {
        System.out.println("Preparando un pastel de vainilla");
    
    }
    
    @Override
    public void decorar (){
        System.out.println(" Colocando turron a pastel de vainilla ");
        
        
    }
}