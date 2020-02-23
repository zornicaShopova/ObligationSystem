import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Data_TaskInput.Data_TInput;

public class Something {

	/*ArrayList<Integer> list = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++)
	{
	  list.add(n_godini);
	}
	DefaultTableModel dt = (DefaultTableModel) table.getModel();
	int years = n;
        for(int i=0; i< years; i++) {
		  for(int j = 0; j <years;j++) {
			int g = j+1;
			String godina = String.valueOf(g);
			table.getColumnModel().getColumn(0);	
		}
	int rows = n;
	int columns = 7 ;
	
	int[][] data = new int[rows][columns];
	  for(int z = 1; z < rows; z++) {
		  for(int l = 1 ;l < columns; l++) {
			  data[1][1] = n;
			  data[1][2] = k;
			  data[1][3] = o;
			  data[1][4] = n;
			  
					  
		  }
	  }  	
	}*/
	
	
	
	//String li,ti,ri,pi,ai_obligacii,Ai_vnoska;
	//private JTable table;
	
	
	/*public Table_R(String li ,String ti ,String ri, String pi, String ai_obligacii , String Ai_vnoska ) {
		ShowTable();
		this.li=li;
		this.ti=ti;
		this.ri=ri;
		this.pi=pi;
		this.ai_obligacii=ai_obligacii;
		this.Ai_vnoska=Ai_vnoska;
		
		
		AddDataToTable();
	}
	
	void AddDataToTable() {

		   
	}*/
	/*String[] col = {"Obligacii_ai","Pi","Li","Ai","Ri","Ti"};
	String[][] dataShow = {{ai_obligacii,pi,li,Ai_vnoska,ri,ti}};
	
	DefaultTableModel dt = (DefaultTableModel) ResultTable.getModel();
	dt.setDataVector(dataShow,col);*/
	
	/*JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Vector<String> rowOne = new Vector<String>();
    rowOne.addElement(li);
    rowOne.addElement(ti);
    rowOne.addElement(ri);
    rowOne.addElement(pi);
    rowOne.addElement(ai_obligacii);
    rowOne.addElement(Ai_vnoska);
    
    Vector<String> rowTwo = new Vector<String>();
    rowTwo.addElement(li);
    rowTwo.addElement(ti);
    rowTwo.addElement(ti);
    
    Vector<Vector> rowData = new Vector<Vector>();
    rowData.addElement(rowOne);
    rowData.addElement(rowTwo);
    
    Vector<String> columnNames = new Vector<String>();
    columnNames.addElement("Obligacii");
    columnNames.addElement("Pi");
    columnNames.addElement("Li");
    columnNames.addElement("Ai");
    columnNames.addElement("Ri");
    columnNames.addElement("Ti");
    
    JTable table = new JTable(rowData, columnNames);

    JScrollPane scrollPane = new JScrollPane(table);
    frame.setVisible(true);*/
    
    
    
//	HOW TO TAKE THE TEHXFIELD FROM DATA INPUT CLASS TO THIS CLASS AND USE IT AS VALUES 
	
	
	//JTextField n_godini = data.txt_n; 
	//JTextField K = data.txtK;
	//JTextField O = data.txtO;
	//JTextField N = data.txtN;
	//JTextField i = data.txt_i;
	
	/*String n_godini = data.txt_n.getText();
	String K = data.txtK.getText();
	String O =data.txtO.getText();
	String N = data.txtN.getText();
	String i = data.txt_i.getText();

	Integer n = Integer.parseInt(n_godini);
	Integer k = Integer.parseInt(K);
	Integer o = Integer.parseInt(O);
	Integer nominal = Integer.parseInt(N);
	Integer percent = Integer.parseInt(i);
	//Mathematical function
	double sum = (percent / 100d);
	double Li = sum*k;
	String li = String.valueOf(Li);
	double Ti = 0;
	String ti = String.valueOf(Ti);
	double ai = Ti/nominal;
	String ai_obligacii = String.valueOf(ai);
	double Pi = ai*nominal;
	String pi = String.valueOf(Pi);
	double Ai = Pi + Li;
	String Ai_vnoska = String.valueOf(Ai);
	double Ri = Ti - Pi;
	String ri = String.valueOf(Ri);
	*/
	
}
