package ex2_annotation;

import org.springframework.stereotype.Component;

@Component("dao")
public class MemberBean {
	private String name="홍길동";
	private int age=33;
	private String message="오늘도화이팅";
	
	//---------------------
	public void output() {
		System.out.println(name + "[" +age + "]" + message);
	}
/*
 * //constructor(기본생성자) public MemberBean() { System.out.println("기본생성자"); }
 * 
 * //constructor method public MemberBean(String name, int age, String message)
 * { super(); this.name = name; this.age = age; this.message = message;
 * System.out.println("임자있는 생성자"); }
 * 
 * //setter, getter public String getName() { return name; } 
 * public voidsetName(String name) { this.name = name; } 
 * public int getAge() { return age;} 
 * public void setAge(int age) { this.age = age; } 
 * public String getMessage(){ return message; } 
 * public void setMessage(String message) { this.message =message; }
 */
}