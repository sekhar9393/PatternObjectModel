Feature: Delete verification
@Smoke
Scenario Outline: Test Case for the Delete Lead


And Enter the UserName as <Uname>
And Enter the Password as <pwd>
And Click the LoginButton
And Click CRM/SFA
And Click LeadsLink
And Click FindLeads
And Enter FirstName as <FirstName>
And Click FindLeadBtn
And Get FirstRecordInfo
And Click FirstResID
And Click DeleteButton
And Click FindLeads
And Enter Captured LEadID 

Examples:
|Uname|pwd|FirstName|
|DemoSalesManager|crmsfa|aa|