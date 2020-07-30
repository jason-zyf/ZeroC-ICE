[[ "java:package:com.ice.book"]]
module slice2java {
   interface OnlineBook {
       void bookTick(string name,double price,string content);
   };

   interface SMSService {
       void sendSMS(string name,double price,string content);
   };
};