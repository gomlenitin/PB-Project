package org.pom;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BinisinaPom extends Ultilityclass{
	
	
	public BinisinaPom() {
		PageFactory.initElements(driver, this);
	}

	 
   @FindBy(xpath="//input[@id='search']")
   private WebElement searchbox; 
   
   @FindBy(xpath="//a[@onclick='myFunction()']")
   private WebElement searchboxclick; 
 
   @FindBy(xpath="(//mark[text()='Tablets'])[1]")
   private WebElement Productname;
   

   @FindBy(xpath="(//div[@class='result-thumbnail'])[1]")
   private WebElement SearchProductimg1;
  
   @FindBy(xpath="//span[@class='select2-selection__arrow']")
   private WebElement Qdropbutton;
   
   @FindBy(xpath="//li[text()='2']")
   private WebElement Qtyselection;
   
   @FindBy(xpath="//li[text()='1']")
   private WebElement Qtyselection1;
   
   public WebElement getPaymentFailtextOTP() {
	return PaymentFailtextOTP;
}


public WebElement getPaymentFailcontine() {
	return PaymentFailcontine;
}


@FindBy(xpath="//input[@class='form-control form-control-lg text-center col-md-4']")
   private WebElement PaymentFailtextOTP;
   
   @FindBy(xpath="//button[text()=' Continue ']")
   private WebElement PaymentFailcontine;
   
 
   
   public WebElement getQtyselection1() {
	return Qtyselection1;
}


@FindBy(id="product-addtocart-button")
   private WebElement addcart;
  
   
   @FindBy(id="top-cart-btn-checkout")
   private WebElement  checkoutbuttonpop;
   
   @FindBy(xpath="(//a[@class='has-sub-cat'])[1]")
   private WebElement  Maincategeory1;
   
  


@FindBy(xpath=" (//a[@class='has-sub-cat'])[2]")
   private WebElement  Maincategeory2;
   



@FindBy(xpath="(//a[@class='has-sub-cat'])[4]")
private WebElement  Maincategeory4;

@FindBy(xpath="(//a[@class='has-sub-cat'])[6]")
private WebElement  Maincategeory6;




@FindBy(xpath="(//a[@class='has-sub-cat'])[5]")
private WebElement  Maincategeory5;

 


@FindBy(xpath="(//div[@class='title'])[46]")
private WebElement  Subsnackscategeory1;

public WebElement getMaincategeory6() {
	return Maincategeory6;
}


public WebElement getSubFacecategeory1() {
	return SubFacecategeory1;
}


@FindBy(xpath="(//div[@class='title'])[78]")
private WebElement  SubFacecategeory1;



@FindBy(xpath="(//div[@class='title'])[48]")
private WebElement  Subbabycategeory;




@FindBy(xpath="(//img[@class='product-image-photo'])[15]")
private WebElement  SubsnacksimgGavi4;


public WebElement getSubFaceimg8() {
	return SubFaceimg8;
}


@FindBy(xpath="(//img[@class='product-image-photo'])[6]")
private WebElement  SubFaceimg8;




@FindBy(xpath="(//img[@class='product-image-photo'])[8]")
private WebElement  Subpampersimg8;



@FindBy(xpath="//div[@class='product-pricing']")
private WebElement  PDPrateproduct2;


@FindBy(xpath="(//div[@class='price'])[10]")
private WebElement  Cartrateproduct2;


@FindBy(xpath="(//button[@class='alo_qty alo_qty_dec ajax-cart-qty-minus'])[1]")
private WebElement Qtymin;


@FindBy(xpath="(//button[@class='alo_qty alo_qty_inc ajax-cart-qty-plus'])[1]")
private WebElement Qtyadd;



@FindBy(xpath="(//input[@id='cart-171989-qty'])")
private WebElement CartQty;

@FindBy(xpath="//button[@title='Proceed to Checkout']")
private WebElement CarttoCheckout;





@FindBy(xpath="(//img[@class='product-image-photo'])[2]")
   private WebElement  imgFillter1;
   
   
@FindBy(xpath="(//div[@class='title'])[12]")
   private WebElement  SubEyecategeory1;
   


@FindBy(xpath="(//div[@class='title'])[3]")
private WebElement  Subanticategeory1;



  @FindBy(xpath="(//div[@class='filter-options-title'])[4]")
   private WebElement  SubBrandFillter;
   
 
@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]")
  private WebElement  SortbyFillter;
  
  @FindBy(xpath="(//li[@role='option'])[5]")
  private WebElement  Sortbycontent;
  
  


@FindBy(xpath="//a[@class='action  previous']")
  private WebElement  Sortbyprevious;
  
  @FindBy(xpath="//a[@class='action  next']")
  private WebElement  Sortbynext;
  
  
@FindBy(xpath="(//button[@title='Add to Bag'])[4]")
  private WebElement  PLPaddcart;

@FindBy(xpath="//a[@class='btn btn-checkout']")
private WebElement  PLPcheckout;



// cart page order summary Total Without coupon

@FindBy(xpath="(//table[@class='data table totals']//tr//td)[1]")
private WebElement  CartSubtotal;



@FindBy(xpath="(//table[@class='data table totals']//tr//td)[2]")
private WebElement  CartVATtotal;

@FindBy(xpath="(//table[@class='data table totals']//tr//td)[3]")
private WebElement  Cartshippingtotal;

@FindBy(xpath="(//table[@class='data table totals']//tr//td)[3]")
private WebElement  CartOrdertotal;



//Checkout  page order summary Total Without coupon

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[1]")
private WebElement  CheckoutSubTotal;

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[2]")
private WebElement  CheckoutVATtotal;


@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[3]")
private WebElement  CheckoutShippingtotal;



@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[4]")
private WebElement  CheckoutOrderTotal;




//cart page order summary Total With coupon

@FindBy(xpath="//strong[@id='block-discount-heading']")
private WebElement  Cartcouponapplyoption;




@FindBy(xpath="//input[@id='coupon_code']")
private WebElement  CartcouponcodeText;


@FindBy(xpath="//li[@coupon-data='test10']")
private WebElement  Cartcouponcodedata;


@FindBy(xpath="//button[@class='action apply primary']")
private WebElement  CartcouponcodedataApply;


@FindBy(xpath="(//table[@class='data table totals']//tr//td)[1]")
private WebElement  CartSubtotalCoupon;


@FindBy(xpath="(//table[@class='data table totals']//tr//td)[2]")
private WebElement  CartDiscounttotalCoupon;

//When is there shipping charges for products Shipp==5
@FindBy(xpath="(//table[@class='data table totals']//tr//td)[5]")
private WebElement  CartSHIIPINGtotalCoupon;

@FindBy(xpath="(//table[@class='data table totals']//tr//td)[4]")
private WebElement  CartVATtotalCoupon;


//When is there shipping charges for products Order==6
@FindBy(xpath="(//table[@class='data table totals']//tr//td)[5]")
private WebElement  CartOrdertotalCoupon;

//When is there shipping charges for products Saved==7
@FindBy(xpath="(//table[@class='data table totals']//tr//td)[6]")
private WebElement  CartsavedamountCoupon;



@FindBy(xpath="//a[@class='showcart header-shopping']")
private WebElement  miniCart;


@FindBy(xpath="//a[@class='use-ajax action towishlist action-towishlist']")
private WebElement  CartWishlist;


public WebElement getWishlistIcon() {
	return WishlistIcon;
}


@FindBy(xpath="//a[@class='header-heart']")
private WebElement  WishlistIcon;




//Checkoutpage page order summary Total With coupon

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[1]")
private WebElement  CheckoutSubtotalCoupon;


public WebElement getCheckoutSubtotalCoupon() {
	return CheckoutSubtotalCoupon;
}


public WebElement getCheckoutDiscounttotalCoupon() {
	return CheckoutDiscounttotalCoupon;
}


public WebElement getCheckoutSHIIPINGtotalCoupon() {
	return CheckoutSHIIPINGtotalCoupon;
}


public WebElement getCheckoutVATtotalCoupon() {
	return CheckoutVATtotalCoupon;
}


public WebElement getCheckoutOrdertotalCoupon() {
	return CheckoutOrdertotalCoupon;
}


public WebElement getCheckoutsavedamountCoupon() {
	return CheckoutsavedamountCoupon;
}


@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[2]")
private WebElement  CheckoutDiscounttotalCoupon;


@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[4]")
private WebElement  CheckoutSHIIPINGtotalCoupon;

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[3]")
private WebElement  CheckoutVATtotalCoupon;



@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[5]")
private WebElement  CheckoutOrdertotalCoupon;


@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[6]")
private WebElement  CheckoutsavedamountCoupon;



@FindBy(xpath="(//input[@class='input-text'])[1]")
private WebElement  CheckoutmailText;


@FindBy(xpath="//input[@name='mobile_number']")
private WebElement  CheckoutphoneText;


@FindBy(xpath="(//input[@class='input-text'])[2]")
private WebElement  CheckoutFirstText;


@FindBy(xpath="(//input[@class='input-text'])[3]")
private WebElement  CheckoutLastText;


@FindBy(xpath="(//div[@class='selected-dial-code'])[1]")
private WebElement  Checkoutdialoption;


@FindBy(xpath="(//span[text()='+91'])[1]")
private WebElement  Checkoutdialnumber;


@FindBy(xpath="//a[@id='mobile-update']")
private WebElement  Checkoutnumberclick;



@FindBy(xpath="//button[@class='request-otp-btn-update pop-bnt']")
private WebElement  CheckoutGetOTP;



@FindBy(xpath="//button[@class='submit-update-otp-btn withresend pop-bnt']")
private WebElement  CheckoutOTPSubmit;

@FindBy(xpath="(//button[@class='button action continue primary'])[1]")
private WebElement  CheckoutnextSTEP1;



@FindBy(xpath="//input[@class='input-text setgooglemap']")
private WebElement  AddressSetmap;


@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]")
private WebElement  Addresscountry;



@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[3]")
private WebElement  AddressDropstatelevel;


@FindBy(id="select2-CYBPSLI-result-qvks-1102")
private WebElement  AddreesStateAj;






@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[4]")
private WebElement  AddressDropLocal;


@FindBy(id="select2-K9WT78X-result-abn5-Al Jadaf")
private WebElement  AddreesLocaljada;



@FindBy(xpath="(//input[@class='admin__control-radio'])[2]")
private WebElement  AddressHome;


@FindBy(xpath="(//input[@class='input-text'])[8]")
private WebElement  AddressHomeDoor;


@FindBy(xpath="(//input[@class='input-text'])[9]")
private WebElement  Addressstreet;


@FindBy(xpath="(//button[@class='button action continue primary'])[2]")
private WebElement  CheckoutnextSTEP2;

//Checkout page Address detail with login


		public WebElement getLogincheckMR() {
			return LogincheckMR;
		}


		public WebElement getLogincheckMRdata() {
			return LogincheckMRdata;
		}


		public WebElement getLogincheckCountry() {
			return LogincheckCountry;
		}


		public WebElement getLogincheckState() {
			return LogincheckState;
		}


		public WebElement getLogincheckStatedubai() {
			return LogincheckStatedubai;
		}


		public WebElement getLogincheckFirst() {
			return LogincheckFirst;
		}


		public WebElement getLogincheckLast() {
			return LogincheckLast;
		}


		public WebElement getLogincheckStreet() {
			return LogincheckStreet;
		}


		public WebElement getLogincheckStreetDATA2() {
			return LogincheckStreetDATA2;
		}


		public WebElement getLogincheckFlotNumber() {
			return LogincheckFlotNumber;
		}


		public WebElement getLogincheckNickname() {
			return LogincheckNickname;
		}


		public WebElement getLogincheckShippingmetod1() {
			return LogincheckShippingmetod1;
		}


		public WebElement getLogincheckShippingmetod2() {
			return LogincheckShippingmetod2;
		}


		public WebElement getLoginpayment1() {
			return Loginpayment1;
		}


		public WebElement getLoginpayment2() {
			return Loginpayment2;
		}



		@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]")
		private WebElement  LogincheckMR;


		@FindBy(xpath="//li[text()='Mr']")
		private WebElement  LogincheckMRdata;
		
		

		@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[2]")
		private WebElement  LogincheckCountry;
		
		@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[3]")
		private WebElement  LogincheckState;
		
		
		@FindBy(xpath="//li[text()='Dubai']")
		private WebElement  LogincheckStatedubai;
		
		
		

		@FindBy(xpath="(//input[@class='input-text'])[1]")
		private WebElement  LogincheckFirst;
		

		@FindBy(xpath="(//input[@class='input-text'])[2]")
		private WebElement  LogincheckLast;
		
		@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[4]")
		private WebElement  LogincheckStreet;
		
		@FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[35]")
		private WebElement  LogincheckStreetDATA2;
		
		@FindBy(xpath="(//input[@class='input-text'])[5]")
		private WebElement  LogincheckFlotNumber;
		
		@FindBy(xpath="(//input[@class='input-text'])[6]")
		private WebElement  LogincheckNickname;
		
		
		@FindBy(xpath="(//input[@class='radio'])[1]")
		private WebElement  LogincheckShippingmetod1;
		
		@FindBy(xpath="(//input[@class='radio'])[2]")
		private WebElement  LogincheckShippingmetod2;
		
		
		@FindBy(xpath="(//input[@name='payment[method]'])[1]")
		private WebElement  Loginpayment1;
		
		@FindBy(xpath="(//input[@name='payment[method]'])[2]")
		private WebElement  Loginpayment2;
		
		public WebElement getPlaceorder1() {
			return Placeorder1;
		}


		@FindBy(id="place-order-trigger")
		private WebElement  Placeorder1;
		
		
		
	
 
@FindBy(xpath="(//label[@class='layered-navigation-label'])[5]")
   private WebElement  SubBrandFilltercheck;
  

@FindBy(xpath="//h4[text()=\" Boiron Sedatif PC Tablets 40's\"]")
   private WebElement  
   BoironCartpagename1;
  
@FindBy(xpath="//h1[text()=\"Boiron Sedatif PC Tablets 40's\"]")
   private WebElement  
   BoironPDPpagename1;


@FindBy(xpath="(//div[@class='price'])[2]")
private WebElement  PLPrate1;


@FindBy(xpath="//h5[text()='49.00']")
private WebElement  PDPrate1;


//Order Succees Page

@FindBy(xpath="//span[text()='Thank you for your purchase!']")
private WebElement  OrderpageTemplate;


public WebElement getOrderpageTemplate() {
	return OrderpageTemplate;
}


public WebElement getOrderID() {
	return OrderID;
}


public WebElement getOrderIDStatic1() {
	return OrderIDStatic1;
}


public WebElement getOrderIDStatic2() {
	return OrderIDStatic2;
}


public WebElement getOrderedAddressverify() {
	return OrderedAddressverify;
}


public WebElement getOrderProduct1rate() {
	return OrderProduct1rate;
}


public WebElement getOrderProduct2rate() {
	return OrderProduct2rate;
}


public WebElement getOrderSubTotal() {
	return OrderSubTotal;
}


public WebElement getOrderShippingcharge() {
	return OrderShippingcharge;
}


public WebElement getOrderVAT() {
	return OrderVAT;
}


public WebElement getOrderedTotal() {
	return OrderedTotal;
}


public WebElement getOrderedQty2() {
	return OrderedQty2;
}


public WebElement getOrderedQty1() {
	return OrderedQty1;
}


public WebElement getOrderedpaymentmethod1() {
	return Orderedpaymentmethod1;
}


public WebElement getOrderedviewdetail() {
	return Orderedviewdetail;
}


@FindBy(xpath="//div[@class='orderid']")
private WebElement  OrderID;


@FindBy(xpath="(//div[@class='orderid']//following-sibling::span)[2]")
private WebElement  OrderIDStatic1;

@FindBy(xpath="(//div[@class='box-body']//following-sibling::span)[1]")
private WebElement  OrderIDStatic2;



@FindBy(xpath="//a[text()='+919344627947']")
private WebElement  OrderedAddressverify;


@FindBy(xpath="(//div[@class='order-summary']//tr//td[3])[1]")
private WebElement  OrderProduct1rate;

@FindBy(xpath="(//div[@class='order-summary']//tr//td[3])[2]")
private WebElement  OrderProduct2rate;


public WebElement getOrderProductname1() {
	return OrderProductname1;
}


public WebElement getOrderProductname2() {
	return OrderProductname2;
}


@FindBy(xpath="(//div[@class='order-summary']//tr//td[1])[1]")
private WebElement  OrderProductname1;

@FindBy(xpath="(//div[@class='order-summary']//tr//td[1])[2]")
private WebElement  OrderProductname2;



@FindBy(xpath="(//div[@class='order-summary']//tr//td[3])[3]")
private WebElement  OrderSubTotal;


@FindBy(xpath="(//div[@class='order-summary']//tr//td[3])[4]")
private WebElement  OrderShippingcharge;


@FindBy(xpath="(//div[@class='order-summary']//tr//td[3])[5]")
private WebElement  OrderVAT;


@FindBy(xpath="(//div[@class='order-summary']//tr//td[3])[7]")
private WebElement  OrderedTotal;


@FindBy(xpath="(//div[@class='order-summary']//tr//td[2])[2]")
private WebElement  OrderedQty2;


@FindBy(xpath="(//div[@class='order-summary']//tr//td[2])[1]")
private WebElement  OrderedQty1;


@FindBy(xpath="//span[text()='Cash/Card On Delivery']")
private WebElement  Orderedpaymentmethod1;


public WebElement getOrderedpaymentmethod2() {
	return Orderedpaymentmethod2;
}

@FindBy(xpath="//span[text()='Online Payment']")
private WebElement  Orderedpaymentmethod2;


//My account page


@FindBy(xpath="//a[@class='header-user']")
private WebElement  MyaccountIcon;

public WebElement getMyaccountIcon() {
	return MyaccountIcon;
	
	
}




public WebElement getMyaccountOrders() {
	return MyaccountOrders;
}


public WebElement getOrderdetailpagebody() {
	return Orderdetailpagebody;
}


public WebElement getMyaccountOrdersID() {
	return MyaccountOrdersID;
}


public WebElement getMyaccountProductname1() {
	return MyaccountProductname1;
}


public WebElement getMyaccountProductname2() {
	return MyaccountProductname2;
}


public WebElement getMyaccountProductQty() {
	return MyaccountProductQty;
}


public WebElement getMyaccountSubTotal() {
	return MyaccountSubTotal;
}


public WebElement getMyaccountCharges() {
	return MyaccountCharges;
}


public WebElement getMyaccountOrderTotal() {
	return MyaccountOrderTotal;
}


public WebElement getMyaccountpaymentmethod() {
	return Myaccountpaymentmethod;
}


@FindBy(xpath="//div[@class='orderid']//following-sibling::span")
private WebElement  MyaccountOrdersID;


@FindBy(xpath="(//div[@class='bottom']//following-sibling::h4)[1]")
private WebElement  MyaccountProductname1;


@FindBy(xpath="(//div[@class='bottom']//following-sibling::h4)[2]")
private WebElement  MyaccountProductname2;


@FindBy(xpath="(//div[@class='order-summary']//following-sibling::span)[1]")
private WebElement  MyaccountProductQty;


@FindBy(xpath="(//div[@class='order-summary']//following-sibling::span)[2]")
private WebElement  MyaccountSubTotal;


@FindBy(xpath="(//div[@class='order-summary']//following-sibling::span)[4]")
private WebElement  MyaccountCharges;

@FindBy(xpath="(//div[@class='order-summary']//following-sibling::span)[5]")
private WebElement  MyaccountOrderTotal;


@FindBy(xpath="(//div[@class='list']//following-sibling::span)[4]")
private WebElement  Myaccountpaymentmethod;


@FindBy(xpath="//a[text()='My Orders']")
private WebElement  MyaccountOrders;


@FindBy(xpath="(//div[@class='body']//following-sibling::h4)[1]")
private WebElement  Orderdetailpagebody;


@FindBy(xpath="//div[@class='view-order-details']")
private WebElement  Orderedviewdetail;



//Payment Gateway page

@FindBy(xpath="(//input[@id='cardNumber'])[2]")
private WebElement  CardNumber;


public WebElement getCardNumber() {
	return CardNumber;
}


public WebElement getMonthdrop() {
	return Monthdrop;
}


public WebElement getYeardrop() {
	return Yeardrop;
}


public WebElement getCVV() {
	return CVV;
}


public WebElement getPayButton() {
	return PayButton;
}




@FindBy(xpath="(//input[@class='select-dropdown'])[4]")
private WebElement  Monthdrop;


@FindBy(xpath="(//input[@class='select-dropdown'])[5]")
private WebElement  Yeardrop;


@FindBy(xpath="//input[@type='password']")
private WebElement  CVV;


@FindBy(xpath="(//input[@class='btn pay'])[2]")
private WebElement  PayButton;





public WebElement getMonthOrderwise() {
	return MonthOrderwise;
}


@FindBy(xpath="//span[text()='August']")
private WebElement  MonthOrderwise;





public WebElement getPLPrate1() {
	return PLPrate1;
}




public WebElement getPDPrate1() {
	return PDPrate1;
}

public WebElement getBoironPDPpagename1() {
	return BoironPDPpagename1;
}

public WebElement getBoironCartpagename1() {
	return BoironCartpagename1;
}

public WebElement getSubEyecategeory1() {
	return SubEyecategeory1;
}


   
   public WebElement getQdropbutton() {
	return Qdropbutton;
}


public WebElement getQtyselection() {
	return Qtyselection;
}


public WebElement getAddcart() {
	return addcart;
}



public WebElement getCheckoutbuttonpop() {
	return checkoutbuttonpop;
}

public WebElement getMaincategeory1() {
	return Maincategeory1;
}

   public WebElement getProductname() {
	return Productname;
}

   
 

public WebElement getSearchProductimg1() {
	return SearchProductimg1;
}


public WebElement getSearchbox() {
	return searchbox;
}

public WebElement getSearchboxclick() {
	return searchboxclick;
}

public WebElement getSubBrandFillter() {
	return SubBrandFillter;
}



public WebElement getSubBrandFilltercheck() {
	return SubBrandFilltercheck;
}
public WebElement getImgFillter1() {
	return imgFillter1;
}
public WebElement getMaincategeory2() {
	return Maincategeory2;
}

public WebElement getSubanticategeory1() {
	return Subanticategeory1;
}
public WebElement getSortbyFillter() {
	return SortbyFillter;
}


public WebElement getSortbycontent() {
	return Sortbycontent;
}
public WebElement getSortbyprevious() {
	return Sortbyprevious;
}


public WebElement getSortbynext() {
	return Sortbynext;
}

public WebElement getPLPaddcart() {
	return PLPaddcart;
}



public WebElement getPLPcheckout() {
	return PLPcheckout;
}

public WebElement getMaincategeory4() {
	return Maincategeory4;
}


public WebElement getSubsnackscategeory1() {
	return Subsnackscategeory1;
}



public WebElement getMaincategeory5() {
	return Maincategeory5;
}


public WebElement getSubbabycategeory() {
	return Subbabycategeory;
}


public WebElement getSubpampersimg8() {
	return Subpampersimg8;
}


public WebElement getSubsnacksimgGavi4() {
	return SubsnacksimgGavi4;
}

public WebElement getQtymin() {
	return Qtymin;
}


public WebElement getQtyadd() {
	return Qtyadd;
}


public WebElement getPDPrateproduct2() {
	return PDPrateproduct2;
}

public WebElement getCartrateproduct2() {
	return Cartrateproduct2;
}

public WebElement getCartQty() {
	return CartQty;
}

public WebElement getCartSubtotal() {
	return CartSubtotal;
}


public WebElement getCartVATtotal() {
	return CartVATtotal;
}


public WebElement getCartshippingtotal() {
	return Cartshippingtotal;
}


public WebElement getCartOrdertotal() {
	return CartOrdertotal;
}

public WebElement getCarttoCheckout() {
	return CarttoCheckout;
}



public WebElement getCheckoutmailText() {
	return CheckoutmailText;
}


public WebElement getCheckoutphoneText() {
	return CheckoutphoneText;
}


public WebElement getCheckoutFirstText() {
	return CheckoutFirstText;
}


public WebElement getCheckoutLastText() {
	return CheckoutLastText;
}


public WebElement getCheckoutdialoption() {
	return Checkoutdialoption;
}


public WebElement getCheckoutdialnumber() {
	return Checkoutdialnumber;
}

public WebElement getCheckoutnumberclick() {
	return Checkoutnumberclick;
}

public WebElement getCheckoutGetOTP() {
	return CheckoutGetOTP;
}


public WebElement getCheckoutSubTotal() {
	return CheckoutSubTotal;
}


public WebElement getCheckoutVATtotal() {
	return CheckoutVATtotal;
}


public WebElement getCheckoutShippingtotal() {
	return CheckoutShippingtotal;
}


public WebElement getCheckoutOrderTotal() {
	return CheckoutOrderTotal;
}


public WebElement getCheckoutOTPSubmit() {
	return CheckoutOTPSubmit;
}


public WebElement getCheckoutnextSTEP1() {
	return CheckoutnextSTEP1;
}

public WebElement getAddresscountry() {
	return Addresscountry;
}


public WebElement getAddressDropstatelevel() {
	return AddressDropstatelevel;
}


public WebElement getAddreesStateAj() {
	return AddreesStateAj;
}


public WebElement getAddressDropLocal() {
	return AddressDropLocal;
}



public WebElement getAddreesLocaljada() {
	return AddreesLocaljada;
}


public WebElement getAddressHome() {
	return AddressHome;
}


public WebElement getAddressHomeDoor() {
	return AddressHomeDoor;
}


public WebElement getAddressstreet() {
	return Addressstreet;
}


public WebElement getCheckoutnextSTEP2() {
	return CheckoutnextSTEP2;
}

public WebElement getAddressSetmap() {
	return AddressSetmap;
}

public WebElement getCartcouponapplyoption() {
	return Cartcouponapplyoption;
}


public WebElement getCartcouponcodeText() {
	return CartcouponcodeText;
}


public WebElement getCartcouponcodedata() {
	return Cartcouponcodedata;
}


public WebElement getCartcouponcodedataApply() {
	return CartcouponcodedataApply;
}


public WebElement getCartSubtotalCoupon() {
	return CartSubtotalCoupon;
}


public WebElement getCartDiscounttotalCoupon() {
	return CartDiscounttotalCoupon;
}


public WebElement getCartSHIIPINGtotalCoupon() {
	return CartSHIIPINGtotalCoupon;
}


public WebElement getCartVATtotalCoupon() {
	return CartVATtotalCoupon;
}


public WebElement getCartOrdertotalCoupon() {
	return CartOrdertotalCoupon;
}


public WebElement getCartsavedamountCoupon() {
	return CartsavedamountCoupon;
}

public WebElement getCartWishlist() {
	return CartWishlist;
}

public WebElement getMiniCart() {
	return miniCart;
}
}