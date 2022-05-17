Feature: log in functionalities of feature
 

  Scenario Outline: login
    Given I am in login page
    When I enter <username> and <password>
 		 And click on Inpatient
    And I click on login button
    Then I will be npatient Ward page

  

    Examples: 
      | username | password    |
      | Admin    |     Admin123 | 
      | name2    |     mnn7      | 
