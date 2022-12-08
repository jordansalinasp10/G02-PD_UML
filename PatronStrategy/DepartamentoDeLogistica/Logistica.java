package DepartamentoDeLogistica;
public class Logistica {
	//Logica del departamento de logistica
	
	public void enviarArticulos(Articulo[] articulos, LogisticaStrategy tipoDeEnvio) {		
		tipoDeEnvio.transportar(articulos);
	}
}
