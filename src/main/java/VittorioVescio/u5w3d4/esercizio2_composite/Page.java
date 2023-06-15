package VittorioVescio.u5w3d4.esercizio2_composite;

import java.util.ArrayList;
import java.util.List;

class Page implements Book {
	private int pageNumber;

	public Page(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public int pagesCount() {
		return 1;
	}

	@Override
	public void print() {
	}

	@Override
	public List<Author> authorList() {
		return new ArrayList<>();
	}
}