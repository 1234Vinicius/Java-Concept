
public class Professor extends Pessoa {
	
	private double salario;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Professor: ";
		s += super.getEndereco();
		return s;
	}
	
	public String obterNome() {
		String n = "Meu nome: ";
		n += super.getNome();
		return n;
	}
	
	
	
	

}
