package pue.mtz.pau.appquimica.Interactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pue.mtz.pau.appquimica.ExpandibleList.Recipe;
import pue.mtz.pau.appquimica.Interfaces.Interactors.TopicsInteractor;
import pue.mtz.pau.appquimica.Interfaces.Presenters.TopicsPresenter;
import pue.mtz.pau.appquimica.Models.ListTopic;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.Models.Topics;

/**
 * Created by david on 21/10/16.
 */

public class TopicsInteractorImpl implements TopicsInteractor {

    private TopicsPresenter presenter;

    public TopicsInteractorImpl(TopicsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void initRecycler() {

        Topic field1 = new Topic("calculo","calculo");
        Topic field2 = new Topic("aritmetica","aritmetica");
        Topic field3 = new Topic("fisica","fisica");
        Topic field4 = new Topic("calculo","calculo");
        Topic field5 = new Topic("aritmetica","aritmetica");
        Topic field6 = new Topic("fisica","fisica");
        Topic field7 = new Topic("calculo","calculo");
        Topic field8 = new Topic("aritmetica","aritmetica");
        Topic field9 = new Topic("fisica","fisica");

        Topics topics = new Topics();
        List<ListTopic> listTopics = new ArrayList<ListTopic>();

        for(int i = 0; i < 7;i++) {
            listTopics.add(new ListTopic("MATEMATICAS", Arrays.asList(field1, field2, field3, field4)));
            listTopics.add(new ListTopic("FISICA", Arrays.asList(field1, field2, field3, field4, field5)));
        }
        topics.setListTopics(listTopics);


        presenter.initRecycler(topics);
    }
}
