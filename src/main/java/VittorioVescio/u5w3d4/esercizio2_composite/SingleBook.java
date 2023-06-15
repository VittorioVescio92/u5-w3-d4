package VittorioVescio.u5w3d4.esercizio2_composite;

import java.util.List;

public class SingleBook implements Book {
	private List<Section> sections;
	private List<Author> authors;
	private double price;

	public SingleBook(List<Section> sections, List<Author> authors, double price) {
		this.sections = sections;
		this.authors = authors;
		this.price = price;
	}

	@Override
	public int pagesCount() {
		int totalPageCount = 0;
		for (Section section : sections) {
			totalPageCount += section.pagesCount();
		}
		return totalPageCount;
	}

	@Override
	public void print() {
		for (Section section : sections) {
			section.print();
		}
	}

	@Override
	public List<Author> authorList() {
		return authors;
	}
}