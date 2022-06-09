
import ru.netology.sqr.SQRService;

public class Main {

        public int calculate ( int initialNumber, int finalNumber){
            SQRService service = new SQRService();
            initialNumber = 25;
            finalNumber = 1200;
            int x = 30;

            for (int i = 10; i <= 99; i++) {if (i * i >= initialNumber && i * i <= finalNumber) {
                x = x + 1;
            }

            }

            return x;
        }


    }



