    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lopes
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/macaco?allowPublicKeyRetrieval=true&useSSL=false", 
                    "macaco", "macaco");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
