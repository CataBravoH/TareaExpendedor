package expendedorbebidas;

public class ExpendedorBebidas {

    public static void main(String[] args) {
        
        Expendedor expen = new Expendedor(3,500);
        
        Moneda mon1000 = new Moneda1000();
        Moneda mon1500 = new Moneda1500();
        Moneda mon500 = new Moneda500();
        Moneda mon100 = new Moneda100();
        
        Comprador Petunia = new Comprador(mon1000, expen.COCA, expen);
        System.out.println("Comprador: Petunia");
        System.out.println("Petunia bebio " + Petunia.queBebiste());
        System.out.println("Petunia recibio de vuelto: " + Petunia.cuantoVuelto()); System.out.println("");
        
        Comprador Margarita = new Comprador(mon1500, expen.SPRITE, expen);
        System.out.println("Comprador: Margarita");
        System.out.println("Margarita bebio " + Margarita.queBebiste());
        System.out.println("Margarita recibio de vuelto: " + Margarita.cuantoVuelto()); System.out.println("");

        Comprador Rosa = new Comprador(mon500, expen.COCA, expen);
        System.out.println("Comprador: Rosa");
        System.out.println("Rosa bebio " + Rosa.queBebiste());
        System.out.println("Rosa recibio de vuelto: " + Rosa.cuantoVuelto()); System.out.println("");
        
        Comprador Jazmin = new Comprador(mon100, expen.COCA, expen);
        System.out.println("Comprador: Jazmin");
        System.out.println("Jazmin bebio " + Jazmin.queBebiste());
        System.out.println("Jazmin recibio de vuelto: " + Jazmin.cuantoVuelto()); System.out.println("");
     
        
    }
    
}
