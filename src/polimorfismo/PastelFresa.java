
package polimorfismo;


public class PastelFresa extends Pastel {

    public PastelFresa(String tamano, double precio, int pisos) {
        super(tamano, precio, pisos);
    }
    @Override
    public void preparar() {
        System.out.println("Preparando un pastel de fresa");
  
    }
    
    @Override
    public void decorar(){
        System.out.println(" Colocando Fresas ");
    }
}