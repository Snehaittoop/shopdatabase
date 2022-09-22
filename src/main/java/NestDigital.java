import java.util.Scanner;
import java.sql.*;

public class NestDigital {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/iotdb","root","");
            System.out.println("connection created");
            stmt=(Statement) conn.createStatement();
            Scanner input=new Scanner(System.in);
            System.out.println("enter temprature");
            int temp= input.nextInt();
            System.out.println(temp);
            String qry="INSERT INTO `temprature`( `temprature`) VALUES ("+temp+")";
            stmt.executeUpdate(qry);
            System.out.println("succesfully created");

            System.out.println(temp);
        }catch (Exception e){
            System.out.println("not created");

        }
    }
}
