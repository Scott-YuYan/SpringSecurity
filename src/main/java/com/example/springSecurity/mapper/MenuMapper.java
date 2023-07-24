package com.example.springSecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springSecurity.model.Menu;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long id);

}
