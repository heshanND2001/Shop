package model;

import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class test {

    public static void main(String[] args) {

        try {
            String filePath = "src//reports//test.jrxml";

            JasperReport jr = JasperCompileManager.compileReport(filePath);
            
            HashMap parameters = new HashMap();
            
            Connection dataSaurce = MySQL.getConnection();

            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSaurce);
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
