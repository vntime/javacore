/**
 * 
 */
package reflection;

import java.io.Serializable;
import java.util.List;

/**
 * @author CNN
 *
 */
public class InputClass implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private List<Object> detailList;

    private List<Object> detailList2;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the detailList
     */
    public List<Object> getDetailList() {
        return detailList;
    }

    /**
     * @param detailList
     *            the detailList to set
     */
    public void setDetailList(List<Object> detailList) {
        this.detailList = detailList;
    }

    /**
     * @return the detailList2
     */
    public List<Object> getDetailList2() {
        return detailList2;
    }

    /**
     * @param detailList2
     *            the detailList2 to set
     */
    public void setDetailList2(List<Object> detailList2) {
        this.detailList2 = detailList2;
    }

}
