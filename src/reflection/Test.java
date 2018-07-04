package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        InputClass in = new InputClass();
        in.setId("ID");
        in.setName("NAME");
        List<Object> list1 = new ArrayList<>();
        InputClass in1 = new InputClass();
        in1.setId("ID1");
        in1.setName("NAME1");
        list1.add(in1);
        in.setDetailList(list1);
        List<Object> list2 = new ArrayList<>();
        InputClass in2 = new InputClass();
        in2.setId("ID2");
        in2.setName("NAME2");
        list2.add(in2);
        in.setDetailList(list1);
        in.setDetailList2(list2);
        test(in);
    }

    public static OutputClass test(Object inOb) {
        try {
            OutputClass outOb = new OutputClass();
            Map<String, OutputClassAttrDetail> attrValMap = new HashMap<>();
            outOb.setAttrValMap(attrValMap);

            Field[] fields = TestClassA.class.getDeclaredFields();
            for (Field field : fields) {
                if (Modifier.PRIVATE != field.getModifiers()) {
                    continue;
                }
                OutputClassAttrDetail attrDetail = new OutputClassAttrDetail();
                attrDetail.setAttrNm(field.getName());
                attrDetail.setAttrType(field.getType());
                if (List.class.equals(field.getType()) || ArrayList.class.equals(field.getType())) {
                    List<OutputClass> innerOutObs = new ArrayList<>();
                    Method m1 = inOb.getClass().getMethod(getGetterMethodName(field.getName()));
                    List<Object> innerObs = (List<Object>) m1.invoke(inOb);
                    if (innerObs != null && !innerObs.isEmpty()) {
                        for (Object innerOb : innerObs) {
                            innerOutObs.add(test(innerOb));
                        }
                    }
                    attrDetail.setAttrVal(innerOutObs);
                } else {
                    Method m1 = inOb.getClass().getMethod(getGetterMethodName(field.getName()));
                    attrDetail.setAttrVal(m1.invoke(inOb));
                }

                attrValMap.put(field.getName(), attrDetail);
            }

            return outOb;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 
     * @param attrName
     */
    private static String getGetterMethodName(String attrName) {
        return "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1);
    }
}
