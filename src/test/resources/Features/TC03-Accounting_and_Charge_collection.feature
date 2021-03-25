Feature: Accounting and Charge Collection

	@TC_4.1_01_01_Accounting_and_Charge_collection
	Scenario Outline:To Validate Postive Scenario for Accounting
	Given user goes to payment list
  And user uses the filter "<EntryDate>","<MessageType>","<PaymentType>","<Reference>","<SubRef>","<SenderRef>" to view the payment
	Then user validate payment screen
			
			Examples: 
			|EntryDate|MessageType| PaymentType  | Reference | SubRef | SenderRef                |
      |         | 103       | RTGS RECEIVE | Sender Ref|  EQUAL | CWB1503250000203         |         
      