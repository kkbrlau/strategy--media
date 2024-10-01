package lanchonete;

public class Geometrica implements ICalculo{
    @Override
    public double calcularMedia(double[] notas) {
        double produto = 1;
        for (double nota : notas) {
            produto *= nota;
        }
        return Math.pow(produto, 1.0 / notas.length);
    }
}

