
package polimorfismo;


    public class PastelChocolate extends Pastel {

    public PastelChocolate(String tamano, double precio, int pisos) {
        super(tamano, precio, pisos);
    }
    
    @Override
    public void preparar() {
        System.out.println("Preparando un pastel de chocolate");
           
    }
    
    @Override
    public void decorar(){
        System.out.println(" Colocando crema de chocolate ");
        
    }
}

