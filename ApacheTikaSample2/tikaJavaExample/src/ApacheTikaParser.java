import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.csv.TextAndCSVParser;
import org.apache.tika.parser.dif.DIFParser;
import org.apache.tika.parser.html.HtmlParser;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.apache.tika.parser.odf.OpenDocumentParser;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.parser.xml.XMLParser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.FileInputStream;
import java.util.Arrays;

public class ApacheTikaParser {

    public static void tikaDetailParser() throws Exception {
        FileInputStream fis = null;

        TemporaryResources tmp = new TemporaryResources();

        try {

            Parser parser = null;

            //String fileName = String.valueOf("C:\\dev\\123.ai");
            //String fileName = String.valueOf("C:\\dev\\bottleCocaCola.3ds");
            //String fileName = String.valueOf("C:\\dev\\sampleWord.doc");
            //String fileName = String.valueOf("C:\\dev\\sampleWord.docx");
            //String fileName = String.valueOf("C:\\dev\\erp.pdf");
            //String fileName = String.valueOf("C:\\dev\\abc.xlsx");
            //String fileName = String.valueOf("C:\\dev\\abc.xls");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\csvFormat.csv");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\difFormt.dif");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\htmFormat.htm");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\htmlFormat.html");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\mhtFormat.mht");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\mhtmlFormat.mhtml");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\odsFormat.ods");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\slkFormt.slk");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\txtFormat.txt");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\txtUnicodeFormat.txt");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xlaFormat.xla");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xlamFormat.xlam");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xlamFormatReport.xlam");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xls5.0Format.xls");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xlsbFormat.xlsb");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xlsmFormat.xlsm");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xltFormat.xlt");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xltmFormat.xltm");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xltxFormat.xltx");
            //String fileName = String.valueOf("C:\\dev\\excelFiles\\xmlFormat.xml");
            String fileName = String.valueOf("C:\\dev\\excelFiles\\xpsFormat.xps");

            fis = new FileInputStream(fileName);

            int getLastIndex = fileName.lastIndexOf(".");
            //System.out.println("getLastIndex : " + getLastIndex);
            int strLength = fileName.length();
            String subsFileName = fileName.substring(getLastIndex + 1, strLength);
            System.out.println("subsFileName : " + subsFileName);

            BodyContentHandler handler = new BodyContentHandler();

            Detector detector = new DefaultDetector();
            Metadata metadata = new Metadata();
            TikaInputStream tis = TikaInputStream.get(fis, tmp);

            fis = new FileInputStream(fileName);

            MediaType mediaType = detector.detect(tis, metadata);

            //System.out.println("mediaType.toString ::: " + mediaType.toString());

            if (subsFileName.equals("doc")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("docx")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xlsx")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("dif")) {
                parser = new DIFParser();
            } else if (subsFileName.equals("csv")) {
                parser = new TextAndCSVParser();
            } else if (subsFileName.equals("xls")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("pdf")) {
                parser = new PDFParser();
            } else if (subsFileName.equals("htm")) {
                parser = new HtmlParser();
            } else if (subsFileName.equals("html")) {
                parser = new HtmlParser();
            } else if (subsFileName.equals("mht")) {
                parser = new HtmlParser();
            } else if (subsFileName.equals("mhtml")) {
                parser = new HtmlParser();
            } else if (subsFileName.equals("ods")) {
                parser = new OpenDocumentParser();
            } else if (subsFileName.equals("slk")) {
                // 파서가 없다.
            } else if (subsFileName.equals("txt")) {
                parser = new TextAndCSVParser();
            } else if (subsFileName.equals("xla")) {
                // 파서가 없다
            } else if (subsFileName.equals("xlam")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xls")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xlsb")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xlsm")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xlt")) {
                // 파서가 없다
            } else if (subsFileName.equals("xltm")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xltx")) {
                parser = new OOXMLParser();
            } else if (subsFileName.equals("xml")) {
                parser = new XMLParser();
            } else if (subsFileName.equals("xps")) {
                // 파서가 없음.
            } else {
                parser = new AutoDetectParser();
            }

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
            /*System.out.println("meta datas");
            System.out.println(metadata);
            System.out.println(metadata.toString());*/

            String[] metaNames = metadata.names();
            /*System.out.println();
            System.out.println("metaNames");
            System.out.println(metaNames);
            System.out.println(Arrays.toString(metaNames));
            System.out.println();*/

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

}
