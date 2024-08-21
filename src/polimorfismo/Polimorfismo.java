
package polimorfismo;


public class Polimorfismo {

    
    public static void main(String[] args) {
       
        
        Pastel pastel1 = new PastelChocolate("Grande", 150, 1); // Polimorfismo: Pastel refiere a un PastelChocolate
        Pastel pastel2 = new PastelVainilla("Mediano", 200, 2);  // Polimorfismo: Pastel refiere a un PastelVainilla
        Pastel pastel3 = new PastelFresa("Pequeno", 75, 1);     // Polimorfismo: Pastel refiere a un PastelFresa

        System.out.println("--------------------------------------");
        pastel1.preparar(); // Llama a preparar() en PastelChocolate
        pastel2.preparar(); // Llama a preparar() en PastelVainilla
        pastel3.preparar(); // Llama a preparar() en PastelFresa
        
        System.out.println("--------------------------------------");
        pastel1.decorar();  // Llama a decorar() en PastelChocolate
        pastel2.decorar();  // Llama a decorar() en PastelVainilla
        pastel3.decorar();  // Llama a decorar() en PastelFresa
        
        System.out.println("--------------------------------------");
        pastel1.mostrardatos();
        pastel2.mostrardatos();
        pastel3.mostrardatos();
        System.out.println("--------------------------------------");
        
    }
    
    
}
