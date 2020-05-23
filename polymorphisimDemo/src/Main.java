public class Main {

    public static void main(String[] args) {
//        // Referans tiplerin birbirinin referansını tutma durumu. İnheritance olmalı aralarında.
////        //Üstleri Aynı olmalı.
////        EmailLogger logger = new EmailLogger();
////        logger.log("Log Mesajı");
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger : loggers) {
//            logger.log("Log Mesajı");
//        }
           // CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
              CustomerManager customerManager = new CustomerManager(new FileLogger());
              customerManager.Add();
            // İşte tamda burası Polymorphism
    }
}
