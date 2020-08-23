package ver2_lect05.fileIO05.training01;

import java.io.File;
import java.util.Date;

public class FileManyFunction01 {

    public static void main(String[] args) throws Exception {
        File txtFile = new File("C:\\dev\\FileIOTextFile.txt");
        File txtFolder = new File("C:\\dev\\FileIOFolder");

        /**
         * 폴더 및 파일명 반환 메소드를 실습하겠습니다.
         */
        String fileName = txtFile.getName();
        System.out.println("fileName : " + fileName);

        /**
         * 해당 파일 객체의 마지막 수정 일자를 반환하는 메소드를 실습하겠습니다.
         */
        long longLastModified = txtFile.lastModified();
        System.out.println("longLastModified : " + longLastModified);
        Date dateLastModified = new Date(longLastModified);
        System.out.println("dateLastModified : " + dateLastModified);
        /**
         * 리턴받은 long 타입을 Date 생성 시 넣어서 날짜를 생성해 보겠습니다.
         * 날짜를 확인해 보시고 다음 메소드 사용으로 넘어가겠습니다.
         */

        /**
         * 파일 경로를 확인하는 메소드를 실습하겠습니다.
         */
        String filePath = txtFile.getPath();
        System.out.println("filePath : " + filePath);
        String fileAbsolutePath = txtFile.getAbsolutePath();
        System.out.println("fileAbsolutePath : " + fileAbsolutePath);
        String fileCanonicalPath = txtFile.getCanonicalPath();
        System.out.println("fileCanonicalPath : " + fileCanonicalPath);
        /**
         * 별 차이가 없는 것 같죠?
         * getPath는 객체 생성 시 입력된 파일 경로,
         * getAbsolutePath는 파일 시스템의 절대 경로를 반환합니다.
         * getCanonicalPath는 파일 시스템의 절대 경로를 반환하는데
         * 경로에 '.'나 '..'를 사용할 경우 해당 문자가 나타나지 않고 이를 계산하여 실제 물리 경로를 반환합니다.
         * getAbsolutePath의 경우에는 그러지 않죠.
         */

        /**
         * 부모파일 여부를 확인하는 메소드를 실습하겠습니다.
         */
        String txtFileParent = txtFile.getParent();
        System.out.println("txtFileParent : " + txtFileParent);
        File txtFileParentFile = txtFile.getParentFile();
        System.out.println("txtFileParentFile : " + txtFileParentFile);
        /**
         * 파일의 부모에 해당하는 부분을 확인하실 수 있습니다.
         */

        /**
         * 존재 여부를 확인합니다.
         */
        boolean txtFileExists = txtFile.exists();
        System.out.println("txtFileExists : " + txtFileExists);
        /**
         * 해당 파일이 존재하므로 true를 리턴합니다.
         */

        /**
         * 폴더인지 파일인지 여부를 체크합니다.
         */
        boolean txtFileFile = txtFile.isFile();
        System.out.println("txtFileFile : " + txtFileFile);
        boolean txtFolderFile = txtFolder.isFile();
        System.out.println("txtFolderFile : " + txtFolderFile);
        /**
         * text 파일이므로 파일임을 true로 리턴합니다.
         * 폴더는 파일이 아니므로 false를 리턴합니다.
         */

        /**
         * 폴더 여부인지 확인합니다.
         */
        boolean txtFileDirectory = txtFile.isDirectory();
        System.out.println("txtFileDirectory : " + txtFileDirectory);
        boolean txtDirectory = txtFolder.isDirectory();
        System.out.println("txtDirectory : " + txtDirectory);
        /**
         * 폴더가 아니므로 false를 리턴합니다.
         * txtFolder는 폴더가 맞으므로 true를 리턴합니다.
         */

        /**
         * 이제는 리스트 메소드입니다.
         * 파일일 때는 null을,
         * 폴더일 떄는 해당 폴더에 포함된 폴더 또는 파일 정보를 출력합니다.
         */
        String[] txtFileList = txtFile.list();
        System.out.println("txtFileList : " + txtFileList);
        String[] txtFolderList = txtFolder.list();
        for (int i = 0; i < txtFolderList.length; i++) {
            System.out.println(txtFolderList[i]);
        }
        /**
         * 반복문을 통해 값을 확인해 보았습니다.
         */

        boolean mkdir = txtFolder.mkdir();
        System.out.println("mkdir : " + mkdir);
        boolean mkdirs = txtFolder.mkdirs();
        System.out.println("mkdirs : " + mkdirs);

        /**
         * 이미 해당 폴더가 존재하고 있으므로 에러가 발생합니다.
         * 다른 것으로 예를 듭니다.
         */

        File createFolder = new File("C:\\dev\\FileIOFolder\\newFolder");
        boolean createMkdirs = createFolder.mkdirs();
        System.out.println("createMkdirs : " + createMkdirs);

        /**
         * 이렇게 코딩하면 해당 폴더가 생성되는 것을 확인할 수 있습니다.
         */

        File txtNewFileCraete = new File("C:\\dev\\createNewFile.txt");
        boolean newFile = txtNewFileCraete.createNewFile();
        System.out.println("newFile : " + newFile);

        /**
         * 해당 이름으로 파일이 생성되는 것을 확인할 수 있습니다.
         * createFile은 파일을 생성하는 메소드입니다.
         */

        File txtNewFileCraete1234 = new File("C:\\dev\\createNewFile1234.txt");
        boolean tfRenameTo = txtNewFileCraete.renameTo(txtNewFileCraete1234);
        System.out.println("tfRenameTo : " + tfRenameTo);

        /**
         * 파일 명이 바뀌는 것을 확인할 수 있다.
         */


        /**
         * 이제 삭제에 대해 실습해 보겠습니다.
         * deleteFolder라는 폴더를 하나 생성하겠습니다.
         */
        File deleteFolder = new File("C:\\dev\\deleteFolder");
        boolean tfDelete = deleteFolder.delete();
        System.out.println("tfDelete : " + tfDelete);
        /**
         * 폴더를 하나 생성해서 삭제하는 예제를 수행해 봤습니다.
         */

        /**
         * 이번에는 용량에 대한 실습입니다.
         * 두 가지를 실습해 보겠습니다.
         */
        long freeSpace = txtFile.getFreeSpace();
        System.out.println("freeSpace : " + freeSpace);
        long freeSpaceGB = ((freeSpace / 1024) / 1024) / 1024;
        System.out.println("freeSpaceMB : " + freeSpaceGB);

        long totalSpace = txtFile.getTotalSpace();
        System.out.println("totalSpace : " + totalSpace);
        long totalSpaceGB = ((totalSpace / 1024) / 1024) / 1024;
        System.out.println("totalSpaceGB : " + totalSpaceGB);
        /**
         * GB로 변환하여 출력하였습니다.
         * 여유 공간과 총 공간에 대한 정보입니다.
         */

        /**
         * File 클래스에는 대략적으로 이러한 기능들이 있습니다.
         * 더 많은 기능들이 존재하지만 Java API를 찾아보시는 것도 좋습니다.
         * 제가 앞전에 강의에서 설명드린 바와 같이
         * 기능들에 대해 대략적으로 알고
         * Java API 문서를 찾아보면서
         * 빠르게 찾아서 적용하는 것도 프로그래머에게 매우 중요한 능력입니다.
         *
         * 이제 다른 내용을 강의해 드리겠습니다.
         *
         * 경로 표현 중
         *
         * ./ 표현과
         * ../ 표현이 있습니다.
         *
         * 절대 경로와는 다른 상대 경로에 대한 표현입니다.
         *
         * ./ 표현은 현재 폴더 기준이라는 뜻입니다.
         * 현재 폴더를 기준으로 파일을 찾아간다는 것입니다.
         * ../는 상위 폴더를 기준으로 찾아간다는 뜻입니다.
         *
         * 프로그래밍을 하다보면 절대 경로를 사용할 때도 많지만,
         * 상대 경로를 사용할 경우도 많습니다.
         * 이에 대한 구분을 알아두시면 좋습니다.
         *
         * 보통 사용자마다 설치해서 사용하는 응용 프로그램은 상대 경로를 쓸 경우
         * 문제가 발생할 확률이 있습니다.
         * 하지만 하나의 웹 서버에서 실행되고
         * 각 사용자는 브라우저로 접근하여 웹 서버에 파일을 업로드하고 다운로드하는
         * 웹 프로그램의 경우엔 그럴 경우가 많이 줄어듭니다.
         *
         * 그럼에도 절대 경로를 쓰는 경우가 많긴 합니다.
         * 절대 경로로 확실한 경로를 지정하여
         * 연관되는 프로그램이나 파일들에 대한 정보를 정확하게 지정해 주는 것이
         * 좋기 때문입니다.
         */

    }

}
