public class Exercicio8 {
    public static boolean haColisaoEntreCirculos(int x1,int y1, int r1, int x2, int y2, int r2) {
        double somaRaios  = r1 + r2;
        double distanciaCentros = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        if (somaRaios >= distanciaCentros) {
            return true;
        } else { return false; }
    }
    public static void main (String[] args) {
        System.out.print(haColisaoEntreCirculos(10,3,1,5,8,2));
    }
}