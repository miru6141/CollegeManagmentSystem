import java.sql.*;
class ConnectivityExample
{
	public static void main(String  arg[])
	{
		
		try{


	            			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	           			
	            			Connection con = DriverManager.getConnection("jdbc:odbc:kdsn","system","hasan");
					//con.open();
					Statement stm=con.createStatement();

					int roll = Integer.parseInt(arg[0]);
					String str=arg[1];
			
					//System.out.println("Roll = "+roll+" and name = " +str);

					int x=stm.executeUpdate("insert into student values("+roll+",'"+str+"');");
					if (x==1)
							System.out.println("Records successfully inserted  . . . . ");
						else 
							System.out.println("Records not saved .... ");
	           			/*if(!con.isClosed())
					{
	               				 System.out.println("Connection Successful");
            			      }
					else
				       {
	                			System.out.println("Connection is Closed");
	           			}*/
	        	 }
	       		 catch(Exception ex)
			 {
	            			ex.printStackTrace();
	       		 }


	}
}
//%windir%\system32\odbcad32.exe
//%windir%\system32