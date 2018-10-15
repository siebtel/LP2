class Automovel{

   public String modelo;
   public int ano;
   private boolean ligado;

   public Automovel(String m,int a) {

       modelo = m;
       ano = a;
       ligado = false;
   }

   public void liga ( ) {
          ligado = true;
  }

  public void desliga ( ) {
           ligado = false;
  }

}