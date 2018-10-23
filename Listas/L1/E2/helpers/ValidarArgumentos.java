public class ValidadorArgumentos {
    private int maximo;
    private int minimo;

    public ValidadorArgumentos(int maximo, int minimo) {
        this.maximo = maximo;
        this.minimo = minimo;
    }

    public void conferirQuantidade(String[] args) throws PoucosArgumentosExpection, MuitosArgumentosExpection {
        if (this.minimo != un && args.length < this.minimo) {
            throw new PoucosArgumentosExpection();
        }
    }
}