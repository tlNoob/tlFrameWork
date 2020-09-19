package com.tlFrameWork.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private String Id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String link;
    @Column
    private String parentId;
    @Column
    private String remark;
    @Column
    private String sort;
    @Column
    private String isPage;

    @Transient
    private List<SysMenu> childMenu;

    public SysMenu() {
    }

    public SysMenu(String name, String link, String parentId, String remark, String sort, String isPage) {
        this.name = name;
        this.link = link;
        this.parentId = parentId;
        this.remark = remark;
        this.sort = sort;
        this.isPage = isPage;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<SysMenu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<SysMenu> childMenu) {
        this.childMenu = childMenu;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getIsPage() {
        return isPage;
    }

    public void setIsPage(String isPage) {
        this.isPage = isPage;
    }
}
