package VittorioVescio.u5w3d4.esercizio2_composite;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookRunner {
	public static void main(String[] args) {

		Author author1 = new Author("Giacomino");
		Author author2 = new Author("Aldo");
		Author author3 = new Author("Giovanni");

		Page page1 = new Page(1);
		Page page2 = new Page(2);
		Page page3 = new Page(3);

		List<Book> section1Pages = new ArrayList<>();
		section1Pages.add(page1);
		section1Pages.add(page2);
		Section section1 = new Section(section1Pages);

		List<Book> section2Pages = new ArrayList<>();
		section2Pages.add(page3);
		Section section2 = new Section(section2Pages);

		List<Section> bookSections = new ArrayList<>();
		bookSections.add(section1);
		bookSections.add(section2);

		List<Author> bookAuthors = new ArrayList<>();
		bookAuthors.add(author1);
		bookAuthors.add(author2);
		bookAuthors.add(author3);

		Book book = new SingleBook(bookSections, bookAuthors, 99.99);

		System.out.println("Pagine totali: " + book.pagesCount());
		System.out.println("Lista Autori: " + book.authorList());

		book.print();
	}
}