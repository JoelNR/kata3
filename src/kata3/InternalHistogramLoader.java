package kata3;


public class InternalHistogramLoader implements HistogramLoader {
    private static final String[] data = new String [] {
        "Cadiz", "Madrid", "Madrid", "Barcerlona", "Barcelona", "Sevilla", "Madrid", "Zaragoza", "Madrid"
    };
    
    @Override
    public Histogram load() {
        Histogram histogram = new Histogram ();
        for (String region : data) {
            histogram.add(region);
        }
        return histogram;
    }
}
