package expendedorbebidas;

public class ExpendedorBebidas {

    public static void main(String[] args) {
        
        Expendedor ex1 = new Expendedor(6,400); // Hay 6 bebidas, valor de 400
        Expendedor ex2 = new Expendedor(0,1000); // No hay bebidas, valor de 1000
        Expendedor ex3 = new Expendedor (2, 1500); // Hay 2 bebidas, valor de 1500
        
        Moneda mon0 = null; // Valor null o 0
        Moneda mon1000 = new Moneda1000();
        Moneda mon1500 = new Moneda1500();
        Moneda mon500 = new Moneda500();
        Moneda mon100 = new Moneda100();
        
        //Comprador con valor superior al precio, recibe vuelto
        Comprador Petunia = new Comprador(mon1000, Expendedor.COCA, ex1);
        System.out.println("Comprador: Petunia");
        System.out.println("¿Qué bebio Petunia?: " + Petunia.queBebiste());
        System.out.println("Petunia recibio de vuelto: " + Petunia.cuantoVuelto()); System.out.println("");
        
        //Comprador que compra en un expendedor vacio, recibe vuelto
        Comprador Margarita = new Comprador(mon500, Expendedor.FANTA, ex2);
        System.out.println("Comprador: Margarita");
        System.out.println("¿Qué bebio Margarita?:  " + Margarita.queBebiste());
        System.out.println("Margarita recibio de vuelto: " + Margarita.cuantoVuelto()); System.out.println("");
        
        //Comprador con valor inferior al precio, no recibe vuelto
        Comprador Rosa = new Comprador(mon500, Expendedor.SPRITE, ex3);
        System.out.println("Comprador: Rosa");
        System.out.println("¿Qué bebio Rosa?: " + Rosa.queBebiste());
        System.out.println("Rosa recibio de vuelto: " + Rosa.cuantoVuelto()); System.out.println("");
        
        //Comprador con valor igual al precio, no recibe vuelto
        Comprador Jazmin = new Comprador(mon1500, Expendedor.COCA, ex3);
        System.out.println("Comprador: Jazmin");
        System.out.println("¿Qué bebio Jazmin?: " + Jazmin.queBebiste());
        System.out.println("Jazmin recibio de vuelto: " + Jazmin.cuantoVuelto()); System.out.println("");
        
        //Comprador con valor 0, no recibe bebida ni vuelto
        Comprador Dalia = new Comprador(mon0, Expendedor.FANTA, ex1);
        System.out.println("Comprador: Dalia");
        System.out.println("¿Qué bebio Dalia?: " + Dalia.queBebiste());
        System.out.println("Dalia recibio de vuelto: " + Dalia.cuantoVuelto()); System.out.println("");
     
        
    }
    
}
