class test {
    boolean week(String day) {
        if (day == "monday")
            return true;
        else if (day == "tuesday")
            return true;
        else if (day == "wednesday")
            return true;
        else if (day == "thursday")
            return true;
        else if (day == "friday")
            return true;
        else if (day == "saturday")
            return false;
        else
            return false;
    }
}

public class day_of_week {
    public static void main(String[] args) {
        test obj = new test();
        boolean x = obj.week("sunday");
        if (x)
            System.out.println("working day");
        else
            System.out.println("weekend day");
    }
}
