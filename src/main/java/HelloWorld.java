import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by adunston on 12/19/16.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorld {
    private Message message;
//    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("conf/hello-world-config.xml");

        HelloWorld hw = (HelloWorld) applicationContext.getBean("helloWorld");
//        HelloWorld hw = new HelloWorld();
        hw.speak();
    }

    public void speak() {
        System.out.println("Hello, world!");

        if (null != message) {
            System.out.println(message.getMessage());
        }
    }

    public void setMessage(Message value) {
        this.message = value;
    }
}
