package com.apress.prospring4.ch4.kindergarten;

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
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }
}
