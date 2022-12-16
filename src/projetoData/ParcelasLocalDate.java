package projetoData;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ParcelasLocalDate {
	
 public static void main(String[] args) {
	LocalDate dataBase = LocalDate.of(2022, 8, 15);
	
	System.out.println("mais 5 dias : " +(dataBase = dataBase.plusDays(5)));// carrega uma nova data atual quando coloca = as varioaveis 
	System.out.println("mais 5 semanas  : " +(dataBase = dataBase.plusWeeks(5)));
	System.out.println("mais 5 Anos : " + (dataBase =  dataBase.plusYears(5)));
	System.out.println("mais 2 meses  : " +(dataBase = dataBase.plusDays(2)));
	System.out.println("menos 1  Ano : " + (dataBase =  dataBase.minusYears(1)));
	System.out.println("menos 1 mes  : " + (dataBase =  dataBase.minusMonths(1)));
	System.out.println("menos 20 dias  : " + (dataBase =  dataBase.minusDays(20)));
	
	
	for( int mes  = 1; mes <= 12; mes++) {
		
		dataBase = dataBase.plusMonths(mes);
		
		System.out.println("Data de vencimneto do boleto : " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ " do mes :" + mes);
		
	}
	
	
	
	
	
	
}

}
