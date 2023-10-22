package com.solution;

import java.util.List;
import java.util.Scanner;

public class Solution01Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		/*
		 * try(CandidateDao cd=new CandidateDao()) { List<Candidate> ans=cd.getAll();
		 * ans.forEach(c->System.out.println(c)); } catch(Exception e) {
		 * e.printStackTrace(); }
		 * 
		 */
		
		
		//1.INSERTING NEW ROW OF A CANDIDATE

		/*
		try (CandidateDao c = new CandidateDao()) {
			System.out.println("Enter Candidate Details to add : ");
			Candidate c1 = new Candidate();
			c1.accept();
			int cnt = c.save(c1);
			System.out.println("Rows Affected : " + cnt);

		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		//2.UPDATING CANDIDATE ROW BY ID
		/*
		try(CandidateDao cd=new CandidateDao())
		{
			System.out.print("Enter id of Candidate to modify :");
			int id=in.nextInt();
			
			Candidate c1=cd.getCandidateById(id);
			
			in.nextLine();
			System.out.println("Enter New Candidate Name : ");
			String name=in.nextLine();
			
			System.out.print("Enter New Party Name: ");
			String party=in.nextLine();
			
			c1.setName(name);
			c1.setParty(party);
			
			int cnt=cd.update(c1);
			System.out.println("Rows Affected : "+cnt);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		//3.List of all parties with sum of votes
		
		try(CandidateDao cd=new CandidateDao())
		{
			List<PartyVotes> list=cd.getPartywiseVotes();
			list.forEach(pv->System.out.println(pv));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
