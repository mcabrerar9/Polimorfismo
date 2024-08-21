
package polimorfismo;


public class Pastel {
    
    protected String tamaño;
    protected double precio;
    protected int pisos;

    public Pastel(String tamaño, double precio, int pisos) {
        this.tamaño = tamaño;
        this.precio = precio;
        this.pisos = pisos;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
            
    
    
    public void preparar() {
        System.out.println(" Preparando base del pastel ");
    }
    
    public void decorar(){
         System.out.println(" Decorando pastel ");    
         
}
    public void mostrardatos(){
        System.out.println(" Haz ordenado un pastel de tamano:  " + tamaño + " Que cuesta: " + precio + " No. de pisos: " + pisos);
    }
    
    
}
