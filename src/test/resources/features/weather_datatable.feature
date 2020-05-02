@weatherdatatable 
Feature: City Weather API response using Datatable 
Scenario: To ensure expected attributes and values are listed for the search city 
	Given validate the weather for the given city names with below details are
      |   		| region 	|country|timezone_id |name 	 | temperature |
      | Key Key | Khorasan |Iran   |Asia/Tehran|Key Key	 | 22 |
      | Chennai | Tamil Nadu|India  |Asia/Kolkata|Chennai| 35 |
      | Mumbai | Maharashtra|India  |Asia/Kolkata|Mumbai | 32 |
       