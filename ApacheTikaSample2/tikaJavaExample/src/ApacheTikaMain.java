import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.FileInputStream;
import java.util.Arrays;

public class ApacheTikaMain {

    public static void main(String[] args) {

        try {
            ApacheTikaParser.tikaDetailParser();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void tikaParser() throws Exception {
        String fileName = String.valueOf("C:\\dev\\sampleWord.doc");
        //String fileName = String.valueOf("C:\\dev\\abc.xlsx");
        //String fileName = String.valueOf("C:\\dev\\123.ai");

        FileInputStream fis = null;

        try {

            TemporaryResources tmp = new TemporaryResources();

            fis = new FileInputStream(fileName);

            Parser parser = new DefaultParser();
            BodyContentHandler handler = new BodyContentHandler();
            Metadata metadata = new Metadata();
            ParseContext context = new ParseContext();

            parser.parse(fis, handler, metadata, context);

            Detector detector = new DefaultDetector();

            TikaInputStream tis = TikaInputStream.get(fis, tmp);
            MediaType detect = detector.detect(tis, metadata);

            System.out.println("detect : " + detect);

            String[] metaNames = metadata.names();
            System.out.println(Arrays.toString(metaNames));
            System.out.println(handler.toString());

            for (int i = 0; i < metaNames.length; i++) {
                System.out.print("metaName : " + metaNames[i] + "\t\t\t\t\t");
                System.out.println(i + " : " + metadata.get(metaNames[i]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void tikaDetailParser() throws Exception {
        FileInputStream fis = null;

        try {

            Parser parser = null;

            //String fileName = String.valueOf("C:\\dev\\sampleWord.doc");
            String fileName = String.valueOf("C:\\dev\\abc.xlsx");
            //String fileName = String.valueOf("C:\\dev\\123.ai");
            fis = new FileInputStream(fileName);

            int getLastIndex = fileName.lastIndexOf(".");
            System.out.println("getLastIndex : " + getLastIndex);
            int strLength = fileName.length();
            String subsFileName = fileName.substring(getLastIndex + 1, strLength);
            System.out.println("subsFileName : " + subsFileName);

            if (subsFileName.equals("doc")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("docx")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xlsx")) {
                parser = new OOXMLParser();
            } else {
                parser = new AutoDetectParser();
            }

            BodyContentHandler handler = new BodyContentHandler();
            Detector detector = new DefaultDetector();
            Metadata metadata = new Metadata();

            /*while (true) {
                int read = fis.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }*/

            System.out.println();

            ParseContext context = new ParseContext();
            parser.parse(fis, handler, metadata, context);

            String[] names = metadata.names();
            System.out.println(Arrays.toString(names));

            System.out.println();
            System.out.println("meta datas");
            System.out.println(metadata);
            System.out.println(metadata.toString());

            String[] metaNames = metadata.names();
            System.out.println();
            System.out.println("metaNames");
            System.out.println(metaNames);
            System.out.println(Arrays.toString(metaNames));
            System.out.println();

            for (int i = 0; i < metaNames.length; i++) {
                System.out.print("metaName : " + metaNames[i] + "\t\t\t\t\t");
                System.out.println(i + " : " + metadata.get(metaNames[i]));
            }

            System.out.println("title => " + metadata.get(TikaCoreProperties.TITLE));
            System.out.println("creator => " + metadata.get(TikaCoreProperties.CREATOR));
            System.out.println("keywords => " + metadata.get(TikaCoreProperties.KEYWORDS));
            System.out.println("description => " + metadata.get(TikaCoreProperties.DESCRIPTION));
            System.out.println("comments => " + metadata.get(TikaCoreProperties.COMMENTS));
            System.out.println("xmpDM:genre => " + metadata.get("xmpDM:genre"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void tikaDetector() throws Exception {
        //String fileName = String.valueOf("C:\\dev\\sampleWord.doc");
        String fileName = String.valueOf("C:\\dev\\abc.xlsx");
        //String fileName = String.valueOf("C:\\dev\\123.ai");

        FileInputStream fis = null;

        try {

            TemporaryResources tmp = new TemporaryResources();

            fis = new FileInputStream(fileName);

            Detector detector = new DefaultDetector();
            Metadata metadata = new Metadata();

            TikaInputStream tis = TikaInputStream.get(fis, tmp);
            MediaType detect = detector.detect(tis, metadata);

            System.out.println("detect : " + detect);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}