public class Attendance {
    private String name;
    private String date;
    private String status;

    public Attendance(String name, String date, String status) {
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public String getName() { return name; }
    public String getDate() { return date; }
    public String getStatus() { return status; }
}
