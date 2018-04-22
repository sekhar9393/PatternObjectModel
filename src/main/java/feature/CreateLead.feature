Feature: Create Lead verification
@Smoke
Scenario Outline: Test Case for the Create Lead


And Enter the UserName as <Uname>
And Enter the Password as <pwd>
And Click the LoginButton
And Click CRM/SFA
And Click LeadsLink
And Click CreateLead
And Enter Create Lead Cname as <Cname>
And Enter Create Lead Fname as <FName>
And Enter Create Lead LName as <LName>
And Click Create Submit button

Examples:
|Uname|pwd|Cname|FName|LName|
|DemoSalesManager|crmsfa|FSS|Sekhar|Reddy|