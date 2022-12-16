package projetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ComparandoData3 {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		Calendar calendar = Calendar.getInstance();
		
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("02/12/2022");
		
		 long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-12-02"), LocalDate.now());// total de dias de uma ate a data atual 
		 System.out.println("possui  " + dias+ "  dias :entre a faixa de datas");
		
		
	}

}
