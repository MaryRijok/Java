package ClimateInfo;

public class SeasonTest {
    public static void main(String[] args) {
        SeasonalData currentSeason = SeasonalData.SUMMER;
        System.out.println(currentSeason);
        displayPreference(currentSeason);
        listAllSeasons();
    }

    public static void displayPreference(SeasonalData season) {
        switch (season) {
            case SUMMER:
                System.out.println("Мне нравится лето!");
                break;
            case AUTUMN:
                System.out.println("Мне нравится осень!");
                break;
            case WINTER:
                System.out.println("Мне нравится зима!");
                break;
            case SPRING:
                System.out.println("Мне нравится весна!");
                break;
            default:
                System.out.println("Неизвестный сезон.");
        }
    }

    public static void listAllSeasons() {
        for (SeasonalData season : SeasonalData.values()) {
            System.out.println(season + " - " + season.seasonCharacteristics());
        }
    }
}
