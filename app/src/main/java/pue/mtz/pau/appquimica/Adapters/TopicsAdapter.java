package pue.mtz.pau.appquimica.Adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import java.util.List;
import pue.mtz.pau.appquimica.ExpandibleList.IngredientViewHolder;
import pue.mtz.pau.appquimica.ExpandibleList.Recipe;
import pue.mtz.pau.appquimica.ExpandibleList.RecipeViewHolder;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.R;

/**
 * Created by david on 24/10/16.
 */

public class TopicsAdapter extends ExpandableRecyclerAdapter<RecipeViewHolder, IngredientViewHolder> {

    private LayoutInflater mInflator;

    public TopicsAdapter(Context context, @NonNull List<? extends ParentListItem> parentItemList) {
        super(parentItemList);
        mInflator = LayoutInflater.from(context);
    }

    // onCreate ...
    @Override
    public RecipeViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View recipeView = mInflator.inflate(R.layout.recipe_view, parentViewGroup, false);
        return new RecipeViewHolder(recipeView);
    }

    @Override
    public IngredientViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View ingredientView = mInflator.inflate(R.layout.ingredient_view, childViewGroup, false);
        return new IngredientViewHolder(ingredientView);
    }

    // onBind ...
    @Override
    public void onBindParentViewHolder(RecipeViewHolder recipeViewHolder, int position, ParentListItem parentListItem) {
        Recipe recipe = (Recipe) parentListItem;

        recipeViewHolder.bind(recipe);



    }

    @Override
    public void onBindChildViewHolder(IngredientViewHolder ingredientViewHolder, int position, Object childListItem) {
        final Topic ingredient = (Topic) childListItem;
        ingredientViewHolder.bind(ingredient);

        ingredientViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(" ************ ",ingredient.getNameTopic());
            }
        });






    }
}
