import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class CsvAttachmentTest {

    @Test
    void attachCsv() {

        InputStream file = getClass()
                .getClassLoader()
                .getResourceAsStream("testops_large_attachment_10000_rows.csv");

        Allure.addAttachment(
                "large-csv",
                "text/csv",
                file,
                ".csv"
        );
    }
}