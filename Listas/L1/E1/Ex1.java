public class Ex1 {

    public static void main(String[] args) {
        double area = 0.0;

        try {
            double[] valores = Ex1.converterArgumentosEmNumero(args);

            switch (valores.length) {
            case 1:
                area = Ex1.calcula(valores[0]);
                Ex1.printArea("circulo", area);
                break;

            case 2:
                area = Ex1.calcula(valores[0], valores[1]);
                Ex1.printArea("retangulo", area);
                break;

            case 3:
                area = Ex1.calcula(valores[0], valores[1], valores[2]);
                String tipoTriangulo = Ex1.getTipoTriangulo(valores[0], valores[1], valores[2]);
                Ex1.printArea("triangulo", area);
                System.out.format("O triangulo e %s.\n", tipoTriangulo);
                break;
            }

        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }

    private static double calcula(double r) {
        return r * r * Math.PI;
    }

    private static double calcula(double b, double a) {
        return b * a;
    }

    private static double calcula(double l1, double l2, double l3) throws Exception {
        if (!Ex1.isTriangulo(l1, l2, l3)) {
            throw new Exception("Os lados informados não geram um triângulo.");
        }

        // FORMULA DE HERON
        double p = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));

        return area;
    }

    private static double[] converterArgumentosEmNumero(String args[]) throws Exception {
        if (args.length < 1) {
            throw new Exception("Numero de argumentos insuficiente.");
        }
        if (args.length > 3) {
            throw new Exception("Numero de argumentos excessivo.");
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

    private static boolean isTriangulo(double l1, double l2, double l3) {
        boolean a = Ex1.calculaCondicaoTriangulo(l1, l2, l3);
        boolean b = Ex1.calculaCondicaoTriangulo(l1, l2, l3);
        boolean c = Ex1.calculaCondicaoTriangulo(l1, l2, l3);

        return a && b && c;
    }

    private static boolean calculaCondicaoTriangulo(double lado, double c1, double c2) {
        return lado > Math.abs(c1 - c2) && lado < (c1 + c2);
    }

    private static String getTipoTriangulo(double l1, double l2, double l3) {
        if (l1 == l2 && l2 == l3) {
            return "equilatero";
        }

        if (l1 != l2 && l2 != l3) {
            return "escaleno";
        }

        return "isosceles";
    }

    private static void printArea(String poligono, double area) {
        System.out.println("A area do " + poligono + " e: " + String.format("%.2f", area) + " unidades de area");
    }

}