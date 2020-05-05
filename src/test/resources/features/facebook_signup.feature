@fbsignup
Feature: Facebook signup 
Scenario: User should create an account succesfully 
	Given I enter the below details to create user account 
		|   |firstName | surName |mobileNumber | password | day | month | year | gender |
		| 1 |dummyname| noname  | 07455825656| dummy@123 	| 12  | Jan   | 2008 | Male |
		| 2	|dummyname1|newname1| 07777888999| dummy@000	| 15  | Feb	  | 2009 | Female|	
		| 3	|dummyname2|newname2| 08888888999| dummy@111	| 16  | March | 2009 | Male |	
		| 4	|dummyname3|newname3| 09999888999| dummy@222	| 17  | April | 2009 | Male |	
		| 5	|dummyname4|newname4| 07878787877| dummy@333	| 18  | May	  | 2009 | Male |	
	And click on signup button 
	Then user should able to view an account succesfully 
	
