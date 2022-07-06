package manage_students;
import java.sql.*;
import java.util.Scanner;
// public class StudentsMain {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         while(true){
//         System.out.println("Enter 1 to Add");
//         System.out.println("Enter 2 to Delete");
//         System.out.println("Enter 3 to Display");
//         System.out.println("Enter 4 to Exit");
//         int i = input.nextInt();
//         if(i==1){
//            System.out.println("Enter Student_id");
//            int s_id = input.nextInt();
//            System.out.println("Enter Student_name");
//            input.next();
//            String s_name = input.nextLine();
//            System.out.println("Enter Student_City");
//            String s_city = input.nextLine();
//            System.out.println("Enter Student_phone");
//            String s_phone = input.nextLine();
//            Student s = new Student(s_id,s_name, s_city, s_phone);
//            System.out.println("Inserted values are "+s);
//            StudentStatement.executequery(s);
//         }
//         else if(i==2){

//         }
//         else if(i==3){

//         }
//         else if(i==4){
//           break;
//         }
//         else{
//          System.out.println("Something went wrong , enter right input");
//         }
//         }
//     }
// }

// class Student{
//     private int student_id;
//     private String student_name;
//     private String student_city;
//     private String student_phone;

//     Student(int student_id,String student_name,String student_city,String student_phone){
//       this.student_id = student_id;
//       this.student_name = student_name;
//       this.student_city = student_city;
//       this.student_phone = student_phone;
//     }
//     Student(String student_name,String student_city,String student_phone){
//         this.student_name = student_name;
//         this.student_city = student_city;
//         this.student_phone = student_phone;
//       }
//     public String toString(){
//         return this.student_name +","+this.student_city+","+this.student_phone;
//     }
//     public int get_id(){
//         return this.student_id;
//     }
//     public String get_name(){
//         return this.student_name;
//     } 
//     public String get_city(){
//         return this.student_city;
//     } 
//     public String get_phone(){
//         return this.student_phone;
//     }

// }

// class StudentConnection{
//     static Connection con;
//     public static Connection Createcon(){
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             con =  DriverManager.getConnection
//             ("jdbc:mysql://localhost:3306/students?autoReconnect=true&useSSL=false","root", "Bansal@123");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return con ;
//     }
// }

// class StudentStatement{
//    public static void executequery(Student s){
//        try {
//         Connection cp;
//         cp = StudentConnection.Createcon();
//         String sql = "insert into students_detail values(?,?,?,?)";
//         PreparedStatement ss = cp.prepareStatement(sql);  
//         ss.setInt(1, s.get_id());  
//         ss.setString(2,s.get_name());
//         ss.setString(3,s.get_city());
//         ss.setString(4,s.get_phone());
//         ss.executeUpdate();
//        } catch (Exception e) {
//         e.printStackTrace();
//        }
//    }
// }

// // //  createStatement is used for static queries
// // //  preparestatement is used for dynamic queries
// // //  means we can't pass parameters in static queries
// // //  so prepared statements are used for parameteric sql statements




// // package manage_students;
// // import java.sql.*;
// // import java.util.Scanner;
// // public class StudentsMain{
// //  public static void main(String[] args) {
// //    try {
// //     Class.forName("com.mysql.cj.jdbc.Driver");
// //     Connection con = DriverManager.getConnection
// //     ("jdbc:mysql://localhost:3306/students?autoReconnect=true&useSSL=false","", "Bansal@123");
// //     PreparedStatement pstmt = con.prepareStatement("Insert into students_detail values(?,?,?,?)");
// //     pstmt.setInt(1, 1);
// //     pstmt.setString(2, "sks");
// //     pstmt.setString(3, "frd");
// //     pstmt.setString(4, "54356455");
// //     pstmt.executeUpdate();
// //    } catch (Exception e) {
// //        e.printStackTrace();
// //    }
// //  }
// // }


// // class StudentsConnection{
// //     static Connection con;
// //     public static Connection createConnection(Connection con ){root
// //         try {
           
// //         } catch (Exception e) {
// //             e.printStackTrace();
// //         }
// //         return con;
// //     }
// // }
class getConnection{
    
    Connection con;
    
        getConnection(String url , String u_name , String pass)throws ClassNotFoundException , SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, u_name, pass);
            this.con = con;
         }
 
    
}
public class StudentsMain{
    public static void main(String[] args) {
        try {
            String url= "jdbc:mysql://localhost:3306/students?autoReconnect=true&useSSL=false";
        String u_name = "root";
        String pass = "Bansal@123";
        getConnection gc = new getConnection(url, u_name, pass);
        String sql = "insert into students_detail values(?,?,?,?)";
        PreparedStatement pstmt =  gc.con.prepareStatement(sql);
        pstmt.setInt(1, 2);
        pstmt.setString(2, "hsh");
        pstmt.setString(3, "del");
        pstmt.setString(4, "52232434");
        pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}