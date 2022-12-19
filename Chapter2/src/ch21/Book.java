package ch21;

/*
 * 객체 배열
 *  기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당되지만, 객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈 
 *  메모리만 할당 되고 각 요소 객체는 생성하여 저장해야 함.
 */

public class Book {
	
	private String title;
	private String author;
	
	public Book(){}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(title+"이며 작가는 "+author+"입니다.");
	}
	
	
	
	
}
