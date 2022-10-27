package expendedorbebidas;

public class Comprador {
    private int vuelto;
    private String tomo;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b= exp.comprarBebida(m, cualBebida);
        tomo=null;
        vuelto=0;
        Moneda aux = null;
        while((aux = exp.getVuelto()) != null){
            vuelto = vuelto + aux.getValor();
        }
        if(b != null){
            tomo = b.beber();
        }
    }
    
    public int cuantoVuelto(){
        return vuelto;
    }
    
    public String queBebiste(){
        return tomo;
    }
}
