package projetoData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDataHora {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("data Ataul : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("hora Ataul : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:ss.s")));
		
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println("data Ataul e data atual  : " + dataHora);
		System.out.println("data Ataul e data atual  : " + dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss.s")));
	}

}
