import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HN_KS24_CNTT5_NguyenTheKien {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] mssvList = new String[100];
        int currentSize = 0;
        String mssvRegex = "^B\\d{7}$";
        Pattern pattern = Pattern.compile(mssvRegex);

        int choice;
        do {
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm MSSV mới");
            System.out.println("3. Cập nhật MSSV theo index");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    if (currentSize == 0) {
                        System.out.println("Danh sách MSSV đang rỗng");
                    } else {
                        for (int i = 0; i < currentSize; i++) {
                            System.out.println((i + 1) + ". " + mssvList[i]);
                        }
                    }
                    break;
                case 2:
                    if (currentSize == 100) {
                        System.out.println("Mảng đã đầy, không thể thêm");
                        break;
                    }

                    String newMssv;
                    while (true) {
                        System.out.print("Nhập MSSV mới : ");
                        newMssv = sc.nextLine();
                        Matcher matcher = pattern.matcher(newMssv);
                        if (matcher.matches()) {
                            break;
                        }
                        System.out.println("Sai định dạng! MSSV phải có dạng Bxxxxxxx");
                    }

                    mssvList[currentSize] = newMssv;
                    currentSize++;
                    System.out.println("Thêm MSSV thành công");
                    break;
                case 3:
                    if (currentSize == 0){
                        System.out.println("Danh sách rỗng");
                        break;
                    }

                    System.out.println("Nhập Index cần sửa (0 -"+ (currentSize - 1 ) + ") ");
                    int index = Integer.parseInt(sc.nextLine());
                    if ( index < 0 || index >= currentSize ){
                        System.out.println("Index không hợp lệ");
                        break;
                    }
                    String updatedMssv;
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        updatedMssv = sc.nextLine();
                        Matcher matcher = pattern.matcher(updatedMssv);
                        if (matcher.matches()) {
                            break;
                        }
                        System.out.println("Sai định dạng MSSV ");
                    }
                    mssvList[index] = updatedMssv;
                    System.out.println("Cập nhật MSSV thành công");
                    break;
                case 4:

                    break;
                case 5:
                    System.out.print("Nhập chuỗi cần tìm: ");
                    String keyword = sc.nextLine().toLowerCase();
                    boolean found = false;

                    for (int i = 0; i < currentSize; i++) {
                        if (mssvList[i].toLowerCase().contains(keyword)) {
                            System.out.println(mssvList[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không có MSSV phù hợp");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }while (choice != 6);

        sc.close();
    }
}