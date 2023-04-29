package MyQuestions;

import java.sql.Connection;
import java.sql.Statement;

public class SqlException
{
    public static void main(String[] args) {
        Connection con=null;
        try(Statement stmt=con.createStatement()){

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
