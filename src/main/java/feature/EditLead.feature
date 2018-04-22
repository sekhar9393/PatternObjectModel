Feature: Create Lead verification
@Sanity
Scenario Outline: Test Case for the Create Lead


And Enter the UserName as <Uname>
And Enter the Password as <pwd>
And Click the LoginButton
And Click CRM/SFA
And Click LeadsLink
And Click FindLeads
And Enter FirstName as <FirstName>
And Click FindLeadBtn
And Click FirstResID
And Click EditBtn
And Enter Edit Cname as <Cname> 
And Click Submit in Edit button

Examples:
|Uname|pwd|FirstName|Cname|
|DemoSalesManager|crmsfa|a|Amazon|