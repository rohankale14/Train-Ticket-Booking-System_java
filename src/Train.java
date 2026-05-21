public class Train {

    private int trainId;

    private String name;

    private String source;

    private  String destination;

    private int totalseats;

    private int availableseats;

    private String date;

    public Train(String date,int trainId, String name, String source, String destination, int totalseats ) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.totalseats = totalseats;
        this.availableseats = totalseats;
        this.date = date;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public int getAvailableseats() {
        return availableseats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAvailableseats(int availableseats)
    {
        this.availableseats = totalseats;
    }
    public boolean bookseats(int count) {
        if (count <= availableseats) {
            availableseats -= count;
            return true;
        }
        return false;
    }
    public void cancelseats(int count)
    {
        availableseats+=count;
    }

    @Override
    public String toString() {
        return " -> |Date :"+ date+"| Train ID : "+ trainId + " | "+name+" | "+source+ " -> " +destination+"| Seats Available: "+availableseats;
    }
}
