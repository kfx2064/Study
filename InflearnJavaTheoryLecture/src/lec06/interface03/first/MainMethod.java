package lec06.interface03.first;

public class MainMethod {

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

        SampleInterface sampleInterface = new SampleInterface(){
            @Override
            public void interfaceMethod() {

            }

            @Override
            public void abstractMethod() {

            }

            @Override
            public void defaultMethod() {

            }

            @Override
            public void callPrivateMethodInDefaultMethod() {

            }
        };

    }

}
