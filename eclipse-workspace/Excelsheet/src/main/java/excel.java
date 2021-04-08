import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excel {

	public ArrayList <String> exceltesting(String test) throws IOException
	{
		ArrayList <String> a= new ArrayList();
	FileInputStream fis=new FileInputStream("C:\\Users\\rushali rathore\\Desktop\\SHEET.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	int count=workbook.getNumberOfSheets();
	int column=0,k=0;
	for( int i=0; i<= count;i++)
	{
	if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
	{
		XSSFSheet sheet=workbook.getSheetAt(i);
		 Iterator <Row> rows=sheet.iterator();
		 Row firstrow=rows.next();
		 Iterator <Cell> cell=firstrow.iterator();
		 while(cell.hasNext())
		 {
			 Cell value=cell.next();
			 if(value.getStringCellValue().equalsIgnoreCase("testcases"))
			 {
				column=k; 
			 }
			 k++;
		 }
		 while(rows.hasNext())
		 {
			Row value=rows.next();
				if(value.getCell(column).getStringCellValue().equalsIgnoreCase(test))
				{
					Iterator <Cell> cells= value.iterator();
					while(cells.hasNext())
					{
						Cell fcell=cells.next();
						if(fcell.getCellTypeEnum()==CellType.STRING) 
						{
							a.add(fcell.getStringCellValue());
						}
						else {
							a.add(NumberToTextConverter.toText(((Cell) cells).getNumericCellValue()));
						}
							
						
					}
					
				}
			}	
		
	}
			
			}
	return a;
	}
}
