package competicaocarro;
	public class Carros {

		private int id;
		private String nome;
		private String marca;
		private String modelo;
		private String motor;
		private int forca;
		private int velocidade;
		private int autonomia;
		
		private Carros (int id, String nome, String marca, String modelo, String motor, int forca, int velocidade, int autonomia) {
			this.id= id;
			this.nome= nome;
			this.marca= marca;
			this.modelo= modelo;
			this.motor= motor;
			this.forca= forca;
			this.velocidade= velocidade;
			this.autonomia= autonomia;
	}
		public int getForca() {
			return forca;
		}
		public void setForca(int forca) {
			if (forca != 0);
			this.forca = forca;
		}
		public int getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(int velocidade) {
			if (velocidade != 0);
			this.velocidade = velocidade;
		}
		public int getAutonomia() {
			return autonomia;
		}
		public void setAutonomia(int autonomia) {
			if (autonomia!= 0);
			this.autonomia = autonomia;
		}
		Carros carro1= new Carros(01, "Irmaos rocha", "Carro de pedra", "pedregulho", "pedra", 76, 67, 3);
		Carros carro2= new Carros(02, "Rufus lenhador", "Carro-tronco", "fogueira", "tora", 55, 78, 8);
		Carros carro3= new Carros(03, "Quadrilha da morte", "Carro blindado", "chumbo", "combustao", 88, 59, 8);
		Carros carro4= new Carros(04, "Irmaos pavor", "Cupe mal assombrado", "cemiterio", "assombrado", 67, 54, 5);
}