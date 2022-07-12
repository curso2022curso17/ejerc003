package ejerc003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LectorTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() throws FileNotFoundException, IOException {
		
		File temp=File.createTempFile("hola", ".xml");
		
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(this.getClass().getResourceAsStream("./home/curso17/eclipse-workspace/proyecto001/ejerc003/src/test/resources/jsonviewer.json")));
				BufferedWriter bw=new BufferedWriter(new PrintWriter(temp))
						
				) {
	
			while (true) {
			
				if (reader.readLine()!= null) {
					System.out.println(reader.readLine());
				} else {

				}
			}

			} catch (FileNotFoundException e) {
				
			// TODO Auto-generated catch block
				
			e.printStackTrace();
		}
		
	}

}
