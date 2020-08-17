package com.company.Day22.dao;

import com.company.Day22.doMain.Food;

import java.util.List;

public interface FoodDao {
    public List<Food> findAll(Integer businessId);
    public Food getFoodById(Integer foodId);
    public int saveFood(Food food);
    public int updateFood(Food food);
    public int removeFood(Integer foodId);
}
