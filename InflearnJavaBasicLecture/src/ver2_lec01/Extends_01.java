package ver2_lec01;

/**
 * 상속에 대한 설명입니다.
 */
public class Extends_01 {

    /**
     * 안녕하세요, 상속에 대한 설명 강의입니다.
     *
     * 상속은 객체지향 개념에 있어서 중요한 개념입니다.
     * 다른 클래스의 기능을 받아와서 현재 클래스에서 쓸 수 있게 해주는 개념이죠.
     *
     * 개념적인 면을 설명 드리겠습니다.
     * 저는 입문 수준에서 설명 드리겠습니다.
     *
     * 상속은 기본적인 것을 부모 클래스에서 제공해 줄 테니,
     * extends를 통해서 자손 클래스에서 받아서 쓰라는 개념입니다.
     * 부모 클래스에서 공통된 기능들을 정의하고,
     * 여러 가지의 자손 클래스에서 해당 공통된 개념을 가져와서 쓰는 것이죠.
     *
     * 부모 클래스가 만약에,
     * 콜라 라는 클래스가 있다면,
     * 자손 클래스에서는 코카콜라, 펩시가 존재할 수 있습니다.
     * 두 콜라 사이에는 회사의 차이 뿐만 아니라,
     * 회사 운영 방식, 콜라 제조법, 물류, 유통, 모든 게 다르겠죠.
     * 하지만 두 회사는 콜라 회사라는 공통점도 가지고 있을 것입니다.
     * 이때 두 콜라 회사의 공통점을 정의한 클래스를 부모 클래스라고 합니다.
     *
     * 공통된 기능들과 속성들,
     * 자바 프로그래밍의 관점에서 보자면 변수들과 메소드들을
     * 부모 클래스에 선언하여 코카콜라 클래스와 펩시 클래스에서 사용하는데는
     * 분명한 장점이 있습니다.
     *
     * 이 장점이란 개념은 수강생 여러분이 스스로 많이 클래스를 만들어 보고,
     * 이것저것 생각해 보면서 프로그래밍을 해봐야 느낄 수 있는 것이기도 해요.
     * 이 강의를 진행하는 강사는 실무 경험이 많습니다.
     *
     * 그 중 하나 예를 들어보죠.
     * 기업의 업무 프로그램은 매출액이 클수록 복잡해 집니다.
     * 제가 일하다 보니 매출액과 맞먹을 정도로 자산규모가 큰 기업도 있었어요.
     * 리조트나 호텔 같은 기업들은 엄청난 자산 규모를 가지고 있습니다.
     * 이유는 리조트나 호텔은 좋은 곳에 땅을 사두고 건물을 짓고
     * 그곳에 손님들을 받아서 매출을 올리기 때문이죠.
     * 그렇기 때문에 리조트나 호텔은 자산 규모가 무척 큽니다.
     *
     * 잠시 다른 걸 설명했구요.
     * 기업 업무 프로그램은 그렇게 자산이나 매출이 클수록 복잡해 지는 경향을 띕니다.
     * 마치 기업이 커질 수록 사람 수가 늘어나는 것과 같더군요.
     * 물론 예외는 있어요.
     * 매출은 조단위인데 직원 수는 몇 백명인 회사들도 존재합니다.
     * 대표적으로 LPG 회사들이 그래요.
     * 수입한 것과 수입한 상품인 LPG를 판매하는 위주라서 그런지
     * 매출은 조단위가 넘는데 직원 수는 매출액에 비해 적습니다.
     *
     * 그래서 매출이 커지면 직원수가 많아진다는 것은 꼭 비례하지 않을 수도 있지만,
     * 대체로 그런 경향을 띕니다.
     * 그리고 직원수가 많아도 프로그램이 복잡해지는 경향이 있어요.
     *
     * 자꾸 프로그램이 복잡해 지는 것을 강조하죠.
     * 프로그램이 복잡해지면 기능들이 많아집니다.
     * 즉, 변수나 메소드들이 많아져요.
     * 이것들이 많아지기 때문에 프로그램은 복잡해 집니다.
     * 근데 만약 어떤 기능이 존재한다고 합시다.
     * 만약에 예를 들어서 발령이란 기능이 존재한다고 합시다.
     * 이 강의를 하는 강사는 발령이란 기능을 프로시저로 짰었어요.
     * 데이터베이스에서 제공해 주는 기능이죠.
     * 하지만 프로시저는 SQL에서 쿼리 문들을 비즈니스 로직을 처리하면서
     * 할 수 있도록 제공해 주는 것이 프로시저입니다.
     * 요즘은 프로시저보다는 자바 코드 상에서 비즈니스 로직을 처리하는 경우가 많아요.
     * 사실 데이터베이스, 프로시저, 쿼리, SQL 이런 것들이
     * 무엇인지 모르는 분들이 많으실 거라고 생각합니다.
     * 그렇다면 가볍게 듣기만 해주세요.
     *
     * 프로시저로 처리하느냐, 아니면 자바 코드로 처리하느냐는
     * 고객이 선택하는 경우가 많습니다.
     * 보통 시스템통합 쪽 일은 구축하고 나면,
     * 구축한 인력 중 몇몇이 남아서 유지보수를 하거나,
     * 구축하고 난 뒤 인력들은 빠지고 다른 인력들이 채워서 들어와서
     * 시스템을 유지보수 하거나 하죠.
     * 그때 다른 인력이 들어올 때 그 인력의 기술 숙련도를 고려하곤 합니다.
     * 그 사람이 데이터베이스를 잘 다룬다, 하면 프로시저로 가고,
     * 그 사람이 자바 코드를 잘 다룬다, 하면 자바 코드로 가는 겁니다.
     * 이건 어찌보면 당연한 거지요.
     * 유지보수하는 사람이 잘 모르는 기술로 구축이 되어 있어버리면
     * 유지보수하기가 힘들어져요.
     *
     * 또 다른 이유도 있습니다.
     *
     * 웹 시스템은 뭔가 허공에서 돌고 있는 것이 아닙니다.
     * 서버 컴퓨터에서 웹 프로그램이 구동되고 있어요.
     * 서버 컴퓨터에서 웹 프로그램이 구동되고 있고
     * 서버는 웹 서버와 데이터베이스 서버로 나누기도 하고
     * 또 다른 방식으로는 하나의 서버에
     * 웹 서버와 데이터베이스가 위치하기도 합니다.
     * 이때 생각해야 하는 것이,
     * 제가 예전에 강의하다가 말씀 드린 것 같아요.
     * 컴퓨터 자원은 무한하지 않습니다.
     * 유한해요.
     * 한계가 있죠.
     * 그때 컴퓨터의 많은 자원이 사용된다면,
     * 어느 쪽에 부하를 주는 편이 옳을지 판단해야 하는 경우가 있습니다.
     * 입문 개념을 한참 벗어나는 개념이긴 한데,
     * 웹 서버와 데이터베이스 서버는 두 개로 갈려진 개념이예요.
     * 두 서버는 각각의 부하를 받습니다.
     * 웹에서의 처리는 웹 서버가, 데이터베이스에서의 처리는 데이터베이스 서버가
     * 처리량을 소화하고, 그에 따른 부담을 집니다.
     *
     * 너무 과도하게 사람이 몰리거나 복잡한 논리적인 코드나 데이터베이스 처리가
     * 구동되면 서버는 당연히 높은 부하를 받게 됩니다.
     * 그리고 만약, 서버가 부담하지 못하면 서버는 다운이 되고 말아요.
     * 그럼 프로그램이 멈추겠죠.
     * 이런 관점에 있어서 웹 서버에 부담을 줄지,
     * 아니면 데이터베이스 서버에 부담을 줄지 판단해야 합니다.
     * 이럴 때도 프로시저를 쓰느냐, 아니면 자바 코드를 쓰느냐의
     * 구분을 가지기도 합니다.
     *
     * 다른 걸 설명하다가 또 다른 걸 더 설명해 버렸죠.
     *
     * 제가 이야기하고자 하는 것은 프로그램의 기능이 복잡해 지면,
     * 복잡한 프로그램들 중 유사 기능들을 묶고, 해당 유사 기능들에서
     * 공통된 기능을 뽑아서 한 곳에서 관리해야 할 필요성을 느낍니다.
     *
     * 제가 개발한 발령이란 로직은 모든 사원에게 적용되는 것이었어요.
     * 사장부터 가장 밑에 사원까지,
     * 그리고 일반직, 전문직 등에게도 공통적으로 적용되는 로직이었죠.
     * 하지만 회사마다 다를 수가 있어요.
     *
     * 만약 일반직의 발령 처리 방법이 다르고 전문직의 발령 처리 방법이 다르다면?
     * 보통 일반직이라 하면 대기업 사무직을 생각하시면 됩니다.
     * 전문직이라 하면 돈 계산해 주시는 분, 서빙하시는 분, 음식을 조리하시는 분,
     * 이런 문들을 전문직이라고 생각하시면 되요.
     * 왜냐면 그런 일들만 전문적으로 처리하시는 분들이기 때문이죠.
     * 회사마다 이런 분들에 대한 발령 처리가 다를 수도 있습니다.
     * 물론 로직 상에 구분문으로 반영할 수 있지만,
     * 발령이란 로직 자체를 분리하는 것도 생각해 볼 수 있어요.
     * 하지만 발령이란 인사 체계에서는 승진, 강등, 연봉 상승, 연봉 동결, 연봉 삭감 등
     * 다양한 기능들이 있을 것이고 이런 것들은 일반직이나, 전문직이나 같을 수가
     * 있습니다.
     *
     * 생각해 봅시다.
     * 이런 공통된 기능들을 발령이란 부모 클래스에서 관리하고
     * 밑에 자식 클래스인 발령-일반직, 발령-전문직에서 관리한다고 생각해 봅시다.
     * 만약 승진에서 어떤 처리가 변경이 되었어요.
     * 발령-일반직과 발령-전문직이 존재할 때는 두 곳을 고쳐야 합니다.
     * 하지만 발령이란 부모가 존재하고 발령-일반직, 발령-전문직의 자식이 존재하는
     * 형태라면 자식은 발령이란 부모를 끌어다 쓰는 것이고
     * 부모 클래스의 발령에서만 승진에서 변경된 처리 방법을 반영하면,
     * 자식 클래스에서 모두 해당 기능이 반영되죠.
     * 이것이 상속입니다.
     * 지금 위의 기능은 부모 하나에 자식 두 개였죠.
     * 만약 열 개의 자식이 하나의 부모 클래스의 기능을 가져다 쓴다고 생각해 보세요.
     * 그러면 열 개의 자식 클래스에서 일일이 고쳐야 하는 것을
     * 부모 클래스에서 한 번에 고칠 수 있습니다.
     *
     * 다른 개념도 존재해요.
     * 기업의 모든 활동이 기록되는 곳은 회계입니다.
     * 기업은 돈을 벌기 위해 설립된 곳이고,
     * 모든 활동은 돈을 벌거나, 돈을 쓰거나 합니다.
     * 수입과 비용이죠.
     * 회계의 개념이예요.
     * 그리고 수입과 비용을 토대로
     * 자산, 부채, 자본을 계산하곤 합니다.
     *
     * 이때 수입과 비용을 계산하려면 어떻게 해야할까요?
     * ERP라는 시스템이 있는데 전사적자원관리라고 부르는 시스템이예요.
     * 이 전사적자원관리에서 수입과 비용을 계산할 때 모든 부서에서
     * 발생하는 수입과 비용을 계산해야 할 수가 있어요.
     * 이때 발생된 회계에 대한 원천적인 데이터를 각 부서의 업무 프로그램에서
     * 들고 있다가 일괄적으로 회계 부서에서 가져다가 쓰는 프로그램이 존재한다고
     * 가정해 봅시다.
     * 자세히 설명을 드리진 않았지만 업무 시스템 중에서는 저렇게 처리하는
     * 업무 시스템들도 존재해요.
     * 다른 부서들에서 회계 처리를 하고 해당 내용을 데이터베이스에 가지고 있다가
     * 회계 부서의 기능을 개발한 개발자가 제공한 메소드를 통해서
     * 데이터베이스의 데이터들을 끌어다가 데이터를 제공해 주어서
     * 회계에 해당 데이터들을 반영하는 기능 말이죠.
     * 만약 이걸 각 부서의 업무 파트를 개발하는 개발자들이 개발한다면
     * 어떻게 될까요?
     * 하나의 업무 개발에는 한 명의 개발자만 붙는 것이 아닙니다.
     * 여러 명이 붙어서 여럿이서 각각 쪼개어 맡아서 개발을 해요.
     * 그리고 이걸 개발하는 개발자들을 이끄는 PL들이 존재하죠.
     * 그리고 그 PL들을 관리하는 PM들이 존재하구요.
     * 계층형 구조로 이루어져 있어요, 프로젝트를 관리하는 것은.
     * 이때 여러 개발자가 하나의 업무 파트를 개발하고,
     * 여러 개의 업무가 하나의 회계 프로그램에 필요한 기능을 제공하는데,
     * 여러 업무 파트의 개발자가 개발하면 얼마나 복잡할까요?
     * 그럴 때는 회계 파트의 개발자가 개발해서 기능을 제공해 주면
     * 매우 간단해 집니다.
     *
     * 그때 상속이란 개념을 꼭 사용하는 것은 아니예요.
     * 객체의 생성을 통한 기능을 끌어다 쓰는 경우도 있구요.
     * 객체를 주입 받아서 기능을 끌어다 쓰는 경우도 있어요.
     *
     * 여기서 가정한 것은 회계 프로그램의 해당 기능을 개발하는 개발자가
     * 부모 클래스의 형태로 기능들을 제공해 주고,
     * 각 업무 파트의 해당 기능을 필요로 하는 개발자가
     * 부모 클래스의 기능을 상속 받아서 구현하는 것을 생각할 수가 있어요.
     *
     * 설명이 어려울 수가 있습니다.
     * 하지만 어떤 분에게는 이 설명이 이해가 될 수도 있다고 생각합니다.
     *
     * 이렇게 함으로써 만약 부모 클래스에서의 특정 기능이 변경되면,
     * 그것을 가져다 쓰는 개발자들에게는 공통적으로 그 기능이 적용되는 것이죠.
     * 만약 10명의 개발자가 일일이 개발해야 하는 것을
     * 1명의 개발자가 기능 수정해서 모두 반영된다면 얼마나 편리하겠어요.
     * 그리고 비용도 매우 많이 아낄 수가 있죠.
     * 개발자들의 인건비는 기술직이라서 높게 책정이 되고,
     * 개발자들의 투입 단가라 부르는, 개발자를 투입했을 때 해당 기업이 받아가는
     * 단가도 높게 책정이 됩니다.
     * 단가가 높게 책정이 되는 것은 그만큼 프로그램은 어렵기도 하고,
     * 숙련된 프로그래머가 적기도 하고,
     * 무엇보다도 대부분의 기술직이 그런 경향을 띄지만,
     * 잘못된 프로그램이 만들어졌을 때는 그것이 끼치는
     * 부정적인 영향이 굉장히 큽니다.
     * 그렇기 때문에 안정적인, 좋은 프로그램을 만들기 위해서
     * 기업들은 많은 돈을 쓰는 것이지요.
     * 높은 단가가 책정되는 개발자들의 필요 공수,
     * 즉 그들이 일해야 하고 신경 써야 하는 것을 줄일 수 있다면,
     * 기업 입장에서는 많은 비용을 절약할 수 있는 것이지요.
     * 이 점이 기술직들에게는 상대적으로 자유로운 분위기를
     * 허락하는 배경이기도 하고,
     * 프로그래머, 즉 SW 개발자들을 고용하려는 기업들에서
     * 부드러운 분위기, 자유로운 분위기를 강조하는 이유 중 하나예요.
     * 높은 개발자 단가에서 소모되는 비용들을 조금이라도 절약할 수
     * 있는 방법 중 하나가 저런 것이기 때문이죠.
     *
     * 또 번외의 내용들을 이야기했네요.
     * 이런 것들이 상속의 장점입니다.
     *
     * 그리고 상속을 받으면 필요한 기능을 고쳐서 쓸 수도 있어요.
     * 본인이 필요한 기능을 본인에게 맞게 고쳐서 사용하는 것이지요.
     * 만약 공통적으로 연차 15일을 제공한다고 생각해 봅시다.
     * 그리고 그것을 상속 받아서 구현을 했어요.
     * 근데 직종에 따라서, 또는 연차에 따라서 각각 휴가를
     * 달리 제공한다고 생각해 봅시다.
     * 그러면 상속받은 클래스에서 연차를 더해주면 되는 것이지요.
     * 기본 15일에서 +를 해주는 것입니다.
     * 이런 것이 상속의 장점이예요.
     * 이제 상속의 장점에 대한 설명을 드렸으니 코드를 한 번 짜볼까요?
     */

}















