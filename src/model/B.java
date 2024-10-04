package model;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class B {
    
    public static void main(String[] args) {
        
        try {
            
            String x;
            
            if (10<5) {
                x = "WHERE `username`='tharaka'";
            } else {
                x = "";
            }
            
            ResultSet rs = MySQL.search("SELECT * FROM `user` "+x);
            
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
