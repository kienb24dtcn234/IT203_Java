public class LyThuyet01 {
    public static void main(String[] args) {
        // Khởi tạo 1 biến chứa tệp
        // Đối tượng nào trong java cũng tuân theo quy tắc đặt tên
        String name = "Hà Bích Ngọc";
        int age = 19;
        float score = 7.5F;
        double money = 10000000.0;

        // Đặt tên biến :
        // camelCase: ngày sinh date_of_birth
        String dateOfBirth = "";

        //snake_case : Họ tên -> FullName
        String full_name = "";

        //PascalCase : Địa chỉ hiện tại : current address
        String CurrentAddress = "";

        // Wrapper Class
        // Cú pháp khai báo biến
        // <Datatype> <VariableName> = <Giá trị>

        int birthYear = 2006;
        int nowYear = 2026;
        int ageOfKien = nowYear - birthYear;
        System.out.print(ageOfKien);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi : ");
        int myAge = Integer.parseInt(sc.nextLine());
        System.out.println(Myage);
        System.out.println("Nhập tuổi : ");
        String myName = sc.nextLine();

        // ==> giải quyết tình huống nuốt dòng java:
        // Cái nào khác chuỗi thì --> nhập chuỗi ép về kiểu số

        boolean result = Boolean.parseBoolean("true");
        System.out.println(result);


    }
}