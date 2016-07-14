package etc.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadExcel {

	String fileName = "program2.xls";

	@Test
	public void testName() throws Exception {
		System.out.println("exist " + new File(fileName).exists());
		try (FileInputStream fileInputStream = new FileInputStream(new File(fileName))) {

			Workbook workbook = WorkbookFactory.create(fileInputStream);

			int sheetCn = workbook.getNumberOfSheets();
			log.info("sheetCn : {} ", sheetCn);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = (Row) rowIterator.next();
				log.info("row : {}", row);
				Iterator cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = (Cell) cellIterator.next();
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
