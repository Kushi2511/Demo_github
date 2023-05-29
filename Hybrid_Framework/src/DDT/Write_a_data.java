package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_a_data
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("./Excel/Frame.xlsx");
	Workbook book=WorkbookFactory.create(file);
	Sheet sh=book.getSheet("Sheet1");
	Row r= sh.createRow(4);
	Cell c=r.createCell(2);
	c.setCellValue("kushi");
	FileOutputStream fos=new FileOutputStream("./Excel/Frame.xlsx");
	book.write(fos);
}
}
