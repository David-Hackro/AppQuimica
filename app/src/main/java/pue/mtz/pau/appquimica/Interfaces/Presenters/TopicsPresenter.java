package pue.mtz.pau.appquimica.Interfaces.Presenters;

import java.util.List;

import pue.mtz.pau.appquimica.Models.Topic;

/**
 * Created by david on 21/10/16.
 */

public interface TopicsPresenter {



    void initRecycler(List<Topic> persons);
    void loadListPerson();
}
