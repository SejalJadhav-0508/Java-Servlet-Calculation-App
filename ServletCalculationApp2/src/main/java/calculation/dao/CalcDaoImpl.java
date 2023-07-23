package calculation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import calculation.model.Calculation;
import calculation.dao.DbConnection;

public class CalcDaoImpl implements CalcDaoInterface{
	PreparedStatement pstate;

	@Override
	public int store(Calculation calc) {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getDbConnection();
		System.out.println("In dao impl class");
		System.out.println(calc);
		int i=0;
		try {
			
				pstate = con.prepareStatement("insert into Calculation values(?,?,?,?)");
				pstate.setInt(1, calc.getNum1());
				pstate.setInt(2, calc.getNum2());
				pstate.setString(3, calc.getOpr());
				pstate.setInt(4, calc.getRes());
				System.out.println("About to execute");
				i=pstate.executeUpdate();
				if(i>0) {
					System.out.println("Record saved in database!");
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}

}
