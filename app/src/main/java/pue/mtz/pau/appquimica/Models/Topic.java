
package pue.mtz.pau.appquimica.Models;

public class Topic {

    private String idTopic;
    private String nameTopic;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Topic() {
    }

    /**
     * 
     * @param nameTopic
     * @param idTopic
     */
    public Topic(String idTopic, String nameTopic) {
        this.idTopic = idTopic;
        this.nameTopic = nameTopic;
    }

    /**
     * 
     * @return
     *     The idTopic
     */
    public String getIdTopic() {
        return idTopic;
    }

    /**
     * 
     * @param idTopic
     *     The id_topic
     */
    public void setIdTopic(String idTopic) {
        this.idTopic = idTopic;
    }

    /**
     * 
     * @return
     *     The nameTopic
     */
    public String getNameTopic() {
        return nameTopic;
    }

    /**
     * 
     * @param nameTopic
     *     The name_topic
     */
    public void setNameTopic(String nameTopic) {
        this.nameTopic = nameTopic;
    }

}
