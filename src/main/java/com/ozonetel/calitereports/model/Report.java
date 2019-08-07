/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.stereotype.Component;

/**
 *
 * @author sharma
 */
@Component
@Table
@Entity(name="CPLOGS")
public class Report {
     private Long id;
    private Long callId;
    private String ucid;
    private String callerId;
    private String calledNumber;
    private Date callStartTime;
    private Date dialStartTime;
    private Date dialEndTime;
    private String disconnectType;
    private String callStatus;
    private Long callDuration;
    private String recordingUrl;
    private String callType;
    private String dialedNumber;
    private String departmentName;
    private String employeeName;
    private Long groupCount;
    private Long callCounter;
    private Long totalCallDuration;
    private String callerLocation;
    private String callDurationMin;
    private Long ivrTotalDuration;
    private String dialCategory;
    private String dialNumberType;
    private Long companyId;

    @Column(name = "CompanyID")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Report() {
    }

    public Report(String callerId, String calledNumber, String disconnectType,
            Long callDuration, String callType, String dialedNumber) {
        this.callerId = callerId;
        this.calledNumber = calledNumber;
        this.disconnectType = disconnectType;
        this.callDuration = callDuration;
        this.callType = callType;
        this.dialedNumber = dialedNumber;
    }

    public Report(Long id, Long callId, String ucid, String callerId,
            String calledNumber, Date callStartTime, Date dialStartTime,
            Date dialEndTime, String disconnectType, String callStatus,
            Long callDuration, String recordingUrl, String callType,
            String dialedNumber, String departmentName, String employeeName,
            Long groupCount, Long callCounter) {
        this.id = id;
        this.callId = callId;
        this.ucid = ucid;
        this.callerId = callerId;
        this.calledNumber = calledNumber;
        this.callStartTime = callStartTime;
        this.dialStartTime = dialStartTime;
        this.dialEndTime = dialEndTime;
        this.disconnectType = disconnectType;
        this.callStatus = callStatus;
        this.callDuration = callDuration;
        this.recordingUrl = recordingUrl;
        this.callType = callType;
        this.dialedNumber = dialedNumber;
        this.departmentName = departmentName;
        this.employeeName = employeeName;
        this.groupCount = groupCount;
        this.callCounter = callCounter;
    }

    public Report(Long callId, String ucid, String callerId,
            String calledNumber, Date callStartTime, Date dialStartTime,
            Date dialEndTime, String disconnectType, String callStatus,
            Long callDuration, String recordingUrl, String callType,
            String dialedNumber, String departmentName, String employeeName) {
        this.callId = callId;
        this.ucid = ucid;
        this.callerId = callerId;
        this.calledNumber = calledNumber;
        this.callStartTime = callStartTime;
        this.dialStartTime = dialStartTime;
        this.dialEndTime = dialEndTime;
        this.disconnectType = disconnectType;
        this.callStatus = callStatus;
        this.callDuration = callDuration;
        this.recordingUrl = recordingUrl;
        this.callType = callType;
        this.dialedNumber = dialedNumber;
        this.departmentName = departmentName;
        this.employeeName = employeeName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SeqID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CallID")
    public Long getCallId() {
        return callId;
    }

    public void setCallId(Long callId) {
        this.callId = callId;
    }

    @Column(name = "UCID", length = 30)
    public String getUcid() {
        return ucid;
    }

    public void setUcid(String ucid) {
        this.ucid = ucid;
    }

    @Column(name = "CallerID", length = 16)
    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    /**
     * TODO treated as india numbers
     */
    
    @Column(name = "CalledNo", length = 16)
    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }

    /**
     * TODO treated as india numbers
     */
   

    @Column(name = "CallStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCallStartTime() {
        return callStartTime;
    }

    public void setCallStartTime(Date callStartTime) {
        this.callStartTime = callStartTime;
    }

    @Column(name = "DialStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDialStartTime() {
        return dialStartTime;
    }

    public void setDialStartTime(Date dialStartTime) {
        this.dialStartTime = dialStartTime;
    }

    @Column(name = "DialEndTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDialEndTime() {
        return dialEndTime;
    }

    public void setDialEndTime(Date dialEndTime) {
        this.dialEndTime = dialEndTime;
    }

    @Column(name = "DisconnectType", length = 20)
    public String getDisconnectType() {
        return disconnectType;
    }

    public void setDisconnectType(String disconnectType) {
        this.disconnectType = disconnectType;
    }

    @Column(name = "CallStatus", length = 20)
    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

   

    @Column(name = "CallDuration")
    public Long getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
    }

    @Column(name = "RecordingURL")
    public String getRecordingUrl() {
        return recordingUrl;
    }

    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    @Column(name = "CallType")
    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    @Column(name = "DialedNumber")
    public String getDialedNumber() {
        return dialedNumber;
    }

    public void setDialedNumber(String dialedNumber) {
        this.dialedNumber = dialedNumber;
    }

    /**
     * TODO treated as india numbers
     */
    @Column(name = "Department")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Column(name = "Extn")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

//    @ManyToOne(targetEntity = Contact.class, fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//    @JoinColumns({
//        @JoinColumn(name = "ExtnID", referencedColumnName = "ExtnID", insertable = false, updatable = false),
//        @JoinColumn(name = "CallerID", referencedColumnName = "PhoneNumber", insertable = false, updatable = false)
//    })
@Transient
    public Long getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
    }

    @Column(name = "MessageCounter", insertable = false, updatable = false)
    public Long getCallCounter() {
        return callCounter;
    }

    public void setCallCounter(Long callCounter) {
        this.callCounter = callCounter;
    }

    @Transient
    public Long getTotalCallDuration() {
        return totalCallDuration;
    }

    public void setTotalCallDuration(Long totalCallDuration) {
        this.totalCallDuration = totalCallDuration;
    }

    @Column(name = "CallerLocation", insertable = false, updatable = false)
    public String getCallerLocation() {
        return callerLocation;
    }

    public void setCallerLocation(String callerLocation) {
        this.callerLocation = callerLocation;
    }

    @Transient
    public String getCallDurationMin() {
        return callDurationMin;
    }

    public void setCallDurationMin(String callDurationMin) {
        this.callDurationMin = callDurationMin;
    }

    @Column(name = "IVRTotalDuration")
    public Long getIvrTotalDuration() {
        return ivrTotalDuration;
    }

    public void setIvrTotalDuration(Long ivrTotalDuration) {
        this.ivrTotalDuration = ivrTotalDuration;
    }

    @Column(name = "DialCategory")
    public String getDialCategory() {
        return dialCategory;
    }

    public void setDialCategory(String dialCategory) {
        this.dialCategory = dialCategory;
    }

    @Column(name = "DialNumberType")
    public String getDialNumberType() {
        return dialNumberType;
    }

    public void setDialNumberType(String dialNumberType) {
        this.dialNumberType = dialNumberType;
    }
    
}
