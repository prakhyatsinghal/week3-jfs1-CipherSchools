create database books;         
use booksdb;

create table books (
    book_id int primary key,
    title varchar(255),
    author varchar(255),
    piece int
);
 
select * from books;




import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;                
public class Test0{
    public static void main(String[] args){
        
        try{
           
            Class.forName("com.mysql.c.jdbc.Driver");
            //step2: create the connection object
            String connectionURL="jdbc:mysql://localhost/booksdb";
           
            int bid = 102;
            String bookTitle ="Sql Essentials";
            String author = "Jerry Rig";
            int price = 295;
            
            String insertQuery=
            String.format("delete from books where id = %d".101);
            Connection conn = DriverManager.getConnection(connectionURL,"root","<passwordhere>");
            System.out.println(insertQuery);

          Statement stmt = conn.createStatement();
          String selectQuery ="select * from books";
          ResultSet result = stmt.executeQuery(selectQuery);
          while(result.next()){
              System.out.println(result.getString(1)+" "+result.getString(2));
          }
        }
        catch(Exception e){
            e.printStackTrace();
            
            
        }
    }
    
}