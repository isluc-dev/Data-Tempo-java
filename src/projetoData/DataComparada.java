package projetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataComparada {
	
	
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("15-12-2022"));
		
		
		//somando um dia da semana 
		calendar.add(calendar.DAY_OF_MONTH, 5);
		
		
		System.out.println( " somando 5 dia da semana "+ new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
        calendar.add(calendar.DAY_OF_MONTH, -5);
		
		
		System.out.println( "subitraindo 5 dias da semana "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		//soando 1 mes 
          calendar.add(calendar.MONTH, 1);
		
		
		System.out.println("soamando 1 mes "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		
	}
	
	
	
	
	
	

}
