/*
 * coursework.java
 * 
 * Copyright 2024 Vihanga <vihanga@MSI>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 			+-------------------------------------------+
 *			| 											|
 *///       |PASSWORD-2022731----------USERnAME-Vihanga |
 //			|											|
//			+-------------------------------------------+
import java.util.*;
public class coursework{
	public static void user(String[]p,String[]u,String[][]s,String[]c,String[][]i){
		System.out.println("\n\n");
		System.out.println("                          +============================================+");
        System.out.println("                          |                                            |");
        System.out.println("                          |              LOGGING INTO ACCOUNT          |");
        System.out.println("                          |                                            |");
        System.out.println("                          +============================================+");
        while(true){
        System.out.println();
        System.out.print("\t\t\t\tUSER NAME |");
		String usr=new Scanner(System.in).nextLine();
		{
		if (usr.equals(u[0]))
		{
		System.out.println("\t\t\t\tHey...! "+ usr);
					pwd(p,u,s,c,i);
					break;
		}
        else{System.out.println("\t\t\t\tInvalid USER-NAME! [Try Again...!]");
					
			}
		}}}
	public static void pwd(String[]p,String[]u,String[][]s,String[]c,String[][]i){
		while(true){
				System.out.println();
				System.out.print("\t\t\t\tPASSWORD  |");
				String pwd=new Scanner(System.in).nextLine();
				if (pwd.equals(p[0]))
				{	
					clearConsole();
					welcomeMsg();
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+------------------------------------+");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|         Loging SUCCESSFUL!         |");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+------------------------------------+");
					System.out.println();
					checkConditon(p,u,s,c,i);	
					break;
				}
				else
				{
					System.out.println("\t\t\t\tInvalid PASSWORD! [Try Again...!]");
					//user(p,u);
				}		
			}
		}
		public static void checkConditon(String[]p,String[]u,String[][]s,String[]c,String[][]i){
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
			System.out.print("\t\t\t[1]-->Change the Credential");	System.out.println("\t\t[4]-->Log Out");
			System.out.print("\t\t\t[2]-->Suplier Manage");			System.out.println("\t\t\t[5]-->Exit the System");
			System.out.println("\t\t\t[3]-->Stock Manage\n\n");
			
			System.out.print("\tEnter Your Option >");
			int option=new Scanner(System.in).nextInt();
				switch (option){
				case 1->changeCredential(p,u,s,c,i);
				case 4->logOut(p,u,s,c,i);
				case 5->exit(p,u);	
				case 2->suplierManageDevision(p,u,s,c,i);
				case 3->stockManageDevision(p,u,s,c,i);
				}
			
			}
		public static void changeCredential(String[]p,String[]u,String[][]s,String[]c,String[][]i){
			System.out.println("\n\tEnter Your current PASSWORD To VERIFY it's YOU...!");
			while(true){
				System.out.print("\n\tCURRENT PASSWORD |");
				String passwd=new Scanner(System.in).nextLine();
					if (p[0].equals(passwd))
					{
						System.out.print("\n\tENTER NEW PASSWORD |");
						String newpwd=new Scanner(System.in).nextLine();
						p[0]=newpwd;
						System.out.println("\n\n\tPassword Changed SUCCESFULLY\n");
						
						System.out.print("Do You Want To Go HOME PAGE[y/n] >");
							String con=new Scanner(System.in).nextLine();
							switch (con){
								case "y","Y"->{clearConsole(); welcomeMsg(); checkConditon(p,u,s,c,i);}
								case "n","N"->user(p,u,s,c,i);
								}
								break;
					}
					else{System.out.println("\tInvalid PASSWORD! [Try Again...!]");}
				}
			}
		public static void exit(String[]p,String[]u){
				Runtime.getRuntime().exit(0); 
			}
		private final static void clearConsole() {
		final String os = System.getProperty("os.name");
		try {
		if (os.equals("Linux")) {
		System.out.print("\033\143");
		} else if (os.equals("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		}
		} catch (final Exception e) {
		//handle the exception
		System.err.println(e.getMessage());
		}
		}
		 public static void welcomeMsg(){
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t\t+==============================================================================+");
			System.out.println("\t\t\t\t\t\t\t\t\t|                             IJSE STOCK MANAGEMENT SYSTEM                     |");
			System.out.println("\t\t\t\t\t\t\t\t\t|        ---Copyright 2024 Vihanga <vihanga@MSI>NIMSARA_SOFTWARE.Inc.---       |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t+==============================================================================+");
			 }
		 public static void suplierDivMsg(){
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t\t+==============================================================================+");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                             IJSE STOCK MANAGEMENT SYSTEM                     |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                               SUPPLIER MANAGE DIVISION                       |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t+==============================================================================+\n\n");
			 }
		 public static void stockDivMsg(){
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t\t+==============================================================================+");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                             IJSE STOCK MANAGEMENT SYSTEM                     |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                STOCK MANAGE DIVISION                         |");
			System.out.println("\t\t\t\t\t\t\t\t\t|                                                                              |");
			System.out.println("\t\t\t\t\t\t\t\t\t+==============================================================================+\n\n");
			 }
		public static void suplierManageDevision(String[]p,String[]u,String[][]s,String[]c,String[][]i){
			clearConsole();
			suplierDivMsg();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
			System.out.print("\t\t\t[1]-->Add Suplier");	System.out.println("\t\t[4]-->View Suplier");
			System.out.print("\t\t\t[2]-->Update Suplier");	System.out.println("\t\t[5]-->Search Suplier");
			System.out.print("\t\t\t[3]-->Delete Suplier");  System.out.println("\t\t[6]-->Home Page\n\n");
			
			System.out.print("\tEnter Your Option >");
			int op=new Scanner(System.in).nextInt();
				switch (op){
				case 6->homePage(p,u,s,c,i);
				case 1->{
				clearConsole();
				suplierDivMsg();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|           ADD SUPPLIERS            |");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				System.out.println();
				addSuplier(p,u,s,c,i);
					}
				case 2 ->{
				clearConsole();
				suplierDivMsg();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|           UPDATE SUPPLIERS         |");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				System.out.println();
				updateSuplier(p,u,s,c,i);
					}
				case 5 ->{
				clearConsole();
				suplierDivMsg();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|           SEARCH SUPPLIERS         |");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				System.out.println();
				search(p,u,s,c,i);
					}
				case 4 ->{
					clearConsole();
					suplierDivMsg();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|             VIEW SUPPLIERS         |");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
					System.out.println();
					viewSuppliers(p,u,s,c,i);
					System.out.print("\t\t\t\t <---- BACK [y/n]");
						String opt=new Scanner(System.in).nextLine();
						switch (opt)
						{
							case "y","Y"->suplierManageDevision(p,u,s,c,i);
							default ->suplierManageDevision(p,u,s,c,i);
						}			
					}
				case 3 ->delete(p,u,s,c,i);
				}
			}
		public static void logOut(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				clearConsole();
				welcomeMsg();
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+------------------------------------+");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|            Logged Out              |");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+------------------------------------+");
				System.out.println();
				user(p,u,s,c,i);
			}
		public static void homePage(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				clearConsole();
				welcomeMsg();
				System.out.println();
				System.out.println();
				checkConditon(p,u,s,c,i);
			}
			public static String[][] iGrow(String[][] ioldArr) {	
			String[][] inewArr = new String[ioldArr.length + 1][6];
		
			for (int i = 0; i < ioldArr.length; i++) {
			for (int j = 0; j < ioldArr[i].length; j++)
			{
				inewArr[i][j]=ioldArr[i][j];
			}
		    }
		
				return inewArr;
			}
			public static String[][] grow(String[][] soldArr) {	
			String[][] snewArr = new String[soldArr.length + 1][2];
		
			for (int i = 0; i < soldArr.length; i++) {
			for (int j = 0; j < soldArr[i].length; j++)
			{
				snewArr[i][j]=soldArr[i][j];
			}
		    }
		
				return snewArr;
			}
			public static String[] cGrow(String[] cOldArr) {	
			String[] cNewArr = new String[cOldArr.length + 1];
		
			for (int i = 0; i < cOldArr.length; i++) {
		
				cNewArr[i]=cOldArr[i];
			
		    }
		
				return cNewArr;
			}
			public static String[] cShrink(String[] cOldArr) {	
			String[] cNewArr = new String[cOldArr.length - 1];
		
			for (int i = 0; i < cOldArr.length-1; i++) {
		
				cNewArr[i]=cOldArr[i];
			
		    }
		
				return cNewArr;
			}
			public static String[][] shrink(String[][] oldAr) {	
			String[][] newAr = new String[oldAr.length - 1][2];
		
			for (int i = 0; i < oldAr.length-1; i++) {
			for (int j = 0; j < oldAr[i].length; j++)
			{
				newAr[i][j]=oldAr[i][j];
			}
		    }
		
				return newAr;
			}
		public static void addSuplier(String[]p,String[]u,String[][]s,String[]c,String[][]i){
			while (true)
			{
				System.out.print("\tSuplier ID |");
				String nid=new Scanner(System.in).nextLine();	
				int x=1;
				for(String[]id:s){
					if (!id[0].equals(nid))
					{
							x=1;
					}
					}
				for(String[]id:s){
					if (id[0].equals(nid))
					{
						x=0;
						System.out.println("\tThat Supplier ID already exists...! [Try Another ID...!]\n");
					}
					}
				if(x==1){
						System.out.print("\tSuplier NAME |");
						String name=new Scanner(System.in).nextLine();
						s=grow(s);
						s[s.length - 1][0] = nid;
						s[s.length - 1][1] = name;
						System.out.print("\tAded SUCCESFUly... | Do You Want to Add Another Supplier [y/n]");
						String op=new Scanner(System.in).nextLine();
								switch (op)
							{
								case "y","Y"->addSuplier(p,u,s,c,i);
								case "n","N" -> suplierManageDevision(p,u,s,c,i);
							}					
					}
				
			}
		}
		public static void search(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				Scanner scanner = new Scanner(System.in);
				System.out.println();
				System.out.print("\tSuplier ID |");
				String nid=new Scanner(System.in).nextLine();
				for (int ii = 0; ii < s.length; ii++)
				{
					if (s[ii][0].equals(nid))
					{	
						System.out.print("\n\t\tSupplier Found SUCCESFUly... !");
						System.out.println("\n\t\tSuplier I.D  |"+s[ii][0]);
						System.out.println("\t\tSuplier Name |"+s[ii][1]);	
						System.out.print("\n\tDo You Want to Search Another Supplier [y/n]");
						String op=new Scanner(System.in).nextLine();
						switch (op)
						{
							case "y","Y"->search(p,u,s,c,i);
							default ->suplierManageDevision(p,u,s,c,i);
						}			
					}
				}
				for(String[]id:s){
					if (!id[0].equals(nid))
					{
						System.out.println("\tCan not Found ID...! [Try Another ID...!]\n");
						search(p,u,s,c,i);
					}
					}
			}
		public static void updateSuplier(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				Scanner scanner = new Scanner(System.in);
				System.out.print("\tSuplier ID |");
				String nid=new Scanner(System.in).nextLine();
				for (int ii = 0; ii < s.length; ii++)
				{
					if (s[ii][0].equals(nid))
					{
						System.out.println("\n\t\tSuplier I.D  |"+s[ii][0]);
						System.out.println("\t\tSuplier Name |"+s[ii][1]);	
						System.out.print("\n\n\tEnter NEW Suplier Name for "+s[ii][1]+" |");	
						String nName=new Scanner(System.in).nextLine();
						s[ii][1]=nName;
						System.out.print("\tUpdated SUCCESFUly... | Do You Want to Add Another Supplier [y/n]");
						String op=new Scanner(System.in).nextLine();
						switch (op)
						{
							case "y","Y"->updateSuplier(p,u,s,c,i);
							default ->suplierManageDevision(p,u,s,c,i);
						}			
					}
				}
				for(String[]id:s){
					if (!id[0].equals(nid))
					{
						System.out.println("\tCan not Found ID...! [Try Another ID...!]\n");
						updateSuplier(p,u,s,c,i);
					}
					}
			}
		public static void viewSuppliers(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				System.out.println();
				System.out.printf("\t\t\t\t+==================================================+\n");
				System.out.printf("\t\t\t\t|                  SUPLIER DETAILS                 |\n");
				System.out.printf("\t\t\t\t+--------------------------------------------------+\n");
				System.out.printf("\t\t\t\t|          |       ID     |           NAME         |\n");
				System.out.printf("\t\t\t\t+--------------------------------------------------+\n");
						
				for (int ii = 0; ii < s.length; ii++)
				{
					System.out.printf("\t\t\t\t%1s %5s %4s %-10s %4s %-21s %1s\n","|",(ii+1),"|", s[ii][0]," | ", s[ii][1],"|");
				}
					System.out.printf("\t\t\t\t+==================================================+\n");
			}
		public static void viewCatogary(String[]p,String[]u,String[][]s,String[]c){
				System.out.println();
				System.out.printf("\t\t\t\t+==================================================+\n");
				System.out.printf("\t\t\t\t|                 CATEGORY DETAILS                 |\n");
				System.out.printf("\t\t\t\t+--------------------------------------------------+\n");
				System.out.printf("\t\t\t\t|          |                   NAME                |\n");
				System.out.printf("\t\t\t\t+--------------------------------------------------+\n");
						
				for (int i = 0; i < c.length; i++)
				{	
					 if (c[i] != null) {
					System.out.printf("\t\t\t\t%1s %5s %4s %-36s %1s\n","|",(i+1),"|", c[i]," | ");
				}}
					System.out.printf("\t\t\t\t+==================================================+\n");
			}
		public static void delete(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				clearConsole();
				suplierDivMsg();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|           DELETE SUPPLIERS         |");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				System.out.println();
				System.out.print("\tSuplier ID |");	
				String nid=new Scanner(System.in).nextLine();
				int x=0;
				boolean y=false;
				for (int ii = 0; ii < s.length; ii++)
				{ 
					if (s[ii][0].equals(nid))
					{	x=ii;
						y=true;
						System.out.println("\n\t\tSuplier I.D  |"+s[ii][0]);
						System.out.println("\t\tSuplier Name |"+s[ii][1]);
					}	
				}
				if(y==true){
					for (int j = x; j < s.length-1; j++)
							{	
									s[j][0]=s[(j+1)][0];
									s[j][1]=s[(j+1)][1];
							}
							
							s=shrink(s);
							System.out.print("\tDeleted SUCCESFUly... | Do You Want to Delete Another Supplier [y/n]");
							String op=new Scanner(System.in).nextLine();
							switch (op)
							{
								case "y","Y"->delete(p,u,s,c,i);
								default ->suplierManageDevision(p,u,s,c,i);
							}						
				}
				if (!y==true)
				{
							System.out.println("\tCan not Found ID...! [Try Another ID...!]\n");
							System.out.print("\tDo You Want to Delete Another Supplier Using Another ID [y/n]");
							String op=new Scanner(System.in).nextLine();
							switch (op)
							{
								case "y","Y"->delete(p,u,s,c,i);
								default ->suplierManageDevision(p,u,s,c,i);
							}					
				}
			}
			
		//-----------------Stock--------------------------------------------------
			
		public static void stockManageDevision(String[]p,String[]u,String[][]s,String[]c,String[][]i){
		clearConsole();
		stockDivMsg();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
		System.out.print("\t\t\t[1]-->Manage Item Catagories");	System.out.println("\t\t[4]-->View Items");
		System.out.print("\t\t\t[2]-->Add Item");				System.out.println("\t\t\t\t[5]-->Rank Item per Unit Price");
		System.out.print("\t\t\t[3]-->Get Item Suplier Wise");  System.out.println("\t\t[6]-->Home Page\n\n");
		System.out.print("\tEnter Your Option >");
		int op=new Scanner(System.in).nextInt();
			switch (op){
			case 1->manageItemCatogory(p,u,s,c,i);
			case 2->{
					clearConsole();
					stockDivMsg();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|              ADD ITEM              |");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					addItem(p,u,s,c,i);
				}
			case 4->{
					clearConsole();
					stockDivMsg();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|            VIEW ITEM               |");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					viewItem(p,u,s,c,i);
					System.out.print("\t\t\t\t <---- BACK [y/n]");
						String opt=new Scanner(System.in).nextLine();
						switch (opt)
						{
							case "y","Y"->stockManageDevision(p,u,s,c,i);
							default ->checkConditon(p,u,s,c,i);
						}			
					}
			case 5->{
					clearConsole();
					stockDivMsg();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|          RANKED UNIT PRICE         |");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					rankedPrice(p,u,s,c,i);
					System.out.print("\t\t\t\t <---- BACK [y/n]");
						String opt=new Scanner(System.in).nextLine();
						switch (opt)
						{
							case "y","Y"->stockManageDevision(p,u,s,c,i);
							default ->{	clearConsole();
										checkConditon(p,u,s,c,i);
									  }
						}			
					}
			case 3->{
					clearConsole();
					stockDivMsg();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|             SEARCH ITEM            |");
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
					getSuplierWise(p,u,s,c,i);
				}
			case 6->homePage(p,u,s,c,i);
			}
		}
		public static void manageItemCatogory(String[]p,String[]u,String[][]s,String[]c,String[][]i){
			clearConsole();
			stockDivMsg();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|          MANAGE ITEM CATEGORY      |");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
			System.out.print("\t\t\t[1]-->Add New Item Catogory");	System.out.println("\t\t[3]-->Update Item Catogory");
			System.out.print("\t\t\t[2]-->Delete Item Catogory");	System.out.println("\t\t[4]-->Back\n\n");
			System.out.print("\tEnter Your Option >");
		    int op=new Scanner(System.in).nextInt();
				switch (op){
				case 1->{ clearConsole();
						  suplierDivMsg();
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|         ADD ITEM CATEGORY          |");
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
				          System.out.println();
				          System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				          addCatogory(p,u,s,c,i);
						  }
				case 2->{ clearConsole();
						  suplierDivMsg();
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|        DELETE ITEM CATEGORY        |");
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+\n");
				          System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				          delCatogory(p,u,s,c,i);
						  }
				case 3->{ clearConsole();
						  suplierDivMsg();
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|         UPDATE ITEM CATEGORY        |");
						  System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t+====================================+");
						  System.out.println();
				          System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t USER :"+u[0]+"  |  STATUS :"+"Logged\n\n");
				          updateCatogory(p,u,s,c,i);
						  }
				case 4->stockManageDevision(p,u,s,c,i);
				}
			}
		public static void addCatogory(String[]p,String[]u,String[][]s,String[]c,String[][]i){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("\tCategory Name: ");
        String name = scanner.nextLine();

        boolean categoryExists = false;
        for (String n : c) {
            if (n.equalsIgnoreCase(name)) {
                categoryExists = true;
                System.out.println("\tThat category already exists! Please try another category name.");
                addCatogory(p,u,s,c,i);
            }
        }
		
        if (!categoryExists) {
            c = cGrow(c);
            c[c.length - 1] = name;

            System.out.println("\tCategory added successfully.");

						System.out.print("\tDo You Want to Add Another Supplier [y/n]");
						String op=new Scanner(System.in).nextLine();
						{
							switch (op)
								{
									case "y","Y"->addCatogory(p,u,s,c,i);
									default ->stockManageDevision(p,u,s,c,i);
								}
						}			
        }
        
    }	
		public static void delCatogory(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				System.out.print("\tCategory Name |");	
				String nid=new Scanner(System.in).nextLine();
				int x=0;
				boolean y=false;
				System.out.println(Arrays.toString(c));
				for (int j = 0; j < c.length; j++)
				{ 
					if (c[j].equals(nid))
					{	x=j;
						y=true;
						
					}	
				}
				if(y==true){
					for (int ii = x; ii < c.length-1; ii++)
							{	
									c[ii]=c[(ii+1)];
							}
							
							c=cShrink(c);
							System.out.print("\tDeleted SUCCESFUly... | Do You Want to Delete Another Catogary [y/n]");
							String op=new Scanner(System.in).nextLine();
							switch (op)
							{
								case "y","Y"->delCatogory(p,u,s,c,i);
								default ->stockManageDevision(p,u,s,c,i);
							}						
				}
				if (!y==true)
				{
							System.out.println("\tCategory 404:ERROR [Try Another Category Name...!]\n");
							System.out.print("\tDo You Want to Delete Another Category Using Another Category Name [y/n]");
							String op=new Scanner(System.in).nextLine();
							switch (op)
							{
								case "y","Y"->delCatogory(p,u,s,c,i);
								default ->stockManageDevision(p,u,s,c,i);
							}					
				}
			}
		public static void updateCatogory(String[]p,String[]u,String[][]s,String[]c,String[][]i){
               System.out.println("Array c: " + Arrays.toString(c));
                System.out.print("\tCategory Name |");
				String name=new Scanner(System.in).nextLine();	
				int x=1;
				for (int j = 0; j < c.length; j++)
				{
					if (c[j].equals(name))
					{
						System.out.println();
						System.out.print("\n\n\tEnter NEW Category Name for "+c[j]+" |");	
						String nName=new Scanner(System.in).nextLine();
						c[j]=nName;
						System.out.print("\tUpdated SUCCESFUly... | Do You Want to Update Another Catogory [y/n]");
						String op=new Scanner(System.in).nextLine();
						switch (op)
						{
							case "y","Y"->updateCatogory(p,u,s,c,i);
							default ->stockManageDevision(p,u,s,c,i);
						}			
					}
				}
				for(String n:c){
					if (!n.equals(name))
					{
						System.out.println("\tCategory 404:ERROR [Try Another Category Name...!]\n");
						updateCatogory(p,u,s,c,i);
					}
					}
			}
		public static String[] addCatogoryInItem(String[]p, String[] u, String[][] s, String[] c) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\tCategory Name | ");
			String name = scanner.nextLine();

			boolean exists = false;
			for (String n : c) {
				if (n.equals(name)) {
					exists = true;
					break;
				}
			}

			if (exists) {
				System.out.println("\tThat Category already exists...! [Try Another Category Name...!]\n");
			} else {
				c = cGrow(c);
				c[c.length - 1] = name;
				System.out.println("\tAdded Successfully... ");
			}

			return c;
		}
		public static String[][] addSuppliersInItem(String[]p, String[] u, String[][] s, String[] c, String[][] i) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tSupplier ID | ");
        String nid = scanner.nextLine();

        boolean exists = false;
        for (String[] id : s) {
            if (id[0].equals(nid)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("\tThat Supplier ID already exists...! [Try Another ID...!]\n");
        } else {
            System.out.print("\tSupplier NAME | ");
            String name = scanner.nextLine();
            s = grow(s);
            s[s.length - 1][0] = nid;
            s[s.length - 1][1] = name;
            System.out.println("\tAdded Successfully... ");
        }

        return s;
    }
		public static void addItem(String[]p,String[]u,String[][]s,String[]c,String[][]i){
						if (c.length == 0 || c == null) {
						System.out.println("\tOops! It seems that you don't have any item categories in the system...\n");
						System.out.print("\tDo you want to add a category [y/n]: ");
						
						Scanner scanner = new Scanner(System.in);
						String op = scanner.nextLine();
						
					if (op.equalsIgnoreCase("y")) {
							c = addCatogoryInItem(p, u, s, c); 
						} else {
							stockManageDevision(p, u, s, c, i);
							return;
						}
        }
						if (s.length == 0 || s == null)
						{
						System.out.println("\tOops! it's Seems that u dont have Any Suppliers in the System...\n");
						System.out.print("\tDo you want to add a suplier [y/n]: ");
						Scanner scanner = new Scanner(System.in);
						String op = scanner.nextLine();
						
						 if (op.equalsIgnoreCase("y")) {
								s = addSuppliersInItem(p, u, s, c, i);
							} else {
								stockManageDevision(p, u, s, c, i);
								return;
							}
						}

				System.out.print("\n\tITEM CODE |");
				String itemCode=new Scanner(System.in).nextLine();	
				boolean x=false;
				for(String[]id:i){
					if (id[0].equalsIgnoreCase(itemCode))
					{
							x=true;
							System.out.println("\tThat Item ID already exists...! [Try Another ID...!]\n");
							addItem(p,u,s,c,i);
					}
					}

				if(!x){
						i=iGrow(i);
						System.out.println("\n\n\tSuppliers List:");
						viewSuppliers(p, u, s,c,i);
						System.out.print("\n\tSelect Supplier number > ");
						int sN=new Scanner(System.in).nextInt();
						int supIndex=(sN-1);
						
						System.out.println("\n\n\tCategories List:");
						viewCatogary(p, u, s,c);
						System.out.print("\n\tSelect Category number > ");
						int cN=new Scanner(System.in).nextInt();
						int catIndex=(cN-1);
						
						System.out.print("\tDescription |");
						String itemName=new Scanner(System.in).nextLine();
						System.out.print("\tUnit Price |");
						double itemPrice=new Scanner(System.in).nextDouble();
						System.out.print("\tQty on Hand |");
						int itemQty=new Scanner(System.in).nextInt();
						
						i[i.length-1][0]=itemCode;
						i[i.length-1][1]=s[supIndex][0];
						i[i.length-1][2]=itemName;
						i[i.length-1][3]=String.valueOf(itemPrice);
						i[i.length-1][4]=String.valueOf(itemQty);
						i[i.length-1][5]=c[catIndex];
						System.out.println("\tAdded Successfully... ");
						System.out.print("\tDo you want to add Another Item [y/n]: ");
						String opt = new Scanner(System.in).nextLine();
						switch (opt)
						{
							case "y","Y"->addItem(p,u,s,c,i);
							default ->stockManageDevision(p,u,s,c,i);
						}					
					}
		}
		public static void getSuplierWise(String[]p,String[]u,String[][]s,String[]c,String[][]i){
				System.out.println();
				System.out.println();
				System.out.print("\tSuplier ID |");
				String nid=new Scanner(System.in).nextLine();
				boolean x=false;
				for(String[]id:s){
					if (!id[0].equals(nid))
					{
						System.out.println("\tCan not Found ID...! [Try Another ID...!]\n");
						x=true;
						getSuplierWise(p,u,s,c,i);
					}
					}
				for (int ii = 0; ii < s.length; ii++)
				{
					if (s[ii][0].equalsIgnoreCase(nid))
					{
						System.out.println("\n\t\tSuplier I.D  |"+s[ii][0]);
						System.out.println("\t\tSuplier Name |"+s[ii][1]);	
					}	
				}
				if(!x){
				System.out.println();
				System.out.println("\t\t\t\t+==========================================================================================================+");
				System.out.println("\t\t\t\t|                                                   ITEM DETAILS                                           |");
				System.out.println("\t\t\t\t+==========================================================================================================+");
				System.out.printf("\t\t\t\t|%-19s|%-29s|%-14s|%-15s|%-25s|\n", "  ITEM CODE  ", "  DESCRIPTION  ", "  UNIT PRICE  ", "  QTY ON HAND  ", "  CATEGORY  ");
				System.out.println("\t\t\t\t+----------------------------------------------------------------------------------------------------------+");
				for (int j = 0; j < i.length ; j++)
				{
					if (i[j][1].equalsIgnoreCase(nid))
					{
						System.out.printf("\t\t\t\t|%-19s|%-29s|%-14s|%-15s|%-25s|\n", i[j][0], i[j][2], i[j][3], i[j][4], i[j][5]);
					}
				}
				System.out.println("\t\t\t\t+==========================================================================================================+");
				        System.out.println("\n\tSearched Successfully... ");
				        System.out.print("\tDo you want to Search Another [y/n]: ");
						String opt = new Scanner(System.in).nextLine();
						switch (opt)
						{
							case "y","Y"->getSuplierWise(p,u,s,c,i);
							default ->{	clearConsole();
										stockManageDevision(p,u,s,c,i);
									}
						}			
				
				}
			}
		public static void viewItem(String[]p,String[]u,String[][]s,String[]c,String[][]i){
			System.out.println();
			for (int ii = 0; ii <c.length; ii++)
			{	
				System.out.println();
				System.out.println("\tCategory : "+c[ii]+"\n");
				System.out.println();
				System.out.println("\t\t\t\t+==========================================================================================================+");
				System.out.println("\t\t\t\t|                                                   ITEM DETAILS                                           |");
				System.out.println("\t\t\t\t+==========================================================================================================+");
				System.out.printf("\t\t\t\t|%-19s|%-29s|%-16s|%-15s|%-23s|\n", "  ITEM CODE  ","  SUPPLIER ID  " ,"  DESCRIPTION  ", "  UNIT PRICE  ", "  QTY ON HAND  ");
				System.out.println("\t\t\t\t+----------------------------------------------------------------------------------------------------------+");	
				for (int j = 0; j < i.length ; j++)
				{
					if (i[j][5].equalsIgnoreCase(c[ii]))
					{
						System.out.printf("\t\t\t\t|%-19s|%-29s|%-16s|%-15s|%-23s|\n", i[j][0], i[j][1], i[j][2], i[j][3], i[j][4]);
					}
				}
				System.out.println("\t\t\t\t+==========================================================================================================+");							
			}
			
			}
		public static String[][] sort(String[][]i){
			String t0; String t1; String t2; String t3; String t4; String t5;
			for (int ii = 0; ii < i.length; ii++)
			{
				for (int j = 0; j < i.length; j++)
				{
					if (Double.valueOf(i[ii][3]) < Double.valueOf(i[j][3]))
					{
						t0 =i[ii][0];
						t1 =i[ii][1];
						t2 =i[ii][2];
						t3 =i[ii][3];
						t4 =i[ii][4];
						t5 =i[ii][5];
						i[ii][0]=i[j][0];
						i[ii][1]=i[j][1];
						i[ii][2]=i[j][2];
						i[ii][3]=i[j][3];
						i[ii][4]=i[j][4];
						i[ii][5]=i[j][5];
						i[j][0] =t0;
						i[j][1] =t1;
						i[j][2] =t2;
						i[j][3] =t3;
						i[j][4] =t4;
						i[j][5] =t5;
					}
				}
			}
			return i;
		}
		public static void rankedPrice(String[]p,String[]u,String[][]s,String[]c,String[][]i){
					String[][] x = new String[i.length][6];
					for (int ii = 0; ii < i.length; ii++) {
					for (int j = 0; j < i[ii].length; j++)
					{
						x[ii][j]=i[ii][j];
					}
					}
					x=sort(x);
				    System.out.println();
					System.out.println("\t\t\t\t+=======================================================================================================================+");
					System.out.println("\t\t\t\t|                                             RANKED PRICE ITEM DETAILS                                                 |");
					System.out.println("\t\t\t\t+=======================================================================================================================+");
					System.out.printf("\t\t\t\t|%-19s|%-29s|%-14s|%-15s|%-15s|%-22s|\n", "  ITEM CODE  ", "  SUP ID  ", "  ITEM NAME  ", "  UNIT PRICE  ", "  QTY  ","  CATEGORY  ");
					System.out.println("\t\t\t\t+-----------------------------------------------------------------------------------------------------------------------+");

					for (int j = 0; j < x.length ; j++) {
						System.out.printf("\t\t\t\t|%-19s|%-29s|%-14s|%-15s|%-15s|%-22s|\n", x[j][0], x[j][1], x[j][2], x[j][3], x[j][4], x[j][5]);
					}

					System.out.println("\t\t\t\t+=======================================================================================================================+");
			}
		public static void main (String[] args) {
		String[]catogory=new String[0];
		String[][]items=new String[0][6];
		String[][]supliers=new String[0][2];//{{"s001","anju"},{"s002","dilki"},{"s003","dula"},{"s004","sanu"},{"s005","vihanga"}};//new String[0][2];
		String[]user={"Vihanga"};
		String[]password={"2022731"};
		welcomeMsg();
		user(password,user,supliers,catogory,items);
		checkConditon(password,user,supliers,catogory,items);
		
	}
}

