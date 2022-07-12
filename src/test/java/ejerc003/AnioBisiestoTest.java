package ejerc003;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnioBisiestoTest {

	private AnioBisiesto anio=new AnioBisiesto();
	
	@BeforeEach
	void setUp() throws Exception {
		

		
	}

	@Test
	void variosTest() {
		
		Object v1="";
		
		Object v2=new String("");
		
		Object v3="";
		
		v1.equals(v1);
		assertTrue( v1 == v1);
	}
	
	@Test
	void anioBisisesto() {

		System.out.println(this.anio.anioBisisesto().toString());
		System.out.println(this.anio.anioBisisesto().size() + " años son bisiestos en los proximos 20 años");
		
	}

}


