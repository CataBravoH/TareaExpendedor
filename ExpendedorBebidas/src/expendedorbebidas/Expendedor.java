package expendedorbebidas;

public class Expendedor {
    private Deposito Coca;
    private Deposito Sprite;
    private Deposito Fanta;
    private DepositoVuelto MonVu;
    private int precioBebidas;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public static final int FANTA=3;
    
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
            for(int i=0; i<numBebidas; i++){
                Fanta.addBebida(new Fanta(300+i));
            }
        }
    }
    
    public Bebida comprarBebida(Moneda moneda, int Elegida){
        Bebida bebida1= null;
        Bebida bebida2=null;
        Bebida bebida3 = null;
        if(moneda == null){
            return null;
        }
        if(moneda.getValor() >= precioBebidas){
            if(Elegida == COCA){
                bebida1 = Coca.getBebida();
                if(bebida1 == null){
                    MonVu.addMoneda(moneda, 0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida1;
            }else if(Elegida == SPRITE){
                bebida2 = Sprite.getBebida();
                if(bebida2 == null){
                    MonVu.addMoneda(moneda, 0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida2;
            }else if(Elegida == FANTA){
                bebida3 = Fanta.getBebida();
                if(bebida3 == null){
                    MonVu.addMoneda(moneda,0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
            }else{
                if(moneda != null){
                    MonVu.addMoneda(moneda,0);
                    return null;
                }
            }
        }
        else{
            if(moneda == null){
                return null;
            }else{
                MonVu.addMoneda(moneda, precioBebidas);
                return null;
            }
        }
        return null;
    }
    
    public Moneda getVuelto(){
        return MonVu.getMoneda();
    }
}
