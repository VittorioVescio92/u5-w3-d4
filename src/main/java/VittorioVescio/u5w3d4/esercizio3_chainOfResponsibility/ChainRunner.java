package VittorioVescio.u5w3d4.esercizio3_chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
	@Autowired
	Ufficiale ufficiale;

	@Override
	public void run(String... args) throws Exception {

		List<Ufficiale> list = new ArrayList<>();

		Ufficiale generale = new Generale(5000, "Vomitino", null);
		Ufficiale colonnello = new Colonnello(4000, "Ajeje", generale);
		Ufficiale tenente = new Tenente(3000, "Giovanni", colonnello);
		Ufficiale maggiore = new Maggiore(2000, "Aldo", tenente);
		Ufficiale capitano = new Capitano(1000, "Giacomo", maggiore);

		list.add(generale);
		list.add(colonnello);
		list.add(tenente);
		list.add(maggiore);
		list.add(capitano);

		long value = 3500;
		ufficiale.checkSalary(value, list);

	}

}
