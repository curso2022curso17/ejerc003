package ejerc003;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AnioBisiesto {

	
	public List<Integer> anioBisisesto() {

		int fecha = Calendar.getInstance().get(Calendar.YEAR);
		List<Integer> aux = new ArrayList<>();
		for (int i = 0; i < 20; i++) {

			if (((fecha % 4 == 0) && (fecha % 100 != 0)) || (fecha % 400 == 0)) {
				aux.add(fecha);
			}
			fecha++;
		}
		return aux;
		//System.out.println(aux.toString());
	}
	
}
