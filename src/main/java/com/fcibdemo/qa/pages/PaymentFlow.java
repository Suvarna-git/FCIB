package com.fcibdemo.qa.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.fcibdemo.qa.base.TestBase;
import com.fcibdemo.qa.constants.IntfConstants;

public class PaymentFlow extends TestBase {
	
	@FindBy(name="file")
	WebElement chooseFileButton;
	
	@FindBy(name="swiftTextArea")
	WebElement swiftTextArea;
	
	@FindBy(xpath="//input[@value='Import']")
	WebElement importBtn;
	
	@FindBy(name="content(periodEntryDate)")
	WebElement periodEntryDate;
	
	@FindBy(name="content(messageType)")
	WebElement messageType;

	@FindBy(name="content(paymentType)")
	WebElement paymentType;
	
	@FindBy(name="content(referenceOption)")
	WebElement referenceOption;
	
	@FindBy(name="content(referenceTest)")
	WebElement referenceTest;
	
	@FindBy(name="content(reference)")
	WebElement reference;

	@FindBy(id="btnAll")
	WebElement getAllBtn;

	@FindBy(xpath="//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(name="payTranFld20")
	WebElement sender_ReferenceField;

	@FindBy(name="payTranBankOpCode")
	WebElement bank_Operation_CodeField;
	
	@FindBy(name="payTranValueDate")
	WebElement valueDateField;
	
	@FindBy(name="payTranCurrency")
	WebElement currencyField;
	
	@FindBy(name="payTranAmount")
	WebElement amountField;
	
	@FindBy(name="payTranSenderAcct")
	WebElement senderAccount_Field;
	
	@FindBy(name="payTranSenderAcctCode")
	WebElement senderAccount_Code_Field;
	
	@FindBy(name="content(payTranSenderAcctCurr)")
	WebElement senderAccount_Currency_Field;
	
	@FindBy(name="content(payTranSenderAddrLine1)")
	WebElement sender_NameAddress1_Field;
	
	@FindBy(name="content(payTranSenderAddrLine2)")
	WebElement sender_NameAddress2_Field;
	
	@FindBy(name="content(payTranSenderAddrLine3)")
	WebElement sender_NameAddress3_Field;
	
	@FindBy(name="content(payTranSenderAddrLine4)")
	WebElement sender_NameAddress4_Field;
	
	@FindBy(name="content(payTranSenderType1)")
	WebElement senderBankBIC_Field;
	
	@FindBy(name="content(payTranORGAcctExt)")
	WebElement ordering_Customer_Account_Field;
	
	@FindBy(name="content(payTranORGAddrLine1)")
	WebElement ordering_Customer_NameAddress1_Field;
	
	@FindBy(name="content(payTranORGAddrLine2)")
	WebElement ordering_Customer_NameAddress2_Field;
	
	@FindBy(name="content(payTranORGAddrLine3)")
	WebElement ordering_Customer_NameAddress3_Field;
	
	@FindBy(name="content(payTranOGBType1)")
	WebElement ordering_Institution_Field;
	
	@FindBy(name="content(payTranOGBAddrLine1)")
	WebElement ordering_Institution_NameAddress1_Field;
	
	@FindBy(name="content(payTranOGBAddrLine2)")
	WebElement ordering_Institution_NameAddress2_Field;
	
	@FindBy(name="content(payTranOGBAddrLine3)")
	WebElement ordering_Institution_NameAddress3_Field;
	
	@FindBy(name="content(payTranOGBAddrLine4)")
	WebElement ordering_Institution_NameAddress4_Field;
	
	@FindBy(name="payTranBeneficiaryAcct")
	WebElement beneficiary_Account_Field;
	
	@FindBy(name="payTranBeneficiaryAcctCode")
	WebElement beneficiary_AccountCode_Field;
	
	@FindBy(name="content(payTranBeneficiaryAcctCurr)")
	WebElement beneficiary_AccountCurrency_Field;
	
	@FindBy(name="content(payTranBeneficiaryAddrLine1)")
	WebElement beneficiary_NameAddress1_Field;
	
	@FindBy(name="content(payTranBeneficiaryAddrLine2)")
	WebElement beneficiary_NameAddress2_Field;
	
	@FindBy(name="content(payTranBeneficiaryAddrLine3)")
	WebElement beneficiary_NameAddress3_Field;
	
	@FindBy(name="content(payTranBeneficiaryAdviceType1)")
	WebElement beneficiary_AdviceType_Field;
	
	@FindBy(name="content(payTranBeneficiaryMessageType1)")
	WebElement beneficiary_MsgType_Field;
	
	@FindBy(name="payTranFld71")
	WebElement detailsOfCharges_Field;
	
	@FindBy(name="payTranFld70Line1")
	WebElement detailsOfPayment_70_Field;
	
	@FindBy(name="payTranFld72Line1")
	WebElement banktobankInfo_72_Field;
	
	@FindBy(name="payTranConversion")
	WebElement convert_Field;
	
	@FindBy(name="payTranConvRate")
	WebElement convertRate_Field;
	
	@FindBy(name="payTranDivideRate")
	WebElement divide_Field;
	
	@FindBy(name="payTranBaseRate")
	WebElement divideBaseRate_Field;
	
	@FindBy(name="payTranDebitConvCurrency")
	WebElement debitEquivalent_Currency_Field;
	
	@FindBy(name="payTranDebitEquivalent")
	WebElement debitEquivalent_Amount_Field;
	
	@FindBy(name="payTranPost")
	WebElement post_Field;
	
	@FindBy(name="content(comm0curr)")
	WebElement commission_Currency_Field;
	
	@FindBy(name="content(comm0amount)")
	WebElement commission_Amount_Field;
	
	@FindBy(name="content(comm0bearer)")
	WebElement commission_DetailsOfCharges_Field;
	
	@FindBy(name="content(comm1curr)")
	WebElement correspFee_Currency_Field;
	
	@FindBy(name="content(comm1amount)")
	WebElement correspFee_Amount_Field;
	
	@FindBy(name="content(comm1bearer)")
	WebElement correspFee_DetailsOfCharges_Field;
	
	@FindBy(name="content(comm2curr)")
	WebElement forexLevy_Currency_Field;
	
	@FindBy(name="content(comm2amount)")
	WebElement forexLevy_Amount_Field;
	
	@FindBy(name="content(comm2bearer)")
	WebElement forexLevy_DetailsOfCharges_Field;
	
	@FindBy(name="content(comm3curr)")
	WebElement stampDuty_Currency_Field;
	
	@FindBy(name="content(comm3amount)")
	WebElement stampDuty_Amount_Field;
	
	@FindBy(name="content(comm3bearer)")
	WebElement stampDuty_DetailsOfCharges_Field;
	
	@FindBy(name="content(comm4curr)")
	WebElement vat_Currency_Field;
	
	@FindBy(name="content(comm4amount)")
	WebElement vat_Amount_Field;
	
	@FindBy(name="content(comm4bearer)")
	WebElement vat_DetailsOfCharges_Field;
	
	@FindBy(name="content(rateGroup)")
	WebElement rateGroup_Field;
	
	@FindBy(name="content(purposeCode)")
	WebElement purposeCode_Field;
	
	@FindBy(name="content(payTranDebit1Acct)")
	WebElement debit_RTGSAccount_Field;
	
	@FindBy(name="content(payTranDebit1AcctCode)")
	WebElement debit_RTGSCode_Field;
	
	@FindBy(name="content(payTranDebit1Value)")
	WebElement debit_RTGSValueDate_Field;
	
	@FindBy(name="content(payTranDebit1Currency)")
	WebElement debit_RTGSCurrency_Field;
	
	@FindBy(name="content(payTranDebit1Amount)")
	WebElement debit_RTGSAmount_Field;
	
	@FindBy(name="content(payTranDebit1AddrLine1)")
	WebElement debit_RTGSAddressLine1_Field;
	
	@FindBy(name="content(payTranDebit1AddrLine2)")
	WebElement debit_RTGSAddressLine2_Field;
	
	@FindBy(name="content(payTranDebit1AddrLine3)")
	WebElement debit_RTGSAddressLine3_Field;
	
	@FindBy(name="content(payTranDebit1AddrLine4)")
	WebElement debit_RTGSAddressLine4_Field;
	
	@FindBy(name="content(payTranCredit1Acct)")
	WebElement credit_CustomerAccount_Field;
	
	@FindBy(name="content(payTranCredit1AcctCode)")
	WebElement credit_CustomerCode_Field;
	
	@FindBy(name="content(payTranCredit1Value)")
	WebElement credit_CustomerValueDate_Field;
	
	@FindBy(name="content(payTranCredit1Currency)")
	WebElement credit_CustomerCurrency_Field;
	
	@FindBy(name="content(payTranCredit1Amount)")
	WebElement credit_CustomerAmount_Field;
	
	@FindBy(name="content(payTranCredit1AddrLine1)")
	WebElement credit_CustomerAddressLine1_Field;
	
	@FindBy(name="content(payTranCredit1AddrLine2)")
	WebElement credit_CustomerAddressLine2_Field;
	
	@FindBy(name="content(payTranCredit1AddrLine3)")
	WebElement credit_CustomerAddressLine3_Field;
	
	@FindBy(name="content(payTranDebit2Acct)")
	WebElement debit_CustomerAccount_Field;
	
	@FindBy(name="content(payTranDebit2AcctCode)")
	WebElement debit_CustomerCode_Field;
	
	@FindBy(name="content(payTranDebit2Value)")
	WebElement debit_CustomerValueDate_Field;
	
	@FindBy(name="content(payTranDebit2Currency)")
	WebElement debit_CustomerCurrency_Field;
	
	@FindBy(name="content(payTranDebit2Amount)")
	WebElement debit_CustomerAmount_Field;
	
	@FindBy(name="content(payTranDebit2AddrLine1)")
	WebElement debit_CustomerAddressLine1_Field;
	
	@FindBy(name="content(payTranCredit2Acct)")
	WebElement credit_Account_Field;
	
	@FindBy(name="content(payTranCredit2AcctCode)")
	WebElement credit_Code_Field;
	
	@FindBy(name="content(payTranCredit2Value)")
	WebElement credit_ValueDate_Field;
	
	@FindBy(name="content(payTranCredit2Currency)")
	WebElement credit_Currency_Field;
	
	@FindBy(name="content(payTranCredit2Amount)")
	WebElement credit_Amount_Field;
	
	@FindBy(name="content(payTranCredit2AddrLine1)")
	WebElement credit_AddressLine1_Field;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//button[normalize-space()='Logout']")
	WebElement logoutBtn;
	
	public PaymentFlow() {
		PageFactory.initElements(driver, this);
	}

	public void filterScreen(String EntryDate,String MessageType, String PaymentType,String Reference,String SubRef,String SenderRef) throws InterruptedException {
		Select sl=new Select(periodEntryDate);
		sl.selectByVisibleText(EntryDate);
		Select sl1 = new Select(messageType);
		sl1.selectByVisibleText(MessageType);
		Select sl2 = new Select(paymentType);
		sl2.selectByVisibleText(PaymentType);
		Select sl3=new Select(referenceOption);
		sl3.selectByVisibleText(Reference);
		Select sl4=new Select(referenceTest);
		sl4.selectByVisibleText(SubRef);
		reference.clear();
		reference.sendKeys(SenderRef);
		getAllBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public PaymentFlow viewPayment(String EntryDate,String MessageType, String PaymentType,String Reference,String SubRef,String SenderRef) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen(EntryDate,MessageType,PaymentType,Reference,SubRef,SenderRef);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		return new PaymentFlow();
	}
	
	public PaymentFlow importSwiftMessage1() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftTextArea.sendKeys(IntfConstants.SWIFT_MSG_1);
//		chooseFileButton.sendKeys(IntfConstants.SWIFT_MSG);
		importBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		LogOut();
		return new PaymentFlow();
	}
	
	public PaymentFlow importSwiftMessage2() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftTextArea.sendKeys(IntfConstants.SWIFT_MSG_2);
//		chooseFileButton.sendKeys(IntfConstants.SWIFT_MSG);
		importBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		LogOut();
		return new PaymentFlow();
	}
	
	public PaymentFlow importSwiftMessage3() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftTextArea.sendKeys(IntfConstants.SWIFT_MSG_3);
//		chooseFileButton.sendKeys(IntfConstants.SWIFT_MSG);
		importBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		LogOut();
		return new PaymentFlow();
	}

	public void validateSenderRef(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = sender_ReferenceField.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Ref field validation");
	}

	public void validateBankOp(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = bank_Operation_CodeField.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "BankOp(23B) field validation");
	}
	
	public void validateValueDate(String ExpectedValue, SoftAssert sa) throws ParseException {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = valueDateField.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Value Date field validation");
	}
	
	public void validateCurrency(String ExpectedValue, SoftAssert sa) throws ParseException {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = currencyField.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Currency field validation");
	}
	
	public void validateAmount(String ExpectedValue, SoftAssert sa) throws ParseException {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = amountField.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Amount field validation");
	}
	
	public void validateSender_Account(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = senderAccount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Account field validation");
	}
	
	public void validateSender_AccountCode(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = senderAccount_Code_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Account Code field validation");
	}
	
	public void validateSender_AccountCurrency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = senderAccount_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Account Currency field validation");
	}
	
	public void validateSender_AddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = sender_NameAddress1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Address Line1 field validation");
	}
	
	public void validateSender_AddressLine2(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = sender_NameAddress2_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Address Line2 field validation");
	}
	
	public void validateSender_AddressLine3(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = sender_NameAddress3_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Address Line3 field validation");
	}
	
	public void validateSender_AddressLine4(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = sender_NameAddress4_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Address Line4 field validation");
	}
	
	public void validateSenderBank_BIC(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = senderBankBIC_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Sender Bank BIC field validation");
	}
	
	public void validateOrderingCustomer_Account(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Customer_Account_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Customer Account field validation");
	}
	
	public void validateOrderingCustomer_AddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Customer_NameAddress1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Customer Address Line1 field validation");
	}
	
	public void validateOrderingCustomer_AddressLine2(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Customer_NameAddress2_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Customer Address Line2 field validation");
	}
	
	public void validateOrderingCustomer_AddressLine3(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Customer_NameAddress3_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Customer Address Line3 field validation");
	}
	
	public void validateOrderingBank(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Institution_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Bank field validation");
	}
	
	public void validateOrderingBank_AdressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Institution_NameAddress1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Bank Address Line1 field validation");
	}
	
	public void validateOrderingBank_AdressLine2(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Institution_NameAddress2_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Bank Address Line2 field validation");
	}
	
	public void validateOrderingBank_AdressLine3(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Institution_NameAddress3_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Bank Address Line3 field validation");
	}
	
	public void validateOrderingBank_AdressLine4(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = ordering_Institution_NameAddress4_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Ordering Bank Address Line4 field validation");
	}
	
	public void validateBeneficiary_Account(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_Account_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Account field validation");
	}
	
	public void validateBeneficiary_AccountCode(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_AccountCode_Field.getText();
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Account Code field validation");
	}
	
	public void validateBeneficiary_AccountCurrency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_AccountCurrency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Account Currency field validation");
	}
	
	public void validateBeneficiary_AddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_NameAddress1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Address Line1 field validation");
	}
	
	public void validateBeneficiary_AddressLine2(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_NameAddress2_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Address Line2 field validation");
	}
	
	public void validateBeneficiary_AddressLine3(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_NameAddress3_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Address Line3 field validation");
	}
	
	public void validateBeneficiary_AdviceType(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_AdviceType_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Advice Type field validation");
	}
	
	public void validateBeneficiary_MsgType(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue= beneficiary_MsgType_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Beneficiary Msg Type field validation");
	}
	
	public void validateDetailsOfCharges(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = detailsOfCharges_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Details Of Charges field validation");
	}
	
	public void validateDetailsOfPayment_70(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = detailsOfPayment_70_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Details Of Payment field 70 validation");
	}
	
	public void validateBanktoBankInfo_72(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = banktobankInfo_72_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Bank to Bank Information field 72 validation");
	}

	public void validateConvert(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = convert_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Convert field validation");
	}
	
	public void validateConvertRate(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = convertRate_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Convert Rate field validation");
	}
	
	public void validateDivide(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = divide_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Divide field validation");
	}
	
	public void validateDivideBaseRate(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = divideBaseRate_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Divide Base Rate field validation");
	}
	
	public void validateDebitEquivalent_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debitEquivalent_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Equivalent Currency field validation");
	}
	
	public void validateDebitEquivalent_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debitEquivalent_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Equivalent Amount field validation");
	}
	
	public void validatePost(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = post_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Post(Y/N) field validation");
	}
	
	public void validateCommission_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = commission_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Commission Currency field validation");
	}
	
	public void validateCommission_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = commission_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Commission Amount field validation");
	}
	
	public void validateCommission_DetailsOfCharges(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = commission_DetailsOfCharges_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Commission Details Of Charges field validation");
	}
	
	public void validateCorrespFee_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = correspFee_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "CorrespFee Currency field validation");
	}
	
	public void validateCorrespFee_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = correspFee_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "CorrespFee Amount field validation");
	}
	
	public void validateCorrespFee_DetailsOfCharges(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = correspFee_DetailsOfCharges_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "CorrespFee Details Of Charges field validation");
	}
	
	public void validateForexLevy_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = forexLevy_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "ForexLevy Currency field validation");
	}
	
	public void validateForexLevy_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = forexLevy_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "ForexLevy Amount field validation");
	}
	
	public void validateForexLevy_DetailsOfCharges(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = forexLevy_DetailsOfCharges_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "ForexLevy Details Of Charges field validation");
	}
	
	public void validateStampDuty_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = stampDuty_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "StampDuty Currency field validation");
	}
	
	public void validateStampDuty_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = stampDuty_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "StampDuty Amount field validation");
	}
	
	public void validateStampDuty_DetailsOfCharges(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = stampDuty_DetailsOfCharges_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "StampDuty Details Of Charges field validation");
	}
	
	public void validateVAT_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = vat_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "VAT Currency field validation");
	}
	
	public void validateVAT_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = vat_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "VAT Amount field validation");
	}
	
	public void validateVAT_DetailsOfCharges(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = vat_DetailsOfCharges_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "VAT Details Of Charges field validation");
	}
	
	public void validateRateGroup(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = rateGroup_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Rate Group field validation");
	}
	
	public void validatePurposeCode(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = purposeCode_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Purpose Code field validation");
	}
	
	public void validateDebit_RTGSAccount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSAccount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Account field validation");
	}
	
	public void validateDebit_RTGSCode(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSCode_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Code field validation");
	}
	
	public void validateDebit_RTGSValueDate(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSValueDate_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Value Date field validation");
	}
	
	public void validateDebit_RTGSCurrency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSCurrency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Currency field validation");
	}
	
	public void validateDebit_RTGSAmount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSAmount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Amount field validation");
	}
	
	public void validateDebit_RTGSAddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSAddressLine1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Address Line1 field validation");
	}
	
	public void validateDebit_RTGSAddressLine2(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSAddressLine2_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Address Line2 field validation");
	}
	
	public void validateDebit_RTGSAddressLine3(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSAddressLine3_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Address Line3 field validation");
	}
	
	public void validateDebit_RTGSAddressLine4(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_RTGSAddressLine4_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit RTGS Address Line4 field validation");
	}
	
	public void validateCredit_CustomerAccount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerAccount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Account field validation");
	}
	
	public void validateCredit_CustomerCode(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerCode_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Code field validation");
	}
	
	public void validateCredit_CustomerValueDate(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerValueDate_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Value Date field validation");
	}
	
	public void validateCredit_CustomerCurrency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerCurrency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Currency field validation");
	}
	
	public void validateCredit_CustomerAmount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerAmount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Amount field validation");
	}
	
	public void validateCredit_CustomerAddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerAddressLine1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Address Line1 field validation");
	}
	
	public void validateCredit_CustomerAddressLine2(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerAddressLine2_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Address Line2 field validation");
	}
	
	public void validateCredit_CustomerAddressLine3(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_CustomerAddressLine3_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Customer Address Line3 field validation");
	}
	
	public void validateDebit_CustomerAccount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_CustomerAccount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Customer Account field validation");
	}
	
	public void validateDebit_CustomerCode(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_CustomerCode_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Customer Code field validation");
	}
	
	public void validateDebit_CustomerValueDate(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_CustomerValueDate_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Customer Value Date field validation");
	}
	
	public void validateDebit_CustomerCurrency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_CustomerCurrency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Customer Currency field validation");
	}
	
	public void validateDebit_CustomerAmount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_CustomerAmount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Customer Amount field validation");
	}
	
	public void validateDebit_CustomerAddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = debit_CustomerAddressLine1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Debit Customer Address Line1 field validation");
	}
	
	public void validateCredit_Account(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_Account_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Account field validation");
	}
	
	public void validateCredit_Code(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_Code_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Code field validation");
	}
	
	public void validateCredit_ValueDate(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_ValueDate_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Value Date field validation");
	}
	
	public void validateCredit_Currency(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_Currency_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Currency field validation");
	}
	
	public void validateCredit_Amount(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue =credit_Amount_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Amount field validation");
	}
	
	public void validateCredit_AddressLine1(String ExpectedValue, SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue = credit_AddressLine1_Field.getAttribute("value");
		System.out.println("Actual Value= " + ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue, "Credit Address Line1 field validation");
	}
	
	public void verifySenderRef_field(String key, SoftAssert sa) {
		validateSenderRef(xmlFileReader.mapTitle.get(key), sa);
	}

	public void verifyBankOp_field(String key, SoftAssert sa) {
		validateBankOp(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyValueDate_field(String key, SoftAssert sa) throws ParseException {
		validateValueDate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCurrency_field(String key, SoftAssert sa) throws ParseException {
		validateCurrency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyAmount_field(String key, SoftAssert sa) throws ParseException {
		validateAmount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_Account_field(String key, SoftAssert sa) {
		validateSender_Account(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_AccountCode_field(String key, SoftAssert sa) {
		validateSender_AccountCode(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_AccountCurrency_field(String key, SoftAssert sa) {
		validateSender_AccountCurrency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_AddressLine1_field(String key, SoftAssert sa) {
		validateSender_AddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_AddressLine2_field(String key, SoftAssert sa) {
		validateSender_AddressLine2(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_AddressLine3_field(String key, SoftAssert sa) {
		validateSender_AddressLine3(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySender_AddressLine4_field(String key, SoftAssert sa) {
		validateSender_AddressLine4(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifySenderBank_BIC_field(String key, SoftAssert sa) {
		validateSenderBank_BIC(xmlFileReader.mapTitle.get(key), sa);
	}

	public void verifyOrderingCustomer_Account_field(String key, SoftAssert sa) {
		validateOrderingCustomer_Account(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingCustomer_AdressLine1_field(String key, SoftAssert sa) {
		validateOrderingCustomer_AddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingCustomer_AdressLine2_field(String key, SoftAssert sa) {
		validateOrderingCustomer_AddressLine2(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingCustomer_AdressLine3_field(String key, SoftAssert sa) {
		validateOrderingCustomer_AddressLine3(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingBank_field(String key, SoftAssert sa) {
		validateOrderingBank(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingBank_AdressLine1_field(String key, SoftAssert sa) {
		validateOrderingBank_AdressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingBank_AdressLine2_field(String key, SoftAssert sa) {
		validateOrderingBank_AdressLine2(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingBank_AdressLine3_field(String key, SoftAssert sa) {
		validateOrderingBank_AdressLine3(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyOrderingBank_AdressLine4_field(String key, SoftAssert sa) {
		validateOrderingBank_AdressLine4(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_Account_field(String key, SoftAssert sa) {
		validateBeneficiary_Account(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_AccountCode_field(String key, SoftAssert sa) {
		validateBeneficiary_AccountCode(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_AccountCurrency_field(String key, SoftAssert sa) {
		validateBeneficiary_AccountCurrency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_AddressLine1_field(String key, SoftAssert sa) {
		validateBeneficiary_AddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_AddressLine2_field(String key, SoftAssert sa) {
		validateBeneficiary_AddressLine2(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_AddressLine3_field(String key, SoftAssert sa) {
		validateBeneficiary_AddressLine3(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_AdviceType_field(String key, SoftAssert sa) {
		validateBeneficiary_AdviceType(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBeneficiary_MsgType_field(String key, SoftAssert sa) {
		validateBeneficiary_MsgType(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDetailsOfCharges_field(String key, SoftAssert sa) {
		validateDetailsOfCharges(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDetailsOfPayment_70_field(String key, SoftAssert sa) {
		validateDetailsOfPayment_70(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyBanktoBankInfo_72_field(String key, SoftAssert sa) {
		validateBanktoBankInfo_72(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyConvert_field(String key, SoftAssert sa) {
		validateConvert(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyConvertRate_field(String key, SoftAssert sa) {
		validateConvertRate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDivide_field(String key, SoftAssert sa) {
		validateDivide(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDivideBaseRate_field(String key, SoftAssert sa) {
		validateDivideBaseRate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebitEquivalent_Currency_field(String key, SoftAssert sa) {
		validateDebitEquivalent_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebitEquivalent_Amount_field(String key, SoftAssert sa) {
		validateDebitEquivalent_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyPost_field(String key, SoftAssert sa) {
		validatePost(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCommission_Currency_field(String key, SoftAssert sa) {
		validateCommission_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCommission_Amount_field(String key, SoftAssert sa) {
		validateCommission_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCommission_DetailsOfCharges_field(String key, SoftAssert sa) {
		validateCommission_DetailsOfCharges(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCorrespFee_Currency_field(String key, SoftAssert sa) {
		validateCorrespFee_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCorrespFee_Amount_field(String key, SoftAssert sa) {
		validateCorrespFee_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCorrespFee_DetailsOfCharges_field(String key, SoftAssert sa) {
		validateCorrespFee_DetailsOfCharges(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyForexLevy_Currency_field(String key, SoftAssert sa) {
		validateForexLevy_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyForexLevy_Amount_field(String key, SoftAssert sa) {
		validateForexLevy_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyForexLevy_DetailsOfCharges_field(String key, SoftAssert sa) {
		validateForexLevy_DetailsOfCharges(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyStampDuty_Currency_field(String key, SoftAssert sa) {
		validateStampDuty_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyStampDuty_Amount_field(String key, SoftAssert sa) {
		validateStampDuty_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyStampDuty_DetailsOfCharges_field(String key, SoftAssert sa) {
		validateStampDuty_DetailsOfCharges(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyVAT_Currency_field(String key, SoftAssert sa) {
		validateVAT_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyVAT_Amount_field(String key, SoftAssert sa) {
		validateVAT_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyVAT_DetailsOfCharges_field(String key, SoftAssert sa) {
		validateVAT_DetailsOfCharges(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyRateGroup_field(String key, SoftAssert sa) {
		validateRateGroup(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyPurposeCode_field(String key, SoftAssert sa) {
		validatePurposeCode(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSAccount_field(String key, SoftAssert sa) {
		validateDebit_RTGSAccount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSCode_field(String key, SoftAssert sa) {
		validateDebit_RTGSCode(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSValueDate_field(String key, SoftAssert sa) {
		validateDebit_RTGSValueDate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSCurrency_field(String key, SoftAssert sa) {
		validateDebit_RTGSCurrency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSAmount_field(String key, SoftAssert sa) {
		validateDebit_RTGSAmount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSAddressLine1_field(String key, SoftAssert sa) {
		validateDebit_RTGSAddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSAddressLine2_field(String key, SoftAssert sa) {
		validateDebit_RTGSAddressLine2(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSAddressLine3_field(String key, SoftAssert sa) {
		validateDebit_RTGSAddressLine3(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_RTGSAddressLine4_field(String key, SoftAssert sa) {
		validateDebit_RTGSAddressLine4(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerAccount_field(String key, SoftAssert sa) {
		validateCredit_CustomerAccount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerCode_field(String key, SoftAssert sa) {
		validateCredit_CustomerCode(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerValueDate_field(String key, SoftAssert sa) {
		validateCredit_CustomerValueDate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerCurrency_field(String key, SoftAssert sa) {
		validateCredit_CustomerCurrency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerAmount_field(String key, SoftAssert sa) {
		validateCredit_CustomerAmount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerAddressLine1_field(String key, SoftAssert sa) {
		validateCredit_CustomerAddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerAddressLine2_field(String key, SoftAssert sa) {
		validateCredit_CustomerAddressLine2(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_CustomerAddressLine3_field(String key, SoftAssert sa) {
		validateCredit_CustomerAddressLine3(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_CustomerAccount_field(String key, SoftAssert sa) {
		validateDebit_CustomerAccount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_CustomerCode_field(String key, SoftAssert sa) {
		validateDebit_CustomerCode(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_CustomerValueDate_field(String key, SoftAssert sa) {
		validateDebit_CustomerValueDate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_CustomerCurrency_field(String key, SoftAssert sa) {
		validateDebit_CustomerCurrency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_CustomerAmount_field(String key, SoftAssert sa) {
		validateDebit_CustomerAmount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyDebit_CustomerAddressLine1_field(String key, SoftAssert sa) {
		validateDebit_CustomerAddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_Account_field(String key, SoftAssert sa) {
		validateCredit_Account(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_Code_field(String key, SoftAssert sa) {
		validateCredit_Code(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_ValueDate_field(String key, SoftAssert sa) {
		validateCredit_ValueDate(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_Currency_field(String key, SoftAssert sa) {
		validateCredit_Currency(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_Amount_field(String key, SoftAssert sa) {
		validateCredit_Amount(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void verifyCredit_AddressLine1_field(String key, SoftAssert sa) {
		validateCredit_AddressLine1(xmlFileReader.mapTitle.get(key), sa);
	}
	
	public void LogOut() throws InterruptedException {
		logOutBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Actions act=new Actions(driver);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//			PDCModifyScreenFrame.click();
			for (int i=0; i<1; i++)
			{
				
				act.sendKeys(Keys.TAB).perform();
				Thread.sleep(100);

			}
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			driver.quit();
		}//end of confirmbuttontab function
	}
