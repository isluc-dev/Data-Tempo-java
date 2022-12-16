package projetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		
		
			System.out.println( "Calendar em milisegundos : "+calendar.getTimeInMillis());
		System.out.println("dia do mes : " + calendar.get(Calendar.DATE));
		System.out.println("Calendar dia da semana : " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(" Calendar hooras doo dia : " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(" Calendar minutos : "+calendar.get(Calendar.MINUTE));
		System.out.println("Calendar segundos : "+calendar.get(Calendar.SECOND));
		System.out.println(" Calendar ano : "+calendar.get(Calendar.YEAR));
		
		
		
	/*	System.out.println( "Data em milisegundos : "+date.getTime());
		System.out.println("dia do mes : " + date.getDate());
		System.out.println("dia da semana : " + date.getDay());
		System.out.println("hooras doo dia : " + date.getHours());
		System.out.println("minutos : "+date.getMinutes());
		System.out.println("segundos : "+date.getSeconds());
		System.out.println("ano : "+(date.getYear() + 1900));*/
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Data Atual Padão e String "+ simpleDateFormat.format(date));
		System.out.println(" 2 Data Atual Padão e String "+ simpleDateFormat.format(calendar.getTime()));
		System.out.println(" Calendar Data Atual Padão e String "+ simpleDateFormat.format(calendar.getInstance().getTime()));
		System.out.println(simpleDateFormat.parse("16/02/1994"));

	}

}
