package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class NumerosMagicosTest {
	
	@Test
	public void testeSeUmNumeroEhPrimo(){
		boolean ehPrimo = false;
		
		ehPrimo = NumerosMagicos.ehPrimo(4);
		Assert.assertFalse(ehPrimo);
		
		ehPrimo = NumerosMagicos.ehPrimo(3);
		Assert.assertTrue(ehPrimo);
		
		ehPrimo = NumerosMagicos.ehPrimo(9);
		Assert.assertFalse(ehPrimo);
		
		ehPrimo = NumerosMagicos.ehPrimo(1);
		Assert.assertFalse(ehPrimo);
		
	}
	
	@Test
	public void testeImprimeNumerosMagicos() {
		List<Integer> numerosMagicos = Arrays.asList(3,4,5,6);
		
		NumerosMagicos.imprimeNumerosMagicos(numerosMagicos);
	}
	
	
	@Test
	public void testePercorreLista() {
		List<List<Integer>> numeros = new ArrayList<>();
		
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(8);
		inteiros.add(27);
		
		List<Integer> inteiros2 = new ArrayList<>();
		inteiros2.add(49);
		inteiros2.add(49);
		
		numeros.add(inteiros);
		numeros.add(inteiros2);

		NumerosMagicos.percorreLista(numeros);
	}
	

}
