package one.digitalinovation.web;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TrabalhandoComDatas {

	public static void main(String[] args) {

//		long timeMillis = System.currentTimeMillis();
//		Instant instate = new Instant
//		System.out.println(timeMillis);
//		Date data = new Date();
//		System.out.println(data);
//		data.from(null)
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario.getTime());
		calendario.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println(calendario.getTime());
		if(Calendar.DAY_OF_WEEK == 7) {
			calendario.add(Calendar.DAY_OF_WEEK, 2);
			System.out.println("sua data de pagamento foi adiada para: " + calendario.getTime());

		}if (Calendar.DAY_OF_WEEK == 0){
			calendario.add(Calendar.DAY_OF_WEEK, 1);
			System.out.println("sua data de pagamento foi adiada para: " + calendario.getTime());

		}

		
		
	}

}
