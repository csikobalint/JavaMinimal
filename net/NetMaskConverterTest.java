package net;
import org.junit.Test;
import static org.junit.Assert.*;

public class NetMaskConverterTest{

	@Test
	public void testSlash0(){
		System.out.println("test /0");
		NetMaskConverterI c = new NetMaskStringConverter("0.0.0.0");
		assertEquals(0, c.slashFormat());
	}


	@Test
	public void testSlash1(){
		System.out.println("test /1");
		NetMaskConverterI c = new NetMaskStringConverter("128.0.0.0");
		assertEquals(1, c.slashFormat());

	}

	@Test
	public void testSlash2(){
		System.out.println("test /2");
		NetMaskConverterI c = new NetMaskStringConverter("192.0.0.0");
		assertEquals(2, c.slashFormat());

	}

	@Test
	public void testSlash24(){
		System.out.println("test /24");
		NetMaskConverterI c = new NetMaskStringConverter("255.255.255.0");
		assertEquals(24, c.slashFormat());
	}

	@Test
	public void testSlash25(){
		System.out.println("test /25");
		NetMaskConverterI c = new NetMaskStringConverter("255.255.255.128");
		assertEquals(25, c.slashFormat());
	}


	@Test
	public void testSlash32(){
		System.out.println("test /32");
		NetMaskConverterI c = new NetMaskStringConverter("255.255.255.255");
		assertEquals(32, c.slashFormat());
	}
	@Test
	public void durationTest(){
		System.out.println("test duration");
		for (int i = 0; i < 10000; i++){
			NetMaskConverterI c = new NetMaskStringConverter("255.255.255.0");
			c.slashFormat();
		}
	}




}