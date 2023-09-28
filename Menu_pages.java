import java.lang.*;
import module.*;
import report.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;


  public class Menu_pages extends JFrame 
    {
	private JMenuBar mBar;
	private JMenu mMaster,mSurvey,mReport,mHelp,mExit,mAbout,mTools;
	private JMenuItem mipost,micondidate,miapplication;
	private JMenuItem miquestion,miexam,miapplication_confirm,miresult_issue;
	private JMenuItem miDeveloper,miSoftware,miYes,miNo,miDocu,mibakup,mirestore,michngpasswd,micreateusr;
	private JMenuItem rpost,rcondidate,rapplication;
	private JMenuItem rquestion,rexam,rapplication_confirm,rresult_issue;
	private ImageIcon image;
	private JLabel lblImage,rn,desc,backgr;
	private JPanel pnl,mvpnl;
	private Container mycontainer; 
	private String usrtype,str1;
	int r;

  public Menu_pages(String ss)
    {
	setTitle("WELCOME  IN  STOCK MARKETING & MONITORING OF GOODS ");
	getContentPane().setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	str1=ss.trim();


	
   	 r=0;
	 rn=new JLabel("WELCOME  IN  STOCK MARKETING & MONITORING OF GOODS ");
	 rn.setForeground(Color.cyan);
	
	  rn.setFont(new Font("impact",Font.BOLD,35));
	 rn.setBounds(0,10,1365,30);
	
	
	Timer tm=new Timer(500,new timerListener());
	tm.start();
	
	pnl = new JPanel();
	image=new ImageIcon("library4.jpg");
	pnl.setLayout(null);
	pnl.setBackground( new Color(126,2,5));	
	lblImage=new JLabel(image);
	lblImage.setBounds(0,45,1365,580);
	backgr=new JLabel(new ImageIcon("copi3.jpg"));
	backgr.setBounds(0,0,1365,600);
	
	desc=new JLabel("    DEVELOPED BY :- SONAMATI         RAUNAQUE        HEENA         TARANNUM                                     ROLL NO :- 10             26           36            35");
	desc.setFont(new Font("Arial",Font.BOLD,20));	
	desc.setForeground(Color.cyan);
	desc.setBounds(0,640,1365,20);

	mycontainer=getContentPane();
        mycontainer.setLayout(new GridLayout(1,1));
        pnl.add(rn);
        pnl.add(lblImage);
        pnl.add(desc);
        pnl.add(backgr);
	mycontainer.add(pnl);

	mBar = new JMenuBar();
	mMaster = new JMenu("Master Entry   ");
	mMaster.setMnemonic('M');
	mSurvey = new JMenu("Transaction Entry   ");
	mSurvey.setMnemonic('T');
	mReport = new JMenu("Report     ");
	mReport.setMnemonic('R');
	mHelp = new JMenu("Help       ");
	mHelp.setMnemonic('H');
	mExit = new JMenu("Exit       ");
	mExit.setMnemonic('X');
	mAbout = new JMenu("About     ");
	mTools=new JMenu("Tools       ");
	mTools.setMnemonic('O');

	
	
	mipost = new JMenuItem("ITEM DETAIL");
	micondidate = new JMenuItem("PRODUCT DETAIL");
	miapplication = new JMenuItem("REPRESENTATIVE");
	
	

	miquestion = new JMenuItem("MARKETINGZONE DETAIL");
	miexam = new JMenuItem("MONTHLYTASK");
	miapplication_confirm = new JMenuItem("REPRESENTATIVEATTENDENTSHEET");

	miresult_issue = new JMenuItem("REPRACHVDETAILS ");

	

	miDeveloper = new JMenuItem("Developer");
	miSoftware = new JMenuItem("Software");
	miYes = new JMenuItem("Yes");
	miNo = new JMenuItem("No");
	miDocu = new JMenuItem("Documentation");
	mibakup=new JMenuItem("BackUp");
	mirestore=new JMenuItem("Restore");
	michngpasswd=new JMenuItem("Change Password");
	micreateusr=new JMenuItem("Manage User");


	rpost = new JMenuItem("Item Detail  Report");
	rcondidate = new JMenuItem(" Product Detail Report ");
	rapplication = new JMenuItem("Marketingzone Detail Report");

	rquestion = new JMenuItem(" Representative Detail Report ");
	rexam = new JMenuItem("Monthlytask Detail Report ");
	rapplication_confirm = new JMenuItem("Representativeattendensheet Detail Report ");

	rresult_issue = new JMenuItem("Reprachvdetails Detail Report  ");


	
	
	mMaster.add(mipost);
	mMaster.add(micondidate);
	mMaster.add(miapplication);
	
	mSurvey.add(miquestion);
	mSurvey.add(miapplication_confirm);

	mSurvey.add(miexam);
	mSurvey.add(miresult_issue);



	mHelp.add(mAbout);
	mAbout.add(miSoftware);
	mAbout.add(miDeveloper);
	mHelp.add(miDocu);

	mExit.add(miYes);
	
	mTools.add(mibakup);
	mTools.add(mirestore);
	mTools.add(micreateusr);
	mTools.add(michngpasswd);
	

	setJMenuBar(mBar);
	mBar.add(mMaster);
	mBar.add(mSurvey);
	mBar.add(mReport);
	mBar.add(mTools);
	mBar.add(mHelp);
	mBar.add(mExit);
	
	mReport.add(rpost);
	mReport.add(rcondidate);
	mReport.add(rapplication);

	mReport.add(rquestion);
	mReport.add(rapplication_confirm);

	mReport.add(rexam);
	mReport.add(rresult_issue);


	mipost.addActionListener(new menuListener());
	micondidate.addActionListener(new menuListener());
	miapplication.addActionListener(new menuListener());
	
	

	miquestion.addActionListener(new menuListener());
	miexam.addActionListener(new menuListener());
	miapplication_confirm.addActionListener(new menuListener());
	
	miresult_issue.addActionListener(new menuListener());
	

	miSoftware.addActionListener(new menuListener());
	miDocu.addActionListener(new menuListener());
	miDeveloper.addActionListener(new menuListener());
	miYes.addActionListener(new menuListener());
	mibakup.addActionListener(new menuListener());
	mirestore.addActionListener(new menuListener());
	michngpasswd.addActionListener(new menuListener());
	micreateusr.addActionListener(new menuListener());

	rpost.addActionListener(new reportListener());
	rcondidate.addActionListener(new reportListener());
	rapplication.addActionListener(new reportListener());

	rquestion.addActionListener(new reportListener());
	rexam.addActionListener(new reportListener());
	rapplication_confirm.addActionListener(new reportListener());

	rresult_issue.addActionListener(new reportListener());

    	try
		{
			try
			{
				String tmp="LOCAL";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection conn=DriverManager.getConnection("jdbc:odbc:hdsn","system","hasan");
				Statement stat=conn.createStatement();
				ResultSet rs=stat.executeQuery(" select usertype from stocklogin where username='"+str1.trim()+"'");
				rs.next();
				String str=rs.getString(1);		
				if(tmp.equalsIgnoreCase(str.trim()))
				mMaster.setEnabled(false);
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(null,"error in Creating Connection","Database Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Not connected to Database","DataBase Error",JOptionPane.ERROR_MESSAGE);
		}
		
		
		mBar.setBackground(new Color(140,251,248));
		mipost.setBackground(new Color(245,222,220));
		micondidate.setBackground(new Color(245,222,220));
		miapplication.setBackground(new Color(245,222,220));
	
		miquestion.setBackground(new Color(245,222,220));
	
		miexam.setBackground(new Color(245,222,220));
		miapplication_confirm.setBackground(new Color(245,222,220));
		miresult_issue.setBackground(new Color(245,222,220));
		
		rpost.setBackground(new Color(245,222,220));
		rcondidate.setBackground(new Color(245,222,220));
		rapplication.setBackground(new Color(245,222,220));
		rquestion.setBackground(new Color(245,222,220));

		rexam.setBackground(new Color(245,222,220));
		rapplication_confirm.setBackground(new Color(245,222,220));
		rresult_issue.setBackground(new Color(245,222,220));

		miDeveloper.setBackground(new Color(245,222,220));
		miYes.setBackground(new Color(245,222,220));
		mibakup.setBackground(new Color(245,222,220));
		mirestore.setBackground(new Color(245,222,220));
		miDocu.setBackground(new Color(245,222,220));
		miSoftware.setBackground(new Color(245,222,220));
		michngpasswd.setBackground(new Color(245,222,220));
		micreateusr.setBackground(new Color(245,222,220));
		mAbout.setBackground(new Color(245,222,220));
		mHelp.setBackground(new Color(245,222,220));

		setSize(1365,730);
	setLocation(0,0);
	setResizable(false);
	setVisible(true);
	}

private class menuListener implements ActionListener
  {
  public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==mipost)
       {
            //new book_detail();
		new item();
       }
      if(e.getSource()==micondidate)
       {
    		new product();
		
       }
	
      if(e.getSource()==miapplication)
       {
         	
		
		new representative();
       }
	
      if(e.getSource()==miquestion)
       {
          
		new marketingzone();
       }
      if(e.getSource()==miexam)
       {
       		
		new monthlytask();
       }
      if(e.getSource()==miapplication_confirm)
       {
          	
		new reprachvdetails();
       }
    
      if(e.getSource()==miresult_issue)
       {
     		new purchase();
       }
     
        if(e.getSource()==miDocu)
       {
       	try
       	{
       		Process p=Runtime.getRuntime().exec("I:/Program Files/Microsoft Office/OFFICE11/winword.exe ABHISHEK.doc"); 
       		
       	}
       	catch(IOException io)
       	{
       		JOptionPane.showMessageDialog(null,"Some Internal Problem"+io,"ERROR",JOptionPane.ERROR_MESSAGE);
       	} 
         
       }
      if(e.getSource()==miSoftware)
      {
         aboutSoftware abs = new aboutSoftware();
       }
      if(e.getSource()==miDeveloper)
       {
         aboutDeveloper abd = new aboutDeveloper();
       }
      if(e.getSource()==miYes)
       {
         int n = JOptionPane.showConfirmDialog(null, "Would you really want to EXIT","Confirmation",JOptionPane.YES_NO_OPTION);
         if (n == JOptionPane.YES_OPTION) 
	    System.exit(0);			 
       }
       if(e.getSource()==mibakup)
       {
       	try
       	{
       		String nm;
       		int n = JOptionPane.showConfirmDialog(null, "ARE U SURE TO TAKE BAKUP OF THE FILE","Confirmation",JOptionPane.YES_NO_OPTION);
         if (n == JOptionPane.YES_OPTION) 
         {
       		nm=JOptionPane.showInputDialog(null,"PLEASE ENTER A BAKUP FILE NAME TO BE CREATE \n OTHERWISE DEFAULT NAME bkp WILL BE USED","bkp");
       		if(nm==null||nm.compareTo("")==0)
       			nm="bkp";
       		Process p=Runtime.getRuntime().exec("exp USERID=system/sahab BUFFER=2000 FILE="+nm+" ROWS=yes TABLES=post_master,condidate_master,application_master,question_master,application_confirm,exam_master,result_issue RECORD=yes TRIGGERS=yes CONSTRAINTS=YES"); 
       	
       		JOptionPane.showMessageDialog(null,"TAKING BACKUP OF THE DATABASE ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
       	}
       	}
       	catch(IOException io)
       	{
       		JOptionPane.showMessageDialog(null,"Sorry we Can't take Backup"+io,"ERROR",JOptionPane.ERROR_MESSAGE);
       		
       	} 
       
       		
       }
       if(e.getSource()==mirestore)
       {
       	try
       	{
       			String nm;
       			int n = JOptionPane.showConfirmDialog(null, "ARE U SURE TO RESTORE","Confirmation",JOptionPane.YES_NO_OPTION);
         if (n == JOptionPane.YES_OPTION) 
         {
       		nm=JOptionPane.showInputDialog(null,"please enter the bakup File name to be restored \n OTHERWISE DEFAULT NAME bkp FILE WILL BE USED","bkp");
       		if(nm==null||nm.compareTo("")==0)
       			nm="bkp";
       		Process p=Runtime.getRuntime().exec(" imp  USERID=farheen/kausar BUFFER=2000 FILE=oracle.dmp IGNORE=yes ROWS=yes TABLES=post_master,condidate_master,application_master,question_master,application_confirm,exam_master,result_issue  CONSTRAINTS=YES");  
       		
       		JOptionPane.showMessageDialog(null,"RESTORING DATABASE FROM BACKUP FILE ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
       	}
       	}
       	catch(IOException io)
       	{
       		JOptionPane.showMessageDialog(null,"Sorry we Can't RESTORE"+io,"ERROR",JOptionPane.ERROR_MESSAGE);
       	} 
       	
       }
       if(e.getSource()==michngpasswd)
       {
       		//new ChangePassword(str1);
       }
       if(e.getSource()==micreateusr)
       {
       		//new CreateUser(str1);
       }
     }
   }

private class reportListener implements ActionListener
  {
  public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==rpost)
       {
         new item_report();
       }
      if(e.getSource()==rcondidate)
       {
          new  product_report();
       }
      if(e.getSource()==rapplication)
       {
        new  marketingzone_report();
       }
	
	 
      if(e.getSource()==rquestion)
       {
         new  representative_report();
       }
      if(e.getSource()==rexam)
       {
         new monthlytask_report();
       }
      if(e.getSource()==rapplication_confirm)
       {
        new representativeattndsheet_report();
       }
      if(e.getSource()==rresult_issue)
       {
         new reprachvdetails_report();
       }
         
     
      
     }
   }
   
   private class timerListener implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {	
   		
   		rn.setLocation(r,10);
   			r=r+20;
   			if(r>=1060)
   			r=0;

   	}
   
   	
   }
   
   


 public static void main(String arg[])
    {

	new Menu_pages(arg[0]);
    }
  }
