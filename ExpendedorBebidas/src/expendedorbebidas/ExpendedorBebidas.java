package expendedorbebidas;

public class ExpendedorBebidas {

    public static void main(String[] args) {
        
        Expendedor expen = new Expendedor(3,700);
        Moneda mon100 = new Moneda100();
        Moneda mon500 = new Moneda500();
        Moneda mon1000 = new Moneda1000();
        Moneda mon1500 = new Moneda1500();
        
        Comprador Petunia = new Comprador(mon1000, expen.COCA, expen);
        System.out.println(Petunia.queBebiste());
        System.out.println(Petunia.cuantoVuelto());
        Comprador Margarita = new Comprador(mon1500, Expendedor.SPRITE, expen);
        System.out.println(Margarita.queBebiste());
        System.out.println(Margarita.cuantoVuelto());

        Comprador Rosa = new Comprador(mon1000, Expendedor.SPRITE, expen);
        System.out.println(Rosa.queBebiste());
        System.out.println(Rosa.cuantoVuelto());

        Comprador Dalia = new Comprador(mon1500, Expendedor.SPRITE, expen);
        System.out.println(Dalia.queBebiste());
        System.out.println(Dalia.cuantoVuelto());

        Comprador Jazmin = new Comprador(mon1500, Expendedor.SPRITE, expen);
        System.out.println(Jazmin.queBebiste());
        System.out.println(Jazmin.cuantoVuelto());

        Expendedor exp = new Expendedor(0,400);
        Comprador c = new Comprador(mon1000,Expendedor.COCA,exp);
        System.out.println(c.queBebiste());
        System.out.println(c.cuantoVuelto());
        
        exp = new Expendedor(4,400);
        Moneda m = null;
        c=null;
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
    }
    
}
