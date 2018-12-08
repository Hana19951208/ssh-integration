import com.offcn.crm.bean.Student;
import com.offcn.crm.dao.StudentDao;
import com.offcn.crm.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Hana
 * @create 2018/12/7-16:24
 */
public class SshTest {



    private ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test() throws SQLException {
       /* List<Student> list = studentService.getList();
        System.out.println(list);*/
//       studentDao.save();
        StudentService bean = ioc.getBean(StudentService.class);
        List<Student> list = bean.getList();
        System.out.println(list);
        System.out.println(bean);
        /*DataSource bean = ioc.getBean(DataSource.class);
        System.out.println(bean);*/
    }
}
