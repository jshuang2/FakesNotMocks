public class FakeExchange implements Exchange {

    private String usd = "USD";
    private String eur = "Euro";
    private Float usdToEuro = 1.05f;
    private Float eurToUsd = 0.95f;

    @Override
    public float rate(String origin, String target) {

        return switch (origin) {
            case "USD" -> usdToEuro;
            case "Euro" -> eurToUsd;
            default -> 0.0f;
        };

    }
}
