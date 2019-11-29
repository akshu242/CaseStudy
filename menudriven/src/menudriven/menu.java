package menudriven;

import java.util.Scanner;

public class menu
{
	static Scanner sc = new Scanner(System.in);
	
	private static int userMenu() 
	{
		System.out.println("0.Exit");
		System.out.println("1.Owner ");
		System.out.println("2.Librarian");
		System.out.println("3.Member");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
		
	}
	
	public static int umenuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.sign in ");
		System.out.println("2.sign up");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static int ownerMenuList( )
	{
		System.out.println("0.Signout");
		System.out.println("1.edit profile");
		System.out.println("2.change password");
		System.out.println("3.subjectwise copies report");
		System.out.println("4.bookwise copies report");
		System.out.println("5.fees/fine");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
		
	}
	public static int libMenuList( )
	{
		System.out.println("0.Signout");
		System.out.println("1.edit profile");
		System.out.println("2.change password");
		System.out.println("3.find book by name");
		System.out.println("4.check book available");
		System.out.println("5.add new book");
		System.out.println("6.add new copy");
		System.out.println("7.issue book copy");
		System.out.println("8.return book copy");
		System.out.println("9.list issued book");
		System.out.println("10.edit books");
		System.out.println("11.change rack");
		System.out.println("12.add member");
		System.out.println("13.take payment");
		System.out.println("14.payment history");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
		
	}


public static void main (String[] args)
{
	int choice;
	String email;
	String password;
	
	int contact;
	
	while((choice =menu.userMenu())!=0)
	{
		switch( choice )
		{
		case 1:		
	
	while( ( choice = menu.umenuList( ) ) != 0)
	{
		
		String e="akanksha";
		String p="sunbeam";
			switch( choice )
			{
			case 1:
				
				System.out.println("Enter Email:");
				email  = sc.next();
				sc.nextLine();
				System.out.println("Enter password:");
				password = sc.next();
				
				if( e.equals(email) && p.equals(password) )
				{
					System.out.println("Login successful..!!!");
					System.out.println();

					while( ( choice = menu.ownerMenuList() ) != 0)
					{
						String nemail,nPass;
						int nContact;						
							switch( choice )
							{
							case 0: 
								System.out.println("signout successfully");
								System.out.println();
								
								break;
							case 1:
								System.out.println("Edit Profile..");
								System.out.println("Enter new Email:");
								nemail=sc.nextLine();
								sc.nextLine();
								System.out.println("Enter new mobile:");
								nContact=sc.nextInt();
								System.out.println();
								break;
								
							case 2:
								
								System.out.println("Enter new password :");
								nPass = sc.nextLine();
								System.out.println("Password updated successfully!!");
								System.out.println();
								break;
							
							case 3:
								System.out.println("SubjectWise copies Report");
								System.out.println("subject :java    count:7");
								System.out.println();
								break;
							
							case 4:
								System.out.println("Bookwise copies Report");
								System.out.println("id:1  name :java   available:5   issued:2   count:7");
								System.out.println();
								break;
							
							case 5:
								System.out.println("Fees/fine report");
								
								System.out.println("from date:20/8/2019");
								System.out.println("from date:30/9/2019");
								System.out.println("type:fee   amount:4200");
								System.out.println("type:fine   amount:50");
								System.out.println();
								break;
							}
						
						
							
					}

				}
				else
				{
					System.out.println("Invalid UserID or Password");
					System.out.println();
				}
				
			  
				break;
			case 2:
				
				System.out.println("Enter Your Email:");
				email = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter password:");
				password = sc.nextLine();
				System.out.println("Enter Mobile Number:");
				contact=sc.nextInt();
				
				System.out.println();
				break;
			}
		
			break;
		}
		case 2:

			while( ( choice = menu.umenuList() ) != 0)
			{
				
				String e="abhi";
				String p="sunbeam123";
					switch( choice )
					{
					case 1:
						
						System.out.println("Enter Email:");
						email  = sc.next();
						sc.nextLine();
						System.out.println("Enter password:");
						password = sc.next();
						
						if( e.equals(email) && p.equals(password) )
						{
							System.out.println("Login successful..!!!");
							System.out.println();

							while( ( choice = menu.libMenuList() ) != 0)
							{
								String nemail,nPass;
								int nContact;						
									switch( choice )
									{
									case 0: 
										System.out.println("signout successfully");
										System.out.println();
										break;
									case 1:
										System.out.println("Edit Profile..");
										System.out.println("Enter new Email:");
										nemail=sc.nextLine();
										sc.nextLine();
										System.out.println("Enter new mobile:");
										nContact=sc.nextInt();
										System.out.println();
										break;
										
									case 2:
										
										System.out.println("Enter new password :");
										nPass = sc.nextLine();
										System.out.println("Password updated successfully!!");
										System.out.println();
										break;
									
									case 3:
										System.out.println("Find book by name..");
										System.out.println("Enter book name:");
										sc.next();
										System.out.println();
										break;
									
									case 4:
										System.out.println("Check book availability");
										System.out.println("enter bookid:");
										sc.nextInt();
										System.out.println();
										break;
									case 5:
										System.out.println("Add new book");
										System.out.println("enter book info:");
										System.out.println("name:");
										sc.next();
										System.out.println("author:");
										sc.next();
										System.out.println("subject:");
										sc.next();
										System.out.println("price:");
										sc.nextInt();
										System.out.println("isbn:");
										sc.nextInt();
										System.out.println("Book added successfully");
										System.out.println();
										
										break;
									
									case 6:
										System.out.println("Add new copy");
										System.out.println("enter book id:");
										sc.nextInt();
										System.out.println("enter book rack:");
										sc.nextInt();
										System.out.println("Book copy added successfully");
										
										break;
									

									case 7:
										System.out.println("issue book copy");
										System.out.println("enter member id:");
										sc.nextInt();
										
										System.out.println("enter book id:");
										sc.nextInt();
										
										System.out.println("issued book successfully");
										System.out.println();
										
										break;
										
									case 8:
										System.out.println("return book copy");
										System.out.println("enter issue id:");
										sc.nextInt();
										
										System.out.println("book returned successfully");
										System.out.println();
										
										break;
										
									case 9:
										System.out.println("list issued book");
										System.out.println("enter member id:");
										sc.nextInt();
										
										
										System.out.println("");
										
										break;
									case 10:
										System.out.println("edit book");
										System.out.println("enter book name:");
										sc.next();
										System.out.println("enter book id to edit");
										sc.nextInt();
											
										System.out.println("name:");
										sc.next();

										System.out.println("auhor:");
										sc.next();

										System.out.println("subject:");
										sc.next();
										System.out.println("price:");
										sc.nextInt();
										System.out.println("isbn:");
										sc.nextInt();
										System.out.println("book updated successfully..");
										
										System.out.println();
										break;
									
									case 11:
										System.out.println("Change rack");
										System.out.println("Enter rack no:");
										System.out.println();
										break;
									case 12:
										System.out.println("Add member");
										System.out.println("Enter member info..");
									
										System.out.println("Enter name:");
										sc.next();
										System.out.println("Enter email:");
										sc.next();
										System.out.println("Enter phone:");
										sc.nextInt();

										System.out.println("Enter password:");
										sc.next();

										System.out.println("User registered successfully..");
										
										System.out.println();
										break;
									}
								
								
									
							}

						}
						else
						{
							System.out.println("Invalid UserID or Password");
							System.out.println();
						}
						
					 break;
					 
					case 2:
						
						System.out.println("Enter Your Email:");
						email = sc.nextLine();
						sc.nextLine();
						System.out.println("Enter password:");
						password = sc.nextLine();
						System.out.println("Enter Mobile Number:");
						contact=sc.nextInt();
						System.out.println();
						break;
					}
				
				break;
			}

			break;
			
	}

	}
}


}