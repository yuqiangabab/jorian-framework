package cn.jorian.jorianframework.core.account.service;


import cn.jorian.jorianframework.core.account.dto.LoginDTO;
import cn.jorian.jorianframework.core.system.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Auther: jorian
 * @Date: 2019/4/18 14:06
 * @Description:
 */
public interface AccountService extends IService<SysUser> {
    void login(LoginDTO loginDTO);

    SysUser getCurrentUser();
}