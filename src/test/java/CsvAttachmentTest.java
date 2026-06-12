import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class CsvAttachmentTest {

    @Test
    void attachCsv() {

        attach("A_10000_rows_20_chars.csv");
        attach("B_10000_rows_1000_chars.csv");
        attach("C_50000_rows_20_chars.csv");
        attach("D_100_rows_100000_chars.csv");
    }

    private void attach(String fileName) {

        InputStream file = getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        Allure.addAttachment(
                fileName,
                "text/csv",
                file,
                ".csv"
        );
    }
}