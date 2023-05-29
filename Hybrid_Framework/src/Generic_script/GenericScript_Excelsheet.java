package Generic_script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericScript_Excelsheet 
{
public static String get_data(String sh,int r,int c)
{
	String value="";
	try
	{
		FileInputStream file=new FileInputStream("./Excel/Frame.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet(sh);
        Row row=sheet.getRow(r);
        Cell cel=row.getCell(c);
        value=cel.toString();
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return value;
}
}