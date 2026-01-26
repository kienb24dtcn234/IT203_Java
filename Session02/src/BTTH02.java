import java.util.Scanner;

public class BTTH02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tinh tien phat tra sach");
            System.out.println("2. Dang ky the muon sach VIP");
            System.out.println("3. Thong ke so sach nhap kho");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tinhTienPhatTraSach(scanner);
                    break;
                case 2:
                    dangKyTheMuonSachVIP(scanner);
                    break;
                case 3:
                    thongKeSoSachNhapKho(scanner);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        } while (choice != 0);

        scanner.close();
    }

//    YÊU CẦU 1
//            •	Mục đích:
//    o             Tính tiền phạt khi trả muộn sách
//•	Yêu cầu:
//    o	       Nhập số lượng sách phải trả:
//    o	       Nhập ngày quá hạn của từng sách
//    o	       Kiểm tra < 5 ngày -> 2000đ / ngày
//    o	       Kiểm tra >=6 ngày -> 5000đ / ngày
//    o	       Tính tổng tiền phạt
//•	Giải pháp:
//    o	     For
//    o	     If else
//            •	Thực thi:
//    o	     Khởi tạo biến tích luỹ tiền phạt
//    o	     B1: Nhập số lượng sách
//    o	     B2: Dùng vòng for lặp quá các quyển sách
//	            B3: Nhập số lượng ngày trả muộn (ngày trả muộn)
//	            B4: Kiểm tra điều kiện:
//            	            If < 5 -> 2000 * ngày trả muộn
//	            Else >= 6 -> 5 * 2000 + (ngày trả muộn - 5) * 5000
//    o	      B5: In ra kết quả
//
    static void tinhTienPhatTraSach(Scanner scanner) {
        System.out.print("Nhap so luong sach tra: ");
        int soLuongSach = scanner.nextInt();
        double tongTienPhat = 0;

        for (int i = 0; i < soLuongSach; i++) {
            System.out.print("Nhap so ngay qua han cho sach " + (i + 1) + ": ");
            int ngayQuaHan = scanner.nextInt();

            if (ngayQuaHan > 0) {
                if (ngayQuaHan <= 5) {
                    tongTienPhat += ngayQuaHan * 2000;
                } else {
                    tongTienPhat += 5 * 2000 + (ngayQuaHan - 5) * 5000;
                }
            }
        }

        System.out.println("Tong tien phat: " + tongTienPhat + " VND");
    }

//    YÊU CẦU 2:
//            •	Mục đích:
//    o	    Kiểm tra có đủ điều kiện làm thẻ VIP
//•	Yêu cầu:
//    o	     Nhập thông tin ( age, số lượng sách đã mượn, có thẻ ưu tiên hay không )
//    o	     Kiểm tra đủ điều kiện hay không
//    o	     In thông tin ra màn hình
//•	Giải pháp:
//    o	    If else
//            •	Thực thi:
//    o	     B1: Nhập tuổi
//    o	     B2: Nhập số lượng sách
//    o	     B3: Nhập thẻ ưu tiên
//    o	     B4: Kiểm tra (age >= 18 && quantityBorrow >= 10) || (isPriority == true)  true | false
//    o	     B5: Kiểm tra kq trả về là true hay false  đăng ký được thẻ VIP | không đủ điều kiện

    static void dangKyTheMuonSachVIP(Scanner scanner) {
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhap so sach da muon trong thang qua: ");
        int soSachMuon = scanner.nextInt();
        System.out.print("Co the uu tien (1: Co, 0: Khong): ");
        int theUuTien = scanner.nextInt();

        if ((tuoi >= 18 && soSachMuon >= 10) || theUuTien == 1) {
            System.out.println("Du tieu chuan nang cap VIP");
        } else {
            System.out.println("Chua du tieu chuan");
        }
    }

//    YÊU CẦU 3:
//            •	Mục đích:
//    o	     Thống kê số sách nhập kho
//•	Yêu cầu:
//    o	      Nhập mã hợp lệ (> 0)
//    o	      Đếm số mã hợp lệ
//    o	      In ra số lượng sách hợp lệ
//•	Giải pháp:
//    o	      While hoặc do…while
//    o	      If else
//    o	      Break
//•	Thực thi:
//    o	      Tạo biến đếm = 0
//    o	      B1: dùng vòng lặp do…while (luôn đúng)
//            	            B2: Nhập mã số
//	           B3: Kiểm tra
//•	                  B4: < 0 không tính bắt nhập lại
//•	                  B5: == 0  break – thoát khỏi vòng lặp
//•	                  B6: > 0 biến đếm tăng lên
//    o	       B7: In kết quả biến đếm ra màn hình
//
    static void thongKeSoSachNhapKho(Scanner scanner) {
        int tongSoSach = 0;
        int maSach;

        do {
            System.out.print("Nhap ma so sach (0 de ket thuc): ");
            maSach = scanner.nextInt();

            if (maSach == 0) {
                break;
            }

            if (maSach < 0) {
                System.out.println("Ma so khong hop le. Vui long nhap lai.");
                continue;
            }

            tongSoSach++;
        } while (true);

        System.out.println("Tong so luong sach hop le da nhap: " + tongSoSach);
    }
}