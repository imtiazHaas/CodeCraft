@regression @smoke @HBNT-01 @E2E

Feature: HAAS Alert Dashboard Sign-in 

	Scenario: Dashboard Sign-in (Dev)
		Given Open HAAS Alert Dashboard Homepage
		When User sign-in 'Email'
		And User provided 'Password'
		Then User should be able to sign-in to HAAS Alert Homepage