package org.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.jsoup.parser.ParseSettings;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pom.BinisinaPom;
import org.pom.Homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.bytebuddy.jar.asm.ModuleVisitor;

public class BinSteps extends Ultilityclass {
	public static BinisinaPom a ;
	public static Homepage h ;
	public static JavascriptExecutor js;
	
	private static final Logger LOGGER = LogManager.getLogger(BinSteps.class);
	
	
@Given("User open the Home page")
public void user_open_the_Home_page() {
	
	LOGGER.info("Browser launched");
//	 StartTimeprint();
//	 String title = driver.getTitle();
//	 checkpresentElement("To check  Tittle at Home page",title.contains("24 Hour Pharmacy") );
//	 h = new Homepage();
//	 implicitWait();
//	 javascriptclick(h.getLoginImageIcon());
//	 Threadsleep(3000);
//	 javascriptclick(h.getLoginDialoption());
//	 Threadsleep(3000);
//	 ClickElement(h.getLoginDialNumber());
//	 PassValues(h.getLoginphonetext(), getdataExcel(1,3));
//     implicitWait();
//	 ClickElement(h.getLoginOTPrequest());
//     Threadsleep(20000);
//	 javascriptclick(h.getLoginOTPsubmit());
//     System.out.println("Login Function is Successfull");
//     LOGGER.info("Login Function is Successfull");
	 EndTimeprint();	
}

@When("user select the Category to sub category option from Home page")
public void user_select_the_Category_to_sub_category_option_from_Home_page() {
	 
	  StartTimeprint();
	  a = new BinisinaPom();
	  Threadsleep(10000);
	  moveToElement(a.getMaincategeory1());
	  Threadsleep(2000);
	  actionClick(a.getSubEyecategeory1());
	  String title1 = driver.getTitle();
	  checkpresentElement("To check  Tittle at PLP page",title1.contains("Vitamins") );
	  System.out.println("Categeory  Succesfully selected&verified"); 
	  EndTimeprint();
}

@When("user click on the any one image based on the filter")
public void user_click_on_the_any_one_image_based_on_the_filter() {
	 
	 StartTimeprint();
	 a = new BinisinaPom();
	 Threadsleep(3000);
	 javascriptclick(a.getSubBrandFillter());
	 Threadsleep(3000);
	 javascriptclick(a.getSubBrandFilltercheck()); 
	 Threadsleep(5000); 
	 String FillterUrl = driver.getCurrentUrl();
	 checkpresentElement("To verify filltration using Brand",FillterUrl.contains("1172")); 
 	 Threadsleep(5000);
	  WebElement PLPrate1 = a.getPLPrate1();
	  String plprate1 = PLPrate1.getText();
	  Threadsleep(3000);
	  javascriptclick(a.getImgFillter1());
	  System.out.println("Successfully verified product based on the Filltration");
	  Threadsleep(2000); 
	  WebElement PDPrate1 = a.getPDPrate1();
	  String pdprate1 = PDPrate1.getText();
	  Threadsleep(2000); 
	  checkequaltext("To verify btw the PLP&PDP page the product RATE",plprate1,pdprate1); 
	  System.out.println("Successfully verified product RATE btw the PLP&PDP page");
	  EndTimeprint();
	 
}


@When("User navigate from  PDP page to cart page")
public void user_navigate_from_PDP_page_to_cart_page() {
      StartTimeprint(); 
      Threadsleep(3000);
	  a =new BinisinaPom(); 
	  WebElement pdppagename1 = a.getBoironPDPpagename1();
	  String PDPname1 = pdppagename1.getText(); 
	  ClickElement(a.getQdropbutton());
	  Threadsleep(3000);
	  ClickElement(a.getQtyselection());
	  getText(a.getBoironPDPpagename1());
      Threadsleep(4000);
	  javascriptclick(a.getAddcart());
	  Threadsleep(3000);
	  javascriptclick(a.getCheckoutbuttonpop());
      Threadsleep(5000);
      checkequaltext("To verify btw the PDP&Cart page the product name",PDPname1 ,getText1(a.getBoironCartpagename1()) );
	  System.out.println("Successfully added cart from main categeory  to cart page ");
	  System.out.println("Successfully verifed product name btw the PDP&Cart page");
	  EndTimeprint();
      StartTimeprint();
	  a = new BinisinaPom();
	  moveToElement(a.getMaincategeory4());
	  Threadsleep(2000);
	  actionClick(a.getSubsnackscategeory1());
	  String title1 = driver.getTitle();
	  checkpresentElement("To check  Tittle at PLP page",title1.contains("Snacks") );
	  System.out.println("Categeory  Successfully selected&verified"); 
	  javascriptclick(a.getSubsnacksimgGavi4());
	  ClickElement(a.getQdropbutton());
	  Threadsleep(3000);
	  WebElement PDPrate2 = a.getPDPrateproduct2();
	  String pdprate2 = PDPrate2.getText();  
	  String pdprate3 = pdprate2.substring(4);
	  
	  ClickElement(a.getQtyselection());
      Threadsleep(3000);
	  javascriptclick(a.getAddcart());
	  Threadsleep(3000);
	  javascriptclick(a.getCheckoutbuttonpop());
      Threadsleep(4000);
      
      WebElement CARTrate1 = a.getCartrateproduct2();
	  String CARTRATE = CARTrate1.getText();
	  String CARTRATE2 = CARTRATE.substring(4);
	 
	  checkequaltext("To verify btw the PDP&Cart  page the product RATE",pdprate3,CARTRATE2); 
	  System.out.println("Successfully verified product RATE btw the PDP&CART page");
	  System.out.println("Successfully added another  product on  the  CART PAGE");	 
      EndTimeprint();
	
      StartTimeprint(); 
	  WebElement cartsubtotal = a.getCartSubtotal();
	  String Cartsubtotal = cartsubtotal.getText();
	  String CartSubTotal2 = Cartsubtotal.substring(4);
	  Double Subtotalamount = Double.valueOf(CartSubTotal2);
	
	  WebElement cartVATtotal = a.getCartVATtotal();
      String Cartvattotal = cartVATtotal.getText();
	  String CartVATTotal2 = Cartvattotal.substring(4);
	  Double CartVATTotal3 = Double.valueOf(CartVATTotal2);
	 		  
	  WebElement shipptotal = a.getCartshippingtotal();
      String  shippingtotal = shipptotal.getText();
      String shippingamount2 = shippingtotal.substring(4);
      Double shippingamount = Double.valueOf(shippingamount2);
	  
      Double t = Subtotalamount+shippingamount;
      
      WebElement OrderTotal = a.getCartOrdertotal();
	  String CartorderTotal = OrderTotal.getText();
	  String CartorderTotal1 = CartorderTotal.substring(4);
	  Double OrderTotalamount = Double.valueOf(CartorderTotal1);
	  System.out.println(OrderTotalamount);
	  Threadsleep(5000);
	  
	  checkpresentElement("To check order summary calculation",Subtotalamount.equals(OrderTotalamount) );
	  System.out.println("Successfully Verified order summary calculation in cart page");
	  //checkequaltext("To verify the product count btw PDP&cart page",Count, Count1);
	  Threadsleep(3000); 
	  javascriptclick(a.getCarttoCheckout());
	 
	  checkequaltext("Compare to cart&Checkout page subtotal",Cartsubtotal, getText1(a.getCheckoutSubTotal()));  
    //checkequaltext("Compare to cart&Checkout page ShippingCharges",shippingtotal, getText1(a.getCheckoutShippingtotal()));
	//checkequaltext("Compare to cart&Checkout page VAT amount",Cartvattotal,getText1(a.getCheckoutVATtotal()));
      checkequaltext("Compare to cart&Checkout page Order total amount Charges",CartorderTotal, getText1(a.getCheckoutOrderTotal()));
   
    WebElement CheckOrderTotal = a.getCheckoutOrderTotal();
    String CheckOrderTotal1 = CheckOrderTotal.getText();
	String CheckOrderTotal2 = CheckOrderTotal1.substring(4);
	
   Double CheckOrderTotal3 = Double.valueOf(CheckOrderTotal2);
 
	checkpresentElement("To check order summary calculation",CheckOrderTotal3.equals(OrderTotalamount) );
	System.out.println("Successfully Verified   product order summary  Detail btw the CART&Checkout  page");
	 EndTimeprint();
 }

@When("Go to  the checkout page and User Enter the shipping Address detail")
public void go_to_the_checkout_page_and_user_enter_the_shipping_address_detail() {
   
	  StartTimeprint();
	  a = new BinisinaPom();
	  Threadsleep(4000);
	 PassValues(a.getAddressSetmap(), getdataExcel(1,2)); 
	 ClickElement(a.getAddressHome());
	 Threadsleep(6000); 
	 ClickElement(a.getLogincheckMR());
	 Threadsleep(3000);
	 ClickElement(a.getLogincheckMRdata());
	 PassValues(a.getLogincheckFirst(), getdataExcel(2,2));
	 Threadsleep(3000);
	 PassValues(a.getLogincheckLast(), getdataExcel(3,2));
	 Threadsleep(5000);
	 ClickElement(a.getLogincheckState());
	 Threadsleep(4000);
	 ClickElement(a.getLogincheckStatedubai());	 
	 ClickElement(a.getLogincheckStreet());
	 Threadsleep(3000);
	 ClickElement(a.getLogincheckStreetDATA2());
	 PassValues(a.getLogincheckFlotNumber(), getdataExcel(5,2));
	 PassValues(a.getLogincheckNickname(), getdataExcel(6,2));
	 Threadsleep(3000);
	 javascriptclick(a.getLogincheckShippingmetod1());
	 Threadsleep(3000);
      System.out.println("Successfully updated Shipping address deatil");
      Threadsleep(5000);
      javascriptclick(a.getCheckoutnextSTEP2());
  	  EndTimeprint();
}

@When("User select the online payment option and click on the place order")
public void user_select_the_online_payment_option_and_click_on_the_place_order() {
    
     StartTimeprint();
	 a = new BinisinaPom();
	 javascriptclick(a.getLoginpayment1());
	 //javascriptclick(a.getLoginpayment2());
	 Threadsleep(7000);
	 javascriptclick(a.getPlaceorder1()); 
	 Threadsleep(25000); 
	 PassValues(a.getCardNumber(), getdataExcel(7, 1)); 
	 javascriptclick(a.getMonthdrop());
	 Threadsleep(5000); 
	 javascriptclick(a.getMonthOrderwise());
	 Threadsleep(3000);
	 PassValues(a.getCVV(),  getdataExcel(8, 1));
	 javascriptclick(a.getPayButton());
	 System.out.println("Succesfully entered card deatil on the payment Gate section");
	 EndTimeprint();
}

@Then("Observe the orderid template page with order detail and Go the My account page")
public void observe_the_orderid_template_page_with_order_detail_and_go_the_my_account_page() {
    
       StartTimeprint();
	   a = new BinisinaPom(); 
       WebElement confirmationmess = a.getOrderpageTemplate();
	   String message = confirmationmess.getText();

     WebElement checkorder1 = a.getOrderIDStatic1();
	 String checkorderID1 = checkorder1.getText();

	 WebElement checkorder2 = a.getOrderIDStatic2();
	 String checkorderID2 = checkorder2.getText();
	 System.out.println(checkorderID2);
     Threadsleep(6000);
	 checkpresentElement("To verify the confirmation message",message.contains("Thank you for your purchase!"));
     checkpresentElement ("To verify the order id",checkorderID1.equals(checkorderID2));
     WebElement orderProductname1 = a.getOrderProductname1();
     String orderProductname12 = orderProductname1.getText();
    
     WebElement orderProductname21 = a.getOrderProductname2();
     String orderProductname22 = orderProductname21.getText();
     
     String Qty = "4";
      
      WebElement Qty1 = a.getOrderedQty1();
	  String OrderedQty = Qty1.getText();
	  int parseInt1 = Integer.parseInt(OrderedQty);
	  
	  WebElement Qty2 = a.getOrderedQty2();
	  String OrderedQty2 = Qty2.getText();
	  int parseInt2 = Integer.parseInt(OrderedQty2);
	  
	  int OrderedQtyTotal = parseInt1+parseInt2;
	  String Qtyvalue = String.valueOf(OrderedQtyTotal);
	 
	  
     checkpresentElement ("To verify the ordered Qty in confirmation page",Qtyvalue.equals(Qty));
	 
	 WebElement Productrate1 =a.getOrderProduct1rate();
     String  Productrate2 = Productrate1.getText();
     String shippingamount3 = Productrate2.substring(4);
     Double  Productrate4 = Double.valueOf(shippingamount3);
     
     WebElement Product2rate1 =a.getOrderProduct2rate();
     String  Product2rate2 = Product2rate1.getText();
     String Product2rate3 = Product2rate2.substring(4);
     Double Product2rate4 = Double.valueOf(Product2rate3);
	  
      Double productsubtotal = Productrate4+Product2rate4;
    
	  WebElement OrderedSubTotal = a.getOrderSubTotal();
	  String OrderedSubTotal1 = OrderedSubTotal.getText();
	  String OrderedSubTotal2 = OrderedSubTotal1.substring(4);
	  Double OrderedSubTotal4 = Double.valueOf(OrderedSubTotal2);
	  Threadsleep(5000);
	  
	  WebElement OrderedTotal = a.getOrderedTotal();
	  String OrderedTotal1 = OrderedTotal.getText();
	  String OrderedTotal2 = OrderedTotal1.substring(4);
	  
//	  WebElement Orderedpaymentmethod = a.getOrderedpaymentmethod1();
//	  String cash1 = Orderedpaymentmethod.getText();
	  
	  WebElement Orderedpaymentmethod2 = a.getOrderedpaymentmethod2();
      String Onlinemethod = Orderedpaymentmethod2.getText();
      Threadsleep(5000);
	  checkpresentElement("To check order summary calculation in Confirmation page",OrderedSubTotal4.equals(productsubtotal) );
	  checkpresentElement("To check the payment method", Onlinemethod.contains("Online"));

	System.out.println("Successfully Verified order summary calculation& payment method in Confirmation  page");
	EndTimeprint();   
	StartTimeprint();
	a = new BinisinaPom(); 
	Threadsleep(5000); 
    javascriptclick(a.getMyaccountIcon());
    Threadsleep(5000); 
    javascriptclick(a.getMyaccountOrders());
    Threadsleep(2000); 
    javascriptclick(a.getOrderdetailpagebody());
	  
	  WebElement myaccountOrdersID = a.getMyaccountOrdersID();
	  String myaccountOrdersID2 = myaccountOrdersID.getText();
	  String myaccountOrdersID3 = myaccountOrdersID2.substring(8);
	  System.out.println(myaccountOrdersID3);
	  
	  WebElement myaccountProductname1 = a.getMyaccountProductname1();
	  String myaccountProductname2 = myaccountProductname1.getText();
      System.out.println(myaccountProductname2);
      
      WebElement myaccountProductname21 = a.getMyaccountProductname2();
	  String myaccountProductname22 = myaccountProductname21.getText();
      System.out.println(myaccountProductname22);
      
      WebElement myaccountProductQty = a.getMyaccountProductQty();
	  String myaccountProductQty1 = myaccountProductQty.getText();
      System.out.println(myaccountProductQty1);
      
      WebElement MyaccountSubTotal = a.getMyaccountSubTotal();
	  String MyaccountSubTotal1 = MyaccountSubTotal.getText();
	  String MyaccountSubTotal2 = MyaccountSubTotal1.substring(4);
      
      WebElement MyaccountOrderTotal = a.getMyaccountOrderTotal();
	  String MyaccountOrderTotal1 = MyaccountOrderTotal.getText();
	  String MyaccountOrderTotal2 = MyaccountOrderTotal1.substring(4);
      System.out.println(MyaccountOrderTotal2);
      
      WebElement Myaccountpaymentmethod1 = a.getMyaccountpaymentmethod();
	  String Myaccountpaymentmethod2 = Myaccountpaymentmethod1.getText();
      System.out.println(Myaccountpaymentmethod2);
	  
   checkequaltext("To verify the Product Qty", Qtyvalue, getText1(a.getMyaccountProductQty()));
   
   checkequaltext("To be verify the Produt name-1 btw the confirmation and My account page", orderProductname12, myaccountProductname2);
   
   checkequaltext("To be verify the Produt name-2 btw the confirmation and My account page", orderProductname22, myaccountProductname22);

   checkequaltext("To be verify the OrderID btw the confirmation and My account page", checkorderID2, myaccountOrdersID3);
 
  checkequaltext("To be verify the Subtotal btw the confirmation and My account page",MyaccountSubTotal2 ,OrderedSubTotal2 );
 
  checkequaltext("To be verify the OrderTotal btw the confirmation and My account page",MyaccountOrderTotal2 ,OrderedTotal2 );
 
  checkequaltext("To be verify the Payment method btw the confirmation and My account page",Myaccountpaymentmethod2 , Onlinemethod);
 
  System.out.println("Successfully verified  order detail btw the Order confirmation and My account page ");
  EndTimeprint();
}

//Scenario-2
@When("user select the main Category to sub category option from Home page")
public void user_select_the_main_category_to_sub_category_option_from_home_page() {
	
	  StartTimeprint();
	  a = new BinisinaPom();
	  Threadsleep(5000);
	  moveToElement(a.getMaincategeory6());
	  Threadsleep(2000);
	  actionClick(a.getSubFacecategeory1());
	  String title1 = driver.getTitle();
	  checkpresentElement("To check  Tittle at PLP page",title1.contains("Face") );
	  System.out.println("Categeory  Succesfully selected&verified"); 
	  EndTimeprint();
    
}


@When("User select the anyone product from  PDP page to cart page")
public void user_select_the_anyone_product_from_pdp_page_to_cart_page() {
	
	   StartTimeprint();
	   a = new BinisinaPom();
	  javascriptclick(a.getSubFaceimg8());
	  ClickElement(a.getQdropbutton());
	  Threadsleep(3000);
	   ClickElement(a.getQtyselection1());
      Threadsleep(3000);
	   javascriptclick(a.getAddcart());
	  Threadsleep(3000);
	  javascriptclick(a.getCheckoutbuttonpop());
      Threadsleep(4000);  
	  System.out.println("Successfully added  product on  the  CART PAGE");	 
      EndTimeprint();
}


@When("Go to the checkout page.If,already register detail navigate to payment page")
public void go_to_the_checkout_page_if_already_register_detail_navigate_to_payment_page() {

      StartTimeprint(); 
      a = new BinisinaPom();
	  WebElement cartsubtotal = a.getCartSubtotal();
	  String Cartsubtotal = cartsubtotal.getText();
	  String CartSubTotal2 = Cartsubtotal.substring(4);
	  Double Subtotalamount = Double.valueOf(CartSubTotal2);
	
	  WebElement cartVATtotal = a.getCartVATtotal();
      String Cartvattotal = cartVATtotal.getText();
	  String CartVATTotal2 = Cartvattotal.substring(4);
	  Double CartVATTotal3 = Double.valueOf(CartVATTotal2);
	 		  
	  WebElement shipptotal = a.getCartshippingtotal();
    String  shippingtotal = shipptotal.getText();
    String shippingamount2 = shippingtotal.substring(4);
    Double shippingamount = Double.valueOf(shippingamount2);
	  
    Double t = Subtotalamount+shippingamount;
    
    WebElement OrderTotal = a.getCartOrdertotal();
	  String CartorderTotal = OrderTotal.getText();
	  String CartorderTotal1 = CartorderTotal.substring(4);
	  Double OrderTotalamount = Double.valueOf(CartorderTotal1);
	  System.out.println(OrderTotalamount);
	  Threadsleep(5000);
	  
	  checkpresentElement("To check order summary calculation",Subtotalamount.equals(OrderTotalamount) );
	  System.out.println("Successfully Verified order summary calculation in cart page");
	  //checkequaltext("To verify the product count btw PDP&cart page",Count, Count1);
	  Threadsleep(3000); 
	  javascriptclick(a.getCarttoCheckout());
	  EndTimeprint();   

	 
	  checkequaltext("Compare to cart&Checkout page subtotal",Cartsubtotal, getText1(a.getCheckoutSubTotal()));  
	 
  //checkequaltext("Compare to cart&Checkout page ShippingCharges",shippingtotal, getText1(a.getCheckoutShippingtotal()));
	//checkequaltext("Compare to cart&Checkout page VAT amount",Cartvattotal,getText1(a.getCheckoutVATtotal()));

    checkequaltext("Compare to cart&Checkout page Order total amount Charges",CartorderTotal, getText1(a.getCheckoutOrderTotal()));
 
  WebElement CheckOrderTotal = a.getCheckoutOrderTotal();
  String CheckOrderTotal1 = CheckOrderTotal.getText();
	String CheckOrderTotal2 = CheckOrderTotal1.substring(4);
	
 Double CheckOrderTotal3 = Double.valueOf(CheckOrderTotal2);

	checkpresentElement("To check order summary calculation",CheckOrderTotal3.equals(OrderTotalamount) );
	System.out.println("Successfully Verified   product order summary  Detail btw the CART&Checkout  page");
	 StartTimeprint();
	  a = new BinisinaPom();
	 Threadsleep(6000);
	 javascriptclick(a.getLogincheckShippingmetod1());
	 Threadsleep(5000);
     System.out.println("Successfully updated Shipping address deatil");
     Threadsleep(5000);
     javascriptclick(a.getCheckoutnextSTEP2());
 	  EndTimeprint();
   
}
@When("User select the different card payment option and click on the place order")
public void user_select_the_different_card_payment_option_and_click_on_the_place_order() {
	 StartTimeprint(); 
	 a = new BinisinaPom();
	 javascriptclick(a.getLoginpayment1());
	
	 //javascriptclick(a.getLoginpayment2());
	 
	 Threadsleep(7000);
	 javascriptclick(a.getPlaceorder1()); 
	 Threadsleep(25000);
	 
	 PassValues(a.getCardNumber(), getdataExcel(10, 1));
	 javascriptclick(a.getMonthdrop());
	 Threadsleep(5000); 
	 javascriptclick(a.getMonthOrderwise());
	 Threadsleep(3000);
	 PassValues(a.getCVV(),  getdataExcel(8, 1));
	 javascriptclick(a.getPayButton());
	 System.out.println("Successfully entered card detail on the payment gate section");
	 EndTimeprint();
}
@Then("Observe the order flow.If,payment failure")
public void observe_the_order_flow_if_payment_failure() {
	 StartTimeprint(); 
	 a = new BinisinaPom();
	 PassValues(a.getPaymentFailtextOTP(), getdataExcel(11, 1));
	 Threadsleep(3000);
	 javascriptclick(a.getPaymentFailcontine());
	 System.out.println("Payment was Failure.So,Successfully entered OTP");
	 EndTimeprint();
}



//Binisina project
@Given("User go to the Home page")
public void user_go_to_the_Home_page() {
StartTimeprint();
	String title = driver.getTitle();
	checkpresentElement("To check  Tittle at Home page",title.contains("24 Hour Pharmacy") );
	 h = new Homepage();
	implicitWait();
	javascriptclick(h.getLoginImageIcon());
	Threadsleep(5000);
	javascriptclick(h.getLoginDialoption());
	Threadsleep(3000);
	ClickElement(h.getLoginDialNumber());
	PassValues(h.getLoginphonetext(), getdataExcel(1,3));
     implicitWait();
	 ClickElement(h.getLoginOTPrequest());
    Threadsleep(20000);
	javascriptclick(h.getLoginOTPsubmit());
   System.out.println("Login Function is Successfull");
	EndTimeprint();	
}
 
@When("User Enter the product name in search box {string}")
public void user_Enter_the_product_name_in_search_box(String product){	 
	 Threadsleep(10000); 
	 StartTimeprint(); 
	 a =new BinisinaPom();
	 Threadsleep(2000);  
	 PassValues(a.getSearchbox(), product);
	 System.out.println("Successfully Entered product name in search box");
	 EndTimeprint();
}

@When("User Should be visible related product.then,Click on any product")
public void user_Should_be_visible_related_product_then_Click_on_any_product() {
	
	 a =new BinisinaPom();
	 Threadsleep(2000); 
	 WebElement searchbox = a.getSearchbox();
	 String Data2 = getAttributte(searchbox);
	javascriptclick(a.getSearchboxclick());
	StartTimeprint(); 
	Threadsleep(5000);
	WebElement productname = a.getProductname();
	String  Data = productname.getText();
	checkequaltext("Comapare Product name",Data2,Data);
	System.out.println("Successfully verified searched product on the PLP page");
	EndTimeprint();
  
}

@When ("User navigate  to the PDP page")
public void user_navigate_to_the_PDP_page() {
	
	javascriptclick(a.getSearchProductimg1());
	  
}

@When ("Observe the  that particular product on PDP page")
public void observe_the_that_particular_product_on_pdp_page() {
	   Threadsleep(5000);   
	  a =new BinisinaPom();  
	  ClickElement(a.getQdropbutton());
	  Threadsleep(3000);
	  ClickElement(a.getQtyselection());	  
}

@When("User add the cart and moved to cart page")
public void user_add_the_cart_and_moved_to_cart_page() {
	  StartTimeprint(); 
	  a =new BinisinaPom();
	  Threadsleep(4000);
	  javascriptclick(a.getAddcart());
	  Threadsleep(4000);
	  javascriptclick(a.getCheckoutbuttonpop());
	  System.out.println("Successfully added cart from searched result to cart page ");
	  EndTimeprint();
	  Threadsleep(4000);
	  			
}
@Then("Added wishlist of the particular product by user from cart page")
public void added_wishlist_of_the_particular_product_by_user_from_cart_page() {
	   StartTimeprint(); 
	   a =new BinisinaPom();
	   javascriptclick(a.getCartWishlist());
	   Threadsleep(8000);
	    javascriptclick(a.getWishlistIcon());
	    Threadsleep(7000);   
	  System.out.println("Succesfully Added wishlist page from cart");
	  EndTimeprint();		
}



@Given("Go to the Home page without Login user")
public void go_to_the_home_page_without_login_user() {
	 StartTimeprint();
	 LOGGER.info("Guest user flow Executed");
	 System.out.println("Successfully launched Home page in Binisina site");
	 LOGGER.info("Successfully launched Home page in Binisina site");
}

@When("user click on any product From main to sub categeory")
public void user_click_on_any_product_from_main_to_sub_categeory() {

	   a = new BinisinaPom();
	   moveToElement(a.getMaincategeory2()); 
	   Threadsleep(2000);
	   actionClick(a.getSubanticategeory1());
	   String title1 = driver.getTitle();
	   checkpresentElement("To check  Tittle at PLP page",title1.contains("Vitamins") );
	   System.out.println("Successfully seletecd from main categeory to sub categeory ");
	   EndTimeprint();
			  
}	

@When("User select the Sortby option and verify the listing page")
public void user_select_the_sortby_option_and_verify_the_listing_page() {
	StartTimeprint();
	a = new BinisinaPom();
	 Threadsleep(5000);
	 ClickElement(a.getSortbyFillter());
	 Threadsleep(5000);
	 ClickElement(a.getSortbycontent());
	 Threadsleep(5000);
	 String SortUrl = driver.getCurrentUrl();
	 checkpresentElement("To verify Sorting order",SortUrl.contains("az"));
	 System.out.println("Successfully Verified Sorting order");
	 EndTimeprint();
}
@When("To check pagination as per plp page")
public void to_check_pagination_as_per_plp_page() throws AWTException {
	StartTimeprint();
	a = new BinisinaPom();
	Threadsleep(3000);
	Robot r = new Robot();
	for (int i = 0; i <60; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);		
	}
	Threadsleep(3000);
	javascriptclick(a.getSortbynext());
	Threadsleep(3000);
	
	for (int i = 0; i <60; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);		
	}
	javascriptclick(a.getSortbynext());
	
	Threadsleep(3000);
	for (int i = 0; i <80; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);		
	}
	
	javascriptclick(a.getSortbynext());	
	
	String pageUrl = driver.getCurrentUrl();
	checkpresentElement("To verify Page Number",pageUrl.contains("4"));
  
	System.out.println("Successfully Verified Pagination using scrolldown");
	  
	
//	actions = new Actions(driver);
////	actions.scrollToElement(a.getLodemore()).perform();
	EndTimeprint();
 

}

@Then("Click on the add cart redirect to the Cart page")
public void click_on_the_add_cart_redirect_to_the_cart_page() {
	 StartTimeprint();
	 a = new BinisinaPom();
	 Threadsleep(5000);
	  javascriptclick(a.getPLPaddcart());
	  Threadsleep(6000);
	  javascriptclick(a.getPLPcheckout());
	  System.out.println("Succesfully moved to cart page of the different pages product");
	  EndTimeprint();
	  StartTimeprint();
a = new BinisinaPom();
moveToElement(a.getMaincategeory5());
Threadsleep(3000);
actionClick(a.getSubbabycategeory());
String title1 = driver.getTitle();
checkpresentElement("To check  Tittle at PLP page",title1.contains("Baby") );
System.out.println("Categeory  Succesfully selected&verified"); 
javascriptclick(a.getSubpampersimg8());
ClickElement(a.getQdropbutton());
Threadsleep(3000);
ClickElement(a.getQtyselection());
Threadsleep(4000);
javascriptclick(a.getAddcart());
Threadsleep(4000);
javascriptclick(a.getCheckoutbuttonpop());
Threadsleep(5000);
a = new BinisinaPom();
javascriptclick(a.getQtyadd());
Threadsleep(4000);
javascriptclick(a.getQtyadd());
Threadsleep(7000);
javascriptclick(a.getQtymin());

System.out.println("Successfully product Quantity Increased and decresed");
EndTimeprint();

StartTimeprint();
javascriptclick(a.getCartcouponapplyoption());
Threadsleep(5000);
javascriptclick(a.getCartcouponcodeText());
Threadsleep(5000);
javascriptclick(a.getCartcouponcodedata());

javascriptclick(a.getCartcouponcodedataApply());

Threadsleep(10000);

WebElement CouponsubTotal = a.getCartSubtotalCoupon();
String CouponsubTotal1 = CouponsubTotal.getText();
String CouponsubTotal2 = CouponsubTotal1.substring(4);
Double valueOf = Double.valueOf(CouponsubTotal2);
System.out.println(CouponsubTotal2);
Threadsleep(5000);


WebElement CouponDiscount = a.getCartDiscounttotalCoupon();
String CouponDiscount1 = CouponDiscount.getText();
String CouponDiscount3 = CouponDiscount1.substring(5);
Double valueOf2 = Double.valueOf(CouponDiscount3);
System.out.println(CouponDiscount3);


//WebElement DiscountShippingTotal = a.getCartSHIIPINGtotalCoupon();
//String DiscountShippingTotal1 = DiscountShippingTotal.getText();
//String DiscountShippingTotal2 = DiscountShippingTotal1.substring(4);
//Double DiscountShippingTotal3 = Double.valueOf(DiscountShippingTotal2);
//System.out.println(DiscountShippingTotal3);


Double discountTotal =valueOf-valueOf2;
System.out.println(discountTotal);

//Double discountTotal =valueOf-valueOf2;
//System.out.println(discountTotal);

WebElement DiscountVAT = a.getCartVATtotalCoupon();
String DiscountVAT1 = DiscountVAT.getText();
String DiscountVAT2 = DiscountVAT1.substring(4);
Double valueOf3 = Double.valueOf(DiscountVAT2);
System.out.println(DiscountVAT2);

WebElement DiscountOrderTotal = a.getCartOrdertotalCoupon();
String DiscountOrderTotal1 = DiscountOrderTotal.getText();
String DiscountOrderTotal2 = DiscountOrderTotal1.substring(4);
Double OrderdiscountTotal = Double.valueOf(DiscountOrderTotal2);
System.out.println(DiscountOrderTotal2);

WebElement SaveAmount = a.getCartsavedamountCoupon();
String SaveAmount1 = SaveAmount.getText();
String SaveAmount2 = SaveAmount1.substring(4);
Double SavedAmount3 =Double.valueOf(SaveAmount2);

Threadsleep(5000);
checkpresentElement("After applying Coupon code.To check order summary calculation",discountTotal.equals(OrderdiscountTotal) );

javascriptclick(a.getCarttoCheckout());

checkpresentElement("Check order summary detail",discountTotal.equals(OrderdiscountTotal));
 
 System.out.println("Sucessfully  verified order summary detail calculation with discount offer");
  Threadsleep(5000);
 

 //checkequaltext("Compare to cart&Checkout page Charges",Cartshipping1, getText1());
  
  a = new BinisinaPom();
 checkequaltext("Compare to cart&Checkout page subtotal",CouponsubTotal1, getText1(a.getCheckoutSubtotalCoupon()));
 
 checkequaltext("Compare to cart&Checkout page DiscpuntAmount",CouponDiscount1, getText1(a.getCheckoutDiscounttotalCoupon()));
 
 checkequaltext("Compare to cart&Checkout page SavedAmount",DiscountVAT1, getText1(a.getCheckoutVATtotalCoupon()));
 
 checkequaltext("Compare to cart&Checkout page OrderTotal",DiscountOrderTotal1, getText1(a.getCheckoutOrdertotalCoupon()));

 System.out.println("Sucessfully  verified order summary detail with discount offer between cart& checkout page");
 Threadsleep(3000);
 
  navigateRefresh();
  Threadsleep(6000);
  
   PassValues(a.getCheckoutFirstText(), getdataExcel(2,1));
  PassValues(a.getCheckoutLastText(), getdataExcel(3,1));
   Threadsleep(3000);
  PassValues(a.getCheckoutmailText(), getdataExcel(1,1));
  Threadsleep(3000);
  javascriptclick(a.getCheckoutdialoption());
  Threadsleep(5000);
  javascriptclick(a.getCheckoutdialnumber());
  
  Threadsleep(10000);
  ClickElement(a.getCheckoutnumberclick());
  Threadsleep(5000);

  PassValues(a.getCheckoutphoneText(), getdataExcel(4,1));

  javascriptclick(a.getCheckoutGetOTP());

  Threadsleep(20000);
  javascriptclick(a.getCheckoutOTPSubmit());
 System.out.println("Sucessfully Verified Guestuser mobile number");
 Threadsleep(5000);
 EndTimeprint();
 
 StartTimeprint();
 a = new BinisinaPom();
 Threadsleep(4000);

PassValues(a.getAddressSetmap(), getdataExcel(1,2));

ClickElement(a.getAddressHome());
Threadsleep(6000);

ClickElement(a.getLogincheckMR());
Threadsleep(3000);
ClickElement(a.getLogincheckMRdata());

PassValues(a.getLogincheckFirst(), getdataExcel(2,2));
Threadsleep(3000);
PassValues(a.getLogincheckLast(), getdataExcel(3,2));
Threadsleep(5000);
ClickElement(a.getLogincheckState());
Threadsleep(4000);
ClickElement(a.getLogincheckStatedubai());	 

ClickElement(a.getLogincheckStreet());
Threadsleep(3000);
ClickElement(a.getLogincheckStreetDATA2());

PassValues(a.getLogincheckFlotNumber(), getdataExcel(5,2));
PassValues(a.getLogincheckNickname(), getdataExcel(6,2));
//Threadsleep(3000);
//javascriptclick(a.getLogincheckShippingmetod1());
 Threadsleep(3000);
  javascriptclick(a.getLogincheckShippingmetod2());
  Threadsleep(6000);
  System.out.println("Successfully updated Shipping address deatil");
  Threadsleep(5000);
 javascriptclick(a.getCheckoutnextSTEP2());
 EndTimeprint();
 StartTimeprint();
   a = new BinisinaPom();
  javascriptclick(a.getLoginpayment2());
  Threadsleep(3000);
 javascriptclick(a.getPlaceorder1());
 System.out.println("Succssfully product ordered using COD option");
 
  EndTimeprint();
  
  StartTimeprint();
  a = new BinisinaPom(); 
 WebElement confirmationmess = a.getOrderpageTemplate();
 String message = confirmationmess.getText();

WebElement checkorder1 = a.getOrderIDStatic1();
String checkorderID1 = checkorder1.getText();


WebElement checkorder2 = a.getOrderIDStatic2();
String checkorderID2 = checkorder2.getText();
System.out.println(checkorderID2);

Threadsleep(6000);

checkpresentElement("To verify the confirmation message",message.contains("Thank you for your purchase!"));
checkpresentElement ("To verify the order id",checkorderID1.equals(checkorderID2));


WebElement orderProductname1 = a.getOrderProductname1();
String orderProductname12 = orderProductname1.getText();

WebElement orderProductname21 = a.getOrderProductname2();
String orderProductname22 = orderProductname21.getText();


String Qty = "4";

 WebElement Qty1 = a.getOrderedQty1();
String OrderedQty = Qty1.getText();
int parseInt1 = Integer.parseInt(OrderedQty);

WebElement Qty2 = a.getOrderedQty2();
String OrderedQty2 = Qty2.getText();
int parseInt2 = Integer.parseInt(OrderedQty2);

int OrderedQtyTotal = parseInt1+parseInt2;
String Qtyvalue = String.valueOf(OrderedQtyTotal);


checkpresentElement ("To verify the ordered Qty in confirmation page",Qtyvalue.equals(Qty));
//
//WebElement Productrate1 =a.getOrderProduct1rate();
//String  Productrate2 = Productrate1.getText();
//String shippingamount3 = Productrate2.substring(4);
//Double  Productrate4 = Double.valueOf(shippingamount3);
//
//WebElement Product2rate1 =a.getOrderProduct2rate();
//String  Product2rate2 = Product2rate1.getText();
//String Product2rate3 = Product2rate2.substring(4);
//Double Product2rate4 = Double.valueOf(Product2rate3);
//
//Double productsubtotal = Productrate4+Product2rate4;
//
//
//
//WebElement OrderedSubTotal = a.getOrderSubTotal();
//String OrderedSubTotal1 = OrderedSubTotal.getText();
//String OrderedSubTotal2 = OrderedSubTotal1.substring(4);
//Double OrderedSubTotal4 = Double.valueOf(OrderedSubTotal2);
//Threadsleep(5000);

//WebElement OrderedTotal = a.getOrderedTotal();
//String OrderedTotal1 = OrderedTotal.getText();
//String OrderedTotal2 = OrderedTotal1.substring(4);


WebElement Orderedpaymentmethod = a.getOrderedpaymentmethod1();
String cash1 = Orderedpaymentmethod.getText();

//WebElement Orderedpaymentmethod2 = a.getOrderedpaymentmethod2();
//String Onlinemethod = Orderedpaymentmethod2.getText();
Threadsleep(5000);
//checkpresentElement("To check order summary calculation in Confirmation page",OrderedSubTotal4.equals(productsubtotal) );
checkpresentElement("To check the payment method", cash1.contains("Cash"));


System.out.println("Successfully Verified order summary calculation& payment method in Confirmation  page");
EndTimeprint();   
		 
		 
		 
//javascriptclick(a.getOrderedviewdetail());
// implicitWait();
// PassValues(a.getEmailbox(), getdataExcel(1,5));
// PassValues(a.getFirstnamebox(), getdataExcel(2,1));
// PassValues(a.getLastnamebox(), getdataExcel(3,1));
// PassValues(a.getStreetbox(), getdataExcel(4,1));
// PassValues(a.getBulidingbox(), getdataExcel(5,1));
// Threadsleep(3000);
// PassValues(a.getStatedubai(), getdataExcel(6,1));
// PassValues(a.getCity(), getdataExcel(7,1));
// PassValues(a.getZipcode(), getdataExcel(8,1)); 
// Threadsleep(6000);
// javascriptclick(a.getDialcodedrop1());
// Threadsleep(3000);
// javascriptclick(a.getCountrycode1());
// Threadsleep(3000);
// PassValues(a.getPhonenumber(),getdataExcel(2,5));
// Threadsleep(6000);
// System.out.println("Sucessfully Updated Billing address detail");
// javascriptclick(a.getVerifyotp1());
// Threadsleep(3000);
// javascriptclick(a.getGetotp1());
// Threadsleep(30000);  
// javascriptclick(a.getGetotp1submit());
// Threadsleep(6000);
//
// 
// 
// a =new AKIstagepom();
// actions = new Actions(driver);
// actions.scrollToElement(a.getCashoption()).perform();
// javascriptclick(a.getCashoption());
//
//  Threadsleep(5000);
// ClickElement(a.getPlaceordercheck());
//  
//  Threadsleep(10000);

// javascriptclick(a.getPlaceguest());
//
// 
//  WebElement confirmationmess = a.getConfirmationmess();
// String message = confirmationmess.getText();
//
// 
// WebElement checkorder = a.getCheckorderid();
// String checkorder1 = checkorder.getText();
//
//
// Threadsleep(6000);
// checkpresentElement("To verify the confirmation meaasge",message.contains("order confirmation"));
// checkpresentElement ("To verify the order id",checkorder1.equals(checkorder1));
//
//System.out.println("Suceesfully verified OrderId&Template detail");
// 
// 
//   
// //Threadsleep(3000);
// //javascriptclick(a.getCartsubtraction());
// //Threadsleep(3000);
//// javascriptclick(a.getCartdelete());
//
//  

}





//Extra mulit product


@When("User move to the main categoey > sub categoey")
public void user_move_to_the_main_categoey_sub_categoey() {

	 
	 for (int i =0; i<4; i++) {
		 
		 actions = new Actions(driver);
        WebElement findElement= driver.findElement(By.xpath("(//a[@class='has-sub-cat '])[1]"));
        actions.moveToElement(findElement).perform();
		 
		 
		 for (int j =i ; j <26 ; j++) {
			 
	         WebElement findElement1 = driver.findElement(By.xpath("(//span[@class='level2-name sub-cat-name'])["+j+"]"));
			 findElement1.click();
		}

	 }
}

@Then("User verify the PLP page")
public void user_verify_the_PLP_page() {
	System.out.println("End");
}






	
	
	

}
