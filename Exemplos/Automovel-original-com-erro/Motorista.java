class Motorista{

   private String nome;
   private Automovel carro;

  public Motorista ( String n,Automovel a ) {

    nome = n;
    carro = a;

  }

  public String obterNome( ) {

    return nome;
  }

  public Automovel obterCarro( ) {

    return carro;
  }

}