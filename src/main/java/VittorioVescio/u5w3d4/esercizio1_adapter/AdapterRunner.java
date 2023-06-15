package VittorioVescio.u5w3d4.esercizio1_adapter;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Info info = new Info();
		info.setNome("Ajeje");
		info.setCognome("Brazorf");
		info.setDataDiNascita(LocalDate.of(1992, 4, 15));

		DataAdapter adapter = new DataAdapter(info);

		UserData userData = new UserData();
		userData.getData(adapter);
		System.out.println();
		System.out.println("------------ Esercizio 1 -------------");
		System.out.println();
		System.out.println("Nome completo: " + userData.getNomeCompleto());
		System.out.println();
		System.out.println("Età: " + userData.getEta());
	}

}
