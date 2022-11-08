package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//[1] 스프링 설정 파일 연결
				ApplicationContext context = new ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
		
		/*인함수에서 스프링 컨테이너를 구동하여
      	applicationContext.xml 의 <context> 태그에서 지정한 폴더를 스캔한다. 
      	@Component 애노테이션을 찾이 빈을 생성하고 @Autowired 애노테이션을 이용하여 필요한 객체와 연결시킨다.
      	결과적으로 MemberBean.java의 기본생성자 함수에서 각 변수의 값이 지정되고,
      	값을 가진 MemberBean 객체가 @Autowired 애노테이션을 통해 MemberDao 객체의 멤버변수 값으로 지정된다. 
      	insert( ) 메소드를 수행하면 멤버변수 member에 지정된 값을 사용하여 화면에 출력하게 된다.*/		
			MemberDAO dao = context.getBean("dao", MemberDAO.class);
								//MemberDAO -> memberDAO
			dao.insert();
				

	}

}
