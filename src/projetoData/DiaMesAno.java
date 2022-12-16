package projetoData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesAno {
	public static void main(String[] args) {
		
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data Ataual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("dia da semana "+localDate.getDayOfWeek().name());
		System.out.println(" Dia do Ano : " + localDate.getDayOfYear());
		System.out.println("Dia Do Mes : " + localDate.getDayOfMonth());
		System.out.println("mes : " +localDate.getMonth());
		System.out.println("numero do mes  : " +localDate.getMonthValue());
		System.out.println("Amo : "+ localDate.getYear());
	}

}
