package expendedorbebidas;

public class Expendedor {
    private Deposito Coca;
    private Deposito Sprite;
    private DepositoVuelto MonVu;
    private int precioBebidas;
    public static final int COCA=1;
    public static final int SPRITE=2;
    
    public Expendedor(int numBebidas, int precioBebidas){
        MonVu = new DepositoVuelto();
        this.precioBebidas = precioBebidas;
        Coca = new Deposito();
        Sprite = new Deposito();
            
        if(numBebidas != 0){
            for(int i=0; i<numBebidas; i++){
                Coca.addBebida(new CocaCola(100+i));
            }
            for(int i=0; i<numBebidas; i++){
                Sprite.addBebida(new Sprite(200+i));
            }
        }
    }
    
    public Bebida comprarBebida(Moneda m, int Cual){
        Bebida b= null;
        Bebida o=null;
        if(m == null){
            return null;
        }
        if(m.getValor() >= precioBebidas){
            if(Cual == COCA){
                b = Coca.getBebida();
                if(b == null){
                    MonVu.addMoneda(m, 0);
                }else{
                    MonVu.addMoneda(m, precioBebidas);
                }
                return b;
            }else if(Cual == SPRITE){
                o= Sprite.getBebida();
                if(o == null){
                    MonVu.addMoneda(m, 0);
                }else{
                    MonVu.addMoneda(m, precioBebidas);
                }
                return o;
            }else{
                if(m!= null){
                    MonVu.addMoneda(m,0);
                    return null;
                }
            }
        }
        else{
            if(m == null){
                return null;
            }else{
                MonVu.addMoneda(m, precioBebidas);
                return null;
            }
        }
        return null;
    }
    
    public Moneda getVuelto(){
        return MonVu.getMoneda();
    }
}
