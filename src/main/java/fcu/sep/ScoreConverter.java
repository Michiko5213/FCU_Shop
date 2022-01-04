package fcu.sep;

public class ScoreConverter {
    public String getGrade(int score) {
        if (score >= 0) {
            int level = score / 10;

            switch (level) {
                case 10:
                    return "A";
                case 9:
                    return "A";
                case 8:
                    return "B";
                case 7:
                    return "C";
                case 6:
                    return "D";
                case 5:
                    return "F";
                case 4:
                    return "F";
                case 3:
                    return "F";
                case 2:
                    return "F";
                case 1:
                    return "F";
                case 0:
                    return "F";
                default:
                    return "Invalid score";
            }

        }
        else{
            return "Invalid score";
        }
    }

}
