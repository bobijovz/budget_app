package com.creations.bobijovz.budget.Model;

import com.orm.SugarRecord;

/**
 * Created by bobijovz on 01/05/2016.
 */
public class BudgetData extends SugarRecord {
    private String monthly;
    private String first_half;
    private String second_half;

    public BudgetData(){

    }

    public BudgetData(String monthly, String first_half, String second_half){
        this.monthly = monthly;
        this.first_half = first_half;
        this.second_half = second_half;
    }


}
