package lec07.collectionset03.first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set을 실습하겠습니다.
 */
public class SetMain {

    /**
     * 메인메서드를 만들어 주겠습니다.
     */
    public static void main(String[] args) {

        /**
         * Set 객체를 생성합니다.
         *
         * add 메서드를 활용해 보겠습니다.
         */
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);

        Set<String> setString = new HashSet<>();
        setString.add("한국");
        setString.add("중국");
        setString.add("미국");

        System.out.println("데이터를 출력합니다.");
        System.out.println(setInt.toString());
        System.out.println(setString.toString());

        /**
         * size를 실습해 보겠습니다.
         */
        int intSize = setInt.size();
        int strSize = setString.size();

        System.out.println("int 크기 : " + intSize);
        System.out.println("String 크기 : " + strSize);

        /**
         * remove를 실습해 볼까요?
         * 자료 중 '2'를 제거해 보겠습니다.
         */
        System.out.println(setInt.toString());
        boolean remove = setInt.remove(2);
        System.out.println("remove : " + remove);
        System.out.println(setInt.toString());

        /**
         * 이제 전체를 지워보겠습니다.
         */
        System.out.println("지우기 전");
        System.out.println(setInt.toString());
        setInt.clear();
        System.out.println("지운 후");
        System.out.println(setInt.toString());

        /**
         * 다시 자료를 채워넣겠습니다.
         */
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);

        /**
         * 1을 포함하고 있는지 확인해 보겠습니다.
         */
        boolean contains = setInt.contains(1);
        System.out.println("contains : " + contains);

        /**
         * 일괄 등록을 실습해 보겠습니다.
         */
        Set duplicateSet = new HashSet();
        duplicateSet.addAll(setInt);
        System.out.println("일괄등록입니다.");
        System.out.println(setInt.toString());
        System.out.println(duplicateSet.toString());

        /**
         * containsAll을 실습해 보겠습니다.
         */
        boolean boolContainsAll = setInt.containsAll(duplicateSet);
        System.out.println("모두 포함하는가");
        System.out.println(boolContainsAll);

        /**
         * Set을 하나 더 만들겠습니다.
         */
        Set setRemove = new HashSet();
        setRemove.add(1);
        setRemove.add(2);
        setRemove.add(3);

        /**
         * removeAll을 실습하겠습니다.
         */
        System.out.println("데이터를 비교합니다.");
        System.out.println(setInt.toString());
        System.out.println(setRemove.toString());
        System.out.println("setInt에 removeAll을 실행합니다.");
        boolean isRemoveAll = setInt.removeAll(setRemove);
        System.out.println("removeAll이 실행되었습니까? : " + isRemoveAll);
        System.out.println(setInt.toString());
        System.out.println(setRemove.toString());

        /**
         * setRemove에 담긴 자료와 같은 것들이 삭제되는 것을 확인하실 수 있습니다.
         *
         * 이번엔 retainAll을 실습해 보겠습니다.
         */

        setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);

        /**
         * 데이터를 확인합니다.
         */
        System.out.println("retainAll 전에 데이터 확인");
        System.out.println(setInt.toString());
        System.out.println(setRemove.toString());

        setInt.retainAll(setRemove);
        System.out.println("setInt를 확인합니다.");
        System.out.println(setInt.toString());

        /**
         * setRemove에 존재하는 1, 2, 3만 남기고 전부 삭제하는 것을 확인할 수 있습니다.
         *
         * iterator를 하기 전에 데이터를 확인합니다.
         */

        System.out.println(setString.toString());

        /**
         * iterator를 실행합니다.
         */
        System.out.println("iterator가 작동합니다.");
        Iterator<String> iterator = setString.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        /**
         * 이런 식으로 Set에 대해 실습해 볼 수 있었습니다.
         * 컬렉션 프레임워크에서는 Map과 List를 가장 많이 사용합니다.
         * Set은 특별한 경우에 활용하곤 합니다.
         * Set에 대한 기본적인 기능들은 파악해 두시길 바랍니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         *
         * 감사합니다.
         */

    }

}
