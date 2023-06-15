package VittorioVescio.u5w3d4.esercizio1_adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}
}