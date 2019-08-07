/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.DaoImpl;

import com.ozonetel.calitereports.Dao.ReportDao;
import com.ozonetel.calitereports.model.Report;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharma
 */
@Repository("reportDAO")
@Transactional
public class ReportDaoImpl implements ReportDao{
@Autowired
SessionFactory sessionFactory;
    @Override
    public List<Report> getLogs() {
        return sessionFactory.getCurrentSession().createQuery("from CPLOGS").list();
    }

    @Override
    public List<Report> getLogsByCompanyId(Long id) {
        return sessionFactory.getCurrentSession().createQuery("from CPLOGS where companyId=:id").setParameter("id", id).list();
        
    }

    @Override
    public List<Report> getLogsByDate(Long id, String startDate, String endDate,String callStatus) {
        Session session=sessionFactory.openSession();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String eQuery="from CPLOGS where companyID=:id AND callStartTime>=:startDate AND dialEndTime<=:endDate";
        if(!callStatus.isEmpty()){
           eQuery=eQuery+" AND callStatus=:callStatus";
        }
        Query query=session.createQuery(eQuery);
        query.setParameter("id", id);
        try{
        query.setParameter("startDate", df.parse(startDate));
        query.setParameter("endDate",df.parse(endDate));
        }catch(Exception e){
            e.printStackTrace();
        }
         if(!callStatus.isEmpty()){
        query.setParameter("callStatus", callStatus);
         }
         System.out.println(eQuery);
        List<Report> reportList=query.list();
        return reportList;
        
    }
    
}
