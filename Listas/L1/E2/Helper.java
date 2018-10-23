public class Helper {

    private static double[] converterArgumentosEmNumero(String args[]) throws Exception {
        if (args.length < 1) {
            throw new PoucosArgumentosExpection();
        }
        if (args.length > 3) {
            throw new MuitosArgumentosExpection();
        }

        double[] valores = new double[args.length];
        String erro = "";

        for (int i = 0; i < args.length; i++) {
            try {
                valores[i] = Double.parseDouble(args[i]);
                if (valores[i] <= 0) { throw new Exception(); }
            } catch (NumberFormatException e) {
                if (erro.trim().length() > 0) {
                    erro += '\n';
                }
                erro += String.valueOf(i + 1) + "o argumento, \"" + String.valueOf(args[i]) + "\", nao eh numero.";
            } catch (Exception e) {
                if (erro.trim().length() > 0) {
                    erro += '\n';
                }
                erro += String.valueOf(i + 1) + "o argumento, \"" + String.valueOf(args[i]) + "\", eh menor ou igual a zero. Só são válidos números positivos.";
            }
        }

        if (erro.trim().length() > 0) {
            throw new Exception(erro);
        }

        return valores;
    }
}