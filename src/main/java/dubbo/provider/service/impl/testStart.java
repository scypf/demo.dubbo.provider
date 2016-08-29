package dubbo.provider.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStart {
	
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });  
        context.start();  
        
	    System.out.println("提供端开始提供服务！");
	    
	    
	    System.in.read(); //阻塞
    }  

}
