import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC12Test {

    @Test
    void testSafety_AllBogiesValid() {
        List<TrainConsistUC12.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC12.GoodsBogie("Cylindrical", "Petroleum"));

        assertTrue(TrainConsistUC12.isSafe(bogies));
    }

    private void assertTrue(boolean safe) {
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<TrainConsistUC12.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC12.GoodsBogie("Cylindrical", "Coal"));

        assertFalse(TrainConsistUC12.isSafe(bogies));
    }

    private void assertFalse(boolean safe) {
        throw new UnsupportedOperationException("Unimplemented method 'assertFalse'");
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<TrainConsistUC12.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC12.GoodsBogie("Open", "Coal"));
        bogies.add(new TrainConsistUC12.GoodsBogie("Box", "Grain"));

        assertTrue(TrainConsistUC12.isSafe(bogies));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<TrainConsistUC12.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistUC12.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new TrainConsistUC12.GoodsBogie("Cylindrical", "Coal"));

        assertFalse(TrainConsistUC12.isSafe(bogies));
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<TrainConsistUC12.GoodsBogie> bogies = new ArrayList<>();

        assertTrue(TrainConsistUC12.isSafe(bogies));
    }
}