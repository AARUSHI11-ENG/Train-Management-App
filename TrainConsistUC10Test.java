import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC10Test {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC10.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistUC10.Bogie("AC Chair", 56));

        assertEquals(128, TrainConsistUC10.totalSeats(bogies));
    }

    private void assertEquals(int i, int totalSeats) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC10.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistUC10.Bogie("First Class", 24));
        bogies.add(new TrainConsistUC10.Bogie("General", 90));

        assertEquals(186, TrainConsistUC10.totalSeats(bogies));
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC10.Bogie("Sleeper", 72));

        assertEquals(72, TrainConsistUC10.totalSeats(bogies));
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();

        assertEquals(0, TrainConsistUC10.totalSeats(bogies));
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC10.Bogie("AC Chair", 56));

        assertEquals(56, TrainConsistUC10.totalSeats(bogies));
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC10.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistUC10.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistUC10.Bogie("First Class", 24));
        bogies.add(new TrainConsistUC10.Bogie("General", 90));

        assertEquals(242, TrainConsistUC10.totalSeats(bogies));
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<TrainConsistUC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC10.Bogie("Sleeper", 72));

        TrainConsistUC10.totalSeats(bogies);

        assertEquals(1, bogies.size());
    }
}