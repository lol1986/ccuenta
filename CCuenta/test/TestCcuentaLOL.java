import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestCcuentaLOL{
	
	Ccuenta miCuenta;
	
	@Test
	public void testSaldoLOL() {
	//prueba del saldo
		miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		assertNotNull(miCuenta);
		miCuenta.getCuenta();
		miCuenta.getName();
		miCuenta.getSaldo();
		assertEquals(miCuenta.getCuenta(),"ES08-3456-2343-2345-1234-1234");
		assertEquals(miCuenta.getName(),"Ana");
		assertEquals(miCuenta.getSaldo(),3200,0);
	}
	
	@Test
	//Ingreso positivo
	public void testIngresarLOL() {
		miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		//prueba del saldo
		miCuenta.getSaldo();
		miCuenta.ingresar(1000.05);
		assertEquals(miCuenta.getSaldo(),4200.05,0);
		}
	
	@Test
	//Ingreso negativo
	public void testIngresarNegativoLOL() {
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		//prueba del saldo
		miCuenta.getSaldo();
		miCuenta.ingresar(-1000.05);
	    assertEquals("Cantidad negativa\r\n", outContent.toString());
		}
	
	@Test
	public void testRetirarLOL() {
		//prueba del saldo
		miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		//prueba del saldo
		miCuenta.retirar(900.50);
		assertEquals(miCuenta.getSaldo(),2299.50,0);
		}

	@Test
	public void testRetirarMayorLOL() {
		 ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 System.setOut(new PrintStream(outContent));
		//prueba del saldo
		miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		//prueba del saldo
		miCuenta.retirar(3200.01);
		assertEquals("Saldo insuficiente\r\n", outContent.toString());
		}
	
	@Test 
	
	public void testCreacionLOL() {
		miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		assertNotNull(miCuenta);
	}

}