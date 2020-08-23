package ver2_lect05.fileIO05.training01;

import java.io.File;
import java.util.Date;

public class IOManyFunction01 {

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

    }

}
