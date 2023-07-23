package calculation.controller;

import java.util.List;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculation.info.CalculationInfo;
import calculation.model.Calculation;
import java.util.ArrayList;

/**
 * Servlet implementation class CalculationController2
 */
@WebServlet("/CalculationController2")
public class CalculationController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationController2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet Calculator</h1><br>");
		
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String opr = request.getParameter("opr");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		Calculation calci = new Calculation();
		List<Calculation> calclst = new ArrayList<Calculation>();
		
		calci.setNum1(num1);
		calci.setNum2(num2); 
		
		if(opr.equals("+")) {
			//result=n1+n2;
			calci.setSum(calci.getNum1()+calci.getNum2());
			out.println("<h1>Addition is: "+calci.getSum()+"</h1>");
			
			//to store in db 
			calci.setOpr("Addition");
			calci.setRes(calci.getSum());
			Calculation calci2 = new Calculation(calci.getNum1(),calci.getNum2(),calci.getOpr(),calci.getRes() );
			calclst.add(calci2);
			CalculationInfo cinfo = new CalculationInfo();
			cinfo.store(calclst);
			
		}
		if(opr.equals("-")) {
			//result=n1+n2;
			calci.setSub(calci.getNum1()-calci.getNum2());
			out.println("<h1>Subtraction is: "+calci.getSub()+"</h1>");
			
			//to store in db 
			calci.setOpr("Subtraction");
			calci.setRes(calci.getSub());
			Calculation calci2 = new Calculation(calci.getNum1(),calci.getNum2(),calci.getOpr(),calci.getRes() );
			calclst.add(calci2);
			CalculationInfo cinfo = new CalculationInfo();
			cinfo.store(calclst);
		}
		if(opr.equals("*")) {
			//result=n1+n2;
			calci.setMul(calci.getNum1()*calci.getNum2());
			out.println("<h1>Multiplication is: "+calci.getMul()+"</h1>");
			
			//to store in db 
			calci.setOpr("Multiplication");
			calci.setRes(calci.getMul());
			Calculation calci2 = new Calculation(calci.getNum1(),calci.getNum2(),calci.getOpr(),calci.getRes() );
			calclst.add(calci2);
			CalculationInfo cinfo = new CalculationInfo();
			cinfo.store(calclst);
		}
		if(opr.equals("/")) {
			//result=n1+n2;
			calci.setDiv(calci.getNum1()/calci.getNum2());
			out.println("<h1>Division is: "+calci.getDiv()+"</h1>");
			
			//to store in db 
			calci.setOpr("Division");
			calci.setRes(calci.getDiv());
			Calculation calci2 = new Calculation(calci.getNum1(),calci.getNum2(),calci.getOpr(),calci.getRes() );
			calclst.add(calci2);
			CalculationInfo cinfo = new CalculationInfo();
			cinfo.store(calclst);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
