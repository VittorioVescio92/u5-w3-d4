package VittorioVescio.u5w3d4.esercizio3_chainOfResponsibility;

import java.util.List;

import lombok.Getter;

@Getter
public abstract class Ufficiale {
	private double salary;
	private String name;
	private Ufficiale superiore;

	public Ufficiale(double salary, String name, Ufficiale superiore) {
		super();
		this.salary = salary;
		this.name = name;
		this.superiore = superiore;
	}

	public void checkSalary(double value, List<Ufficiale> list) {
		if (value >= salary && superiore != null) {
			System.out.println(this.getName() + " percepisce almeno " + value);
		} else if (value >= salary) {
			System.out.println(this.getName() + " percepisce almeno " + value);
		} else {
			System.out.println("Nessun ufficiale percepisce almeno " + value);
		}
	}
}
