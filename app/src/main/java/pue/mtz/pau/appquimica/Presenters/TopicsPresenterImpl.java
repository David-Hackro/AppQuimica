package pue.mtz.pau.appquimica.Presenters;

import java.util.List;

import pue.mtz.pau.appquimica.Interactors.TopicsInteractorImpl;
import pue.mtz.pau.appquimica.Interfaces.Interactors.TopicsInteractor;
import pue.mtz.pau.appquimica.Interfaces.Presenters.TopicsPresenter;
import pue.mtz.pau.appquimica.Interfaces.Views.TopicsView;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.Models.Topics;

/**
 * Created by david on 21/10/16.
 */

public class TopicsPresenterImpl implements TopicsPresenter {


    private TopicsView view;
    private TopicsInteractor interactor;

    public TopicsPresenterImpl(TopicsView view) {
        this.view = view;
        interactor = new TopicsInteractorImpl(this);
    }

    @Override
    public void initRecycler(Topics topics) {
        view.initRecycler(topics);
    }

    @Override
    public void loadListPerson() {
        interactor.initRecycler();
    }
}
