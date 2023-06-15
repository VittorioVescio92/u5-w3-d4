package VittorioVescio.u5w3d4.esercizio2_composite;

import java.util.ArrayList;
import java.util.List;

class Section implements Book {
	private List<Book> pages;

	public Section(List<Book> pages) {
		this.pages = pages;
	}

	@Override
	public int pagesCount() {
		int totalPageCount = 0;
		for (Book page : pages) {
			totalPageCount += page.pagesCount();
		}
		return totalPageCount;
	}

	@Override
	public void print() {
		for (Book page : pages) {
			page.print();
		}
	}

	@Override
	public List<Author> authorList() {
		List<Author> authors = new ArrayList<>();
		for (Book page : pages) {
			authors.addAll(page.authorList());
		}
		return authors;
	}
}
