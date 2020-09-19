package com.tlFrameWork.repository;

import com.tlFrameWork.model.SysMenu;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysMenuRepository extends JpaRepository<SysMenu,Long> {
    List<SysMenu> findAll(Sort sort);
}
