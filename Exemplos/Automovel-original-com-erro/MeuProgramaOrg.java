public class MeuProgramaOrg{

   private Automovel carro1;
   private Motorista motorista1,motorista2;

   public static void main (String args[ ] ) {

    carro1 = new Automovel ("chevette", 87 );

     motorista1 = new Motorista("Joao" , carro1);
 
     motorista2 = new Motorista ("Pedro", carro1);

     System.out.println (motorista1.obterNome( ) );
     System.out.println (motorista2.obterNome( ) );

   }
}
