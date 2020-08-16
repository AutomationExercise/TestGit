package co.edureka.utility;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel 
{
	public static String[][] getdata (String filename, sheetname)
	{
		
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new SXXFWorkbook();
		Sheet sh = wb.getSheet(sheetname);
		int rowNum = sh.getLastRowNum();
		int colNum = sh.getRowHeight(0).getLastCellNum();
		
		String[][] data = new String[rowNum][colNum];	
		
		for(int i=0; i<rowNum; i++)
		{
			Row row = sh.getRow(i);
			
			for (int j=0; j<colNum; j++)
			{
				Cell cell = row.getCell();
				
				String value= new DataFormater().formateCellValue(cell);
				data[i][j];
			}
		
	}
		
		return data;
	}
	


}
