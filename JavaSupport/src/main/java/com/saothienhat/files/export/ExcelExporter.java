package com.saothienhat.files.export;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



public class ExcelExporter
{
    private static final String FILE_PATH = "D:\\testWriteStudents.xlsx";
    //We are making use of a single instance to prevent multiple write access to same file.
    private static final ExcelExporter INSTANCE = new ExcelExporter();

    public static ExcelExporter getInstance()
    {
        return INSTANCE;
    }

    private ExcelExporter()
    {
    }

    public static void main( String args[] )
    {

        List<StudentExcel> studentList = new ArrayList<StudentExcel>();
        studentList.add( new StudentExcel( "Magneto", "90", "100", "80" ) );
        studentList.add( new StudentExcel( "Wolverine", "60", "60", "90" ) );
        studentList.add( new StudentExcel( "ProfX", "100", "100", "100" ) );

        writeStudentsListToExcel( studentList );

    }

    public static void writeStudentsListToExcel( List<StudentExcel> studentList )
    {

        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();

        Sheet studentsSheet = workbook.createSheet( "Students" );

        int rowIndex = 0;
        for( StudentExcel student : studentList )
        {
            Row row = studentsSheet.createRow( rowIndex++ );
            int cellIndex = 0;
            //first place in row is name
            row.createCell( cellIndex++ ).setCellValue( student.getName() );

            //second place in row is marks in maths
            row.createCell( cellIndex++ ).setCellValue( student.getMaths() );

            //third place in row is marks in Science
            row.createCell( cellIndex++ ).setCellValue( student.getScience() );

            //fourth place in row is marks in English
            row.createCell( cellIndex++ ).setCellValue( student.getEnglish() );

        }

        //write this workbook in excel file.
        try
        {
            FileOutputStream fos = new FileOutputStream( FILE_PATH );
            workbook.write( fos );
            fos.close();

            System.out.println( FILE_PATH + " is successfully written" );
        }
        catch( FileNotFoundException e )
        {
            e.printStackTrace();
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }

    }

}
