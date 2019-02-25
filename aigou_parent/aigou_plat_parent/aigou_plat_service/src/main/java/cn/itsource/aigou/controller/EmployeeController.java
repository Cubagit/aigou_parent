package cn.itsource.aigou.controller;


import cn.itsource.aigou.util.AjaxResult;
import cn.itsource.aigou.domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {

        if("xdd".equals(employee.getName())&&"xdd".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }

    }


}
