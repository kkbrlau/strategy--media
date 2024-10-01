package lanchonete;

public class Situacao {
	 public static void main(String[] args) {
	        // Strategy de cálculo Aritmético
	        ICalculo aritmetica = new Aritmetica();
	        Disciplina d1 = new Disciplina(aritmetica);
	        d1.setNome("POO");
	        d1.setNotas(new double[]{5.0, 7.0, 6.0});
	        d1.calcularMedia();
	        System.out.printf("Disciplina: %s  Média: %.2f  Situação: %s%n", d1.getNome(), d1.getMedia(), d1.getSituacao());

	        // Strategy de cálculo Geométrico
	        ICalculo geometrica = new Geometrica();
	        Disciplina d2 = new Disciplina(geometrica);
	        d2.setNome("Algoritmos");
	        d2.setNotas(new double[]{8.0, 7.0, 9.0});
	        d2.calcularMedia();
	        System.out.printf("Disciplina: %s | Média: %.2f | Situação: %s%n", d2.getNome(), d2.getMedia(), d2.getSituacao());
	    }
	}