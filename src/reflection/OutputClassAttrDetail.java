/**
 * 
 */
package reflection;

import java.io.Serializable;

/**
 * @author CNN
 *
 */
public class OutputClassAttrDetail implements Serializable {
    private String attrNm;
    private Class attrType;
    private Object attrVal;

    /**
     * @return the attrNm
     */
    public String getAttrNm() {
        return attrNm;
    }

    /**
     * @param attrNm
     *            the attrNm to set
     */
    public void setAttrNm(String attrNm) {
        this.attrNm = attrNm;
    }

    /**
     * @return the attrType
     */
    public Class getAttrType() {
        return attrType;
    }

    /**
     * @param attrType
     *            the attrType to set
     */
    public void setAttrType(Class attrType) {
        this.attrType = attrType;
    }

    /**
     * @return the attrVal
     */
    public Object getAttrVal() {
        return attrVal;
    }

    /**
     * @param attrVal
     *            the attrVal to set
     */
    public void setAttrVal(Object attrVal) {
        this.attrVal = attrVal;
    }

}
