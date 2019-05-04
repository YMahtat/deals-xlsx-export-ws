package ma.dxc.apps.sigestion.controllers;


import ma.dxc.apps.sigestion.services.ExcelExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;


@RestController
@RequestMapping("/export")
public class ExcelExportController {

    @Autowired ExcelExportService excelExportService;

    @Value("${export.excel.deals}") String dealsExcelFileName;

    @GetMapping("/deals")
    public void getDealsExcelFile(HttpServletResponse response) throws IOException {
        response.setContentType("");
        //response.setHeader("Content-disposition","attachment; filename=" + dealsExcelFileName);
        response.setHeader("Content-disposition","filename=" + dealsExcelFileName);
        //response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setContentType("application/vnd.ms-excel");
        excelExportService.exportDealsToXlsx().write(response.getOutputStream());
    }
}
