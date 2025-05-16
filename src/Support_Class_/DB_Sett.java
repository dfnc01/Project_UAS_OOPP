package Support_Class_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Sett {
    public static Connection connect() {
        Connection con = null ;
        try{
            String link ="jdnc:sqlite:DataBase.db";
            con = DriverManager.getConnection(link);
        }catch (SQLException w){
            System.out.println("gagal terhubung"+ w.getMessage());
        }
        return con;
    }
}
