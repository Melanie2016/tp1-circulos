package ar.edu.unlam.basica2.TPcirculos;

public class Circulos {

	
	private Double radio;										//ATRIBUTOS
	private Double perimetro;

	
	public Circulos (Double radioDelCirculo){					//CONSTRUCTOR 
	
		this.radio = radioDelCirculo ;
		this.setPerimetro(0.0);
	}
	

	public Double obtenerElRadioDeUnCirculo() {							//METODO

		return this.radio;
	}
	
	
	public Double obtenerElPerimetroDeUnCirculo(){						//METODO
		
		return this.setPerimetro(2*3.14*this.radio);
	}
	
	
	
	
	
	
	
	public Double getPerimetro() {
		return perimetro;
	}


	public Double setPerimetro(Double perimetro) {
		return this.perimetro = perimetro;
	}

}
