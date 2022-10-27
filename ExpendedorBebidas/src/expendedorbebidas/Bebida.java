package expendedorbebidas;

abstract public class Bebida {
    private int numSerie;
    
    public Bebida(int numSerie){
        this.numSerie = numSerie;
    }
    public int getSerie(){
        return this.numSerie;
    }
    public abstract String beber();
}

class Sprite extends Bebida{
    
    public Sprite(int numSerie){
        super(numSerie);
    }
    @Override
    public String beber(){
        return new String ("Sprite");
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int numSerie){
        super(numSerie);
    }
    @Override
    public String beber(){
        return new String ("CocaCola");
    }
}
