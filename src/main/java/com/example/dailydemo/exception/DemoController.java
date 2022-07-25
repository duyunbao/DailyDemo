package com.example.dailydemo.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
@Controller
public class DemoController {


    @RequestMapping("/test/getName")
    @ResponseBody
    public ApiResult<String> getName() {
        AssertUtil.businessInvalid(true, "hello world exception test");
        return ApiResult.success("hello world");
    }

}
