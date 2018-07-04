/**
 * 
 */
package reflection;

import java.util.Map;

/**
 * @author CNN
 *
 */
public class OutputClass {
    private Map<String, OutputClassAttrDetail> attrValMap;

    /**
     * @return the attrValMap
     */
    public Map<String, OutputClassAttrDetail> getAttrValMap() {
        return attrValMap;
    }

    /**
     * @param attrValMap
     *            the attrValMap to set
     */
    public void setAttrValMap(Map<String, OutputClassAttrDetail> attrValMap) {
        this.attrValMap = attrValMap;
    }

}
