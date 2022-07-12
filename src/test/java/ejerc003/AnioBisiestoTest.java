package ejerc003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnioBisiestoTest {

	private AnioBisiesto anio=new AnioBisiesto();
	
	@BeforeEach
	void setUp() throws Exception {
		

		System.out.println(this.anio.anioBisisesto().toString());
		System.out.println(this.anio.anioBisisesto().size() + " años son bisiestos en los proximos 20 años");
		
	}

	@Test
	void anioBisisesto() {
		
	}

}


