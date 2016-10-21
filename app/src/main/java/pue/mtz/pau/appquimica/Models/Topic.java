package pue.mtz.pau.appquimica.Models;

/**
 * Created by david on 21/10/16.
 */

public class Topic {


    private String name;
    private String icon;
    private String description;

    public Topic(String name, String icon, String description) {
        this.name = name;
        this.icon = icon;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }
}
