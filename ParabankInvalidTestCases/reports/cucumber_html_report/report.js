$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("parabank.feature");
formatter.feature({
  "line": 2,
  "name": "ParaBank Website",
  "description": "",
  "id": "parabank-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Invalid_Billpay_And_Messagetocustomer"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To check that the application is InValid bill pay  due to invalid accountno",
  "description": "",
  "id": "parabank-website;to-check-that-the-application-is-invalid-bill-pay--due-to-invalid-accountno",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user open the Parabank Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user login to the account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user fills the details of the bill pay",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "submit the bill pay and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBillpayinvalidacntnoChrome.the_user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 7609424524,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidacntnoChrome.the_user_open_the_Parabank_Login_Page()"
});
formatter.result({
  "duration": 8437345709,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidacntnoChrome.the_user_login_to_the_account()"
});
formatter.result({
  "duration": 7054022761,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidacntnoChrome.the_user_fills_the_details_of_the_bill_pay()"
});
formatter.result({
  "duration": 6720442122,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidacntnoChrome.submit_the_bill_pay_and_close_the_browser()"
});
formatter.result({
  "duration": 3470657293,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To check that the application is InValid bill pay when mandatoryfield is left blank",
  "description": "",
  "id": "parabank-website;to-check-that-the-application-is-invalid-bill-pay-when-mandatoryfield-is-left-blank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tc_02"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user open the Parabank Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user login to the account",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user left one of the mandatoryfield of the bill pay",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Submit the bill pay and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBillpaymndtrylb.user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 4048755526,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpaymndtrylb.user_open_the_Parabank_Login_Page()"
});
formatter.result({
  "duration": 5082442957,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpaymndtrylb.user_login_to_the_account()"
});
formatter.result({
  "duration": 5301795904,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpaymndtrylb.user_left_one_of_the_mandatoryfield_of_the_bill_pay()"
});
formatter.result({
  "duration": 7575469259,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpaymndtrylb.submit_the_bill_pay_and_close_the_browser()"
});
formatter.result({
  "duration": 6377714567,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "To check that the application is InValid bill pay due to invalid amount",
  "description": "",
  "id": "parabank-website;to-check-that-the-application-is-invalid-bill-pay-due-to-invalid-amount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tc_03"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user launches  chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User open the Parabank Login",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "the User login to the account",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User gave invalid amount",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Submit bill pay and close  browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBillpayinvalidamnt.user_launches_chrome_browser()"
});
formatter.result({
  "duration": 4136375299,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidamnt.user_open_the_Parabank_Login()"
});
formatter.result({
  "duration": 6840619830,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidamnt.the_User_login_to_the_account()"
});
formatter.result({
  "duration": 7853299414,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidamnt.user_gave_invalid_amount()"
});
formatter.result({
  "duration": 7066271758,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayinvalidamnt.submit_bill_pay_and_close_browser()"
});
formatter.result({
  "duration": 6348030469,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "To check that the application is InValid bill pay because phone no field is left blank",
  "description": "",
  "id": "parabank-website;to-check-that-the-application-is-invalid-bill-pay-because-phone-no-field-is-left-blank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@tc_04"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "User open the Parabank Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User login to the account",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User left phone no field of the bill pay",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Submit bill pay and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBillpayponenolb.user_Launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 7116396755,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayponenolb.user_open_the_Parabank_Login_Page()"
});
formatter.result({
  "duration": 7985427984,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayponenolb.user_login_to_the_account()"
});
formatter.result({
  "duration": 7862916016,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayponenolb.user_left_phone_no_field_of_the_bill_pay()"
});
formatter.result({
  "duration": 7562299461,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayponenolb.submit_bill_pay_and_close_the_browser()"
});
formatter.result({
  "duration": 7760017008,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "To check that the application is InValid mssgtocstmr because one field is left blank",
  "description": "",
  "id": "parabank-website;to-check-that-the-application-is-invalid-mssgtocstmr-because-one-field-is-left-blank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@tc_05"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "the user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "the user open the Parabank HomePage",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "the user opens the msg and left the details",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "send the message to customer care",
  "keyword": "And "
});
formatter.match({
  "location": "ParaMssgtocstmrlb.the_user_launchs_the_chrome_browser()"
});
formatter.result({
  "duration": 6031611719,
  "status": "passed"
});
formatter.match({
  "location": "ParaMssgtocstmrlb.the_user_open_the_Parabank_HomePage()"
});
formatter.result({
  "duration": 8892468152,
  "status": "passed"
});
formatter.match({
  "location": "ParaMssgtocstmrlb.the_user_opens_the_msg_and_left_the_details()"
});
formatter.result({
  "duration": 6507321687,
  "status": "passed"
});
formatter.match({
  "location": "ParaMssgtocstmrlb.send_the_message_to_customer_care()"
});
formatter.result({
  "duration": 8419070939,
  "status": "passed"
});
});