package testdata;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
	public static int totalRow;
	public List<Map<String,String>> getData(String ExcelFilePath, String SheetName) throws Exception, IOException
	{
		Workbook workbook=WorkbookFactory.create(new File(ExcelFilePath));
		Sheet sheet=workbook.getSheet(SheetName);
		workbook.close();
		return readdata(sheet);
		
	}

	private List<Map<String, String>> readdata(Sheet sheet) {
		// TODO Auto-generated method stub
		Row row;
		Cell cell;
		
		totalRow = sheet.getLastRowNum();
		
		List<Map<String,String>> excelRows=new ArrayList<Map<String,String>>();
		for(int currentrow=1;currentrow<=totalRow;currentrow++)
		{
			row=sheet.getRow(currentrow);
			int totalColumn=row.getLastCellNum();
			LinkedHashMap<String,String> columnMapdata=new LinkedHashMap<String,String>();
			for(int currentColumn=0;currentColumn<totalColumn;currentColumn++)
			{
				 cell = row.getCell(currentColumn);
				String columnHeaderName=sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();
				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
				
			}
			excelRows.add(columnMapdata);
		}
		return excelRows;
			
		}
	public int countRow() {
		return totalRow;
	}
}

		
		
		
		
		
		
