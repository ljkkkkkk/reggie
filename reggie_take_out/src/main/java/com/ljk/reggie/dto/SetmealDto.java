package com.ljk.reggie.dto;

import com.ljk.reggie.entity.Setmeal;
import com.ljk.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
