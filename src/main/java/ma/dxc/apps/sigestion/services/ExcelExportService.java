package ma.dxc.apps.sigestion.services;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ExcelExportService {

    @Autowired DealsServices dealsServices;

    public Workbook exportDealsToXlsx() throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("HPIPO HBIBO");
        Row firstRow = sheet.createRow(0);
        firstRow.createCell(0).setCellValue("ID");
        firstRow.createCell(1).setCellValue("NAME");
        firstRow.createCell(2).setCellValue("DESCRIPTION");
        final int[] rowCount = {1};
        dealsServices.getDeals().forEach(deal -> {
            Row row = sheet.createRow(rowCount[0]);
            row.createCell(0).setCellValue(deal.getId());
            row.createCell(1).setCellValue(deal.getName());
            row.createCell(2).setCellValue(deal.getDescription());
            rowCount[0]++;
        });
        sheet.groupRow(0, rowCount[0]-1);
        sheet.createFreezePane(0, rowCount[0]);
        return workbook;
    }
}
