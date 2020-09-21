package com.tlFrameWork.controller;

import com.tlFrameWork.model.SysMenu;
import com.tlFrameWork.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/MenuRestController")
public class MenuRestController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/initMenu")
    public List initMenu() {
        List<SysMenu> MenuList=menuService.initMenu();
        return MenuList;
    }
}
