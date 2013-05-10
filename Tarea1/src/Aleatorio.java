import java.util.Random;

public class Aleatorio {

	public int generarNumeroAleatorio() {
		Random numeroAleatorio = new Random();
		int numero = numeroAleatorio.nextInt(1000);
		return numero;
	}

}
