public class Angulo {
    public static double converteAngulo(double graus) {
        return graus * Math.PI/180;
    }

    public static double funcaoSeno(double radianos) {
        return Math.sin(radianos);
    }
    
    public static double funcaoCoseno (double radianos) {
        return Math.cos(radianos);
    }
    public static double funcaoTangente (double radianos) {
        return Math.tan(radianos);
    }

    public static double funcaoCotangente (double radianos) {
        return 1 / Angulo.funcaoTangente(radianos);
    }
}