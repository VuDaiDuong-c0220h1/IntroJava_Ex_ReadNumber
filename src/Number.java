import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Nhập số cần đọc: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String read = "";
        if (number < 0 && number >= 100) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    read = "Không";
                    break;
                case 1:
                    read = "Một";
                    break;
                case 2:
                    read = "Hai";
                    break;
                case 3:
                    read = "Ba";
                    break;
                case 4:
                    read = "Bốn";
                    break;
                case 5:
                    read = "Năm";
                    break;
                case 6:
                    read = "Sáu";
                    break;
                case 7:
                    read = "Bảy";
                    break;
                case 8:
                    read = "Tám";
                    break;
                case 9:
                    read = "Chín";
                    break;
            }
        } else if (number < 100) {
            String numberString = String.valueOf(number);
            switch (numberString.charAt(0)) {
                case '1':
                    read = "Mười";
                    break;
                case '2':
                    read = "Hai mươi";
                    break;
                case '3':
                    read = "Ba mươi";
                    break;
                case '4':
                    read = "Bốn mươi";
                    break;
                case '5':
                    read = "Năm mươi";
                    break;
                case '6':
                    read = "Sáu mươi";
                    break;
                case '7':
                    read = "Bảy mươi";
                    break;
                case '8':
                    read = "Tám mươi";
                    break;
                case '9':
                    read = "Chín mươi";
                    break;
            }
            switch (numberString.charAt(1)) {
                case '0':
                    read += "";
                    break;
                case '1':
                    if (numberString.charAt(0) == '1') {
                        read += " Một";
                    } else {
                        read += " Mốt";
                    }
                    break;
                case '2':
                    read += " Hai";
                    break;
                case '3':
                    read += " Ba";
                    break;
                case '4':
                    if (numberString.charAt(0) == '1') {
                        read += " Bốn";
                    } else {
                        read += " Tư";
                    }
                    break;
                case '5':
                    read += " Lăm";
                    break;
                case '6':
                    read += " Sáu";
                    break;
                case '7':
                    read += " Bảy";
                    break;
                case '8':
                    read += " Tám";
                    break;
                case '9':
                    read += " Chín";
                    break;
            }
        }
        System.out.println(read);
    }
}
