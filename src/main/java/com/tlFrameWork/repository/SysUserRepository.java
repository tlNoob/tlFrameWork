package com.tlFrameWork.repository;

import com.tlFrameWork.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SysUserRepository extends JpaRepository<SysUser,Long> {
        List<SysUser> findAll();
        SysUser findByUserIdAndPassWord(String userId,String passWord);
}
