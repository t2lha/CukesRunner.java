package utilities;

public class
Selenium_Utils {







    public static void waitFor(int sec) {

        try {
            Thread.sleep(sec*1000);
        }catch (Exception e){


            e.printStackTrace();
        }


    }


}






