package competicaocarro;

public class Pista {

	private int id;
	private String nome;
	private int tamanhoGasto;
	private int dirigibilidade=-4;
	private int forcaPista=-2;
	private int velocidadePista=-1;
	private int  autonomiaPista=-4;
	
	public Pista (int id, String nome, int tamanhoGasto, int dirigibilidade) {
		this.id= id;
		this.nome= nome;
		this.tamanhoGasto= tamanhoGasto;
		tamanhoGasto= (forcaPista+velocidadePista+autonomiaPista);	
	}
	
	Pista circuito01= new Pista(01, "interlagos", 97, -7);
	Pista circuito02= new Pista(02, "suzuka", 88, -9);
	Pista circuito03= new Pista(03, "interlagos", 52, -5);
	Pista circuito04= new Pista(04, "interlagos", 43, -4);
	Pista circuito05= new Pista(05, "interlagos", 78, -10);
}
