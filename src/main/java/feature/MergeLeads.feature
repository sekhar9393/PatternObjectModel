Feature: Merge Lead verification
Scenario Outline: Test Case for the Merge Lead
And Enter the UserName as <Uname>
And Enter the Password as <pwd>
And Click the LoginButton
And Click CRM/SFA
And Click LeadsLink
And Click MergeLeads
And Click FromLeadIcon
And Switch to New Window
And FirstName as <fromLead>
And Click Find Lead
And Click First LeadID in MErgeLeads
And Navigate to Parent Window from fromLead Screen
And Click ToLeadIcon
And Switch to New Window	
And Enter FirstName for ToLead as <ToLead>
And Click Find Lead
And Click First LeadID in MErgeLeads
And Navigate to Parent Window from fromLead Screen
And Click Merge Button
And Accept Alert
Examples:
|Uname|pwd|fromLead|ToLead|
|DemoSalesManager|crmsfa|a|b|