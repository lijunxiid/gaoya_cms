package com.xxgc.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xxgc.entity.SysMenu;
import java.util.List;
/**
 * 菜单管理 服务类
 */
public interface ISysMenuService extends IService<SysMenu> {
    /**
     * 根据用户名获取对应菜单
     */
    List<SysMenu> findListByName(String username);
}