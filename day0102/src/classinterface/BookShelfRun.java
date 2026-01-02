package classinterface;

public class BookShelfRun {

	public static void main(String[] args) {
		
		BookShelf bs = new BookShelf();
		bs.shelf();
		bs.queue();
		
		Shelf sf = new BookShelf();
		sf.shelf();
		
		Queue qu = new BookShelf();
		qu.queue();
	}
}
