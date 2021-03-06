package pue.mtz.pau.appquimica.Views;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pue.mtz.pau.appquimica.Adapters.TopicsAdapter;
import pue.mtz.pau.appquimica.Interfaces.Presenters.TopicsPresenter;
import pue.mtz.pau.appquimica.Models.Ingredient;
import pue.mtz.pau.appquimica.ExpandibleList.Recipe;
import pue.mtz.pau.appquimica.Interfaces.Views.TopicsView;
import pue.mtz.pau.appquimica.Models.ListTopic;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.Models.Topics;
import pue.mtz.pau.appquimica.Presenters.TopicsPresenterImpl;
import pue.mtz.pau.appquimica.R;

public class TopicsImpl extends AppCompatActivity implements TopicsView{

    @BindView(R.id.progress)
    ProgressBar progressBar;


    public TopicsPresenter presenter;

    @BindView(R.id.RecyclerView)
    public RecyclerView mRecyclerView;

    private TopicsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        ButterKnife.bind(this);

        presenter = new TopicsPresenterImpl(this);

        presenter.loadListPerson();

    }


    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        adapter.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        adapter.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void initRecycler(Topics topicss) {
        List<Recipe> recipes = new ArrayList<Recipe>();

        for (ListTopic t : topicss.getListTopics())
        {
            recipes.add(new Recipe(t.getNameTopic(),t.getTopics()));
        }

/*
        Topic field1 = new Topic("calculo","calculo");
        Topic field2 = new Topic("aritmetica","aritmetica");
        Topic field3 = new Topic("fisica","fisica");
        Topic field4 = new Topic("calculo","calculo");
        Topic field5 = new Topic("aritmetica","aritmetica");
        Topic field6 = new Topic("fisica","fisica");
        Topic field7 = new Topic("calculo","calculo");
        Topic field8 = new Topic("aritmetica","aritmetica");
        Topic field9 = new Topic("fisica","fisica");


        Recipe taco = new Recipe("MATEMATICAS", Arrays.asList(field1,field2,field3,field4));
        Recipe quesadilla = new Recipe("FISICA",Arrays.asList(field1,field2,field3,field4,field5));


        final List<Recipe> recipes = Arrays.asList(taco, quesadilla);*/

        //mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);

        adapter = new TopicsAdapter(this, recipes);
        //mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*
        adapter.setExpandCollapseListener(new ExpandableRecyclerAdapter.ExpandCollapseListener() {
            @Override
            public void onListItemExpanded(int position) {
                Recipe expandedRecipe = recipes.get(position);

                Toast.makeText(MainActivity.this,expandedRecipe.getChildItemList().get(0).toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListItemCollapsed(int position) {
                Recipe collapsedRecipe = recipes.get(position);
                Toast.makeText(MainActivity.this,collapsedRecipe.getChildItemList().get(0).toString(),Toast.LENGTH_SHORT).show();
            }
        });
*/
        mRecyclerView.setAdapter(adapter);

    }
}
