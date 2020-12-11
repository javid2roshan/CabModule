package register.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import register.dao.DriverDao;
import register.model.Driver;

@WebServlet("/register")
public class DriverServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DriverDao driverDao;

    public void init() {
        driverDao = new DriverDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNo = request.getParameter("phoneNo");
        String licenseNo = request.getParameter("licenseNo");
        String carNo = request.getParameter("carNo");
             
        Driver driver = new Driver();
        boolean isValidPhoneNumber = driver.validatePhoneNo(phoneNo);
        boolean isValidFields = driver.validateFields();
        if (!isValidPhoneNumber || !isValidFields) {
        	request.setAttribute("errorMessage", "Invalid Credentials!!");
        	request.getRequestDispatcher("/WEB-INF/views/driverregister.jsp").forward(request, response);
        }
        else {
            driver.setName(name);
            driver.setEmail(email);     
            driver.setPhoneNo(phoneNo);
            driver.setLicenseNo(licenseNo);
            driver.setCarNo(carNo);
        }
        
        try {
            driverDao.registerDriver(driver);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("driverregister.jsp");
    }
}