


	public class Disparador {
		
		Aleatorio aleatorio = new Aleatorio();
		Proceso proceso = new Proceso();
		
		public void activarDisparador() {
			while(true){
				int numeroAleatorio = aleatorio.generarNumeroAleatorio();
				System.out.print(numeroAleatorio + ", ");
				if (numeroAleatorio == 1) {
					try {
						throw new MiExepcion();
					} catch (MiExepcion e) {
						System.out.println(e.getMessage());
					}
				}else if (numeroAleatorio == 100) {
					//throw new RuntimeCodigo100();
					System.out.println("CODIGO 100");
				}else if (numeroAleatorio == 22) {
					proceso.iniciarProceso();
				}
			}
		}			
	}	

