package com.ljk.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljk.reggie.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
