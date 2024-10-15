package com.xxgc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxgc.entity.SysMenu;
import com.xxgc.mapper.SysMenuMapper;
import com.xxgc.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * 菜单管理 服务实现类
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    public List<SysMenu> findListByName(String username) {
        return sysMenuMapper.findByUserName(username);
    }
}