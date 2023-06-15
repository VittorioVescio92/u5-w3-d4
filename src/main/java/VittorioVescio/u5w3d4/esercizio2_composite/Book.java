package VittorioVescio.u5w3d4.esercizio2_composite;

import java.util.List;

public interface Book {
	public int pagesCount();

	public void print();

	public List<Author> authorList();
}