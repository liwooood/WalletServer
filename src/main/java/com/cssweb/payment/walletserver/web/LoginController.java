package com.cssweb.payment.walletserver.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chenhf on 2014/7/4.
 */
@Controller
public class LoginController {

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public void login(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("test");
        response.flushBuffer();
    }
}
