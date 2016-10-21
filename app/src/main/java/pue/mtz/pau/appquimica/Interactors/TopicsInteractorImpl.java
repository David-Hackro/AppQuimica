package pue.mtz.pau.appquimica.Interactors;

import java.util.ArrayList;
import java.util.List;

import pue.mtz.pau.appquimica.Interfaces.Interactors.TopicsInteractor;
import pue.mtz.pau.appquimica.Interfaces.Presenters.TopicsPresenter;
import pue.mtz.pau.appquimica.Models.Topic;

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
        List<Topic> personas = new ArrayList<Topic>();
        //String name, String icon, String description
        personas.add(new Topic("david","example","esta es la descripcion"));

        presenter.initRecycler(personas);
    }
}