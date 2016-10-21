package pue.mtz.pau.appquimica.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pue.mtz.pau.appquimica.Adapters.TopicsAdapter;
import pue.mtz.pau.appquimica.Interfaces.Presenters.TopicsPresenter;
import pue.mtz.pau.appquimica.Interfaces.Views.TopicsView;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.Presenters.TopicsPresenterImpl;
import pue.mtz.pau.appquimica.R;

public class TopicsImpl extends AppCompatActivity implements TopicsView{

    @BindView(R.id.progress)
    ProgressBar progressBar;
    @BindView(R.id.RecyclerView)
    RecyclerView recyclerView;

    private TopicsAdapter adapter;
    private TopicsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        ButterKnife.bind(this);

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
