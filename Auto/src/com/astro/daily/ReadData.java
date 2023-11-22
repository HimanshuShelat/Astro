package com.astro.daily;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellAddress;

public class ReadData {
	public int[] ReadXls() {
		int[] retArr = {0,1,2,3,4,5,6,7,8,9};
		try {

		CellAddress  cellIn1 = new CellAddress ("V9");
		System.out.println(new java.io.File("").getAbsolutePath() + ". Put \"2079 Auto.xls\" file at this place");
		File fout = new File("2079 Auto.xls");
		
		FileInputStream foutNPTemp = new FileInputStream(fout);
	
		HSSFWorkbook wbTemp = new HSSFWorkbook(foutNPTemp);
		
		HSSFSheet stTemp = wbTemp.getSheetAt(0);

		/* READ FROM COMMAND LINE BY CELL ADDRESS
		BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
		CellReference cr = new CellReference(brk.readLine());
		stDeriv.getRow(cr.getRow()).getCell(cr.getCol())  */
		double oiDiff = 0.0; 

		for(int i = 0; i <10; i++) {
		oiDiff = stTemp.getRow(i).getCell(1).getNumericCellValue();
		retArr[i] = (int)Math.round(oiDiff);
		//System.out.println(retArr[i]);
		}
		} catch(Exception e) {
			System.out.println(e);
		}
	
		return retArr;
	}

	

}
