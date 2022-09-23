package Day05.AbstractionExample;

public class FileMain {

    public static void main(String[] args) {

        TextFileReader textFileReader = new TextFileReader();

        textFileReader.produceReport();
        textFileReader.sendFileViaEmail();

        textFileReader.fileOpen();
        textFileReader.fileRead();

    }
}
