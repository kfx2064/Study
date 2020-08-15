package lec04;

/**
 * 구매품목
 */
public class ProcureItemVO {

    /**
     * 웹 개발 실무에서 하시다 보면 자주 만나게 되는 코드입니다.
     * VO라고 하기도 하고 DTO라고 하기도 합니다.
     * 좀 더 깊이 들어가면 두 개의 명명법에는 차이가 있지만,
     * 가벼운 수준으로 아시면 좋습니다.
     * VO든 DTO는 편하신 것으로 쓰시길 바랍니다.
     *
     * VO와 DTO는 특정 업무에 대한 데이터 값들을 변수로 지정하는 것입니다.
     * id, name, quantity, price라고 지정할 수 있죠.
     * id는 고유하게 만들어지는 primary key라고 생각합시다.
     * primary key가 무엇이지 생각하실 수 있습니다.
     * 기본키라고도 하며 데이터베이스의 개념이기도 하지요.
     * 지금 막 데이터베이스를 배우시는 분들은 primary key의 개념이 없으실 수 있습니다.
     * 당연한 현상입니다.
     * 제가 간단하게 설명을 드리자면,
     * 무조건 존재해야 하는 값이고,
     * 고유하게 값이 존재해야 하는 값입니다.
     * 1, 1, 1, 이런 식으로 값이 존재해서는 안 됩니다.
     * 1, 2, 3, 이런 식으로 값이 존재해야 합니다.
     * 1, 2, 3, 은 값이 각각 다르죠.
     * 각각 다른 값들이 존재해야 무조건 존재해야 하는 값이고,
     * 고유하게 값이 존재해야 하는 조건을 만족합니다.
     */

    private int id;
    private String name;
    private int quantity;
    private int price;

    /**
     * 아래는 getter와 setter입니다.
     * 이것은 조금 더 깊이 들어가면 객체지향적인 개념입니다.
     * private 자체가 생소하시죠?
     * public과 private만 잘 알아도 대부분의 코드를 짜실 수 있습니다.
     * private은 외부에서 접근이 불가하게 만드는 접근제한자입니다.
     * public은 어디서든 접근이 가능하게 만드는 접근제한자이구요.
     * 조금 어렵죠.
     * 자바 프로젝트를 생성하면 가장 먼저 생상되는 것이 프로젝트 폴더입니다.
     * InflearnJavaBasicLecture 라고 하는 프로젝트 명이죠.
     * 그 아래 src라는 폴더가 있습니다.
     * src라는 폴더에는 java 파일들이 존재하게 됩니다.
     * 그리고 그 아래에는 제가 명명한 lec00, lec01, lec02, lec03, lec04 등이 있습니다.
     * 이것들의 이름은 무엇이냐면 패키지명인 것입니다.
     * 패키지명 아래에는 자바 파일이 있습니다.
     * 이런 구조로 있게 되지요.
     * 각각의 접근제한자는 같은 자바 파일 내에서만,
     * 또는 같은 패키지 내에서만,
     * 또는 패키지가 달라도 같은 프로젝트 내에서 등의 경우의 수가 있지요.
     * private, protected, public이라는 것들이 그런 것들입니다.
     *
     * private을 붙인 이유를 설명하다 보니 너무 멀리까지 왔네요.
     *
     * 여기서 private을 붙인 이유는 다른 자바 파일, 즉 다른 외부 클래스에서 접근하지 못하도록
     * 막기 위함입니다.
     *
     * 여러 가지의 이유가 있겠죠.
     * 그 중 가장 중요한 이유는 private을 통해서 외부의 클래스에서 직접 접근하지 못하도록 막음으로써
     * 데이터의 오염을 막기 위함입니다.
     * 데이터의 오염을 막는 것은 중요한 요소입니다.
     * 데이터의 오염이라는 표현은, 좀 더 쉽게 풀어서 설명하면,
     * 올바른 데이터가 들어가지 않고 여기저기서 해당 데이터 값이 접근을 하여 올바르지 않은 데이터가
     * 들어가게 된다는 것입니다.
     * 3이란 값을 주입하였는데 다른데서 1이란 값을 주입하여
     * 3이란 값을 이용하여 코딩을 해야 하는데 1이란 값이 사용되는 경우가 있습니다.
     * 이런 현상을 막기 위해서 private을 쓰게 되곤 합니다.
     * 그 외에 좀 더 깊게 들어가자면 여러 가지 이유가 있습니다.
     *
     * 가장 간단한 이유는 외부 클래스에서 값에 함부로 접근하지 못하도록 막기 위함입니다.
     */

    /**
     * 밑에는 getter와 setter입니다.
     * private으로 선언한 값은 외부 클래스에서 접근할 수가 없습니다.
     * 하지만 값의 변경과 값을 가져다 써야하는 경우가 생깁니다.
     * 이럴 때 어떻게 해야 할까요?
     * 바로 getter, setter 함수를 이용하여 코드를 짜는 것입니다.
     * getter는 값을 가져오는 것입니다.
     * setter는 값을 저장하는 것입니다.
     * get, 가져오다,
     * set, 저장하다.
     * 이런 의미인 것이죠.
     * getter, setter를 통해 값을 통제하는 것입니다.
     * 이런 절차를 통해 private으로 변수를 선언하고,
     * 해당 변수에 값을 저장하고,
     * 그리고 getter, setter를 통해 값을 통제하는 것입니다.
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * toString은 값을 문자열의 형태로 늘어놓는 것입니다.
     * 왜 쓸까요?
     * 제가 알고 있는 가장 좋은 이유는 값의 형태를 파악하는 것입니다.
     * toString을 통해서 값의 형태를 파악하는 것입니다.
     * VO에 어떤 값들이 셋팅되는지 확인하는 것이죠.
     * 이것은 종종 디버깅을 IDE의 디버깅 기능을 통해서 하는 것이 아니라
     * 로직을 흘려가면서 확인할 때 유용하게 사용되는 함수입니다.
     * 위에 annotation으로 붙은 Override는 지금 당장 주의 깊게 아시지 않아도 됩니다.
     * 저것 역시 객체지향의 개념에서 필요한 것이죠.
     * annotation이란 개념도 후에 알게 되는 개념입니다.
     * 어떤 특정한 상태를 알려주거나, 특정한 기능을 제공해 주는 것이라고 파악해 두시면 좋습니다.
     */

    @Override
    public String toString() {
        return "ProcureItemVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
