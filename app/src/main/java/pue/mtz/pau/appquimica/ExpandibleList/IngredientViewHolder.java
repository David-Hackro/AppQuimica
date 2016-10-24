package pue.mtz.pau.appquimica.ExpandibleList;


import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import pue.mtz.pau.appquimica.Models.Ingredient;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.R;

/**
 * Created by david on 24/10/16.
 */


public class IngredientViewHolder extends ChildViewHolder {

    private TextView mIngredientTextView;

    public IngredientViewHolder(@NonNull View itemView) {
        super(itemView);
        mIngredientTextView = (TextView) itemView.findViewById(R.id.ingredient_textview);
    }

    public void bind(@NonNull Topic ingredient) {
        mIngredientTextView.setText(ingredient.getNameTopic());
    }
}