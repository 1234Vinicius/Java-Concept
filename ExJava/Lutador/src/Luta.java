
public class Luta {
	
	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[3];
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f,
				68.9f, 11, 2, 1);
		
		l[1] = new Lutador("Vinicius", "Brasil", 19, 1.77f, 60.5f, 12,4,0);
		
		
		l[2] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14,2,3);
		
		
		Lutando UEC01 = new Lutando();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		
		
	}

}
