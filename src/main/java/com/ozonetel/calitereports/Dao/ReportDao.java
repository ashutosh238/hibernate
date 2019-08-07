/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.Dao;

import com.ozonetel.calitereports.model.Report;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sharma
 */
public interface ReportDao {
    public List<Report> getLogs();
    public List<Report> getLogsByCompanyId(Long id);
    public List<Report> getLogsByDate(Long id,String startDate,String endDate,String callStatus);
}
