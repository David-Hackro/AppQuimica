package pue.mtz.pau.appquimica.Interfaces.Presenters;

import java.util.List;

import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.Models.Topics;

/**
 * Created by david on 21/10/16.
 */

public interface TopicsPresenter {



    void initRecycler(Topics topics);
    void loadListPerson();
}
