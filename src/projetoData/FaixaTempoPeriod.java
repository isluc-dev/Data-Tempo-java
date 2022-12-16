package projetoData;

import java.time.LocalDate;
import java.time.Period;

public class FaixaTempoPeriod {
	
 public static void main(String[] args) {
	LocalDate dataAntiga = LocalDate.of(2022, 8, 15);
	//LocalDate dataAntiga1 = LocalDate.parse("2022/08/15");
	
	LocalDate dataNova = LocalDate.of(2023, 12, 25);
	//LocalDate dataNova1 = LocalDate.parse("2023/12/15");
	
	System.out.println("data Antiga e e maior que data nova : " + dataAntiga.isAfter(dataNova));
	System.out.println("data Antiga e e anterior a nova  : " + dataAntiga.isBefore(dataNova));
	System.out.println("as datas sao iguais ? : " + dataAntiga.isEqual(dataNova));
	
	Period periodo = Period.between(dataAntiga, dataNova);
	System.out.println("quantos dias : " + periodo.getDays());
	System.out.println("quantos meses : " + periodo.getMonths());
	System.out.println(" so  meses : " + periodo.toTotalMonths());
	System.out.println("quantos anos : " + periodo.getYears());
	System.out.println("Periodo : " + periodo.getYears()+" ano  " + periodo.getMonths()+ " meses   " + periodo.getDays()+" dias");
}

}
