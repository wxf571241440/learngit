package com.xf.controller;

import com.xf.bean.Book;
import com.xf.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: Demo0921
 * @description:
 * @author: wxf
 * @create: 2020-09-24 09:04
 */
@Controller
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping("/getbook")
    public String getAll(ModelMap map){
        List<Book> books= bookService.getAll();
        System.out.println(books.size());
        map.addAttribute("books",books);
        return "success";
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
