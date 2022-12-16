package projetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoData {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVemcimentoBoleto = simpleDateFormat.parse("25/12/2022");
		Date dataAtual = simpleDateFormat.parse("14/12/2022");
		// se a data 1 e maior que a data 2
		if(dataVemcimentoBoleto.after(dataAtual)) {// se e posterior a data a tual ou esta depois da data atual
			System.out.println("boleto não venceu !");
		}else {
			System.out.println("boleto vencido Urgente!");
		}
		
		
		
		
	}

}
