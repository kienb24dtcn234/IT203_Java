package HN_KS24_CNTT5_NguyenTheKien;

public class Students {
    private String id;
    private String name;
    private double score;

    public Students() {
        this.id = "SV000";
        this.name = "Unknown";
        this.score = 0.0;
    }

    public Students(String id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        if(id.startsWith("SV") && id.length() == 5){
            this.id = id;
        } else{
            System.out.println("Mã SV không hợp lệ : ");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Điểm phải trong khoảng 0 - 10 : ");
        }
    }

    public String getRank(){
        if (score >= 8.0) {
            return "Giỏi";
        } else if (score >= 6.5) {
            return "Khá";
        } else {
            return "Trung bình";
        }
    }
    public String toString() {
        return "Ma SV: " + id +
                " | Ten: " + name +
                " | Diem: " + score +
                " | Hoc luc: " + getRank();
    }
}
