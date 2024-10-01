package lanchonete;

public class Disciplina {
	 private String nome;
	    private double[] notas;
	    private ICalculo calculo;
	    private double media;
	    
	    public Disciplina(ICalculo calculo) {
	        this.calculo = calculo;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setNotas(double[] notas) {
	        this.notas = notas;
	    }

	    public void calcularMedia() {
	        this.media = calculo.calcularMedia(notas);
	    }
	    
	    public String getNome() {
	    	return nome;
	    }

	    public double getMedia() {
	        return this.media;
	    }

	    public String getSituacao() {
	        if (calculo instanceof Aritmetica) {
	            return this.media >= 5.0 ? "Aprovado" : "Reprovado";
	        } else  
	            return this.media >= 7.0 ? "Aprovado" : "Reprovado";
	        }
}
