package pue.mtz.pau.appquimica.Views;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pue.mtz.pau.appquimica.Adapters.TopicsAdapter;
import pue.mtz.pau.appquimica.Models.Ingredient;
import pue.mtz.pau.appquimica.ExpandibleList.Recipe;
import pue.mtz.pau.appquimica.Interfaces.Views.TopicsView;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.R;

public class TopicsImpl extends AppCompatActivity implements TopicsView{

    /*@BindView(R.id.progress)
    ProgressBar progressBar;
    @BindView(R.id.RecyclerView)
    RecyclerView recyclerView;

    private TopicsAdapter adapter;
    private TopicsPresenter presenter;
*/
    @BindView(R.id.RecyclerView)
    public RecyclerView mRecyclerView;
    private TopicsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        ButterKnife.bind(this);
  /*      ButterKnife.bind(this);

        presenter = new TopicsPresenterImpl(this);

        recyclerView.setHasFixedSize(true);
        //recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        adapter = new TopicsAdapter(R.layout.card_topic);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this.getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        presenter.loadListPerson();

    }

    @Override
    public void initRecycler(List<Topic> topics) {
        adapter.setListTopics(topics);

    }

}
*/
        //String name, String icon, String description
        Topic field1 = new Topic("calculo","","");
        Topic field2 = new Topic("aritmetica","","");
        Topic field3 = new Topic("fisica","","");
        Topic field4 = new Topic("calculo","","");
        Topic field5 = new Topic("aritmetica","","");
        Topic field6 = new Topic("fisica","","");
        Topic field7 = new Topic("calculo","","");
        Topic field8 = new Topic("aritmetica","","");
        Topic field9 = new Topic("fisica","","");


        Recipe taco = new Recipe("MATEMATICAS", Arrays.asList(field1,field2,field3,field4));
        Recipe quesadilla = new Recipe("FISICA",Arrays.asList(field1,field2,field3,field4,field5));


        final List<Recipe> recipes = Arrays.asList(taco, quesadilla);

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
    public void initRecycler(List<Topic> persons) {

    }
}
