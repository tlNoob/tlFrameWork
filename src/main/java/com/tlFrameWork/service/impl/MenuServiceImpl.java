package com.tlFrameWork.service.impl;

import com.tlFrameWork.model.SysMenu;
import com.tlFrameWork.repository.SysMenuRepository;
import com.tlFrameWork.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private SysMenuRepository sysMenuRepository;
    @Override
    public List<SysMenu> initMenu() {
        Sort sort=Sort.by(Sort.Direction.ASC,"sort");
        List<SysMenu> allMenu=sysMenuRepository.findAll(sort);
        List<SysMenu> menuList=new ArrayList<SysMenu>();
        for(SysMenu tlMenuInfo:allMenu){
            if("#".equals(tlMenuInfo.getParentId())){
                menuList.add(tlMenuInfo);
            }
        }

        for(SysMenu tlMenuInfo:menuList){
            tlMenuInfo.setChildMenu(getChildMenu(tlMenuInfo.getId(),allMenu));
        }
        return menuList;
    }

    private List<SysMenu> getChildMenu(String id, List<SysMenu> allMenu) {
        List<SysMenu> childMenu = new ArrayList<SysMenu>();
        for (SysMenu tlMenuInfo : allMenu) {
            if (id.equals(tlMenuInfo.getParentId())) {
                childMenu.add(tlMenuInfo);
            }
        }
        if (childMenu.size() == 0) {
            return null;
        }
        for (SysMenu tlMenuInfo : childMenu) {
            tlMenuInfo.setChildMenu(getChildMenu(tlMenuInfo.getId(), allMenu));
        }
        return childMenu;
    }
}
