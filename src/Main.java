/*
CONSEGNA:
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
*/

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        String dateString1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("\nData 1: " + dateString1);

        String dateString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("\nData 2: " + dateString2);

        String dateString3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("\nData 3: " + dateString3);

    }
}

/*
CORREZIONE:

*/