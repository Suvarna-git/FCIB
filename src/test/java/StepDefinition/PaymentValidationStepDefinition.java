package StepDefinition;

import java.text.ParseException;
import javax.xml.parsers.ParserConfigurationException;
import org.testng.asserts.SoftAssert;
import com.fcibdemo.qa.base.TestBase;
import com.fcibdemo.qa.constants.IntfConstants;
import com.fcibdemo.qa.pages.HomePage;
import com.fcibdemo.qa.pages.LoginPage;
import com.fcibdemo.qa.pages.PaymentFlow;
import com.fcibdemo.qa.pages.xmlFileReader;
import com.fcibdemo.qa.util.Windowhandle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PaymentValidationStepDefinition extends TestBase {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Windowhandle win;
	PaymentFlow paymentFlow;
	xmlFileReader x = new xmlFileReader();
	SoftAssert sa = new SoftAssert();

	@Given("user goes to payment list")
	public void user_goes_to_payment_list() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentFlow = homePage.checkPayment();
	}

	@Then("user uses the filter {string},{string},{string},{string},{string},{string} to view the payment")
	public void user_uses_the_filter_to_view_the_payment(String EntryDate, String MessageType, String PaymentType, String Reference, String SubRef, String SenderRef) throws InterruptedException {
		paymentFlow = paymentFlow.viewPayment(EntryDate,MessageType, PaymentType, Reference,SubRef,SenderRef);
	}

	@Then("user validate payment screen")
	public void user_validate_payment_screen() throws ParseException, ParserConfigurationException, InterruptedException {
		x.fileReader();

		paymentFlow.verifySenderRef_field("SenderRef", sa); // Sender's Reference
		paymentFlow.verifyBankOp_field("BankOp", sa);
		paymentFlow.verifyValueDate_field("ValueDate", sa); // 32A
		paymentFlow.verifyCurrency_field("Currency", sa); // 32A
		paymentFlow.verifyAmount_field("Amount", sa); // 32A
		
		paymentFlow.verifySender_Account_field("Sender_Account", sa);
		paymentFlow.verifySender_AccountCode_field("Sender_AccountCode", sa);
		paymentFlow.verifySender_AccountCurrency_field("Sender_AccountCurrency", sa);
		paymentFlow.verifySender_AddressLine1_field("Sender_AddressLine1", sa);
		paymentFlow.verifySender_AddressLine2_field("Sender_AddressLine2", sa);
		paymentFlow.verifySender_AddressLine3_field("Sender_AddressLine3", sa);
		paymentFlow.verifySender_AddressLine4_field("Sender_AddressLine4", sa);
		paymentFlow.verifySenderBank_BIC_field("SenderBank_BIC", sa);
		
		paymentFlow.verifyOrderingCustomer_Account_field("OrderingCustomer_Account", sa);
		paymentFlow.verifyOrderingCustomer_AdressLine1_field("OrderingCustomer_AddressLine1", sa);
		paymentFlow.verifyOrderingCustomer_AdressLine2_field("OrderingCustomer_AddressLine2", sa);
		paymentFlow.verifyOrderingCustomer_AdressLine3_field("OrderingCustomer_AddressLine3", sa);
		
		paymentFlow.verifyOrderingBank_field("OrderingBank", sa);
		paymentFlow.verifyOrderingBank_AdressLine1_field("OrderingBank_AddressLine1", sa);
		paymentFlow.verifyOrderingBank_AdressLine2_field("OrderingBank_AddressLine2", sa);
		paymentFlow.verifyOrderingBank_AdressLine3_field("OrderingBank_AddressLine3", sa);
		paymentFlow.verifyOrderingBank_AdressLine4_field("OrderingBank_AddressLine4", sa);
		
		paymentFlow.verifyBeneficiary_Account_field("Beneficiary_Account", sa);
		paymentFlow.verifyBeneficiary_AccountCode_field("Beneficiary_AccountCode", sa);
		paymentFlow.verifyBeneficiary_AccountCurrency_field("Beneficiary_AccountCurrency", sa);
		paymentFlow.verifyBeneficiary_AddressLine1_field("Beneficiary_AddressLine1", sa);
		paymentFlow.verifyBeneficiary_AddressLine2_field("Beneficiary_AddressLine2", sa);
		paymentFlow.verifyBeneficiary_AddressLine3_field("Beneficiary_AddressLine3", sa);
		paymentFlow.verifyBeneficiary_AdviceType_field("Beneficiary_AdviceType", sa);
		paymentFlow.verifyBeneficiary_MsgType_field("Beneficiary_MsgType", sa);
		
		//MISCELLANEOUS DETAILS
		paymentFlow.verifyDetailsOfCharges_field("DetailsOfCharges", sa);   // Details of Charges
		paymentFlow.verifyDetailsOfPayment_70_field("DetailsOfPayment_70", sa);
		paymentFlow.verifyBanktoBankInfo_72_field("BanktoBankInfo_72", sa);

		// MISCELLANEOUS Charges
		paymentFlow.verifyConvert_field("Convert", sa);
		paymentFlow.verifyConvertRate_field("Convert_Rate", sa);
		paymentFlow.verifyDivide_field("Divide", sa);
		paymentFlow.verifyDivideBaseRate_field("Divide_BaseRate", sa);
		paymentFlow.verifyDebitEquivalent_Currency_field("DebitEquivalent_Currency", sa);
		paymentFlow.verifyDebitEquivalent_Amount_field("DebitEquivalent_Amount", sa);
		paymentFlow.verifyPost_field("Post(Y/N)", sa);

		paymentFlow.verifyCommission_Currency_field("Commission_Currency", sa);
		paymentFlow.verifyCommission_Amount_field("Commission_Amount", sa);
		paymentFlow.verifyCommission_DetailsOfCharges_field("Commission_DetailsOfCharges", sa);
		paymentFlow.verifyCorrespFee_Currency_field("Corresp.Fee_Currency", sa);
		paymentFlow.verifyCorrespFee_Amount_field("Corresp.Fee_Amount", sa);
		paymentFlow.verifyCorrespFee_DetailsOfCharges_field("Corresp.Fee_DetailsOfCharges", sa);
		paymentFlow.verifyForexLevy_Currency_field("ForexLevy_Currency", sa);
		paymentFlow.verifyForexLevy_Amount_field("ForexLevy_Amount", sa);
		paymentFlow.verifyForexLevy_DetailsOfCharges_field("ForexLevy_DetailsOfCharges", sa);
		paymentFlow.verifyStampDuty_Currency_field("StampDuty_Currency", sa);
		paymentFlow.verifyStampDuty_Amount_field("StampDuty_Amount", sa);
		paymentFlow.verifyStampDuty_DetailsOfCharges_field("StampDuty_DetailsOfCharges", sa);
		paymentFlow.verifyVAT_Currency_field("VAT_Currency", sa);
		paymentFlow.verifyVAT_Amount_field("VAT_Amount", sa);
		paymentFlow.verifyVAT_DetailsOfCharges_field("VAT_DetailsOfCharges", sa);
		paymentFlow.verifyRateGroup_field("RateGroup", sa);
		paymentFlow.verifyPurposeCode_field("PurposeCode", sa);

		// ACCOUNTING ENTRY DETAILS
		// Debit RTGS Account
		paymentFlow.verifyDebit_RTGSAccount_field("Debit_RTGSAccount", sa);
		paymentFlow.verifyDebit_RTGSCode_field("Debit_RTGSCode", sa);
		paymentFlow.verifyDebit_RTGSValueDate_field("Debit_RTGSValueDate", sa);
		paymentFlow.verifyDebit_RTGSCurrency_field("Debit_RTGSCurrency", sa);
		paymentFlow.verifyDebit_RTGSAmount_field("Debit_RTGSAmount", sa);
		paymentFlow.verifyDebit_RTGSAddressLine1_field("Debit_RTGSAddressLine1", sa);
		paymentFlow.verifyDebit_RTGSAddressLine2_field("Debit_RTGSAddressLine2", sa);
		paymentFlow.verifyDebit_RTGSAddressLine3_field("Debit_RTGSAddressLine3", sa);
		paymentFlow.verifyDebit_RTGSAddressLine4_field("Debit_RTGSAddressLine4", sa);

		// Credit Customer Account
		paymentFlow.verifyCredit_CustomerAccount_field("Credit_CustomerAccount", sa);
		paymentFlow.verifyCredit_CustomerCode_field("Credit_CustomerCode", sa);
		paymentFlow.verifyCredit_CustomerValueDate_field("Credit_CustomerValueDate", sa);
		paymentFlow.verifyCredit_CustomerCurrency_field("Credit_CustomerCurrency", sa);
		paymentFlow.verifyCredit_CustomerAmount_field("Credit_CustomerAmount", sa);
		paymentFlow.verifyCredit_CustomerAddressLine1_field("Credit_CustomerAddressLine1", sa);
		paymentFlow.verifyCredit_CustomerAddressLine2_field("Credit_CustomerAddressLine2", sa);
		paymentFlow.verifyCredit_CustomerAddressLine3_field("Credit_CustomerAddressLine3", sa);

		// Debit Customer Account
		paymentFlow.verifyDebit_CustomerAccount_field("Debit_CustomerAccount", sa);
		paymentFlow.verifyDebit_CustomerCode_field("Debit_CustomerCode", sa);
		paymentFlow.verifyDebit_CustomerValueDate_field("Debit_CustomerValueDate", sa);
		paymentFlow.verifyDebit_CustomerCurrency_field("Debit_CustomerCurrency", sa);
		paymentFlow.verifyDebit_CustomerAmount_field("Debit_CustomerAmount", sa);
		paymentFlow.verifyDebit_CustomerAddressLine1_field("Debit_CustomerAddressLine1", sa);

		// Credit Account
		paymentFlow.verifyCredit_Account_field("Credit_Account", sa);
		paymentFlow.verifyCredit_Code_field("Credit_Code", sa);
		paymentFlow.verifyCredit_ValueDate_field("Credit_ValueDate", sa);
		paymentFlow.verifyCredit_Currency_field("Credit_Currency", sa);
		paymentFlow.verifyCredit_Amount_field("Credit_Amount", sa);
		paymentFlow.verifyCredit_AddressLine1_field("Credit_AddressLine1", sa);

		sa.assertAll();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentFlow.LogOut();
	}
	
	@Then("user validates payment screen")
	public void user_validates_payment_screen() throws InterruptedException, ParseException, ParserConfigurationException {
		x.fileReader1();

		paymentFlow.verifySenderRef_field("SenderRef", sa); // Sender's Reference
		paymentFlow.verifyBankOp_field("BankOp", sa);
		paymentFlow.verifyValueDate_field("ValueDate", sa); // 32A
		paymentFlow.verifyCurrency_field("Currency", sa); // 32A
		paymentFlow.verifyAmount_field("Amount", sa); // 32A
		
		paymentFlow.verifySender_Account_field("Sender_Account", sa);
		paymentFlow.verifySender_AccountCode_field("Sender_AccountCode", sa);
		paymentFlow.verifySender_AccountCurrency_field("Sender_AccountCurrency", sa);
		paymentFlow.verifySender_AddressLine1_field("Sender_AddressLine1", sa);
		paymentFlow.verifySender_AddressLine2_field("Sender_AddressLine2", sa);
		paymentFlow.verifySender_AddressLine3_field("Sender_AddressLine3", sa);
		paymentFlow.verifySender_AddressLine4_field("Sender_AddressLine4", sa);
		paymentFlow.verifySenderBank_BIC_field("SenderBank_BIC", sa);
		
		paymentFlow.verifyOrderingCustomer_Account_field("OrderingCustomer_Account", sa);
		paymentFlow.verifyOrderingCustomer_AdressLine1_field("OrderingCustomer_AddressLine1", sa);
		paymentFlow.verifyOrderingCustomer_AdressLine2_field("OrderingCustomer_AddressLine2", sa);
		paymentFlow.verifyOrderingCustomer_AdressLine3_field("OrderingCustomer_AddressLine3", sa);
		
		paymentFlow.verifyOrderingBank_field("OrderingBank", sa);
		paymentFlow.verifyOrderingBank_AdressLine1_field("OrderingBank_AddressLine1", sa);
		paymentFlow.verifyOrderingBank_AdressLine2_field("OrderingBank_AddressLine2", sa);
		paymentFlow.verifyOrderingBank_AdressLine3_field("OrderingBank_AddressLine3", sa);
		paymentFlow.verifyOrderingBank_AdressLine4_field("OrderingBank_AddressLine4", sa);
		
		paymentFlow.verifyBeneficiary_Account_field("Beneficiary_Account", sa);
		paymentFlow.verifyBeneficiary_AccountCode_field("Beneficiary_AccountCode", sa);
		paymentFlow.verifyBeneficiary_AccountCurrency_field("Beneficiary_AccountCurrency", sa);
		paymentFlow.verifyBeneficiary_AddressLine1_field("Beneficiary_AddressLine1", sa);
		paymentFlow.verifyBeneficiary_AddressLine2_field("Beneficiary_AddressLine2", sa);
		paymentFlow.verifyBeneficiary_AddressLine3_field("Beneficiary_AddressLine3", sa);
		paymentFlow.verifyBeneficiary_AdviceType_field("Beneficiary_AdviceType", sa);
		paymentFlow.verifyBeneficiary_MsgType_field("Beneficiary_MsgType", sa);
		
		//MISCELLANEOUS DETAILS
		paymentFlow.verifyDetailsOfCharges_field("DetailsOfCharges", sa);   // Details of Charges
		paymentFlow.verifyDetailsOfPayment_70_field("DetailsOfPayment_70", sa);
		paymentFlow.verifyBanktoBankInfo_72_field("BanktoBankInfo_72", sa);

		// MISCELLANEOUS Charges
		paymentFlow.verifyConvert_field("Convert", sa);
		paymentFlow.verifyConvertRate_field("Convert_Rate", sa);
		paymentFlow.verifyDivide_field("Divide", sa);
		paymentFlow.verifyDivideBaseRate_field("Divide_BaseRate", sa);
		paymentFlow.verifyDebitEquivalent_Currency_field("DebitEquivalent_Currency", sa);
		paymentFlow.verifyDebitEquivalent_Amount_field("DebitEquivalent_Amount", sa);
		paymentFlow.verifyPost_field("Post(Y/N)", sa);

		paymentFlow.verifyCommission_Currency_field("Commission_Currency", sa);
		paymentFlow.verifyCommission_Amount_field("Commission_Amount", sa);
		paymentFlow.verifyCommission_DetailsOfCharges_field("Commission_DetailsOfCharges", sa);
		paymentFlow.verifyCorrespFee_Currency_field("Corresp.Fee_Currency", sa);
		paymentFlow.verifyCorrespFee_Amount_field("Corresp.Fee_Amount", sa);
		paymentFlow.verifyCorrespFee_DetailsOfCharges_field("Corresp.Fee_DetailsOfCharges", sa);
		paymentFlow.verifyForexLevy_Currency_field("ForexLevy_Currency", sa);
		paymentFlow.verifyForexLevy_Amount_field("ForexLevy_Amount", sa);
		paymentFlow.verifyForexLevy_DetailsOfCharges_field("ForexLevy_DetailsOfCharges", sa);
		paymentFlow.verifyStampDuty_Currency_field("StampDuty_Currency", sa);
		paymentFlow.verifyStampDuty_Amount_field("StampDuty_Amount", sa);
		paymentFlow.verifyStampDuty_DetailsOfCharges_field("StampDuty_DetailsOfCharges", sa);
		paymentFlow.verifyVAT_Currency_field("VAT_Currency", sa);
		paymentFlow.verifyVAT_Amount_field("VAT_Amount", sa);
		paymentFlow.verifyVAT_DetailsOfCharges_field("VAT_DetailsOfCharges", sa);
		paymentFlow.verifyRateGroup_field("RateGroup", sa);
		paymentFlow.verifyPurposeCode_field("PurposeCode", sa);

		// ACCOUNTING ENTRY DETAILS
		// Debit RTGS Account
		paymentFlow.verifyDebit_RTGSAccount_field("Debit_RTGSAccount", sa);
		paymentFlow.verifyDebit_RTGSCode_field("Debit_RTGSCode", sa);
		paymentFlow.verifyDebit_RTGSValueDate_field("Debit_RTGSValueDate", sa);
		paymentFlow.verifyDebit_RTGSCurrency_field("Debit_RTGSCurrency", sa);
		paymentFlow.verifyDebit_RTGSAmount_field("Debit_RTGSAmount", sa);
		paymentFlow.verifyDebit_RTGSAddressLine1_field("Debit_RTGSAddressLine1", sa);
		paymentFlow.verifyDebit_RTGSAddressLine2_field("Debit_RTGSAddressLine2", sa);
		paymentFlow.verifyDebit_RTGSAddressLine3_field("Debit_RTGSAddressLine3", sa);
		paymentFlow.verifyDebit_RTGSAddressLine4_field("Debit_RTGSAddressLine4", sa);

		// Credit Customer Account
		paymentFlow.verifyCredit_CustomerAccount_field("Credit_CustomerAccount", sa);
		paymentFlow.verifyCredit_CustomerCode_field("Credit_CustomerCode", sa);
		paymentFlow.verifyCredit_CustomerValueDate_field("Credit_CustomerValueDate", sa);
		paymentFlow.verifyCredit_CustomerCurrency_field("Credit_CustomerCurrency", sa);
		paymentFlow.verifyCredit_CustomerAmount_field("Credit_CustomerAmount", sa);
		paymentFlow.verifyCredit_CustomerAddressLine1_field("Credit_CustomerAddressLine1", sa);
		paymentFlow.verifyCredit_CustomerAddressLine2_field("Credit_CustomerAddressLine2", sa);
		paymentFlow.verifyCredit_CustomerAddressLine3_field("Credit_CustomerAddressLine3", sa);

		// Debit Customer Account
		paymentFlow.verifyDebit_CustomerAccount_field("Debit_CustomerAccount", sa);
		paymentFlow.verifyDebit_CustomerCode_field("Debit_CustomerCode", sa);
		paymentFlow.verifyDebit_CustomerValueDate_field("Debit_CustomerValueDate", sa);
		paymentFlow.verifyDebit_CustomerCurrency_field("Debit_CustomerCurrency", sa);
		paymentFlow.verifyDebit_CustomerAmount_field("Debit_CustomerAmount", sa);
		paymentFlow.verifyDebit_CustomerAddressLine1_field("Debit_CustomerAddressLine1", sa);

		// Credit Account
		paymentFlow.verifyCredit_Account_field("Credit_Account", sa);
		paymentFlow.verifyCredit_Code_field("Credit_Code", sa);
		paymentFlow.verifyCredit_ValueDate_field("Credit_ValueDate", sa);
		paymentFlow.verifyCredit_Currency_field("Credit_Currency", sa);
		paymentFlow.verifyCredit_Amount_field("Credit_Amount", sa);
		paymentFlow.verifyCredit_AddressLine1_field("Credit_AddressLine1", sa);

		sa.assertAll();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentFlow.LogOut();
	}

}
