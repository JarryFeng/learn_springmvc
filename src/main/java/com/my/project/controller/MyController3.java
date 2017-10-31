package com.my.project.controller;

import com.my.project.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jarry on 2017/10/24.
 */
@Controller
public class MyController3 {

    @RequestMapping("/good2.action")
    public ModelAndView query(){
        List<Item> list = new ArrayList<Item>();
        Item item = new Item();
        item.setName("瓜子");
        item.setPrice(new BigDecimal(8));
        item.setProductDate(new Date());
        list.add(item);

        Item item2 = new Item();
        item2.setName("话梅");
        item2.setPrice(new BigDecimal(15));
        item2.setProductDate(new Date());
        list.add(item2);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items",list);
        modelAndView.setViewName("goods");

        return modelAndView;
    }

//    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
//        List<Item> list = new ArrayList<Item>();
//        Item item = new Item();
//        item.setName("瓜子");
//        item.setPrice(new BigDecimal(8));
//        item.setProductDate(new Date());
//        list.add(item);
//
//        Item item2 = new Item();
//        item2.setName("话梅");
//        item2.setPrice(new BigDecimal(15));
//        item2.setProductDate(new Date());
//        list.add(item2);
//
//        //httpServletRequest.setAttribute("items", list);
//        //httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(httpServletRequest, httpServletResponse);
//        httpServletResponse.sendRedirect("/WEB-INF/jsp/goods.jsp");
//        /*
//        httpServletResponse.setContentType("application/json;charset=utf-8");
//        httpServletResponse.setCharacterEncoding("utf-8");
//        httpServletResponse.getWriter().write("json字符串");
//        */
//
//    }

    /*public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        List<Item> list = new ArrayList<Item>();
        Item item = new Item();
        item.setName("瓜子");
        item.setPrice(new BigDecimal(8));
        item.setProductDate(new Date());
        list.add(item);

        Item item2 = new Item();
        item2.setName("话梅");
        item2.setPrice(new BigDecimal(15));
        item2.setProductDate(new Date());
        list.add(item2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items",list);
        modelAndView.setViewName("/WEB-INF/jsp/goods.jsp");

        return modelAndView;
    }*/
}
