package ar.edu.unlam.basica2.TPcirculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculosTest {

	@Test
	public void crearUnCirculoConRadio2() {
		
		Circulos MiCirculo = new Circulos(2.00);
		
 		assertEquals(2.00,MiCirculo.obtenerElRadioDeUnCirculo(), 0.01);
	}
	

	@Test
	public void crearUnCirculoConRadio3Punto7() {
		
		Circulos MiCirculo = new Circulos(3.7);
		
		assertEquals(3.7,MiCirculo.obtenerElRadioDeUnCirculo(),0.01);
		
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		
		Circulos MiCirculo = new Circulos(5.00);
		
		assertEquals(5.00,MiCirculo.obtenerElRadioDeUnCirculo(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		
		Circulos MiCirculo = new Circulos(10.9);
		
		assertEquals(10.9,MiCirculo.obtenerElRadioDeUnCirculo(),0.01);
	}
	
	
	@Test 
	public void crearUnCirculoConRadio9Punto8(){
		
		Circulos MiCirculo = new Circulos(9.8);
		
		assertEquals(9.8,MiCirculo.obtenerElRadioDeUnCirculo(),0.1);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Sea61Punto54(){
		
		Circulos MiCirculo = new Circulos(9.8);
		 
		 assertEquals(61.54,MiCirculo.obtenerElPerimetroDeUnCirculo(),0.01);
		
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6() {
		
		Circulos MiCirculo = new Circulos(16.6);
		 
		 assertEquals(16.6,MiCirculo.obtenerElRadioDeUnCirculo(), 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Sea104Punto24(){
		
		Circulos MiCirculo = new Circulos(16.6);
		
		assertEquals(104.24,MiCirculo.obtenerElPerimetroDeUnCirculo(),0.01);
	}
	
	
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
	
	
	
}
