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

class LectorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() throws FileNotFoundException, IOException {

		StringBuilder sb= new StringBuilder();
		
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						this.getClass().getResourceAsStream("./json.json"))
				)
	) {

			reader.lines().forEachOrdered(l -> sb.append(l));
			
		/**		if (reader.readLine()!= null) {
					System.out.println(reader.readLine());
				} else {
				}*/
	

			} catch (FileNotFoundException e) {
				
			// TODO Auto-generated catch block
				
			e.printStackTrace();
		}

		
		File temp=File.createTempFile("hola", ".xml");
		
		try(BufferedWriter bw=new BufferedWriter(new PrintWriter(temp))) {
		
			//bw.write(xml);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
		
	}

