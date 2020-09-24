package com.xf.service.impl;

import com.xf.bean.Book;
import com.xf.dao.BookDao;
import com.xf.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: Demo0921
 * @description:
 * @author: wxf
 * @create: 2020-09-24 09:02
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;
    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
