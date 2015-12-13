package com.apress.prospring4.ch4.highschool;

import com.apress.prospring4.ch4.Food;
import com.apress.prospring4.ch4.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 17:30
 * Declaration: All Rights Reserved !!!
 */
public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));

        return lunchSet;
    }
}
