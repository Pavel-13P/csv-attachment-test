import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class CsvAttachmentTest {

    @Test
    void attachCsv() {

        attach("A_300KB_10000rows.csv");
        attach("B_150KB_5000rows.csv");
        attach("C_250KB_1000rows.csv");
        attach("D_450KB_10000rows.csv");
        attach("E_300KB_100rows.csv");
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