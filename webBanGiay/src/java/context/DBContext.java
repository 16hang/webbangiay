/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.jsp.tagext.TryCatchFinally;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Admin
 */
public class DBContext {

    public Connection getConnection() throws Exception {

        String url = "jdbc:sqlserver://" + serverName + ":" + port + ";databaseName=" + database;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, user, password);
    }

    public final String serverName = "ADMIN";
    public final String user = "sa";
    public final String instance = "";
    public final String password = "hang";
    public final String port = "1433";
    public final String database = "QLBanGiay";
    
}
