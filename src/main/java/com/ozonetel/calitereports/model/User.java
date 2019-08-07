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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
import org.springframework.stereotype.Component;

/**
 *
 * @author sharma
 */
@Component   
@Table       
@Entity(name = "CPUSERS")
public class User {

    private static final long serialVersionUID = 3832626162173359411L;
    private Long id;
    private String username;
    private String password;
    private String confirmPassword;
    private String passwordHint;
    private boolean enabled;
    private boolean accountExpired;
    private boolean accountLocked;
    private boolean credentialsExpired;
    private Date createTime;
    private Date updateTime;
    private Date lastLoginTime;
   
    private Integer version;
    private String googleToken;
    private boolean recordDelete;
    private Date deleteTime;
    private String accessToken;
    private Long partnerID;
    private boolean partnerEnabled;
    private Long partnerPlanID;

    @Column(name = "PartnerPlanID")
    public Long getPartnerPlanID() {
        return partnerPlanID;
    }

    public void setPartnerPlanID(Long partnerPlanID) {
        this.partnerPlanID = partnerPlanID;
    }

    @Column(name = "PartnerEnabled", nullable = false, length = 1)
    public boolean isPartnerEnabled() {
        return partnerEnabled;
    }

    public void setPartnerEnabled(boolean partnerEnabled) {
        this.partnerEnabled = partnerEnabled;
    }

    @Column(name = "PartnerID")
    public Long getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Long partnerID) {
        this.partnerID = partnerID;
    }
    

   
    /**
     * default constructor
     */
    public User() {
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(String username, String password, String passwordHint,
            boolean enabled, boolean accountExpired, boolean accountLocked,
            boolean credentialsExpired, Date createTime, Date updateTime,
            Date lastLoginTime,boolean partnerEnabled) {
        this.username = username;
        this.password = password;
        this.passwordHint = passwordHint;
        this.enabled = enabled;
        this.accountExpired = accountExpired;
        this.accountLocked = accountLocked;
        this.credentialsExpired = credentialsExpired;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastLoginTime = lastLoginTime;
        this.partnerEnabled=partnerEnabled;
    }

   
    @Column(name = "GoogleToken")
    public String getGoogleToken() {
        return googleToken;
    }

    public void setGoogleToken(String googleToken) {
        this.googleToken = googleToken;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "LoginID", nullable = false, length = 50, unique = true, updatable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "Password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Column(name = "PasswordHint", length = 50)
    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    @Column(name = "Status", nullable = false, length = 1)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Column(name = "AccountExpired", nullable = false, length = 1)
    public boolean isAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(boolean accountExpired) {
        this.accountExpired = accountExpired;
    }

    /**
     * @see
     * org.springframework.security.userdetails.UserDetails#isAccountNonExpired()
     */
    @Transient
    public boolean isAccountNonExpired() {
        return !isAccountExpired();
    }

    @Column(name = "AccountLocked", nullable = false, length = 1)
    public boolean isAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    /**
     * @see
     * org.springframework.security.userdetails.UserDetails#isAccountNonLocked()
     */
    @Transient
    public boolean isAccountNonLocked() {
        return !isAccountLocked();
    }

    @Column(name = "CredentialsExpired", nullable = false, length = 1)
    public boolean isCredentialsExpired() {
        return credentialsExpired;
    }

    public void setCredentialsExpired(boolean credentialsExpired) {
        this.credentialsExpired = credentialsExpired;
    }

    /**
     * @see
     * org.springframework.security.userdetails.UserDetails#isCredentialsNonExpired()
     */
    @Transient
    public boolean isCredentialsNonExpired() {
        return !credentialsExpired;
    }

    @Column(name = "CreateDateTime", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "UpdateDateTime", nullable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "LastLoginTime", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    
   
    @Version
    @Column(name = "Version", nullable = false)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Column(name = "Deleted")
    public boolean isRecordDelete() {
        return recordDelete;
    }

    public void setRecordDelete(boolean recordDelete) {
        this.recordDelete = recordDelete;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DeleteDateTime", insertable = false)
    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * @see
     * org.springframework.security.userdetails.UserDetails#getAuthorities()
     * @return GrantedAuthority[] an array of roles.
     */
    


    
}
