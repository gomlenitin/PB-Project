@E2E
Feature: To be Verify the E2E Functionality

@test1
Scenario: To Validate  the Main category to Sub Category with loggedin  user
 
 Given  User open the Home page
 When   user select the Category to sub category option from Home page
 And    user click on the any one image based on the filter
 And    User navigate from  PDP page to cart page   
 And    Go to  the checkout page and User Enter the shipping Address detail 
 And    User select the online payment option and click on the place order
 Then   Observe the orderid template page with order detail and Go the My account page
 

 @test2
 Scenario: To Validate  the  online payemt method using different cards sample data

 Given  User open the Home page
 When   user select the main Category to sub category option from Home page   
 And    User select the anyone product from  PDP page to cart page   
 And    Go to the checkout page.If,already register detail navigate to payment page
 And    User select the different card payment option and click on the place order
 Then   Observe the order flow.If,payment failure
 
@test3
Scenario Outline: To validate the search box related product
Given  User go to the Home page 
When   User Enter the product name in search box "<Product Name>"
And    User Should be visible related product.then,Click on any product
And    User navigate  to the PDP page
And    Observe the  that particular product on PDP page
And    User add the cart and moved to cart page
Then   Added wishlist of the particular product by user from cart page 

 Examples:
          |Product Name|
          |Tablets|


 @test4
Scenario:  To Validate  the Sorting&pagination in  PLP page
 Given  Go to the Home page without Login user  
 When   user click on any product From main to sub categeory
 And    User select the Sortby option and verify the listing page
 And    To check pagination as per plp page 
 Then   Click on the add cart redirect to the Cart page
 
 
 
 
 
 
 
 
 
 
 
 
 