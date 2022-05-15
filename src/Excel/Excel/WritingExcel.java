package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\Biswajit\\Desktop\\testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("pass");;
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Biswajit\\Desktop\\testscript.xlsx");
		wb.write(fos);
		wb.close();
	}
}
