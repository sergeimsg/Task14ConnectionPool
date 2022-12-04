package by.it.academy.hometask.connectionpool.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainConnection {
    public static void main(String[] args) throws ConnectionPollException, SQLException {

        ConnectionPool connectionPool = new ConnectionPool();
        connectionPool.initPoolData();
        Connection con = connectionPool.takeConnection();
        Statement st = null;
        ResultSet rs = null;


            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM city");

            while (rs.next()) {

                System.out.printf("ID %d name %S population %d inhabitans",rs.getInt(1), rs.getString(2),
                        rs.getInt(5));
                System.out.println();
//                System.out.println(rs.getInt(1)+"   " + rs.getString("Name")+"  "+
//                        rs.getString(3) + rs.getString(4) +
//                         rs.getInt("Population"));

            }


        connectionPool.closeConnection(con, st, rs);
        connectionPool.clearConnectionQueue();

    }

}
