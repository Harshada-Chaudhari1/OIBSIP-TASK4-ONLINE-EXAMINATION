import java.util.*;
public class OnlineExam {

	public static void main(String[] args) {



				Scanner in = new Scanner(System.in);
				String realid="7890",realpassword="101";
				while(true){
					System.out.println("Welcome to Login");

					System.out.print("Enter LoginId:");
					String id,password;
					id=in.next();
					System.out.print("Enter Password: ");
					password=in.next();
					if(id.equals(realid) && password.equals(realpassword)){

						Integer count=0;

						System.out.println("Welcome to Exam Portal");


						while(true){
							System.out.println("1.Exam\n2.Update Profile\n3.Logout");
							System.out.print("Enter Your Choice:");
							Integer n=in.nextInt();
							if(n==1){
								long examstarttime=System.currentTimeMillis();//Timer and auto submit
								long endtime=examstarttime+30*1000;
								while(System.currentTimeMillis()<endtime){

									System.out.println("Your Exam Exactly Starts Now and Your timer was on mode.\nCurrent time:"+System.currentTimeMillis());

									System.out.println("1.powd_r \n1.e 2.a 3.n 4.k 5.m");
									System.out.print("Enter Suitable letter: ");
									String s=in.next();
									if(s.equals("1")){
										count+=1;
									}

									System.out.println("Your Submitted First Question Successfully.\nNow Current time:"+System.currentTimeMillis());

									System.out.println("2.y_llow \n1.e 2.a 3.n 4.H 5.m");
									System.out.print("Enter Suitable letter: ");
									s=in.next();
									if(s.equals("4")){
										count+=1;
									}

									System.out.println("Your Submitted Second Question Successfully.\nNow Current time:"+System.currentTimeMillis());

									System.out.println("3.m_n \n1.e 2.a 3.n 4.c 5.m");
									System.out.print("Enter Suitable letter: ");
									s=in.next();
									if(s.equals("2")){
										count+=1;
									}

									System.out.println("Your Submitted Third Question Successfully.\nNow Current time:"+System.currentTimeMillis());
								    System.out.println("4.pl_t \n1.e 2.o 3.n 4.y 5.m");
									System.out.print("Enter Suitable letter: ");
									s=in.next();
									if(s.equals("2")){
										count+=1;
									}

									System.out.println("Your Submitted Fourth Question Successfully.\nNow Current time:"+System.currentTimeMillis());

									System.out.println("5.H_lp \n1.e 2.a 3.n 4.m 5.p");
									System.out.print("Enter Suitable letter: ");
									s=in.next();
									if(s.equals("5")){
										count+=1;
									}

									System.out.println("Your Submitted Fifth Question Successfully.\nNow Current time:"+System.currentTimeMillis());

								}
								System.out.println("Your Exam Finishes.\nYou Scored:"+(count*10));
							}
							else if(n==2){
								try{
									System.out.print("Enter Updated Id:");
									realid=in.next();
									System.out.print("Enter Updated Password");
									realpassword=in.next();
									System.out.println("Details Updated Successfully");
								}
								catch(Exception e){
									System.out.println("Failed to Update Details");
								}

							}
							else if(n==3){
								System.exit(0); 
							}
							else{
								System.out.println("Enter valid choices");
							}
						}
					}
					else{
						System.out.println("Your Entered Details are Invalid.Try Again");
					}
				}
			}

	}
