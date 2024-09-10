package br.com.pipeline;

import br.com.pipeline.util.Soma;
import org.junit.Test;
import junit.framework.Assert;

public class Main {
	public static void main(String[] args) {
		 @Test
		Soma conta = new Soma();
		double result = conta.somar(10.0, 5.0);

		System.out.println("Resultado: " + result);

		 Assert.assertEquals(15.0, result, 0);
	}
}
