package calculation.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import calculation.dao.DbConnection;
import calculation.dao.CalcDaoImpl;
import calculation.dao.CalcDaoInterface;
import calculation.model.Calculation;

public class CalculationInfo {
	Scanner sc= new Scanner(System.in);
	private CalcDaoInterface cdi = null;
	
	//store in collection
	public void store(List<Calculation> calclst){
		
		
		Calculation cobj = calclst.get(0);
		System.out.println(cobj);
		cdi = new CalcDaoImpl();
		int i = cdi.store(cobj);
		System.out.println(i);
	}

}
