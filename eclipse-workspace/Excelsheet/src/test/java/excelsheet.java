import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excelsheet {

	public ArrayList<String> getData(String test) throws IOException {
		// TODO Auto-generated method stub
  FileInputStream fis =new FileInputStream("C:\\Users\\rushali rathore\\Desktop\\demosheet.xlsx");
  XSSFWorkbook workbook=new XSSFWorkbook(fis);
  int count=workbook.getNumberOfSheets();
  int k=0;
  int column=0;
  ArrayList <String> a = new ArrayList <String>();
  for(int i=0; i<count ;i++)
  {
	  if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
	  {  	
		XSSFSheet sheet =workbook.getSheetAt(i);
		Iterator <Row>  rows=sheet.iterator();
		Row firstrow=rows.next();
		Iterator<Cell> ce=firstrow.cellIterator();
		while(ce.hasNext())
		{
			Cell value=ce.next();
		if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
		{
		column =k;
		}
		k++;
	  }
		while(rows.hasNext())
		{
	  Row fcrow=rows.next();
	  if(fcrow.getCell(column).getStringCellValue().equalsIgnoreCase(test))
	  {
		  Iterator<Cell> c=fcrow.iterator();
		  while(c.hasNext())
		  {
			 Cell dcell= c.next(); 
			 if(dcell.getCellTypeEnum()==CellType.STRING)
			 {
			  a.add(dcell.getStringCellValue());
		  }
			 else
			 {
				 a.add(NumberToTextConverter.toText(((Cell) c).getNumericCellValue()));
			 }
	  }
  }
  
	  }	
		
	}
	}
return a;
	}
public static void main(String[] args) throws IOException {
	
	}}
