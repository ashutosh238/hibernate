/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.ozonetel.calitereports.Dao.ReportDao;
import com.ozonetel.calitereports.model.Report;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author sharma
 */
public class ReportTest {
    
    
   static ReportDao reportDao;
    @BeforeClass
	public static void preExecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ozonetel");
		context.refresh();
		
		reportDao=(ReportDao)context.getBean("reportDAO");
	}
     
        public void getReport(){
            int size=reportDao.getLogs().size();
            Assert.assertEquals(359118, size);
        }
           @Test
        public  void getlogList(){
            String callStatus;
            callStatus="answered";
            Date d=new Date();
               SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
              String s= sf.format(d)+" 00:00:00";
              String e=sf.format(d)+" 23:59:59";
            List<Report> reportlogs=reportDao.getLogsByDate(new Long(1),s,e,callStatus);
               System.out.println("Size of List is :::::::"+reportlogs.size());
               
        }
    
}
