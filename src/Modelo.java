import com.google.gson.annotations.SerializedName;

public class Modelo {
    @SerializedName("base_code")
    private String codigoMoneda;
    @SerializedName("conversion_rates")
    private ConversionMoneda conversionMoneda;

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public double getValorMoneda(String tipoMonedaCambio) {
        if (conversionMoneda == null) {
            return 0.0; // o lanzar una excepción si es necesario
        }
        return conversionMoneda.getValorMoneda(tipoMonedaCambio);
    }

    public static class ConversionMoneda {
        @SerializedName("USD")
        private double valorUSD;
        @SerializedName("ARS")
        private double valorARS;
        @SerializedName("COP")
        private double valorCOP;
        @SerializedName("BRL")
        private double valorBRL;

        public ConversionMoneda(double valorUSD, double valorARS, double valorCOP, double valorBRL) {
            this.valorUSD = valorUSD;
            this.valorARS = valorARS;
            this.valorCOP = valorCOP;
            this.valorBRL = valorBRL;
        }

        public double getValorMoneda(String tipoMonedaCambio) {
            switch (tipoMonedaCambio) {
                case "USD":
                    return valorUSD;
                case "ARS":
                    return valorARS;
                case "COP":
                    return valorCOP;
                case "BRL":
                    return valorBRL;
                default:
                    return 0.0; // o lanzar una excepción si es necesario
            }
        }

        @Override
        public String toString() {
            return "valorUSD='" + valorUSD + '\'' +
                    ", valorARS='" + valorARS + '\'' +
                    ", valorCOP='" + valorCOP + '\'' +
                    ", valorBRL='" + valorBRL + '\'';
        }
    }

    @Override
    public String toString() {
        return "codigoMoneda='" + codigoMoneda + '\'' +
                ", conversionMoneda=" + conversionMoneda;
    }
}
