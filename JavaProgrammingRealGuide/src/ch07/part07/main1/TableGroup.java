package ch07.part07.main1;

import javax.swing.*;
import java.lang.reflect.Field;

public class TableGroup<T extends DefaultVo> {

    JScrollPane pane = new JScrollPane();

    public TableGroup(Class<T> clazz, T... array) {

        Field[] fields = clazz.getDeclaredFields();
        int count = 0;
        for (Field f : fields) {
            Grid annotation = f.getAnnotation(Grid.class);
            if (annotation != null) {
                count++;
            }
        }

        String[] headerInfo = new String[count];
        Field[] headerField = new Field[count];
        int index = 0;
        for (Field f : fields) {
            boolean accessible = f.isAccessible();
            f.setAccessible(true);
            Grid annotation = f.getAnnotation(Grid.class);
            if (annotation != null) {
                String name = annotation.name();
                headerInfo[index] = name;
                headerField[index] = f;
                index++;
            }
            f.setAccessible(accessible);
        }

        Object[][] data = new Object[0][];
        if (array != null) {
            data = new Object[array.length][];
            int index2 = 0;
            for (T t : array) {
                Object[] datum = new Object[count];
                int index3 = 0;
                for (Field f : headerField) {
                    boolean accessible = f.isAccessible();
                    f.setAccessible(true);
                    try {
                        datum[index3] = f.get(t);
                    } catch (IllegalArgumentException iae) {
                        iae.printStackTrace();
                    } catch (IllegalAccessException ie) {
                        ie.printStackTrace();
                    }
                    f.setAccessible(accessible);
                    index3++;
                }
                data[index2] = datum;
                index2++;
            }
        }

        // 테이블 만들기
        JTable table = new JTable(data, headerInfo);
        pane.setViewportView(table);

    }

    public JScrollPane getTablePanel() {
        return pane;
    }

}
