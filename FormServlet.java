// import java.io.IOException;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// @WebServlet("/submitForm")
// public class FormServlet extends HttpServlet {
//     private static final long serialVersionUID = 1L;

//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         String nzetaReference = request.getParameter("nzeta_reference");
//         String passportNumber = request.getParameter("passport_number");
//         String nationality = request.getParameter("nationality");
//         int expiryDay = Integer.parseInt(request.getParameter("expiry_day"));
//         int expiryMonth = Integer.parseInt(request.getParameter("expiry_month"));
//         int expiryYear = Integer.parseInt(request.getParameter("expiry_year"));
//         int dobDay = Integer.parseInt(request.getParameter("dob_day"));
//         int dobMonth = Integer.parseInt(request.getParameter("dob_month"));
//         int dobYear = Integer.parseInt(request.getParameter("dob_year"));

//         String jdbcURL = "jdbc:mysql://localhost:3306/nzeta_db";
//         String dbUser = "root";
//         String dbPassword = "root";

//         String sql = "INSERT INTO nzeta_status (nzeta_reference, passport_number, nationality, expiry_day, expiry_month, expiry_year, dob_day, dob_month, dob_year) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

//         try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
//              PreparedStatement statement = connection.prepareStatement(sql)) {

//             statement.setString(1, nzetaReference);
//             statement.setString(2, passportNumber);
//             statement.setString(3, nationality);
//             statement.setInt(4, expiryDay);
//             statement.setInt(5, expiryMonth);
//             statement.setInt(6, expiryYear);
//             statement.setInt(7, dobDay);
//             statement.setInt(8, dobMonth);
//             statement.setInt(9, dobYear);

//             int rows = statement.executeUpdate();

//             if (rows > 0) {
//                 System.out.println("A new user has been inserted successfully.");
//             }
//         } catch (SQLException ex) {
//             ex.printStackTrace();
//         }
//     }
// }
