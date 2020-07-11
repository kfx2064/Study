package ch09.part01.main1;

import java.lang.reflect.Field;

public class DefaultVo {

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        Class<? extends DefaultVo> clazz = this.getClass();
        sb.append(clazz.getName() + " 정보");

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            if (f != null) {
                String name = f.getName();
                String desc = "";
                Desc anno = f.getDeclaredAnnotation(Desc.class);
                if (anno != null) {
                    desc = anno.name();
                }

                String value = "";
                try {
                     boolean accessible = f.isAccessible();
                     f.setAccessible(true);
                     Object obj = f.get(this);
                     if (obj != null) {
                         value = obj.toString();
                     }
                     f.setAccessible(accessible);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                sb.append("\r\n\t" + name + " = " + value + " [" + desc + "]");
            }
        }

        return sb.toString();
    }

}
