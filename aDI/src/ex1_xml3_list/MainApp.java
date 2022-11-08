package ex1_xml3_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//[1] 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml3_list/applicationContext.xml");
		
		
		/*메인함수에서 Spring 컨테이너를 구동하여 id가 bean인 ListBean 타입의 객체 list를 만든다.
 		이 때, <property> 태그에서 intList라는 이름의 List<Integer>에 22,33,44 이라는 값을 지정한다. 
     	for 반복문에서는 객체 list에 들어있는 Integer 값을 하나씩 꺼내어 출력한다. */
		ListBean bean = (ListBean)context.getBean("bean");
		for(Integer i : bean.getIntList()) {
			System.out.println(i);
		}
		for(MemberBean mb : bean.getMemberList()) {
			mb.output();
		}

	}

}
