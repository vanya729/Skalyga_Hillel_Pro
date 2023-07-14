package lessons19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTransformer {

    public String convert() {
        String patern = "yyyy-MM-dd hh:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patern);
       return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }

}
