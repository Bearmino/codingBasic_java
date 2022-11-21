package ch12;

/*
 * this
 *   
 * 객체 자신(인스턴스 자신)을 가르킴
 * 생성자에서 또 다른 생성자를 호출시에 사용
 * 자신의 주소(참조값)을 반환함
 * 
 */

/*
 * 생성자에서 다른 생성자를 호출하는 this
 * 
 *  클래스에서 생성자가 여러 개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출
 *  생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로, this()statement이전에 statement를 쓸 수 없음
 * 
 */

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음",1);
	}
	
	public Person(String name, int age) {		
		this.name = name;
		this.age = age;		
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "Minsik";
		p.age = 30;
		
		Person p2 = new Person();
		p2.name = "Dongsuk";
		p2.age = 50;
		
		System.out.println(p);
		System.out.println(p2);
		
	}	
}
