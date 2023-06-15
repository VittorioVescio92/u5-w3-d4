package VittorioVescio.u5w3d4.esercizio1_adapter;

import java.time.LocalDate;

public class DataAdapter implements DataSource {
	private Info info;

	public DataAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		LocalDate dataDiNascita = info.getDataDiNascita();
		int annoCorrente = LocalDate.now().getYear();
		int annoDiNascita = dataDiNascita.getYear();
		return annoCorrente - annoDiNascita;
	}

}
