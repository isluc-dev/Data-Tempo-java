package projetoData;

import java.time.Duration;
import java.time.Instant;

public class TempoComInstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("duração por nano segundos : " + duracao.toNanos());
		System.out.println("duração por minutos : " + duracao.toMinutes());
		System.out.println("duração por Horas : " + duracao.toHours());
		System.out.println("duração por Dias : " + duracao.toDays());
	}

}
