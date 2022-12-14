package expendedorbebidas;

abstract class Moneda {

    public Moneda() {
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}

class Moneda100 extends Moneda{
    
    public Moneda100(){
        super();
    }
    @Override
    public int getValor(){
        return 100;
    }
}

class Moneda500 extends Moneda{
    
   public Moneda500(){
       super();
   }
   @Override
   public int getValor(){
       return 500;
   }
}

class Moneda1000 extends Moneda{
    
   public Moneda1000(){
       super();
   }
   @Override
   public int getValor(){
       return 1000;
   }
}
class Moneda1500 extends Moneda{
    
   public Moneda1500(){
       super();
   }
   @Override
   public int getValor(){
       return 1500;
   }
}