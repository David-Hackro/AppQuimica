package pue.mtz.pau.appquimica.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pue.mtz.pau.appquimica.Adapters.TopicsAdapter;
import pue.mtz.pau.appquimica.ExpandibleList.Recipe;
import pue.mtz.pau.appquimica.Interfaces.Presenters.TopicsPresenter;
import pue.mtz.pau.appquimica.Interfaces.Views.TopicsView;
import pue.mtz.pau.appquimica.Models.ListTopic;
import pue.mtz.pau.appquimica.Models.Topics;
import pue.mtz.pau.appquimica.Presenters.TopicsPresenterImpl;
import pue.mtz.pau.appquimica.R;

public class MainActivityImpl extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,TopicsView {




    public TopicsPresenter presenter;

    @BindView(R.id.RecyclerView)
    public RecyclerView mRecyclerView;

    private TopicsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ButterKnife.bind(this);

        presenter = new TopicsPresenterImpl(this);

        presenter.loadListPerson();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            startActivity(new Intent(MainActivityImpl.this,TopicsImpl.class));
        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(MainActivityImpl.this,TopicsImpl.class));
        } else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(MainActivityImpl.this,TopicsImpl.class));
        } else if (id == R.id.nav_manage) {
            startActivity(new Intent(MainActivityImpl.this,TopicsImpl.class));
        } else if (id == R.id.nav_share) {
            startActivity(new Intent(MainActivityImpl.this,TopicsImpl.class));
        } else if (id == R.id.nav_send) {
            startActivity(new Intent(MainActivityImpl.this,TopicsImpl.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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