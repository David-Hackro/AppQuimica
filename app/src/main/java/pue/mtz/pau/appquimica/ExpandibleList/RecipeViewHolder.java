package pue.mtz.pau.appquimica.ExpandibleList;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import pue.mtz.pau.appquimica.R;

/**
 * Created by david on 24/10/16.
 */


public class RecipeViewHolder extends ParentViewHolder {

    private TextView mRecipeTextView;

    public RecipeViewHolder(View itemView) {
        super(itemView);
        mRecipeTextView = (TextView) itemView.findViewById(R.id.recipe_textview);
    }

    public void bind(Recipe recipe) {
        mRecipeTextView.setText(recipe.getName());
    }
}
