package com.tlFrameWork.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue
   private Long id;
    @Column(nullable = false, unique = true)
   private String userId;
    @Column(nullable = false)
   private String passWord;
    @Column(nullable = false, unique = true)
   private String loginName;
    @Column(nullable = false)
   private String roleCode;

    public SysUser() {
    }

    public SysUser(String userId, String passWord, String loginName, String roleCode) {
        this.userId = userId;
        this.passWord = passWord;
        this.loginName = loginName;
        this.roleCode = roleCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
