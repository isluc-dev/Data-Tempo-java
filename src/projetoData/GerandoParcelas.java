package projetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {
	
	public static void main(String[] args) throws ParseException {
		
	//	Date date = new Date();
		
		
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("15/12/2022");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(calendar.MONDAY, 1);
			
			System.out.println("parcela de numero:   " +parcela+ "  vencimento em :  " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()) );
		}
	}

}
