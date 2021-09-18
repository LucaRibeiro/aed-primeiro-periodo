package Q01_ClasseSeries;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Series {

    private String name;
    private String format;
    private String duration;
    private String initialCountry;
    private String originalLang;
    private String broadcasterInitial;
    private String streamingInitial;
    private int numberSeasons;
    private int numberEpisodes;

    public Series() {

    }

    public Series(String data[]) {
        this.name = data[0];
        this.format = data[1];
        this.duration = data[2];
        this.initialCountry = data[3];
        this.originalLang = data[4];
        this.broadcasterInitial = data[5];
        this.streamingInitial = data[6];
        this.numberSeasons = Integer.parseInt(data[7]);
        this.numberEpisodes = Integer.parseInt(data[8]);
    }

    /** Getters */

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public String getDuration() {
        return duration;
    }

    public String getInitialCountry() {
        return initialCountry;
    }

    public String getBroadcasterInitial() {
        return broadcasterInitial;
    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public int getNumberEpisodes() {
        return numberEpisodes;
    }

    /** Setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setInitialCountry(String initialCountry) {
        this.initialCountry = initialCountry;
    }

    public void setBroadcasterInitial(String broadcasterInitial) {
        this.broadcasterInitial = broadcasterInitial;
    }

    public void setNumberSeasons(int numberSeasons) {
        this.numberSeasons = numberSeasons;
    }

    public void setNumberEpisodes(int numberEpisodes) {
        this.numberEpisodes = numberEpisodes;
    }

    /** Print in screen all data from class */
    public void print() {
        System.out.println(this.name + ' ' + this.format + ' ' + this.duration + ' ' + this.initialCountry + ' '
                + this.originalLang + ' ' + this.broadcasterInitial + ' ' + this.streamingInitial + ' '
                + this.numberSeasons + ' ' + this.numberEpisodes);
    }

    public String removeTags(String line) {
        String newLine = "";
        int i = 0;
        while (i < line.length()) {
            if (line.charAt(i) == '<') {
                i++;
                while (line.charAt(i) != '>')
                    i++;
            } else {
                newLine += line.charAt(i);
            }
            i++;
        }
        System.out.println(newLine);
        return newLine;
    }

    public void readData(String fileName) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(isr);

        // String str;
        // while ((str = reader.readLine()) != null) {
        //     System.out.println(str);
        // }

        while (!reader.readLine().contains("<meta"))
            ;
        this.name = this.removeTags(reader.readLine());

        while (!reader.readLine().contains("Formato"))
            ;

        this.format = this.removeTags(reader.readLine());

        while (!reader.readLine().contains("Dura"))
            ;

        this.duration = this.removeTags(reader.readLine());

        while (!reader.readLine().contains("de origem"))
            ;

        this.initialCountry = this.removeTags(reader.readLine());

        while (!reader.readLine().contains("Idioma original"))
            ;

        this.originalLang = this.removeTags(reader.readLine());

        while (!reader.readLine().contains("de temporadas"))
            ;

        this.numberSeasons = Integer.parseInt(this.removeTags(reader.readLine()));

        while (!reader.readLine().contains("de epis"))
            ;

        this.numberEpisodes = Integer.parseInt(this.removeTags(reader.readLine()));

        reader.close();
    }

    public static void main(String args[]) throws Exception {
        Series serie = new Series();
        serie.readData("series/13_Reasons_Why.html");
        serie.print();
    }

}