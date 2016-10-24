package pue.mtz.pau.appquimica.ExpandibleList;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

import pue.mtz.pau.appquimica.Models.Ingredient;
import pue.mtz.pau.appquimica.Models.Topic;

/**
 * Created by david on 24/10/16.
 */

public class Recipe implements ParentListItem {

    // a recipe contains several ingredients
    private String mName;

    private List mIngredients;
    public Recipe(String name, List<Topic> ingredients) {
        mName = name;
        mIngredients = ingredients;
    }

    public String getName() {
        return mName;
    }


    @Override
    public List getChildItemList() {
        return mIngredients;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    public List getmIngredients() {
        return mIngredients;
    }

    public void setmIngredients(List mIngredients) {
        this.mIngredients = mIngredients;
    }
}