package lec06.polymorphism02.first;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 이제 메인 메서드가 들어있는 메인 클래스입니다.
 *
 * 잘 따라와 주세요.
 */
public class MainMethod {

    public static void main(String[] args) {

        Company cmpElecs = new Electronics();
        Company cmpShips = new Ships();

        /**
         * 위에 선언한 것이 보이시나요?
         * 부모 클래스인 컴퍼니 클래스를 참조변수로 하여
         * 전자회사와 조선회사를 객체생성하였습니다.
         *
         * 다른 것을 보여드릴까요?
         */
        Map<String, Object> hashMap = new HashMap<>();
        Map<String, Object> treeMap = new TreeMap<>();

        /**
         * 둘 다 맵인데 하나는 해쉬맵이고 하나는 트리맵이죠?
         * 이런 식으로 같은 형태의 부모 클래스를 참조변수로 사용하고
         * new 연산자를 통한 객체 생성에서는 자손 클래스를 쓰는 것을 다형성의 일종으로 봅니다.
         *
         * 부모 클래스의 참조변수를 사용한 것에는 특징이 있습니다.
         * new 연산자를 통해 생성한 객체의 모든 기능을 사용할 수 없다는 점이죠.
         */

        cmpElecs.builtCompany();
        /**
         * 자동 완성을 통해 보이는 메서드 목록을 보시면 아시겠죠?
         * 그럼 비교할 수 있는 객체를 만들어 볼까요:
         */
        Electronics electronics = new Electronics();
        electronics.systemDevice();
        /**
         * 참조변수를 new 연산자를 통해 만드는 자식 클래스로 만드니까 모든 기능을 사용할 수 있죠?
         * 이런 형태로 선언하는 것을 다형성이라고 보는 것입니다.
         *
         * 다형성은 부모 클래스의 형태 한 가지로 다양한 자식 클래스를 참조할 수 있다는 것입니다.
         * 부모와 자식 클래스 간의 변수와 메서드에 차이가 없다면
         * 다양한 형태의 자식 클래스를 부모 클래스 하나로만 참조변수로 사용하여 쓸 수 있습니다.
         * 하지만 자식 클래스가 부모 클래스보다 많은 변수와 기능을 가지고 있을 때는
         * 부모 클래스의 참조변수는 자식 클래스의 더 많은 변수와 기능을 사용할 수 없습니다.
         *
         * 그렇기 때문에 다형성은 꼭 필요한 경우에만 활용해야 할 것입니다.
         */

        /**
         * 이번엔 instanceof라는 것을 알아보겠습니다.
         *
         * 잘 따라와 주세요.
         */
        boolean boolCompany = cmpElecs instanceof Company;
        System.out.println("같은가? : " + boolCompany);
        boolean boolElectronics = electronics instanceof Company;
        System.out.println("같은가? boolElectronics : " + boolCompany);
        Ships ships = new Ships();
        boolean boolShips = ships instanceof Ships;
        System.out.println("같은가? boolShips : " + boolShips);

        /**
         * instanceof 예제 코드를 짜보았습니다.
         * instanceof는 왼쪽에는 변수명을, 참조변수죠.
         * 그리고 오른쪽에는 클래스명을 적습니다.
         * 그리고 비교하는 것입니다.
         * 해당 참조변수의 형태가 오른쪽에 적은 클래스 형과 같은지.
         * instanceof는 조건문에서 자주 쓰입니다.
         * 조건문에서 형비교를 한 다음에 형 변환이나
         * 조건문을 실행하는 형태로 쓰는 것입니다.
         */

        if (ships instanceof Ships) {
            System.out.println("조선회사가 맞습니다.");
        }

        /**
         * 방금 짜본 것이 조건문에서 활용하는 형태입니다.
         * 그러면 instanceof를 포함한 다형성 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}
