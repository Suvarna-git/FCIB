Feature: Validating Inward Clearing Message

	@TC_4.0_01_01_Validating_Inward_Clearing_message
	Scenario Outline: Simulating Code Error in GPS System
	Given user goes to payment list
  Then user uses the filter "<EntryDate>","<MessageType>","<PaymentType>","<Reference>","<SubRef>","<SenderRef>" to view the payment
	Then user validates payment screen
			
			Examples: 
      |EntryDate|MessageType| PaymentType  | Reference | SubRef | SenderRef                |
      |         | 103       | RTGS RECEIVE | Sender Ref|  EQUAL | CWB1503250000212         |      
      																														