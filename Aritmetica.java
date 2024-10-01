package lanchonete;

public class Aritmetica implements ICalculo {
	  @Override
	    public double calcularMedia(double[] notas) {
	        double soma = 0;
	        for (double nota : notas) {
	            soma += nota;
	        }
	        return soma / notas.length;
	    }
	}


