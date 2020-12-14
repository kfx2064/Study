package lec06.interface03.first;

public class MainMethod {

    /**
     * 구체화된 인터페이스를 사용해 보겠습니다.
     * @param args
     */

    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();

        sampleClass.abstractMethod();
        sampleClass.defaultMethod();
        sampleClass.callPrivateMethodInDefaultMethod();
        sampleClass.interfaceMethod();

        String strOsName = sampleClass.OS_NAME;
        String strDownloadPath = SampleClass.DOWNLOAD_PATH;

        System.out.println("OS name : " + strOsName);
        System.out.println("download Path : " + strDownloadPath);

        /**
         * 이런 식으로 구체화된 인터페이스들을 사용할 수 있습니다.
         */

        SampleInterface.sampleFirst sampleFirst = new SampleInterface.sampleFirst();
        int sampleCount = sampleFirst.sampleCount;
        System.out.println("sampleCount : " + sampleCount);

        /**
         * 내부 클래스도 이런 식으로 사용이 가능합니다.
         */

        SampleInterface.D create = SampleInterface.D.CREATE;
        SampleInterface.D read = SampleInterface.D.READ;
        SampleInterface.D update = SampleInterface.D.UPDATE;
        SampleInterface.D delete = SampleInterface.D.DELETE;

        System.out.println("create : " + create);
        System.out.println("read : " + read);
        System.out.println("update : " + update);
        System.out.println("delete : " + delete);

        /**
         * enum도 이런 식으로 사용이 가능하죠.
         *
         * 인터페이스를 활용하는 것들을 한 번 코딩해 보았습니다.
         *
         * 그럼 다음 강의에서 찾아뵙겠습니다.
         * 감사합니다.
         */
    }

}
