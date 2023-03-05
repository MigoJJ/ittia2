package je.panse.doro.samsara.i2toolkit.hito;

public class OsteoporosisDifferentialDiagnosis {
    // instance variables
    private double boneMineralDensity;
    private int age;
    private boolean isFemale;
    private boolean hasFragilityFracture;
    private boolean hasSecondaryOsteoporosis;

    // constructor
    public OsteoporosisDifferentialDiagnosis(double boneMineralDensity, int age, boolean isFemale, boolean hasFragilityFracture, boolean hasSecondaryOsteoporosis) {
        this.boneMineralDensity = boneMineralDensity;
        this.age = age;
        this.isFemale = isFemale;
        this.hasFragilityFracture = hasFragilityFracture;
        this.hasSecondaryOsteoporosis = hasSecondaryOsteoporosis;
    }

    // method to perform differential diagnosis
    public String performDifferentialDiagnosis() {
        if (hasSecondaryOsteoporosis) {
            return "Secondary osteoporosis";
        } else if (hasFragilityFracture) {
            return "Established osteoporosis with fragility fracture";
        } else {
            if (isFemale) {
                if (age < 50) {
                    if (boneMineralDensity < -2.0) {
                        return "Low bone mass (osteopenia)";
                    } else {
                        return "Normal bone density";
                    }
                } else {
                    if (boneMineralDensity < -2.5) {
                        return "Osteoporosis";
                    } else {
                        return "Normal bone density";
                    }
                }
            } else {
                if (age < 50) {
                    if (boneMineralDensity < -1.0) {
                        return "Low bone mass (osteopenia)";
                    } else {
                        return "Normal bone density";
                    }
                } else {
                    if (boneMineralDensity < -2.5) {
                        return "Osteoporosis";
                    } else {
                        return "Normal bone density";
                    }
                }
            }
        }
    }
}
