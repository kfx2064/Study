package lec00;

/**
 * 세 번째 강의
 * JVM
 */
public class JVM03 {

    /**
     * JVM은 Java Virtual Machine이라 부르는 것입니다.
     * 자바 가상 머신이라 부르곤 하죠.
     * 자바를 실행하기 위한 가상의 컴퓨터입니다.
     *
     * 가상의 컴퓨터란 실제 컴퓨터가 아니라 소프트웨어로 구현된 컴퓨터라는 뜻이죠.
     *
     * 계속 이론 설명이 지속되니 조금 지겨우실 수도 있습니다.
     * 하지만 JRE, JDK, JVM 등의 기초적인 개념을 이해하고 계시면,
     * 이후 강의를 듣고 난 뒤 이 강의보다 좀 더 깊게 자바를 설명하는 강의를 들으실 때는
     * 많은 도움이 되실 겁니다.
     *
     * 그래서 조금만 참고 들으시길 바랍니다.
     *
     * 자바로 작성된 프로그램은 JVM에서만 실행되기 때문에 자바 애플리케이션 실행에는 JVM이 필요합니다.
     * 이것은 자바의 장점이 됩니다.
     * 보통 다른 언어들 중에서는 특정 OS에서 만들고 컴파일, 즉 기계가 이해할 수 있는 언어로 변환한 뒤의
     * 해당 프로그램은 그 OS 환경에서만 사용이 가능합니다.
     * 즉 Windows 컴퓨터에서 프로그램을 만들었으면 Windows 컴퓨터에서만 사용이 가능하고,
     * Linux 컴퓨터에서 프로그램을 만들었으면 Linux 컴퓨터에서만 사용이 가능합니다.
     *
     * 하지만 자바는 다르죠.
     * 자바는 JVM이 있으면 어느 OS에서 만들었든 어느 OS에서든 구동이 가능합니다.
     * 이것은 자바의 강점이 됩니다.
     * 일괄적으로 Windows가 설치된 컴퓨터에서 자바로 프로그래밍을 하고 난 뒤에
     * Linux 서버에 해당 프로그램을 구동시킬 수 있기 때문입니다.
     *
     * 이것을 좀 더 경영적인 관점에서 보자면,
     * 보통 사무용 컴퓨터로는 Windows 컴퓨터를 많이 선호합니다.
     * 대다수의 노트북도 Windows가 설치된 상태구요.
     * 경영의 관점에서 보면 이런 컴퓨터들을 일괄구매하여 사용하면 집기류 구매에
     * 돈을 아낄 수 있습니다.
     * 근데 프로그램이 필요한데 그 프로그램을 구동할 컴퓨터는 Linux나 Unix 환경인 경우가 많습니다.
     * 서버 컴퓨터라 부르죠.
     * 여기에는 많은 사정이 있고 나중에 웹 프로그램을 배우시면서 서버나 OS 등의 것들을 깊게 배우시면서
     * 들어가시다 보면 자세한 내용을 아시게 될 것입니다.
     * 여기서 문제가 발생합니다.
     * 사무용 컴퓨터로 구매한 것들은 Windows인데 Windows에서 프로그램을 만든 것은 Windows에서만
     * 돌아간다면 Linux나 Unix 서버에서는 구동이 불가하게 되는 경우가 발생합니다.
     * 그러면 경영자의 관점에서는 곤란할 수 밖에 없습니다.
     * 하지만 자바는 이런 문제를 회피할 수 있습니다.
     * 그러면 경영자의 관점에서 보면 자바라는 프로그램은 매우 매력적인 프로그래밍 언어가 됩니다.
     * 이 외에도 다양한 이유가 있습니다.
     * 제가 설명드린 이유는 자바라는 언어가 대한민국, 그리고 전세계에서 많이 사용하는
     * 프로그래밍 언어 중 하나가 된 이유 중 하나가 됩니다.
     *
     * 다만 JVM은 OS에 종속적입니다.
     * 해당 OS에 맞는 JVM을 사용해야 합니다.
     * Linux면 Linux용 JVM을 사용해야 합니다.
     * Windows면 Windows용 JVM을 사용해야 합니다.
     * 이것은 큰 문제가 되지 않습니다.
     * 해당 OS에 맞는 JVM을 다운로드 받아서 설치하면 되기 때문입니다.
     *
     * Java 애플리케이션은 JVM을 거쳐서 OS로 전달됩니다.
     * 그리고 OS는 하드웨어로 전달하여 실제 동작을 수행합니다.
     *
     * 감이 오시지 않습니까?
     *
     * Java application -> JVM -> OS.
     * 이렇게 중간 단계로 JVM이 존재하는 것입니다.
     * 즉 Java application는 JVM을 통과하여 OS가 이해하는 언어로 제공되어 지는 것입니다.
     *
     * 이건 컴파일이란 개념과 인터프리터라는 개념도 들어가긴 합니다.
     *
     * 컴파일과 인터프리터는 미묘하게 다릅니다.
     * 여기서까지 자세히 설명하진 않겠습니다.
     *
     * 자바는 컴파일 언어다, 라고 알고 계시면 좋습니다.
     *
     * 컴파일은 무엇이냐면, 이클립스나 인텔리제이 등의 IDE를 이용하여 코딩을 할 때는
     * 사람이 알아볼 수 있는 영어로 작성합니다.
     * 하지만 해당 언어는 컴퓨터가 이해하지 못합니다.
     * 컴퓨터가 이해할 수 있는 언어로 바꿔주는 작업을 컴파일이라고 합니다.
     * 이 컴파일 단계를 거쳐야만 컴퓨터가 이해하는 언어로 제공이 됩니다.
     * 그리고 자바는 컴파일 언어입니다.
     *
     * 이 정도로 JVM에 대한 설명을 마치겠습니다.
     *
     * 감사합니다.
     */

}
