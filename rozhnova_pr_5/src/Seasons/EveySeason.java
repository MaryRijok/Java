package Climate;

public enum Season {
    WINTER(-16, 49),
    SPRING(14, 55),
    SUMMER(29, 20),
    FALL(7, 64);

    private final int averageTemperature;
    private final int averagePrecipitation;

    Season(int averageTemperature, int averagePrecipitation) {
        this.averageTemperature = averageTemperature;
        this.averagePrecipitation = averagePrecipitation;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public int getAveragePrecipitation() {
        return averagePrecipitation;
    }

    public String describeSeason() {
        switch (this) {
            case WINTER:
            case FALL:
                return "Период с прохладной погодой";
            case SPRING:
            case SUMMER:
                return "Период с теплой погодой";
            default:
                return "Неизвестный сезон";
        }
    }

    @Override
    public String toString() {
        return this.name() + ": Средние осадки — " + averagePrecipitation +
                " мм, средняя температура — " + averageTemperature + "°C";
    }
}
