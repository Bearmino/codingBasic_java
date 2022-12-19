package ch21;

// 깊은 복사
// 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
			
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		copyLibrary[0]= new Book();
		copyLibrary[1]= new Book();
		copyLibrary[2]= new Book();
		copyLibrary[3]= new Book();
		copyLibrary[4]= new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
			
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		System.out.println("=======library=======");
			for(Book book : library) {
				book.showBookInfo();
			}
			
		System.out.println("======Copy library======");
			for(Book book : copyLibrary) {
				book.showBookInfo();
			}
			
	}

}
