package com.astro.daily;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
/*
 * nifty cash volume: take a market watch of nifty and then to excel and calculate volume of each
 *  stock and addup. for options have an input for cell number and from that cell number get 1 
 *  in the money 1 out of the money and one at the money row for call and put and calculate the 
 *  volume and money flow data. for future take curret month future in a separate spread sheet or
 *   the same and do calculations
 
 */
public class test {

	public static void main (String[] args) throws Exception {
	
		CellAddress  cellIn1 = new CellAddress ("V9");
		for(int i = 1; i <4; i++) {		
		File fout = new File("C:\\Users\\HIMAN\\Documents\\Win7\\Documents\\Documents\\Stocks\\sharekhan\\Daily trades\\Nitinji\\2079 Auto.xls");
//		File deriv = new File("C:\\Sharekhan\\TradeTigerNew\\User Data\\himanshu1969\\SnapToExcel\\opt fut.xls");
		File npAuto = new File("C:\\Sharekhan\\TradeTigerNew\\User Data\\himanshu1969\\SnapToExcel\\2079 Auto.xls");
		
		
		
		FileInputStream foutNPTemp = new FileInputStream(fout);
		FileInputStream finDeriv = new FileInputStream("C:\\Sharekhan\\TradeTigerNew\\User Data\\himanshu1969\\SnapToExcel\\opt fut.xls");
		FileOutputStream foutNp = new FileOutputStream(npAuto);
	
		HSSFWorkbook wbTemp = new HSSFWorkbook(foutNPTemp);
		HSSFWorkbook wbDeriv = new HSSFWorkbook(finDeriv);
		//HSSFWorkbook wbNPout = new HSSFWorkbook();
		
		//wbNPout.createSheet("FUTURE")
		HSSFSheet stTemp = wbTemp.getSheetAt(0);
		HSSFSheet stDeriv = wbDeriv.getSheetAt(1);
		/* READ FROM COMMAND LINE BY CELL ADDRESS
		BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
		CellReference cr = new CellReference(brk.readLine());
		stDeriv.getRow(cr.getRow()).getCell(cr.getCol())  */
		double oiDiff = 0.0; 
		double vol = 0.0;
		double BigPlrRto = 0.0;
		HistoryData futureCargo = new HistoryData();
		//HistoryData futurePrev = new HistoryData();
		
			oiDiff = stDeriv.getRow(10).getCell(6).getNumericCellValue();
			vol = stDeriv.getRow(8).getCell(8).getNumericCellValue();
			BigPlrRto = oiDiff/vol;
			setValues(8,futureCargo,stDeriv); 
			//writeRow(1,1,futureCargo,stTemp,foutNp,wbTemp);
			write(i,oiDiff);
			foutNPTemp.close(); finDeriv.close(); foutNp.close(); 
			System.out.println(BigPlrRto + " kk " + oiDiff + " kk " + vol + "  kk " + futureCargo.getBidQty()); 
			//if(brk.readLine() != null) break;
			//TimeUnit.MINUTES.sleep(1);
			
			
	
			wbDeriv.close(); wbTemp.close();
			foutNp.close(); finDeriv.close(); foutNPTemp.close();
			System.gc();
			TimeUnit.MINUTES.sleep(1);
		}
		 
		
	}
	public static void setValues(int row, HistoryData subject, HSSFSheet card) {
		
		subject.setBidQty(card.getRow(row).getCell(7).getNumericCellValue());
		subject.setBidPrice(card.getRow(row).getCell(8).getNumericCellValue());
		subject.setAskPrice(card.getRow(row).getCell(9).getNumericCellValue());
		subject.setAskQty(card.getRow(row).getCell(10).getNumericCellValue());
		subject.setOpen(card.getRow(row).getCell(11).getNumericCellValue());
		subject.setHigh(card.getRow(row).getCell(12).getNumericCellValue());
		subject.setLow(card.getRow(row).getCell(13).getNumericCellValue());
		subject.setClose(card.getRow(row).getCell(14).getNumericCellValue());
		
		subject.setQty(card.getRow(row).getCell(18).getNumericCellValue());
		subject.setTotalBuy(card.getRow(row).getCell(19).getNumericCellValue());
		subject.setTotalSell(card.getRow(row).getCell(20).getNumericCellValue());
		subject.setChangeInOi(card.getRow(row).getCell(21).getNumericCellValue());
		subject.setPreviousClose(card.getRow(row).getCell(27).getNumericCellValue());
		
		
	
	}
public static void writeRow(int cellNum, int rowNum, HistoryData subject, HSSFSheet card,FileOutputStream foutNp, HSSFWorkbook temp) {
		
		/*
		subject.getHigh();
		subject.getLow();
		subject.getClose();
		
		subject.getQty();
		subject.getChangeInOi();
		subject.getPreviousClose(); */
		System.out.println("This is the expected value in the card " + subject.getHigh() + " At column " + cellNum + " row " + rowNum);
		Row row = card.createRow(rowNum);
	    row.createCell(cellNum).setCellValue("subject.getHigh()");;
	    
	   
	    // Write the output to a file
	    try {
	    temp.write(foutNp);
	    System.out.println("kkkkkkggggkkkkkkkkkkkkkkkkkkkkkkk");
	    
	    }
		catch (Exception e) {
			System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		}
	
	}

public static void write(int rowNum, double iodff){
	   try
	   {
	       FileInputStream myxls = new FileInputStream("2079 Auto.xls");
	       HSSFWorkbook studentsSheet = new HSSFWorkbook(myxls);
	       HSSFSheet worksheet = studentsSheet.getSheetAt(0);
	       int lastRow=worksheet.getLastRowNum();
	       System.out.println(lastRow);
	       Row row = worksheet.createRow(rowNum);
	       row.createCell(1).setCellValue(String.valueOf(iodff));
	       myxls.close();
	       FileOutputStream output_file =new FileOutputStream(new File("2079 Auto.xls"));  
	       //write changes
	       studentsSheet.write(output_file);
	       output_file.close();
	       System.out.println(" is successfully written");
	    }
	    catch(Exception e)
	    {
	    }
	}
}
