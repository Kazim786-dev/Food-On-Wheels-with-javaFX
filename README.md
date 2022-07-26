# Food_On_Wheels
 A desktop application with database attached to keep record for food order. 
 
 1. Introduction to "Food on Wheels" Desktop app

This is a desktop based online food delivery system like Food panada app. There are 4 types of users of this system which includes Admin, Customer, Rider and Restaurant Manager. Admin manages restaurants, riders and customers while Restaurant manager manage food menu of their restaurant.

2. How to use?

When you will open our Online food delivery System, you will see the name of our application "Food on Wheels" and 4 different sections on the bottom of the screen based on the users of our System.

2.1 Admin Section

2.1.1 If you click on Admin, the admin login page will appear and you can login successfully by giving username "admin" and Password "12345"

2.1.2 After that you can add restaurant by clicking on add restaurant button and this action will bring a page on which you will give details of restaurant and credentials of restaurant manager (username and password) and then click on "Add restaurant" button. Moreover, the username of manager and name of the restaurant should be unique and the password should be more than or equal to 5 characters (This constraint is applicable on every password field in the system)

2.1.3 After adding restaurant click on back button, Now By clicking on delete restaurant button, a new screen will appear. If you click on show button, you will get all the added restaurants in the choice box and you can simply select one and then click on delete button

2.1.4 After that you can also add rider and delete rider in almost the similar way, but the email of the rider will be the password of the rider on its login page.

215 Youcan also block customers by seeing the all the customers in your system and select them from choice box and block them, after that they will no more be your app users

21.6 You can also see block requests by riders in block reported customer's section. If you click on this button, a new screen will appear and you can select the customer and then click on see reason, in this way you can see the reason which motivates the rider to report this customer.

2.2 Restaurant Manager Section

2.2.1 You can login to specific restaurant by giving the username and powword of the restaurant manager which admin enters at the tone of addition of restaurant in the systent

2.2.4 You can also add food by giving the details of food including name, price and quantity of food

2.2.3 You can delete food by choosing food from the choice box.

2.2.4 You can update food by choosing the food you want to update from the choice box and the enter the updated details and click on update button

2.3 Customer Section

2.3.1 You can sign up on the system as a customer by giving the required details on the sign-up page.

2.3.2 After registration, you have to sign in to the system

2.3.3 You can click "Order Something to eat" button and new screen will appear on which you can select the restaurant and then click on "Select" button. After that a new screen will appear with the list of foods and you can select check boxes of foods and then click on confirm foods. After confirming foods, you can enter the quantity of each food and then click on proceed button. On the next page, you can enter the description of your order and location of your order (Description is not necessary) and click on proceed. On the next screen you will generated transcript/bill your order and then you can confirm this order and select the payment method and click on confirm method. If you choose "pay by card method you will have to give your card number and click on confirm order and your order will be placed

2.3.4 You can lick on "Give feedback to rider" button to give feedback. You can choose the rider Bom the of the riders that delivers food as you and ghee detailed feedback in the text field and then click on save button

2.3.5 You cou click "Change Acciunt info" to manage or update your profile formation and then

click on update button to save your updated information

2.4 Rider Section

2.4.1 You can login to the specific rider's account by entering the username and email in place of password which the admin enters when he added that rider

2.4.2 You can click on "Pick Order" to pick order from restaurant On clicking pick order, a new screen will appear and you will have to click on Display Orders button to see the placed orders: After that you will give the id of that order you want to pick and deliver to the customer and click on pick order.

2.4.3 You can also deliver order by selecting picked orders by entering id

2.4.4 You can also Report Customer by selecting from the customers you interact with. After selecting, you will have to enter the reason of reporting that specific customer. At last, you can report that customer to admin by clicking on report button

2.4.5 You can also see feedbacks for you by the customers by clicking on feedbacks button

3. Important Things

We connect Our Xampp data base correctly and connect our project with database. We maintain the record of latest 11 objects in the array lists and other data will be stored in database. You have to add more than 10 objects to save the data in database

We updated every artifact accordingly.

To use database, you have to create database manually in Xampp and then give the name of database DB Handler class and also run the table creation queries attached with the project on the Xampp to create tables.

The balance in the card of every customer is 20,000.
