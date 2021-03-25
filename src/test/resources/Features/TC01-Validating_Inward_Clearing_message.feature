Feature: Validating Inward Clearing Message

	@TC_4.0_01_01_Validating_Inward_Clearing_message
	Scenario Outline: To Validate Postive Scenario
	Given user goes to payment list
  And user uses the filter "<EntryDate>","<MessageType>","<PaymentType>","<Reference>","<SubRef>","<SenderRef>" to view the payment
	Then user validate payment screen
			
			Examples: 
			|EntryDate|MessageType| PaymentType  | Reference | SubRef | SenderRef                |
      |         | 103       | RTGS RECEIVE | Sender Ref|  EQUAL | CWB1503250000301         |     
      
       
      	
