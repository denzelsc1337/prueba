package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class calculadoraTest {

	@Test
	public void testSuma() {
		//double a y b;
		double resultado = Calculadora.suma(3, 2);
		double esperado_resultado = 5;
		assertEquals(resultado, esperado_resultado, "resultado exitoso");
		
	}

}
