package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class CreateWorkBookFile {

    public static void main(String[] args) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            FileOutputStream output = new FileOutputStream("/Users/joshuasmba/Documents/amazon/Web-Automation-Framkework/Ebay/excelFile/Items.xlsx");
            XSSFSheet sheet = workbook.createSheet("new items");
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("File should be created");

    }
}
