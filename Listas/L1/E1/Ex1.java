public class Ex1 {
    
    public static void main (String args[ ] ) {
        double area = 0.0;

        switch(args.length) {
            case 1:
                double raio = Double.parseDouble(args[0]);
                area = Ex1.calcula(raio);
                Ex1.printArea("circulo", area);
                break;
            
            case 2:
                double base = Double.parseDouble(args[0]);
                double altura = Double.parseDouble(args[1]);
                area = Ex1.calcula(base, altura);
                Ex1.printArea("retangulo", area);
                break;
            
            case 3:
                double l1 = Double.parseDouble(args[0]);
                double l2 = Double.parseDouble(args[1]);
                double l3 = Double.parseDouble(args[2]);
                area = Ex1.calcula(l1, l2, l3);
                Ex1.printArea("triangulo", area);
                break;

            default:
                int n = args.length;
                Ex1.printError(
                    "Numero incorreto de argumentos (" + String.valueOf(n) + ")", 
                    "O programa deve receber de 1 a 3 argumentos."
                );

        }

        
   }

   private static double calcula(double r) {
       return r * r * 3.14;
   }
    
    private static double calcula(double b, double a) {
        return b * a;
    }
    
    private static double calcula(double l1, double l2, double l3) {
        // FORMULA DE HERON
        double p = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
        return area;
    }

    private static void printArea(String poligono, double area) {
        System.out.println("A area do " + poligono + " e: " + String.format("%.2f", area) + " unidades de area");
    }

    private static void printError(String tipo, String message) {
        System.out.println("ERRO: " + tipo);
        System.out.println("\u2192 " + message);
    }

}