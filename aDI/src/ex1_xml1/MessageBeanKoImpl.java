package ex1_xml1;

public class MessageBeanKoImpl implements MessageBean{
	
	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl 생성자 호출");
		
	}
	
	public void sayHello(String name) {
	
		System.out.println(name +"님 안녕");
	}
}
