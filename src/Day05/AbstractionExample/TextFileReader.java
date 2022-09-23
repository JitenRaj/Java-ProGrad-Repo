package Day05.AbstractionExample;

public class TextFileReader extends FileReader {

    @Override
    void produceReport() {
        System.out.println("Report Generated.");
    }

    @Override
    void sendFileViaEmail() {
        System.out.println("File sent.");
    }

    void fileOpen(){
        System.out.println("File Opened.");
    }

    void fileRead(){
        System.out.println("Read File.");
    }
}
